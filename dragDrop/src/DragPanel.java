import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    ImageIcon icon = new ImageIcon("reires.png");
    final int WIDTH = icon.getIconWidth();
    final int HEIGHT = icon.getIconHeight();
    Point imageCorner;
    Point prevPt;
    DragPanel(){
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void paintComponent(Graphics G){
        super.paintComponent(G);
        icon.paintIcon(this, G, (int)imageCorner.getX(), (int)imageCorner.getY());
    }
    private class ClickListener extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
        }
    }
    private class DragListener extends MouseMotionAdapter{
        @Override
        public void mouseDragged(MouseEvent e) {
            Point currentPt = e.getPoint();
            imageCorner.translate((int)(currentPt.getX() - prevPt.getX()), (int)(currentPt.getY() - prevPt.getY()));
            prevPt = currentPt;
            repaint();
        }
    }

}
