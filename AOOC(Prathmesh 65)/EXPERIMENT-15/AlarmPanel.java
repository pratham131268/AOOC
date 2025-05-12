import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AlarmPanel extends JPanel {
    private JLabel timeLabel, alarmLabel;
    private JTextField hourField, minuteField;
    private JButton setAlarmButton;
    private AlarmController controller;

    public AlarmPanel(AlarmController controller) {
        this.controller = controller;
        setBackground(new Color(240, 240, 240));
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        timeLabel = new JLabel("Current Time: ", JLabel.CENTER);
        timeLabel.setFont(new Font("Segoe UI", Font.BOLD, 28));
        timeLabel.setForeground(new Color(70, 70, 70));
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(timeLabel, gbc);

        JLabel setAlarmTitle = new JLabel("Set Alarm Time:", JLabel.CENTER);
        setAlarmTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
        setAlarmTitle.setForeground(new Color(0, 100, 200));
        gbc.gridy++;
        add(setAlarmTitle, gbc);

        gbc.gridwidth = 1;
        gbc.gridy++;
        add(new JLabel("Hour (0-23):", JLabel.RIGHT), gbc);
        hourField = new JTextField(2);
        hourField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        hourField.setHorizontalAlignment(JTextField.CENTER);
        gbc.gridx++;
        add(hourField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("Minute (0-59):", JLabel.RIGHT), gbc);
        minuteField = new JTextField(2);
        minuteField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        minuteField.setHorizontalAlignment(JTextField.CENTER);
        gbc.gridx++;
        add(minuteField, gbc);

        setAlarmButton = new JButton("SET ALARM");
        styleButton(setAlarmButton, new Color(0, 120, 215), Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        add(setAlarmButton, gbc);

        alarmLabel = new JLabel("No alarm set", JLabel.CENTER);
        alarmLabel.setFont(new Font("Segoe UI", Font.ITALIC, 14));
        alarmLabel.setForeground(new Color(100, 100, 100));
        gbc.gridy++;
        add(alarmLabel, gbc);

        setAlarmButton.addActionListener(e -> {
            try {
                int hour = Integer.parseInt(hourField.getText());
                int minute = Integer.parseInt(minuteField.getText());
                controller.setAlarm(hour, minute);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, 
                    "Please enter numbers only", 
                    "Invalid Input", JOptionPane.WARNING_MESSAGE);
            }
        });
    }

    private void styleButton(JButton button, Color bgColor, Color textColor) {
        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        button.setBackground(bgColor);
        button.setForeground(textColor);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(bgColor.darker(), 1),
            BorderFactory.createEmptyBorder(8, 20, 8, 20)
        ));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                button.setBackground(bgColor.brighter());
            }
            public void mouseExited(MouseEvent evt) {
                button.setBackground(bgColor);
            }
        });
    }

    public void updateTimeLabel(String time) {
        timeLabel.setText("Current Time: " + time);
    }

    public void setAlarmLabel(String text, Color color) {
        alarmLabel.setText(text);
        alarmLabel.setForeground(color);
    }

    public int getHour() {
        return Integer.parseInt(hourField.getText());
    }

    public int getMinute() {
        return Integer.parseInt(minuteField.getText());
    }
}
