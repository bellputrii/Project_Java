import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.PublicKey;

public class GAMEGUI extends JFrame {

    private JLabel backgroundLabel;
    private JLabel characterLabel;
    private JLabel textLabel;

    private int charX, charY;

    public GAMEGUI(){
        setTitle("Game Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setResizable(false);

        setBackgroundImage();
        addGameCharacter();
        addKeyboardListener();
        addTextLabel();

        setFocusable(true);
        requestFocusInWindow();
        setVisible(true);
    }

    public void setBackgroundImage(){
        ImageIcon bgImage = new ImageIcon("src/assets/bg.jpeg.jpg");
        this.backgroundLabel = new JLabel(bgImage);
        this.backgroundLabel.setBounds(0,0,800,600); // x,y 0,0 itu dari atas kanan pojok
        add(this.backgroundLabel);
    }
    public void addGameCharacter(){
       ImageIcon characterIcon = new ImageIcon("src/assets/char.jpeg.jpg");
       characterLabel = new JLabel(characterIcon);
       charX = 350;
       charY = 300;
       characterLabel.setBounds(charX,charY,100,167);
       backgroundLabel.add(characterLabel);
    }

    public void addTextLabel(){
        textLabel = new JLabel("Welcome!!!!");
        textLabel.setFont(new Font("Arial", Font.BOLD, 24));
        textLabel.setForeground(Color.BLACK);
        textLabel.setBounds(350,200,200,30);
        backgroundLabel.add(textLabel);
    }
    public void addKeyboardListener(){
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        charY -= 10;
                        break;
                    case KeyEvent.VK_DOWN:
                        charY += 10;
                        break;
                }
                    switch (keyCode){
                    case KeyEvent.VK_RIGHT:
                        charX += 10;
                        break;
                    case KeyEvent.VK_LEFT:
                        charX -= 10;
                        break;
                }
                characterLabel.setLocation(charX, charY);
            }


            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

}
