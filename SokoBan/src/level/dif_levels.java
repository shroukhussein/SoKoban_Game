package level;

import Game.game;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import main.blue_box;
import main.main;
import main.player;
import main.wood_box;
import main.yellow_box;

public abstract class dif_levels {

   protected Color txt = new Color(51, 125, 155);
  protected  Image bg3;  
  protected  Image bluebox;
  protected  Image dest;
  protected  Image wiin;
 
    protected int px, py;
    protected int yy[];
    protected int yx[];
    protected int d;
    protected int dy[];
    protected int dx[];
    protected int w;
    protected int wy[];
    protected int wx[];
    protected player p;
  
    protected int x;
    protected int counter;
    protected int done;
    public wood_box y[];
    public dif_levels() {
        ImageIcon back3 = new ImageIcon("res/image/bg33.jpg");
        bg3 = back3.getImage();
        ImageIcon bbox = new ImageIcon("res/image/box_blue.png");
        bluebox = bbox.getImage();
        ImageIcon des = new ImageIcon("res/image/dest.png");
        dest = des.getImage();
        ImageIcon win = new ImageIcon("res/image/win.jpg");
        wiin = win.getImage();
      
        
        d=0;
        w=0;
        x = 0;
        counter = 0;
        done = 0;
        
       

    }
  public abstract void  paintComponent(Graphics g);
  
  public void keyPressed(KeyEvent e) {

        int KeyCode = e.getKeyCode();

        ////////////////////////////////////////////////////move left
        if (KeyCode == e.VK_LEFT) {
win();
            if (p.Px < 80) {
                p.Px = 64;

            } else {
                p.Px -= 32;
                counter++;

            }
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < w; j++) {
                    if (y[i].yX < wx[j] + 64 && y[i].yY < wy[j] + 60 && y[i].yY > wy[j] - 30 && y[i].yX > wx[j] - 50) {
                        y[i].yX = wx[j] + 64;
                        p.Px = y[i].yX + 64;
                        counter--;
                    } else if (p.Px < y[i].yX + 64 && p.Py < y[i].yY + 60 && p.Py > y[i].yY - 60 && p.Px > y[i].yX) {

                        if (p.Px < 80) {
                            p.Px = 64;

                        } else {
                            p.Px -= 32;

                        }
                        if (y[i].yX < 80) {
                            y[i].yX = 64;
                            p.Px = y[i].yX + 64;
                            counter--;

                        } else {
                            y[i].yX -= 64;
                            game.s.step();
                        }
                    }
                }
                for (int j = 0; j < x; j++) {
                    if (j != i) {
                        if (y[i].yX < y[j].yX + 64 && y[i].yY < y[j].yY + 60 && y[i].yY > y[j].yY - 30 && y[i].yX > y[j].yX - 50) {
                            y[i].yX = y[j].yX + 64;
                            p.Px = y[i].yX + 64;
                            counter--;
                        } else if (p.Px < y[i].yX + 64 && p.Py < y[i].yY + 60 && p.Py > y[i].yY - 60 && p.Px > y[i].yX) {

                            if (p.Px < 80) {
                                p.Px = 64;

                            } else {
                                p.Px -= 32;

                            }
                            if (y[i].yX < 80) {
                                y[i].yX = 64;
                                p.Px = y[i].yX + 64;
                                counter--;

                            } else {
                                y[i].yX -= 64;
                                game.s.step();
                            }
                        }
                    }

                }

            }
        }

