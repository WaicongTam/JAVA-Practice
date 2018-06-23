import javax.swing.*;
import java.awt.event.*;

public class SimpleGUI1 implements ActionListener{    
    JButton button;
    
    public static void main (String[] args) {
        SimpleGUI1 gui = new SimpleGUI1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame("Stupid as hell");
        button = new JButton("Click me!");

        button.addActionListener(this);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        button.setText("Fucked up!");
    }
}