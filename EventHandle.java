import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EventHandle{

    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Handling Example");
        JButton button = new JButton("Click me!");

        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Button clicked!");
        });

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
