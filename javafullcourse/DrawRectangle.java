import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class DrawRectangle extends JPanel {
    private int x1, y1, x2, y2;

    public DrawRectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        int topLeftX = Math.min(x1, x2);
        int topLeftY = Math.min(y1, y2);
        g.drawRect(topLeftX, topLeftY, width, height);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates of the first vertex (x1, y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter the coordinates of the opposite vertex (x2, y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        JFrame frame = new JFrame("Draw Rectangle");
        DrawRectangle panel = new DrawRectangle(x1, y1, x2, y2);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        scanner.close();
    }
}