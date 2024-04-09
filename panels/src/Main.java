// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
    //jpanel a gui component  that functions as a container to hold other components
        JFrame frame = new JFrame();
        JPanel redpanel = new JPanel();
        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon("reires.png");
        label.setText("hi");
        label.setIcon(icon);
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0, 0, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(new BorderLayout());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);


        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(redpanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}