package Sokoban_Levels;
import Logic.Logic_2;
import Start.Levels;
import java.util.ArrayList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.swing.*;

public class Design_Level1 extends Levels {
   int counter=3;
          public Design_Level1(){} 
    int x,y;
     ArrayList<ImageView>imh=new ArrayList<ImageView>();
     ArrayList<ImageView>boxs=new ArrayList<ImageView>();
     ArrayList<ImageView>dest=new ArrayList<ImageView>();    
  @Override
  public void design(Scene scene, Group gg) 
  {
 Image imm=new Image("/pic/Back_Ground3.jpeg");
 ImageView imgg =new ImageView(imm);  
 gg.getChildren().add(imgg);
 im2=new Image("/pic/character.png");
 img2 =new ImageView(im2);
 img2.setX(448);img2.setY(192);gg.getChildren().add(img2);
 Image im3=new Image("/pic/box_yellow.png");
 ImageView img3 =new ImageView(im3);
 Image im4=new Image("/pic/box_blue.png");
 ImageView img4 =new ImageView(im3);
 im=new Image("/pic/wall.png");
 img=new ImageView();
 im5=new Image("/pic/dest.png");
ImageView img5 =new ImageView(im5);
       int[][] design
            = {
                {9, 9, 9, 9, 9, 9, 9, 9, 9,9,9},
                {9, 9, 1, 1, 1, 1, 1, 9, 9,9,9},
                {9, 1, 1, 4, 9, 9, 1, 1, 1,9,9},
                {9, 1, 9, 9, 1, 9, 2, 9, 1,9,9},
                {9, 1, 9, 9, 1, 9, 1, 9, 1,9,9},
                {9, 1, 9, 2, 4, 9, 2, 4, 1,9,9},
                {9, 1, 9, 9, 9, 9, 1, 1, 1,9,9},
                {9, 1, 1, 1, 1, 1, 1, 9, 9,9,9}
            };       
       for(int i=0;i<8;i++)
       {
           for(int j=0;j<11;j++)
           {    
           if(design[i][j]==1)
           {
               img=new ImageView();
               img.setImage(im);
               img.setX(j*64);img.setY(i*64);
               gg.getChildren().add(img);imh.add(img);img.setId("1");
           }
           if(design[i][j]==2)
           {
               img3=new ImageView();
               img3.setImage(im3);
               img3.setX(j*64);img3.setY(i*64);
               gg.getChildren().add(img3); boxs.add(img3);img3.setId("2");
           }
          if(design[i][j]==4)
           {
               img5=new ImageView();
               img5.setImage(im5);
               img5.setX(j*64);img5.setY(i*64);
               gg.getChildren().add(img5);    dest.add(img5);img.setId("4");
           }
           }
       } 
       Logic_2 logic_2=new Logic_2();
       logic_2.logic(scene, gg, imh, boxs, dest,img2,counter,2);
  }
  
}