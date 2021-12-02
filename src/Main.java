import java.awt.EventQueue;
import javax.swing.JFrame;

public class Main extends JFrame {

    public Main()  {
        initUI();
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Main m = new Main();
            m.setVisible(true);
        });

    }

    private void initUI() {
        add(new Board());
        setSize(350, 250); // note: height includes top-bar :/
        setTitle("Oy oy m8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // null makes the frame centered
    }



}
