package levels;

import Game.game;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import level.easy_levels;

import main.main;
import main.player;
import main.yellow_box;
import manage.KeyManage;

public class easy_2 extends easy_levels {

    public int[][] map
            = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 3, 3, 1, 1, 4, 1, 1},
                {1, 1, 5, 1, 1, 5, 5, 1, 1},
                {1, 1, 5, 4, 1, 5, 4, 1, 1},
                {1, 3, 5, 1, 5, 5, 5, 1, 1},
                {1, 1, 1, 5, 2, 1, 1, 1, 1}
            };

   

    public easy_2() {
        yy = new int[3];
        yx = new int[3];

        dy = new int[3];
        dx = new int[3];

        wy = new int[10];
        wx = new int[10];
        y = new yellow_box[3];
      
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 9; j++) {
                if (map[i][j] == 2) {
                    px = j * 64 + 80;
                    py = i * 64 + 90;
                    p = new player(px, py);
                } else if (map[i][j] == 3) {
                    yy[x] = i * 64 + 90;
                    yx[x] = j * 64 + 64;
                    y[x] = new yellow_box(yx[x], yy[x]);
                    x++;
                }

            }

        }

    }

    public void paintComponent(Graphics g) {
        g.drawImage(bg1, 0, 0, null);
        for (int i = 0; i < 664; i += 64) {

            g.drawImage(box_gray, i, 28, null);
        }
        for (int i = 0; i < 664; i += 64) {

            g.drawImage(box_gray, i, 475, null);
        }
        for (int i = 90; i < 464; i += 64) {

            g.drawImage(box_gray, 0, i, null);
        }
        for (int i = 90; i < 464; i += 64) {

            g.drawImage(box_gray, 640, i, null);
        }

        w = 0;
        d = 0;
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 9; j++) {

                if (map[i][j] == 4) {
                    dx[d] = (j * 64 + 80);
                    dy[d] = (i * 64 + 100);
                    g.drawImage(dest, dx[d], dy[d], null);
                    d++;
                }
                if (map[i][j] == 5) {
                    wx[w] = (j * 64 + 64);
                    wy[w] = (i * 64 + 90);
                    g.drawImage(box_gray, wx[w], wy[w], null);
                    w++;
                }
            }
        }
        p.paintComponent(g);
        for (int i = 0; i < 3; i++) {
            y[i].paintComponent(g);
        }
        g.setColor(Color.black);
        g.fillRect(0, 540, 700, 150);
        g.setColor(txt);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Steps : " + counter + "", 550, 580);
        g.drawString("Box : " + x + "", 550, 610);
        g.drawString("difficult : easy", 550, 640);

        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Restart : R", 10, 560);
        g.drawString("Next level : 3", 10, 585);
        g.drawString("Previous level : P", 10, 610);
        g.drawString("Quit : Esc", 10, 635);
        g.setColor(Color.gray);
        g.setFont(new Font("Arial", Font.BOLD, 80));
        g.drawString("Level 2", 250, 620);
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
             if (KeyCode == e.VK_3 || KeyCode == e.VK_NUMPAD3) {

            game.s.next();
            game.level_2 = false;
            main.level_3();
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
            game.level_2 = false;
            main.level_1();
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
