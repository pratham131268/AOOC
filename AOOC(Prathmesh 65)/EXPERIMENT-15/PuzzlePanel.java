import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PuzzlePanel extends JPanel {
    private JLabel puzzleLabel;
    private JTextField answerField;
    private JButton stopAlarmButton;
    private AlarmController controller;

    public PuzzlePanel(AlarmController controller) {
        this.controller = controller;
        setBackground(new Color(240, 240, 240));
        setLayout(new BorderLayout(20, 20));
        setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        JPanel puzzleCenter = new JPanel(new BorderLayout(20, 20));
        puzzleCenter.setBackground(new Color(240, 240, 240));

        puzzleLabel = new JLabel("", JLabel.CENTER);
        puzzleLabel.setFont(new Font("Segoe UI", Font.BOLD, 28));
        puzzleLabel.setForeground(new Color(200, 50, 50));
        puzzleCenter.add(puzzleLabel, BorderLayout.NORTH);

        JPanel answerPanel = new JPanel();
        answerPanel.setBackground(new Color(240, 240, 240));
        JLabel answerLabel = new JLabel("Answer: ");
        answerLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        answerPanel.add(answerLabel);

        answerField = new JTextField(10);
        answerField.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        answerField.setHorizontalAlignment(JTextField.CENTER);
        answerPanel.add(answerField);

        puzzleCenter.add(answerPanel, BorderLayout.CENTER);

        stopAlarmButton = new JButton("STOP ALARM");
        stopAlarmButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        stopAlarmButton.setBackground(new Color(200, 50, 50));
        stopAlarmButton.setForeground(Color.WHITE);
        stopAlarmButton.setFocusPainted(false);
        stopAlarmButton.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 50, 50).darker(), 1),
            BorderFactory.createEmptyBorder(8, 20, 8, 20)
        ));
        stopAlarmButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        puzzleCenter.add(stopAlarmButton, BorderLayout.SOUTH);

        add(puzzleCenter, BorderLayout.CENTER);

        stopAlarmButton.addActionListener(e -> {
            try {
                int answer = Integer.parseInt(answerField.getText());
                controller.checkAnswer(answer);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, 
                    "Please enter a valid number", 
                    "Invalid Input", JOptionPane.WARNING_MESSAGE);
            }
        });

        answerField.addActionListener(e -> stopAlarmButton.doClick());
    }

    public void setPuzzleText(String text) {
        puzzleLabel.setText(text);
    }

    public void clearAnswerField() {
        answerField.setText("");
        answerField.requestFocus();
    }
}
