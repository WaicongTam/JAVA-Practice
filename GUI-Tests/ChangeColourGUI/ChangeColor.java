import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeColor implements ActionListener{
    JFrame frame;
    JButton button;

    public static void main(String[] args) {
        ChangeColor gui = new ChangeColor();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("GO FUCKING CHANGE IT!");
        button.addActionListener(this);

        MyDrawPanel drawpanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawpanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        frame.repaint();
    }
}