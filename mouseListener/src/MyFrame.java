import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);
        this.setSize(500, 500);
        this.add(label);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setBackground(Color.BLUE);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setBackground(Color.red);
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
