import java.awt.*;
import javax.swing.*;
public class DDALineDrawing extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawLineUsingDDA(g, 50, 50, 200, 200); // Example coordinates
    }
private void drawLineUsingDDA(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        int steps = Math.max(Math.abs(dx), Math.abs(dy));
        float xIncrement = dx / (float) steps;
        float yIncrement = dy / (float) steps;
        float x = x1;
        float y = y1;
        for (int i = 0; i <= steps; i++) {
            g.fillRect(Math.round(x), Math.round(y), 1, 1); // Draw pixel
            x += xIncrement;
            y += yIncrement;
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("DDA Line Drawing Algorithm");
        DDALineDrawing panel = new DDALineDrawing();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
} 