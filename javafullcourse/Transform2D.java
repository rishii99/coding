import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transform2D extends JPanel implements ActionListener {
    private int[][] triangle = {
            {100, 150, 200},  // X coordinates
            {200, 100, 200}   // Y coordinates
    };

    private String transformation = "none";
    private Timer timer;

    public Transform2D() {
        JFrame frame = new JFrame("2D Transformation Demo");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton translateBtn = new JButton("Translate");
        JButton scaleBtn = new JButton("Scale");
        JButton rotateBtn = new JButton("Rotate");
        JButton resetBtn = new JButton("Reset");

        translateBtn.addActionListener(e -> {
            transformation = "translate";
            repaint();
        });
        scaleBtn.addActionListener(e -> {
            transformation = "scale";
            repaint();
        });
        rotateBtn.addActionListener(e -> {
            transformation = "rotate";
            repaint();
        });
        resetBtn.addActionListener(e -> {
            transformation = "reset";
            repaint();
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(translateBtn);
        buttonPanel.add(scaleBtn);
        buttonPanel.add(rotateBtn);
        buttonPanel.add(resetBtn);

        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.add(this, BorderLayout.CENTER);
        frame.setVisible(true);

        timer = new Timer(20, this);  // for smooth rotation (optional)
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.WHITE);

        Graphics2D g2d = (Graphics2D) g;

        int[][] transformedTriangle = new int[2][3];
        for (int i = 0; i < 3; i++) {
            transformedTriangle[0][i] = triangle[0][i];
            transformedTriangle[1][i] = triangle[1][i];
        }

        switch (transformation) {
            case "translate":
                for (int i = 0; i < 3; i++) {
                    transformedTriangle[0][i] += 100;  // Move right
                    transformedTriangle[1][i] += 50;   // Move down
                }
                break;
            case "scale":
                for (int i = 0; i < 3; i++) {
                    transformedTriangle[0][i] = (int) (transformedTriangle[0][i] * 1.5);
                    transformedTriangle[1][i] = (int) (transformedTriangle[1][i] * 1.5);
                }
                break;
            case "rotate":
                double angle = Math.toRadians(45); // 45-degree rotation
                int centerX = triangle[0][0];
                int centerY = triangle[1][0];
                for (int i = 0; i < 3; i++) {
                    int x = triangle[0][i] - centerX;
                    int y = triangle[1][i] - centerY;
                    transformedTriangle[0][i] = (int) (x * Math.cos(angle) - y * Math.sin(angle)) + centerX;
                    transformedTriangle[1][i] = (int) (x * Math.sin(angle) + y * Math.cos(angle)) + centerY;
                }
                break;
            case "reset":
                transformedTriangle = triangle;
                break;
        }

        g2d.setColor(Color.BLUE);
        g2d.drawPolygon(transformedTriangle[0], transformedTriangle[1], 3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Transform2D::new);
    }
}
