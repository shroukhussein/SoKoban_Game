package main;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class blue_box {
      public int yX,yY;
      Image ch;
      
   public blue_box(int x,int y)
   {
       yX=x;
       yY=y;
         ImageIcon c = new ImageIcon("res/image/box_blue.png");
         ch = c.getImage();
   }
     public void paintComponent(Graphics g) {
         g.drawImage(ch, yX, yY, null);
     }
}
