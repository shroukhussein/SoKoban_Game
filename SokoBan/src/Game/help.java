package Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class help
{
    Image help;
    Image menuee;
   
   
    public help()
    {
        ImageIcon h_level = new ImageIcon("res/image/help.jpg");
        help = h_level.getImage();
     
    }

    
    public void paintComponent(Graphics g) {
 
            g.drawImage(help, 0, 20, null);
            g.setFont(new Font("Arial", Font.BOLD, 55));
            g.setColor(Color.YELLOW);
            g.drawString("How To Play !!", 150, 250);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.setColor(Color.WHITE);
            g.drawString("Skoban is a type of transport puzzle, in", 140, 300);
            g.drawString("which the player pushes boxes in a warehouse", 140, 330);
            g.drawString("The player can only push the boxes but can ", 140, 360);
            g.drawString("not pull them and can only push one box at a time .", 140, 390);
            g.setFont(new Font("Arial", Font.BOLD, 40));
            g.setColor(Color.YELLOW);
            g.drawString("Objective of the game :", 150, 450);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.setColor(Color.WHITE);
            g.drawString("The aim of the game is to push all the", 140, 500);
            g.drawString("available boxes to a designated", 140, 530);
            g.drawString("locations (Goal). ", 140, 560);
    }
}
