import javax.swing.*;

public class CalculatorApp {
    public static void main(String[] args) {
        SwingUtileties.inokeLater(() ->) {
            CalculatorFrame frame = new CalculatorFrame();
            frame.setVisible(true);
        });
    
    }
    
}