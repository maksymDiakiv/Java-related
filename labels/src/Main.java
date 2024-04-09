// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Jlabel a gui display area for a string of text , an image or both
        JFrame frame = new JFrame();
        JLabel label = new JLabel();//create label
        Border border =BorderFactory.createLineBorder(Color.red, 3);

        ImageIcon icon = new ImageIcon("reires.png");
        label.setText("hello fellas");//text of label
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);//position of text left right center of icon
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.green);//color of text
        label.setFont(new Font("MV Boli", Font.PLAIN,20));//font of text
        label.setIconTextGap(1);//set gap of text to image
        label.setBackground(Color.black);
        label.setOpaque(true);//display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);//set vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(0, 0, 250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500, 500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}