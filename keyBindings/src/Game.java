import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {
    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    Game(){
        frame = new JFrame("key binding");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100, 100, 100, 100);
        label.setOpaque(true);

        upAction = new UpAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();
        downAction = new DownAction();
        label.getInputMap().put(KeyStroke.getKeyStroke('w'), "go up");
        label.getActionMap().put("go up", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('s'), "go down");
        label.getActionMap().put("go down", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('a'), "go left");
        label.getActionMap().put("go left", leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('d'), "go right");
        label.getActionMap().put("go right", rightAction);

        frame.add(label);
        frame.setVisible(true);
    }

    public class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() - 10);
        }
    }
    public class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }
    public class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());
        }
    }
    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
        }
    }
}
