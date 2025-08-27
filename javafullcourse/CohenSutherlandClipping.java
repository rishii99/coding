import javax.swing.*;
import java.awt.*;
public class CohenSutherlandClipping extends JPanel {
    final int INSIDE = 0; // 0000
    final int LEFT = 1;   // 0001
    final int RIGHT = 2;  // 0010
    final int BOTTOM = 4; // 0100
    final int TOP = 8;    // 1000
    int x_min = 100, y_min = 100, x_max = 300, y_max = 300;
    int x1 = 50, y1 = 250, x2 = 350, y2 = 150;
    int computeCode(int x, int y) {
        int code = INSIDE;
        if (x < x_min)
            code |= LEFT;
        else if (x > x_max)
            code |= RIGHT;
        if (y < y_min)
            code |= BOTTOM;
        else if (y > y_max)
            code |= TOP;

        return code;
    }
    void cohenSutherlandClip(Graphics g) {
        int code1 = computeCode(x1, y1);
        int code2 = computeCode(x2, y2);
        boolean accept = false;
        while (true) {
            if ((code1 | code2) == 0) {
                accept = true;
                break;
            } else if ((code1 & code2) != 0) {
                break;
            } else {
                int code_out;
                int x = 0, y = 0;
                if (code1 != 0)
                    code_out = code1;
                else
                    code_out = code2;
                if ((code_out & TOP) != 0) {
                    x = x1 + (x2 - x1) * (y_max - y1) / (y2 - y1);
                    y = y_max;
                } else if ((code_out & BOTTOM) != 0) {
                    x = x1 + (x2 - x1) * (y_min - y1) / (y2 - y1);
                    y = y_min;
                } else if ((code_out & RIGHT) != 0) {
                    y = y1 + (y2 - y1) * (x_max - x1) / (x2 - x1);
                    x = x_max;
                } else if ((code_out & LEFT) != 0) {
                    y = y1 + (y2 - y1) * (x_min - x1) / (x2 - x1);
                    x = x_min;
                }
                if (code_out == code1) {
                    x1 = x;
                    y1 = y;
                    code1 = computeCode(x1, y1);
                } else {
                    x2 = x;
                    y2 = y;
                    code2 = computeCode(x2, y2);
                }
            }
        }
        if (accept) {
            g.setColor(Color.GREEN);
            g.drawLine(x1, y1, x2, y2);
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawRect(x_min, y_min, x_max - x_min, y_max - y_min);
        g.setColor(Color.RED);
        g.drawLine(50, 250, 350, 150);
        cohenSutherlandClip(g);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cohen-Sutherland Line Clipping");
        CohenSutherlandClipping panel = new CohenSutherlandClipping();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
