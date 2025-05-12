import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.*;


public class AlarmController {
    private AlarmClockFrame view;
    private Timer alarmTimer;
    private Clip alarmClip;
    private int puzzleAnswer;
    private boolean alarmActive = false;

    public AlarmController(AlarmClockFrame view) {
        this.view = view;
    }

    public void initialize() {
        loadAlarmSound();
        setupTimers();
    }

    private void loadAlarmSound() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("alarm.wav"));
            alarmClip = AudioSystem.getClip();
            alarmClip.open(audioInputStream);
        } catch (Exception e) {
            System.err.println("Error loading sound: " + e.getMessage());
        }
    }

    private void setupTimers() {
        Timer timeUpdateTimer = new Timer();
        timeUpdateTimer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                updateTime();
            }
        }, 0, 1000);
    }

    private void updateTime() {
        String currentTime = new java.text.SimpleDateFormat("HH:mm:ss").format(new java.util.Date());
        view.getAlarmPanel().updateTimeLabel(currentTime);

        if (alarmActive) {
            String alarmTime = String.format("%02d:%02d:00", 
                view.getAlarmPanel().getHour(), 
                view.getAlarmPanel().getMinute());
            if (currentTime.equals(alarmTime)) {
                startAlarm();
            }
        }
    }

    public void setAlarm(int hour, int minute) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            JOptionPane.showMessageDialog(view, 
                "Invalid time!\nHour must be 0-23\nMinute must be 0-59", 
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        alarmActive = true;
        view.getAlarmPanel().setAlarmLabel(String.format("Alarm set for %02d:%02d", hour, minute), new Color(0, 120, 0));
    }

    private void startAlarm() {
        Random rand = new Random();
        int num1 = rand.nextInt(10) + 1;
        int num2 = rand.nextInt(10) + 1;
        puzzleAnswer = num1 + num2;
        view.getPuzzlePanel().setPuzzleText(String.format("What is %d + %d?", num1, num2));
        
        CardLayout cl = (CardLayout)(view.getMainPanel().getLayout());
        cl.show(view.getMainPanel(), "puzzle");
        
        if (alarmClip != null) {
            alarmClip.setFramePosition(0);
            alarmClip.loop(Clip.LOOP_CONTINUOUSLY);
        } else {
            Toolkit.getDefaultToolkit().beep();
        }
        
        view.setAlwaysOnTop(true);
        view.toFront();
        view.requestFocus();
    }

    public void checkAnswer(int userAnswer) {
        if (userAnswer == puzzleAnswer) {
            stopAlarm();
        } else {
            view.getPuzzlePanel().clearAnswerField();
            JOptionPane.showMessageDialog(view, 
                "✖ Wrong answer! Try again.", 
                "Incorrect", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void stopAlarm() {
        if (alarmClip != null) {
            alarmClip.stop();
        }
        
        alarmActive = false;
        view.setAlwaysOnTop(false);
        CardLayout cl = (CardLayout)(view.getMainPanel().getLayout());
        cl.show(view.getMainPanel(), "alarm");
        view.getAlarmPanel().setAlarmLabel("Alarm stopped", new Color(100, 100, 100));
        view.getPuzzlePanel().clearAnswerField();
    }
}
