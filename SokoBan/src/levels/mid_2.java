/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levels;

import Game.game;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import level.mid_levels;
import main.blue_box;
import main.main;
import main.player;
import main.yellow_box;
import manage.KeyManage;

public class mid_2 extends mid_levels {
    
   
   
     int[][] map
            = {
                {5, 5, 5, 5, 5, 5, 1, 1, 4},
                {1, 3, 1, 3, 1, 3, 3, 1, 1},
                {1, 1, 1, 1, 1, 4, 4, 1, 4},
                {1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 3, 1, 1, 2, 1, 1, 1, 1},
                {1, 1, 5, 4, 5, 1, 1, 1, 1}
            };
    

    public mid_2() {
        
        yy = new int[5];
        yx = new int[5];

        dy = new int[5];
        dx = new int[5];

        wy = new int[8];
        wx = new int[8];
        
        y=new blue_box[5];
    
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 9; j++) {
                if (map[i][j] == 2) {
                    py = i * 64 + 90;
                    px = j * 64 + 80;
                    p = new player(px, py);
                } else if (map[i][j] == 3) {
                    yy[x] = i * 64 + 90;
                    yx[x] = j * 64 + 64;
                    y[x] = new blue_box(yx[x], yy[x]);
                    x++;
                }

            }

        }
    }

    
    public void paintComponent(Graphics g) {
        g.drawImage(bg2, 0, 0, null);
        for (int i = 0; i < 664; i += 64) {

            g.drawImage(wall, i, 28, null);
        }
        for (int i = 0; i < 664; i += 64) {

            g.drawImage(wall, i, 475, null);
        }
        for (int i = 90; i < 464; i += 64) {

            g.drawImage(wall, 0, i, null);
        }
        for (int i = 90; i < 464; i += 64) {

            g.drawImage(wall, 640, i, null);
        }
        w = 0;
        d = 0;
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 9; j++) {

                if (map[i][j] == 4) {
                    dx[d] = j * 64 + 80;
                    dy[d] = i * 64 + 100;
                    g.drawImage(dest, dx[d], dy[d], null);
                    d++;
                }
                if (map[i][j] == 5) {
                    wx[w] = (j * 64 + 64);
                    wy[w] = (i * 64 + 90);
                    g.drawImage(wall, wx[w], wy[w], null);
                    w++;
                }
            }
        }
        p.paintComponent(g);
        for (int i = 0; i < 4; i++) {
            y[i].paintComponent(g);
        }

        g.setColor(Color.black);
        g.fillRect(0, 540, 700, 150);
        g.setColor(txt);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Steps : " + counter + "", 550, 580);
        g.drawString("Box : " + x + "", 550, 610);
        g.drawString("difficult : mid", 550, 640);

        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Restart : R", 10, 560);
        g.drawString("Next level : 8", 10, 585);
        g.drawString("Previous level : P", 10, 610);
        g.drawString("Quit : Esc", 10, 635);
        g.setColor(Color.gray);
        g.setFont(new Font("Arial", Font.BOLD, 80));
        g.drawString("Level 7", 250, 620);
    
      if (done >= x) {
        
            g.drawImage(wiin, 0, 0, null); 
        }
           if(done==x)
           {
               game.s.win();
            done++;   
           }

    }

    public void np(KeyEvent e)
    {
         int KeyCode = e.getKeyCode();
         if( done >= x)
         {
             if (KeyCode == e.VK_8 || KeyCode == e.VK_NUMPAD8) {

            game.s.next();
            game.level_7 = false;
            main.level_8();
            p.Px = px;
            p.Py = py;
            counter = 0;
            done = 0;
            for (int i = 0; i < x; i++) {
                y[i].yX = yx[i];
                y[i].yY = yy[i];
             
            }
            }
        }
        ////////////////////////////////perv level
        if (KeyCode == e.VK_P) {
            game.s.end();
            game.level_7 = false;
            main.level_6();
            p.Px = px;
            p.Py = py;
            counter = 0;

            for (int i = 0; i < x; i++) {
                y[i].yX = yx[i];
                y[i].yY = yy[i];
            }
        }
    }
    
    
}
