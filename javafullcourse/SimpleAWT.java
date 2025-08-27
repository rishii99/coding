import java.awt.*;
import java.awt.event.*;

public class SimpleAWT {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");
        Button button = new Button("Click Me");
        
        button.setBounds(50, 100, 80, 30);
        button.addActionListener(e -> System.out.println("Button Clicked!"));
        
        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
