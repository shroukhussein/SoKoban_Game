package Game;
import Game.game;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class menu {

    protected Image menuee;
   
    public menu()
    {
        ImageIcon m_level = new ImageIcon("res/image/menu.jpg");
        menuee = m_level.getImage();
    }

    public void paintComponent(Graphics g) {
       
        g.drawImage(menuee, 0, 20, null);
        g.setFont(new Font("Arial", Font.BOLD, 50));
        g.setColor(Color.YELLOW);
        g.drawString("Start Game", game.startButton.x + 15, game.startButton.y + 55);
        g.setColor(Color.YELLOW);
        g.drawString("Quit Game", game.quitButton.x + 20, game.quitButton.y + 65);
       
    }

}
