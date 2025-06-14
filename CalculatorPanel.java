import javax.swing.*;
import java.awt.*;

public class CalculatorPanel extends JPanel {
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;

    public CalculatorPanel() {
        setLayout(new BorderLayout());

        // TextField
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        add(textField, BorderLayout.NORTH);

        // Panel Tombol
        JPanel buttonPanel = new JPanel(new GridLayout(3, 6, 5, 5));
        
        // Tombol Angka (1-9, 0)
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 18));
            buttonPanel.add(numberButtons[i]);
        }

        // Tombol Operator (+, -, *, /, %, Mod, Exit)
        String[] operators = {"+", "-", "*", "/", "%", "Mod", "Exit"};
        functionButtons = new JButton[operators.length];
        for (int i = 0; i < operators.length; i++) {
            functionButtons[i] = new JButton(operators[i]);
            functionButtons[i].setFont(new Font("Arial", Font.PLAIN, 18));
            buttonPanel.add(functionButtons[i]);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }
}
