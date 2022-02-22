

package manage;
import Game.game;
import main.main;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


 public class MouseHandler extends MouseAdapter
    {
        @Override
        public void mousePressed(MouseEvent e)
        {
            int mx = e.getX();
            int my = e.getY();
            
            if (game.menu)//كل دة مايحصلش غير ف صفحة المينيو
            {
                /////////////////لما يدوس ع زرار الهيلب
                if (mx > game.helpButton.x && mx < game.helpButton.x + game.startButton.width+3
                        && my > game.helpButton.y && my < game.helpButton.y + game.helpButton.height)
                {
                   
                   main.help();
                }
                /////////////////لما يدوس ع زرار الستارت
                if (mx > game.startButton.x && mx < game.startButton.x + game.startButton.width + 100
                        && my > game.startButton.y && my < game.startButton.y + game.startButton.height) 
                {
                    
                    main.start();
                }
                 /////////////////لما يدوس ع زرار الخروج
                if (mx > game.quitButton.x && mx < game.quitButton.x + game.quitButton.width + 100
                        && my > game.quitButton.y && my < game.quitButton.y + game.quitButton.height)
                {
                    main.quit();
                }
            }

           else if (game.difficulty)///كل دة مايحصلش غير ف صفحة الديفيقلت
           {
               //لما يدوس ع زرار اليزى
                if (mx > game.easyButton.x && mx < game.easyButton.x + game.easyButton.width + 100
                        && my > game.easyButton.y && my < game.easyButton.y + game.easyButton.height) 
                {
                   main.easy();
                }//لما يدوس ع زرار الميد
               if (mx > game.midButton.x && mx < game.midButton.x + game.midButton.width + 100
                        && my > game.midButton.y && my < game.midButton.y + game.midButton.height)
               {
                    main.mid();
                }
               ///لما يدوس ع زرار الهارد
                if (mx > game.hardtButton.x && mx < game.hardtButton.x + game.hardtButton.width + 100
                        && my > game.hardtButton.y && my < game.hardtButton.y + game.hardtButton.height)
                {
                    main.hard();
                }
            }
           else if(game.easy)
           {
               if(mx>125&&mx<125+64&&my>350&&my<350+64)
               {
                   
                   main.level_1();
               }
               
               if(mx>225&&mx<225+64&&my>350&&my<350+64)
               {
                   main.level_2();
               }
               
                if(mx>325&&mx<325+64&&my>350&&my<350+64)
               {
                   main.level_3();
               }
                 if(mx>425&&mx<425+64&&my>350&&my<350+64)
               {
                   main.level_4();
               }
                   if(mx>525&&mx<525+64&&my>350&&my<350+64)
               {
                   main.level_5();
               }
           }
             else if(game.mid)
           {
               if(mx>125&&mx<125+64&&my>350&&my<350+64)
               {
                   main.level_6();
               }
                
               if(mx>225&&mx<225+64&&my>350&&my<350+64)
               {
                   main.level_7();
               }
               
                if(mx>325&&mx<325+64&&my>350&&my<350+64)
               {
                  main.level_8();
               }
                
                if(mx>425&&mx<425+64&&my>350&&my<350+64)
              {
                 main.level_9();
              }
                  if(mx>525&&mx<525+64&&my>350&&my<350+64)
              {
                main.level_10();
            }
                 
           }
            else if(game.hard)
           {
               if(mx>125&&mx<125+64&&my>350&&my<350+64)
               {
                   main.level_11();
               }
                
                if(mx>225&&mx<225+64&&my>350&&my<350+64)
               {
                   main.level_12();
               }
               
                if(mx>325&&mx<325+64&&my>350&&my<350+64)
               {
                  main.level_13();
               }
                
                if(mx>425&&mx<425+64&&my>350&&my<350+64)
              {
                 main.level_14();
              }
                  if(mx>525&&mx<525+64&&my>350&&my<350+64)
              {
                main.level_15();
              }
               
            }
            
//////لما يدوس ع زرار باك
           if (mx > game.backButton.x + 20 && mx < game.backButton.x + game.backButton.width + 20
                    && my > game.backButton.y && my < game.backButton.y + game.backButton.height) 
           {
                main.back();
            }
        }

    }