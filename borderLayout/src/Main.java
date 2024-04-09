import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.red);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.yellow);
        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.blue);
        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.gray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
    }
}