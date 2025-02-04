import javax.swing.*;

public class GameGUI extends JFrame {

    private JLabel backgroundLabel;
    private JLabel characterLabel;
    private JLabel textLabel;
    public GameGUI(){
        setTitle("Game Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setFocusable(true);
        requestFocusInWindow();
        setVisible(true);
    }
}
