import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class sliderDemo implements ChangeListener{
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    sliderDemo(){
        frame = new JFrame("sliderDemo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);

        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);

        slider.setOrientation(SwingConstants.VERTICAL);

        label.setText("C = " + slider.getValue());
        slider.addChangeListener(this);
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("c = " + slider.getValue());
    }
}
