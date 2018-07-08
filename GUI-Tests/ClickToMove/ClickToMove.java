import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickToMove implements ActionListener{
    int x = 70;
    int y = 70;
    JButton button;
    JFrame frame;

    public static void main(String[] args) {
        ClickToMove gui = new ClickToMove();
        gui.go();        
    }

    public void go() {
        JFrame frame = new JFrame();
        JButton button = new JButton("Move it!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setSize(600, 600);
        frame.setVisible(true);          
    }

    public void actionPerformed(ActionEvent event) {
        for (int i = 0; i < 130; i++) {
            x++;
            y++;
            drawPanel.repaint();
            try {
                Thread.sleep(50);
                } catch(Exception ex) { }
            }
        }

    class MyDrawPanel extends JPanel{
        public void paintComponent(Graphics g) {    
            g.setColor(Color.white);
            g.fillRect(0, 0, getWidth(), getHeight());
            
            g.setColor(Color.green);
            g.fillOval(x, y, 40, 40);
        }
    }

}