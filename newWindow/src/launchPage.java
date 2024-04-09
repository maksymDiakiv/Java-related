import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class launchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("open a new window");
    launchPage(){

        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.add(myButton);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton){
            frame.dispose();
            newWIndow myWindow = new newWIndow();
        }
    }
}
