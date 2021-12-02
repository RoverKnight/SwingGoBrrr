import org.junit.Test;
import swingTimer.SwingTimer;
import walter.DrawOnWalter;

import java.awt.*;

public class TestThatShit {

    @Test
    public void drawOnWalter() {
        EventQueue.invokeLater(() -> {
            DrawOnWalter drawOnWalter = new DrawOnWalter();
            drawOnWalter.setVisible(true);
        });

        while (true) {} // keeps the program from just shutting off because test is finished
    }

    @Test
    public void swingTimer() {
        EventQueue.invokeLater(() -> {
            SwingTimer t = new SwingTimer();
            t.setVisible(true);
        });

        while (true) {}
    }








}
