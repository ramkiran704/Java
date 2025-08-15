import javax.swing.*;
import java.awt.*;

public class Demonstration_21 extends JFrame {
    public Demonstration_21() {
        setTitle("Demonstration");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center on screen
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hello JFrame", 100, 100);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Demonstration_21 demo = new Demonstration_21();
            demo.setVisible(true);
        });
    }
}
