import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton radioButton;
    JRadioButton radioButton2;
    JRadioButton radioButton3;
    ButtonGroup buttonGroup;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        radioButton = new JRadioButton();
        radioButton2 = new JRadioButton();
        radioButton3 = new JRadioButton();
        radioButton.setFocusable(false);
        radioButton2.setFocusable(false);
        radioButton3.setFocusable(false);
        radioButton3.addActionListener(this);
        radioButton2.addActionListener(this);
        radioButton.addActionListener(this);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        this.add(radioButton);
        this.add(radioButton2);
        this.add(radioButton3);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == radioButton){
            System.out.println("no");
        } else if (e.getSource() == radioButton2) {
            System.out.println("yes");


        }else if (e.getSource() == radioButton3){
            System.out.println("cum");
        }

    }
}
