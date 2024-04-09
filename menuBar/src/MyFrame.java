import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("FIle");
        JMenu editMenu = new JMenu("edit");
        JMenu helpMenu = new JMenu("help");
        JMenuItem saveItem = new JMenuItem("save");
        JMenuItem loadItem = new JMenuItem("load");
        JMenuItem exitItem = new JMenuItem("exit"); //System.exit(0);

        //loadItem.SetMnemonic(KeyEvent.VK_L);// l for load

        fileMenu.add(saveItem);
        fileMenu.add(loadItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
