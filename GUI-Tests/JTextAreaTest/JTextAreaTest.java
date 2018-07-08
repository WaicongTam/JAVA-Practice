import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTextAreaTest implements ActionListener {
    JTextArea text;

    public static void main(String[] args) {
        JTextAreaTest gui = new JTextAreaTest();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Just do IT");
        button.addActionListener(this);
        text = new JTextArea(10, 20);
        text.setLineWrap(true);

        JScrollPane scroller1 = new JScrollPane(text);
        scroller1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        panel.add(scroller1);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        frame.setSize(350, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        text.append("ADDING ADDING ADDING \n");
    }
}