////////////////////////////////////////////////////move right
        if (KeyCode == e.VK_RIGHT) {
win();
            if (p.Px > 580) {
                p.Px = 600;

            } else {
                p.Px += 32;
                counter++;
            }
            for (int i = 0; i < x; i++) {

                for (int j = 0; j < w; j++) {
                    if (y[i].yX < wx[j] + 32 && y[i].yY < wy[j] + 60 && y[i].yY > wy[j] - 30 && y[i].yX > wx[j] - 32) {
                        y[i].yX = wx[j] - 64;
                        p.Px = y[i].yX - 32;
                        counter--;
                    } else if (p.Px < y[i].yX + 32 && p.Py < y[i].yY + 60 && p.Py > y[i].yY - 60 && p.Px > y[i].yX - 32) {

                        if (p.Px > 580) {
                            p.Px = 600;

                        } else {
                            p.Px += 32;

                        }
                        if (y[i].yX >= 575) {
                            y[i].yX = 575;
                            p.Px = y[i].yX - 35;
                            counter--;
                        } else {
                            y[i].yX += 64;
                            game.s.step();

                        }

                    }
                }
                for (int j = 0; j < x; j++) {
                    if (j != i) {
                        if (y[i].yX < y[j].yX + 32 && y[i].yY < y[j].yY + 60 && y[i].yY > y[j].yY - 30 && y[i].yX > y[j].yX - 32) {
                            y[i].yX = y[j].yX - 64;
                            p.Px = y[i].yX - 32;
                            counter--;
                        } else if (p.Px < y[i].yX + 32 && p.Py < y[i].yY + 60 && p.Py > y[i].yY - 60 && p.Px > y[i].yX - 32) {

                            if (p.Px > 580) {
                                p.Px = 600;

                            } else {
                                p.Px += 32;

                            }
                            if (y[i].yX >= 575) {
                                y[i].yX = 575;
                                p.Px = y[i].yX - 35;
                                counter--;
                            } else {
                                y[i].yX += 64;
                                game.s.step();

                            }

                        }
                    }

                }

            }
        }
////////////////////////////////////////////////////move up
        if (KeyCode == e.VK_UP) {
win();
            if (p.Py <= 90) {
                p.Py = 90;

            } else {
                p.Py -= 32;
                counter++;
            }
            for (int i = 0; i < x; i++) {

                for (int j = 0; j < w; j++) {
                    if (y[i].yY < wy[j] + 64 && y[i].yY > wy[j] - 64 && y[i].yX < wx[j] + 60 && y[i].yX > wx[j] - 30) {
                        y[i].yY = wy[j] + 64;
                        p.Py = y[i].yY + 64;
                        counter--;
                    } else if (p.Py < y[i].yY + 55 && p.Py > y[i].yY && p.Px < y[i].yX + 60 && p.Px > y[i].yX - 30) {

                        if (p.Py <= 90) {
                            p.Py = 90;

                        } else {
                            p.Py -= 32;

                        }
                        if (y[i].yY <= 96) {
                            y[i].yY = 96;
                            p.Py = y[i].yY + 64;
                            counter--;
                        } else {
                            y[i].yY -= 64;
                            game.s.step();
                        }
                    }
                }
                for (int j = 0; j < x; j++) {
                    if (j != i) {
                        if (y[i].yY < y[j].yY + 64 && y[i].yY > y[j].yY - 64 && y[i].yX < y[j].yX + 60 && y[i].yX > y[j].yX - 30) {
                            y[i].yY = y[j].yY + 64;
                            p.Py = y[i].yY + 64;
                            counter--;
                        } else if (p.Py < y[i].yY + 55 && p.Py > y[i].yY && p.Px < y[i].yX + 60 && p.Px > y[i].yX - 30) {

                            if (p.Py <= 90) {
                                p.Py = 90;

                            } else {
                                p.Py -= 32;

                            }
                            if (y[i].yY <= 96) {
                                y[i].yY = 96;
                                p.Py = y[i].yY + 64;
                                counter--;
                            } else {
                                y[i].yY -= 64;
                                game.s.step();
                            }
                        }
                    }

                }
            }
        }
        ////////////////////////////////////////////////////move down
        if (KeyCode == e.VK_DOWN) {
win();
            if (p.Py >= 410) {
                p.Py = 410;

            } else {
                p.Py += 32;
                counter++;
            }
            for (int i = 0; i < x; i++) {

                for (int j = 0; j < w; j++) {
                    if (y[i].yY > wy[j] - 50 && y[i].yY < wy[j] + 64 && y[i].yX < wx[j] + 60 && y[i].yX > wx[j] - 30) {
                        y[i].yY = wy[j] - 64;
                        p.Py = y[i].yY - 64;
                        counter--;
                    } else if (p.Py > y[i].yY - 50 && p.Py < y[i].yY + 64 && p.Px < y[i].yX + 60 && p.Px > y[i].yX - 30) {

                        if (p.Py >= 410) {
                            p.Py = 410;

                        } else {
                            p.Py += 32;

                        }
                        if (y[i].yY >= 410) {
                            y[i].yY = 410;
                            p.Py = y[i].yY - 64;
                            counter--;

                        } else {
                            y[i].yY += 64;
                            game.s.step();
                        }
                    }
                }

                for (int j = 0; j < x; j++) {
                    if (j != i) {
                        if (y[i].yY > y[j].yY - 50 && y[i].yY < y[j].yY + 64 && y[i].yX < y[j].yX + 60 && y[i].yX > y[j].yX - 30) {
                            y[i].yY = y[j].yY - 64;
                            p.Py = y[i].yY - 64;
                            counter--;
                        } else if (p.Py > y[i].yY - 50 && p.Py < y[i].yY + 64 && p.Px < y[i].yX + 60 && p.Px > y[i].yX - 30) {

                            if (p.Py >= 410) {
                                p.Py = 410;

                            } else {
                                p.Py += 32;

                            }
                            if (y[i].yY >= 410) {
                                y[i].yY = 410;
                                p.Py = y[i].yY - 64;
                                counter--;

                            } else {
                                y[i].yY += 64;
                                game.s.step();
                            }
                        }
                    }

                }
            }
        }
        ////////////////////////////////////////////////////to quit
        if (KeyCode == e.VK_ESCAPE) {
            game.s.end();
            p.Px = px;
            p.Py = py;
            done = 0;
            counter = 0;

            for (int i = 0; i < x; i++) {
                y[i].yX = yx[i];
                y[i].yY = yy[i];
               
            }

            main.back();

        }
        ////////////////////////////////////////////////////to reset 
        if (KeyCode == e.VK_R) {
            game.s.restart();
            p.Px = px;
            p.Py = py;
            counter = 0;
            done = 0;
            for (int i = 0; i < x; i++) {
                y[i].yX = yx[i];
                y[i].yY = yy[i];
              

            }

        }
        /////////////////////////////////////nextlevel

    }
  public abstract void np(KeyEvent e);

