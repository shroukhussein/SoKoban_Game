package main;

import Game.game;


public class main {

    public static void main(String[] args) {
       
        game g=new game();
    }

    
    
    
    public static void help() {
        /////////////////قفلنا صفحة ال مينيو و فتحنا ال هيلب
        game.help_start = true;
        game.menu = false;
    }

    public static void back() {
       
        if (game.help_start) {
            game.help_start = false;
            game.menu = true;
        }
        if (game.difficulty) {
            game.difficulty = false;
            game.menu = true;
        }
        if (game.easy) {
            game.easy = false;
            game.menu = false;
            game.difficulty = true;
        }
        if (game.mid) {
            game.mid = false;
            game.menu = false;
            game.difficulty = true;
        }
        if (game.hard) {
            game.hard = false;
            game.menu = false;
            game.difficulty = true;
        }
        if (game.level_1) {
            game.level_1 = false;
            game.easy = true;
        }
        if (game.level_2) {
            game.level_2 = false;
            game.easy = true;
        }
        if (game.level_3) {
            game.level_3 = false;
            game.easy = true;
        }
        if (game.level_4) {
            game.level_4 = false;
            game.easy = true;
        }
        if (game.level_5) {
            game.level_5 = false;
            game.easy = true;
        }
         if (game.level_6) {
            game.level_6 = false;
            game.mid = true;
        }
         if (game.level_7) {
            game.level_7 = false;
            game.mid = true;
        }
          if (game.level_8) {
            game.level_8 = false;
            game.mid = true;
        }
          
           if (game.level_9) {
            game.level_9 = false;
            game.mid = true;
        }
           
               if (game.level_10) {
            game.level_10 = false;
            game.mid = true;
        }
                 if (game.level_11) {
            game.level_10 = false;
            game.hard = true;
        }
                 if (game.level_12) {
            game.level_12 = false;
            game.hard = true;
        }
               if (game.level_13) {
            game.level_13 = false;
            game.hard = true;
        }
         
             if (game.level_14) {
            game.level_14 = false;
            game.hard = true;
        }
                if (game.level_15) {
            game.level_15 = false;
            game.hard = true;
        }
    }

    public static void start() {
        game.difficulty = true;
        game.menu = false;
        
    }

    public static void easy() {
        game.menu = false;
        game.difficulty = false;
        difficulty();
        game.easy = true;

    }

    public static void mid() {
        game.menu = false;
        game.difficulty = false;
        difficulty();
        game.mid = true;
    }

    public static void hard() {
        game.menu = false;
        game.difficulty = false;
        difficulty();
        game.hard = true;

    }

    public static void difficulty() {
        game.easy = game.mid = game.hard = false;

    }

    public static void level_1() {
        
        game.menu = false;
        difficulty();
        game.level_1 = true;

    }

    public static void level_2() {
       
        game.menu = false;
        difficulty();
        game.level_2 = true;

    }

    public static void level_3() {
         
        game.menu = false;
        difficulty();
        game.level_3 = true;

    }

    public static void level_4() {
       
        game.menu = false;
        difficulty();
        game.level_4 = true;

    }

    public static void level_5() {
        
        game.menu = false;
        difficulty();
        game.level_5 = true;

    }
     public static void level_6() {
        game.menu = false;
        difficulty();
        game.level_6= true;

    }
     
      public static void level_7() {
        game.menu = false;
        difficulty();
        game.level_7= true;

    }
      
       public static void level_8() {
        game.menu = false;
        difficulty();
        game.level_8= true;

    }
       
         public static void level_9() {
        game.menu = false;
        difficulty();
        game.level_9= true;

    }
             public static void level_10() {
        game.menu = false;
        difficulty();
        game.level_10= true;

    }
                 public static void level_11() {
        game.menu = false;
        difficulty();
        game.level_11= true;

    }
                 public static void level_12() {
        game.menu = false;
        difficulty();
        game.level_12= true;

    }
         public static void level_13() {
        game.menu = false;
        difficulty();
        game.level_13= true;

    }
            public static void level_14() {
        game.menu = false;
        difficulty();
        game.level_14= true;

    }
           public static void level_15() {
        game.menu = false;
        difficulty();
        game.level_15= true;

    }

    public static void quit() {
        System.exit(0);

    }
    
}
