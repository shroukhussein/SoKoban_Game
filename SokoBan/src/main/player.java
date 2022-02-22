package main;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class player 
{
    public  int Px,Py;
    Image ch;
   public player(int x,int y)
   {
       Px=x;
       Py=y;
         ImageIcon c = new ImageIcon("res/image/character.png");
        ch = c.getImage();
   }
     public void paintComponent(Graphics g) {
         g.drawImage(ch, Px, Py, null);
     }
}
