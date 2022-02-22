package Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class difficult {

    Image difficut;
    public Rectangle backButton = new Rectangle(50, 600, 40, 80);
    public Rectangle easyButton = new Rectangle(200, 350, 70, 300);
    public Rectangle midButton = new Rectangle(200, 450, 70, 300);
    public Rectangle hardtButton = new Rectangle(200, 550, 70, 300);

    public difficult() {
        ImageIcon d_level = new ImageIcon("res/image/Difficulty.jpg");
        difficut = d_level.getImage();
    }

    public void paintComponent(Graphics g) {
      
        g.drawImage(difficut, 0, 20, null);
        g.setFont(new Font("Arial", Font.BOLD, 100));
        g.setColor(Color.YELLOW);
        g.drawString("Difficulty", 150, 300);
        g.setFont(new Font("Arial", Font.BOLD, 50));
        g.setColor(Color.YELLOW);
        g.drawString("Easy", easyButton.x + 100, easyButton.y + 40);
        g.setFont(new Font("Arial", Font.BOLD, 50));
        g.setColor(Color.YELLOW);
        g.drawString("Medium", midButton.x + 60, midButton.y + 50);
        g.setFont(new Font("Arial", Font.BOLD, 50));
        g.setColor(Color.YELLOW);
        g.drawString("Hard", hardtButton.x + 100, hardtButton.y + 50);
     
    }
}
