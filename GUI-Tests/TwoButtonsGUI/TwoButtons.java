import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButtons{
    JFrame frame;
    JButton button1;
    JButton button2;
    JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1 = new JButton("GO FUCKING CHANGE IT!");
        button1.addActionListener(new PaintListener());

        button2 = new JButton("SHOW ME THE FUCKING RGB!");
        button1.addActionListener(new LabelListener());


        label = new JLabel("FUCKING LABEL!");

        MyDrawPanel drawpanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button1);
        frame.getContentPane().add(BorderLayout.CENTER, drawpanel);
        frame.getContentPane().add(BorderLayout.EAST, button2);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.setSize(1000, 500);
        frame.setVisible(true);
    }

    
    class PaintListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.repaint();
        }
    }

    class LabelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("Nope!");
        }
    }
}