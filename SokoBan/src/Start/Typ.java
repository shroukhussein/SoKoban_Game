/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Start;
import Sokoban_Levels.Design_level4;
import Sokoban_Levels.Design_level3;
import Sokoban_Levels.Design_level2;
import Sokoban_Levels.Design_Level1;
import Game.difficult;
import Game.*;
import difficulty.easy;
import java.awt.Graphics;
import java.awt.TextField;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JFrame;
import levels.easy_1;
import main.main;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author DIERCT
 */
public class Typ extends SokoBan {
    Scene scene ;
    Group root;
 public Typ()
 {
    
 }
public void page_1(Scene scene ,Group root)
{
      Label b1=new Label("           ");
      b1.setTranslateX(70);   b1.setTranslateY(590);
      Image imr=new Image("/pic/menu.jpg");
      Label l=new Label("Start Game");
      Label ll=new Label("Quit Game");
      l.setFont(new Font("Arial",50));
      ll.setFont(new Font("Arial",50));
      ImageView imgr=new ImageView(imr);
      l.setTranslateX(200);  l.setTranslateY(280);
       ll.setTranslateX(200);  ll.setTranslateY(400);
       l.setTextFill(Color.YELLOW);
       ll.setTextFill(Color.YELLOW);
       l.setOnMouseClicked(e->{
           First(scene, root);
       });
       ll.setOnMouseClicked(e->{
         System.exit(0);
       });
        b1.setOnMouseClicked(e->{
         System.exit(0);
       }); 
        root.getChildren().addAll(imgr,l,ll,b1);
}
public  void Page_Win(Scene scene,Group  group,int level)
{
    music_win();
    Image win=new Image("/pic/win.jpg");
    ImageView winimg=new  ImageView(win);
    Image Exit=new Image("/pic/previous.jpg");
    ImageView out=new  ImageView(Exit);
    out.setX(50);out.setY(500);
    Image Next=new Image("/pic/next.jpg");
    ImageView Next_level=new  ImageView(Next);
    Next_level.setX(550);Next_level.setY(500);
        int step1 , step2 , step3 ,step4;
    Next_level.setOnMouseClicked(new EventHandler<MouseEvent>() {
         @Override
         public void handle(MouseEvent e) {
             if(level==1){
          Levels design_level3 =new Design_Level1();
          design_level3.design(scene, group);}
             else if(level==2){
          Levels design_level3 =new Design_level2();
          design_level3.design(scene, group);} 
             else if(level==3){
          Levels design_level3 =new Design_level3();
          design_level3.design(scene, group);
         
             }
             else if(level==4)
             {
                   game g=new game();
             }
         }
     });
    out.setOnMouseClicked(new EventHandler<MouseEvent>() {
         @Override
         public void handle(MouseEvent e) {
             Start_page(scene,group);
         }
     });
    group.getChildren().addAll(winimg,out,Next_level);
}
  public void music_win()
    {
         try{
        InputStream music =new FileInputStream(new File("res/audio/win.wav"));
        AudioStream  audios=new AudioStream(music);
        AudioPlayer.player.start(audios);
        }
        catch(Exception e)
        {
            
        }
         
    }
  public void Restart(Scene scene,Group group,int level)
  {
     Label res=new Label("Restart");
     res.setFont(new Font("Arial",25));
     res.setTextFill(Color.YELLOW);
     res.setTranslateX(5);  res.setTranslateY(550);
  Label lebal=new Label();
  lebal.setText("Steps :: ");
  lebal.setTranslateX(5);  lebal.setTranslateY(600);
  lebal.setFont(new Font("Arial",25)); lebal.setTextFill(Color.YELLOW);
     Label level_d=new Label();
     level_d.setText("LEVEL "+level);
     level_d.setTranslateX(200);  level_d.setTranslateY(560);
     level_d.setFont(new Font("Arial",47)); level_d.setTextFill(Color.YELLOW);
  Label Start=new Label();
  Start.setText("Start Page");
  Start.setTranslateX(500);  Start.setTranslateY(550);
  Start.setFont(new Font("Arial",25)); Start.setTextFill(Color.YELLOW);   
     Label num_box=new Label();
     num_box.setTranslateX(500);  num_box.setTranslateY(600);
     num_box.setFont(new Font("Arial",25)); num_box.setTextFill(Color.YELLOW);
     if(level==4||level==2||level==3)
          num_box.setText("Box :: "+3);
     else if(level==1)
          num_box.setText("Box :: "+2);
     res.setOnMouseClicked(new EventHandler<MouseEvent>() {
         @Override
         public void handle(MouseEvent e) {
             if(level==1){
          Levels design_level2 =new Design_level4();
          design_level2.design(scene, group);
           }
             else if(level==2){
          Levels design_level3 =new Design_Level1();
          design_level3.design(scene, group);} 
             else if(level==3){
          Levels design_level4 =new Design_level2();
          design_level4.design(scene, group);} 
             else if(level==4){
            Levels design_level5 =new Design_level3();
            design_level5.design(scene, group);
             }
         }
     });
      Start.setOnMouseClicked(new EventHandler<MouseEvent>() {
         @Override
         public void handle(MouseEvent e)
         {
             page_1(scene, group);
         }
     });
     group.getChildren().addAll(res,lebal,level_d,Start,num_box);
  }
  public void Start_page(Scene scene,Group group)
  {
   Image start=new Image("/pic/training level.jpg");
    ImageView star=new  ImageView(start);   
    Image Next=new Image("/pic/next.jpg");
    ImageView Next_level=new  ImageView(Next);
    Next_level.setX(550);Next_level.setY(500);
    Next_level.setOnMouseClicked(new EventHandler<MouseEvent>() {
         @Override
         public void handle(MouseEvent e)
         {
          Levels design_level1=new Design_level4();
          design_level1.design(scene, group);
         }
     });
    group.getChildren().addAll(star,Next_level);  }
  public void First(Scene scene,Group group)
  {
      Image Back=new Image("/pic/first.jpeg");
      ImageView Background=new  ImageView(Back);
      Image first=new Image("/pic/first_button.jpeg");
      ImageView first_button=new  ImageView(first);
      first_button.setX(220);first_button.setY(350);
      Image second=new Image("/pic/second_button.jpeg");
      ImageView second_button=new  ImageView(second);
      second_button.setX(220);second_button.setY(450);
       first_button.setOnMouseClicked(new EventHandler<MouseEvent>() {
         @Override
         public void handle(MouseEvent e)
         {
             Start_page(scene, group);
         }
     });
        second_button.setOnMouseClicked(new EventHandler<MouseEvent>() {
         @Override
         public void handle(MouseEvent e)
         {
         game g=new game();
            
         
     
         }
     });
      group.getChildren().addAll(Background,first_button,second_button);
  }
}



























