import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //gridlayout places components in a grid of cells
        //each components takes all the available space within its cell
        //and each cell is the same size




        JFrame frame = new JFrame();

        frame.setLayout(new GridLayout(3,3,10,20));//rows,columns,horspacing,vert
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}