//**********************************************************************
    public void control(KeyEvent e) {
        int KeyCode = e.getKeyCode();

        for (int i = 0; i < w; i++) {

            if (KeyCode == e.VK_LEFT) {

                if (p.Px < wx[i] + 64 && p.Py < wy[i] + 60 && p.Py > wy[i] - 40 && p.Px > wx[i]) {//left
                    p.Px = wx[i] + 64;
                    counter--;
                }
            }

            if (KeyCode == e.VK_RIGHT) {
                if (p.Px < wx[i] + 32 && p.Py < wy[i] + 64 && p.Py > wy[i] - 40 && p.Px > wx[i] - 32) {//right
                    p.Px = wx[i] - 32;
                    counter--;
                }
            }
            if (KeyCode == e.VK_UP) {
                if (p.Py < wy[i] + 64 && p.Py > wy[i] && p.Px < wx[i] + 64 && p.Px > wx[i] - 32) {//up
                    p.Py = wy[i] + 64;
                    counter--;
                }
            }
            if (KeyCode == e.VK_DOWN) {
                if (p.Py > wy[i] - 50 && p.Py < wy[i] + 64 && p.Px < wx[i] + 60 && p.Px > wx[i] - 30) {//down
                    p.Py = wy[i] - 64;
                    counter--;
                }
            }
        }
    }

//*****************************************************************************
    public void win() {
done=0;
        for (int i = 0; i < x; i++) {
            
            for (int j = 0; j < x; j++) {

                if (y[i].yX < dx[j] + 32 && y[i].yY < dy[j] + 20 && y[i].yY > dy[j] - 30 && y[i].yX > dx[j] - 32) {
                    if (done <= x) {
                        done++;
                    }
                 

                }

            }
        }

       
    }
}
