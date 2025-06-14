import javax.swing.*;
import java.awt.*;

public class CalculatorFrame Extends JFrame {  private JTextField inputField;  private JButton[] buttons;  private double result;
    private CalculatorPanel panel;

    public CalculatorFrame() {
        setTitle("Kalkulator Sederhana");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,500);

        panel = new CalculatorPanel();
        add(panel);
    }
    
}
