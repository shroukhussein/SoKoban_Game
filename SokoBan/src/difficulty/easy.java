package difficulty;
import Game.game;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class easy  {
  
     Image box;
    Image help;
    public easy()
    {
         ImageIcon b_level = new ImageIcon("res/image/box_gray.png");
        box = b_level.getImage();
        ImageIcon h_level = new ImageIcon("res/image/help.jpg");
        help = h_level.getImage();
    }
    
    public  void paintComponent(Graphics g)
    {
         
            g.drawImage(help, 0, 20, null);
            g.setFont(new Font("Arial", Font.BOLD, 100));
            g.setColor(Color.YELLOW);
            g.drawString("Easy", 250, 300);
            g.setFont(new Font("Arial", Font.BOLD, 50));
            g.setColor(Color.yellow);
            g.drawImage(box, 125, 350, null);
            g.drawString("1", 140, 400);
            g.drawImage(box, 225, 350, null);
            g.drawString("2", 240, 400);
            g.drawImage(box, 325, 350, null);
            g.drawString("3", 340, 400);
            g.drawImage(box, 425, 350, null);
            g.drawString("4", 440, 400);
            g.drawImage(box, 525, 350, null);
            g.drawString("5", 540, 400);
          
    }
    
    
    
    
}
