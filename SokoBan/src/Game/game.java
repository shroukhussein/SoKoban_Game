package Game;
import Audio.sound;
import difficulty.diff;
import difficulty.easy;
import difficulty.mid;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import levels.diff_1;
import levels.diff_2;
import levels.diff_3;
import levels.diff_4;
import levels.diff_5;
import levels.easy_1;
import levels.easy_2;
import levels.easy_3;
import levels.easy_4;
import levels.easy_5;
import levels.mid_1;
import levels.mid_2;
import levels.mid_3;
import levels.mid_4;
import levels.mid_5;
import main.main;
import static main.main.main;
import main.player;
import manage.KeyManage;
import manage.MouseHandler;

public class game extends JFrame {

    Image dbImage;
    Graphics dbg;

   help h = new help();
   menu m = new menu();
    difficult d = new difficult();
    easy e = new easy();
    mid mi = new mid();
    diff di = new diff();
   
   public static sound s=new sound();
   
  
  public static easy_1 e1=new easy_1();
  public static easy_2 e2=new easy_2();
  public static easy_3 e3=new easy_3();
  public static easy_4 e4=new easy_4();
  public static easy_5 e5=new easy_5();
  
  
  public static mid_1 m1=new mid_1();
  public static mid_2 m2=new mid_2();
  public static mid_3 m3=new mid_3();
  public static mid_4 m4=new mid_4();
  public static mid_5 m5=new mid_5();

  public static diff_1 d1=new diff_1();
  public static diff_2 d2=new diff_2();
  public static diff_3 d3=new diff_3();
  public static diff_4 d4=new diff_4();
  public static diff_5 d5=new diff_5();
  
  
    public static boolean menu = false;
    public static boolean help_start = false;
    public static boolean backed = false;
    public static boolean difficulty = true;
    public static boolean easy = false;
    public static boolean mid = false;
    public static boolean hard = false;
    
    public static boolean level_1=false;
    public static boolean level_2=false;
    public static boolean level_3=false;
    public static boolean level_4=false;
    public static boolean level_5=false;
    
    
    
     public static boolean level_6=false;
     public static boolean level_7=false;
     public static boolean level_8=false;
     public static boolean level_9=false;
     public static boolean level_10=false;
     
     public static boolean level_11=false;
     public static boolean level_12=false;
     public static boolean level_13=false;
     public static boolean level_14=false;
     public static boolean level_15=false;

    public static Rectangle startButton = new Rectangle(200, 300, 80, 300);
    public static Rectangle quitButton = new Rectangle(200, 400, 80, 300);
    public static Rectangle helpButton = new Rectangle(50, 600, 40, 80);
    public static Rectangle backButton = new Rectangle(50, 600, 40, 80);
    public static Rectangle easyButton = new Rectangle(200, 350, 70, 300);
    public static Rectangle midButton = new Rectangle(200, 450, 70, 300);
    public static Rectangle hardtButton = new Rectangle(200, 550, 70, 300);
 

    public game() {
        
        setTitle("Sokoban");
        setSize(700, 660);
        setResizable(false);
        setVisible(true);
        setBackground(Color.black);
        this.setLocationRelativeTo(null);
        this.addMouseListener(new MouseHandler());
        this.addMouseMotionListener(new MouseHandler());
        addKeyListener(new KeyManage()); 
       
        
    }

    public void paint(Graphics g) {
        dbImage = createImage(getWidth(), getHeight());
        dbg = dbImage.getGraphics();
        paintComponent(dbg);
        g.drawImage(dbImage, 0, 0, this);
    }

    public void paintComponent(Graphics g)
    {
        if (menu)
        {
            m.paintComponent(g);
          
        }
         if (help_start) 
        {
            h.paintComponent(g);
        }
         if (difficulty)
        {
            d.paintComponent(g);
        }
        else if (easy)
        {
            e.paintComponent(g);
        }
        else if (mid)
        {
            mi.paintComponent(g);
        }
        else if (hard) 
        {
            di.paintComponent(g);
        }
        else if(level_1)
        {
             e1.paintComponent(g);
          
        }
         else if(level_2)
        {
             e2.paintComponent(g);
          
        }
         else if(level_3)
        {
             e3.paintComponent(g);
          
        }
         else if(level_4)
        {
             e4.paintComponent(g);
          
        }
         else if(level_5)
        {
             e5.paintComponent(g);
          
        }
           else if(level_6)
        {
             m1.paintComponent(g);
          
        }
           else if(level_7)
        {
             m2.paintComponent(g);
          
        }
           else if(level_8)
        {
             m3.paintComponent(g);
          
        }
        
           else if(level_9)
        {
             m4.paintComponent(g);
          
        }
           else if(level_10)
        {
             m5.paintComponent(g);
          
        }
           else if(level_11)
        {
             d1.paintComponent(g);
          
        }
            else if(level_12)
        {
             d2.paintComponent(g);
          
        }
           else if(level_13)
        {
             d3.paintComponent(g);
          
        }
           else if(level_14)
        {
             d4.paintComponent(g);
          
        }
           else if(level_15)
        {
             d5.paintComponent(g);
          
        }
        
         repaint();
    }

}
