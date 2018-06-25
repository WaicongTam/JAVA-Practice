import javax.swing.*;
import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleAnimation {
    int x = 70;
    int y = 70;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();        
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(600, 600);
        frame.setVisible(true);

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

    class buttonListener implements ActionListener{
        public actionPerformed(ActionEvent event) {
            
        }
    }

}