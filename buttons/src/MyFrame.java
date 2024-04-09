import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame(){

        ImageIcon icon = new ImageIcon("reires.png");

        button = new JButton();
        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(true);
        button.setBounds(200,100, 100, 50);
        button.addActionListener(this);
        button.setText("im a button");
        button.setFocusable(false);
        //button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.TOP);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setForeground(Color.CYAN);
        button.setBackground(Color.red);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("was pressed");
            label.setVisible(false);
        }
    }
}
