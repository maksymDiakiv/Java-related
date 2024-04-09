import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    MyFrame (){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        button = new JButton("submit");
        button.addActionListener(this);
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.BOLD, 35));
        textField.setForeground(Color.gray);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.BLUE);
        //textField.setText("username");
        //textField.setEditable(false);

        this.add(textField);
        this.add(button);
        this.pack();//adjusting size of frame to fit all components
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println(textField.getText());
        }
    }
}
