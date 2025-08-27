import javax.swing.*;
import java.awt.*;

public class IPLLogo extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Set anti-aliasing for smooth rendering
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set Background Color
        setBackground(Color.WHITE);

        // Draw Batsman (Simple Silhouette)
        g2.setColor(Color.BLUE);
        g2.fillOval(100, 120, 40, 40);  // Head
        g2.fillRect(110, 160, 20, 50);  // Body
        g2.drawLine(110, 160, 90, 190); // Left Leg
        g2.drawLine(130, 160, 150, 190); // Right Leg
        g2.drawLine(110, 170, 80, 140);  // Left Arm
        g2.drawLine(130, 170, 170, 120); // Right Arm holding bat

        // Draw Cricket Bat
        g2.setColor(Color.ORANGE);
        g2.fillRect(165, 110, 10, 40);

        // Draw Cricket Ball with Motion Trail
        g2.setColor(Color.RED);
        g2.fillOval(220, 80, 20, 20); // Ball
        g2.setColor(new Color(255, 0, 0, 100)); // Semi-transparent for trail effect
        g2.fillOval(200, 90, 20, 20);
        g2.fillOval(180, 100, 20, 20);

        // Draw IPL Text
        g2.setColor(Color.BLACK);
        g2.setFont(new Font("Arial", Font.BOLD, 40));
        g2.drawString("IPL", 250, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("IPL Inspired Logo");
        IPLLogo logo = new IPLLogo();

        frame.add(logo);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
