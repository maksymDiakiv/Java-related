import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Image img;
    MyPanel(){
        img = new ImageIcon("reires.png").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }
    @Override
    public void paint(Graphics g){

        Graphics2D g2d = (Graphics2D) g;
        //g2d.setPaint(Color.CYAN);
        //g2d.setStroke(new BasicStroke(5));
        //g2d.drawLine(0,0,500,500);

        //g2d.drawRect(0,0,100,200);
        //g2d.fillRect(0,0,100,200);
        //g2d.fillOval(0,0,100,100);
//        g2d.setPaint(Color.red);
//        g2d.fillArc(0,0,100,100,0,180);
//        g2d.setPaint(Color.white);
//        g2d.fillArc(0,0,100,100,180,180);
//        int[] x = {150,250,350};
//        int[] y = {300,150,300};
//        g2d.drawPolygon(x,y,3);
//        g2d.setFont(new Font("Ink Free", Font.BOLD,50));
//        g2d.drawString("U R a winner", 50,50);
          g2d.drawImage(img, 0, 0, null);

    }
}
