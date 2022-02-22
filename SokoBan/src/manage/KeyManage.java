package manage;

import Game.game;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import levels.easy_1;
import main.main;
import main.player;

public class KeyManage extends KeyAdapter {

    public void keyPressed(KeyEvent e) {
        int KeyCode = e.getKeyCode();
        if (game.level_1) {

            game.e1.keyPressed(e);
            game.e1.control(e);
            game.e1.np(e);

        }
        if (game.level_2) {
            game.e2.keyPressed(e);
            game.e2.control(e);
            game.e2.np(e);
        }
        if (game.level_3) {
            game.e3.keyPressed(e);
            game.e3.control(e);
            game.e3.np(e);
        }
        if (game.level_4) {
            game.e4.keyPressed(e);
            game.e4.control(e);
            game.e4.np(e);
        }
        if (game.level_5) {
            game.e5.keyPressed(e);
            game.e5.control(e);
            game.e5.np(e);
        }
        if (game.level_6) {
            game.m1.keyPressed(e);
            game.m1.control(e);
            game.m1.np(e);
        }

        if (game.level_7) {
            game.m2.keyPressed(e);
            game.m2.control(e);
            game.m2.np(e);
        }

        if (game.level_8) {
            game.m3.keyPressed(e);
            game.m3.control(e);
            game.m3.np(e);
        }

        if (game.level_9) {
            game.m4.keyPressed(e);
            game.m4.control(e);
           game.m4.np(e);
        }
        if (game.level_10) {
            game.m5.keyPressed(e);
            game.m5.control(e);
            game.m5.np(e);
        }

        if (game.level_11) {
            game.d1.keyPressed(e);
            game.d1.control(e);
            game.d1.np(e);
        }
         if(game.level_12)
      {
          game.d2.keyPressed(e);
          game.d2.control(e);
          game.d2.np(e);
      }
          if(game.level_13)
      {
          game.d3.keyPressed(e);
          game.d3.control(e);
          game.d3.np(e);
      }
                 
          if(game.level_14)
      {
          game.d4.keyPressed(e);
          game.d4.control(e);
           game.d4.np(e);
      }
          if(game.level_15)
      {
          game.d5.keyPressed(e);
          game.d5.control(e);
           game.d5.np(e);
      }
        
    }

}
