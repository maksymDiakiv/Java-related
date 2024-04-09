import javax.swing.*;

public class MyFrame extends JFrame {
    DragPanel dragPanel = new DragPanel();
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("drag and drop");
        this.setSize(600, 600);
        this.add(dragPanel);
        //this.setLayout(null);
        this.setVisible(true);
    }
}
