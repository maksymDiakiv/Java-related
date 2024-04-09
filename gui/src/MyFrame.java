import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        //jframe a gui window to add components to

        this.setTitle("Program");//title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //exit out of application
        this.setResizable(false);  //prevent frame from being resized
        this.setSize(420, 420);    //set x-dim and y-dim
        this.setVisible(true); //make frame visible (at this point you already have a tiny window)

        //ImageIcon imageIcon = new ImageIcon(url); create an imageIcon
        //frame.setIconImage(imageIcon.getImage()); change icon of frame
        this.getContentPane().setBackground(Color.black);//changes color of background
        //setBackground(new Color(r,g,b)
    }
}
