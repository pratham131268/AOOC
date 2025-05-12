import javax.swing.*;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AlarmClockFrame alarm = new AlarmClockFrame();
            alarm.setVisible(true);
        });
    }
}
