package walter;

import javax.swing.JFrame;

public class DrawOnWalter extends JFrame {

    public DrawOnWalter()  {
        initUI();
    }

    private void initUI() {
        add(new WalterBoard());
        setSize(500, 350); // note: height includes top-bar :/
        setTitle("Oy oy m8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // null makes the frame centered
    }



}
