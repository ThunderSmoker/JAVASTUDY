import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLight {
    private static JFrame frame;
    private static JRadioButton redButton;
    private static JRadioButton yellowButton;
    private static JRadioButton greenButton;
    private static JPanel lightPanel;

    public static void main(String[] args) {
        createAndShowGUI();
    }

    private static void createAndShowGUI() {
        frame = new JFrame("Traffic Light");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        JLabel label = new JLabel("Select a color:");

        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(yellowButton);
        buttonGroup.add(greenButton);

        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLightColor(Color.RED);
            }
        });

        yellowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLightColor(Color.YELLOW);
            }
        });

        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLightColor(Color.GREEN);
            }
        });

        lightPanel = new JPanel();
        lightPanel.setBackground(Color.LIGHT_GRAY);
        lightPanel.setPreferredSize(new Dimension(100, 250));

        panel.add(label);
        panel.add(redButton);
        panel.add(yellowButton);
        panel.add(greenButton);
        panel.add(lightPanel);

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void setLightColor(Color color) {
        lightPanel.setBackground(color);
    }
}
