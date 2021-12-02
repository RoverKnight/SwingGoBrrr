package swingTimer;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SwingTimer extends JFrame {

    public SwingTimer() {

        initUI();
    }

    private void initUI() {

        add(new SwingTimerBoard());

        setSize(500, 350);
        pack();

        setTitle("Star");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}