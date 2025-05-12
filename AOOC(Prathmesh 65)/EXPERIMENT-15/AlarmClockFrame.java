import javax.swing.*;
import java.awt.*;

public class AlarmClockFrame extends JFrame {
    private AlarmPanel alarmPanel;
    private PuzzlePanel puzzlePanel;
    private JPanel mainPanel;
    private AlarmController controller;

    public AlarmClockFrame() {
        setTitle("Alarm Clock for Heavy Sleeper");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        controller = new AlarmController(this);
        mainPanel = new JPanel(new CardLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        mainPanel.setBackground(new Color(240, 240, 240));

        alarmPanel = new AlarmPanel(controller);
        puzzlePanel = new PuzzlePanel(controller);
        
        mainPanel.add(alarmPanel, "alarm");
        mainPanel.add(puzzlePanel, "puzzle");
        
        add(mainPanel);
        controller.initialize();
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public AlarmPanel getAlarmPanel() {
        return alarmPanel;
    }

    public PuzzlePanel getPuzzlePanel() {
        return puzzlePanel;
    }
}
