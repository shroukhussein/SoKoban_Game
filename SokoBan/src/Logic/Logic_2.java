package Logic;

import Start.Typ;
import java.util.ArrayList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.TouchEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javax.swing.JOptionPane;
public class Logic_2 
{  ImageView character;
 public int counter,steps;
 public  Logic_2()
 { 
   counter=0; steps=0 ;
 }
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }
 Label lebal=new Label();
 public void logic(Scene scene,Group group,ArrayList<ImageView>imh,ArrayList<ImageView>boxs,
         ArrayList<ImageView>dest,ImageView character1,int count,int level)
    {
        
        Typ typ=new Typ();
        typ.Restart(scene,group,level);
         character=character1;            
    scene.setOnKeyPressed(new EventHandler<KeyEvent>() 
    {
        
        @Override
        public void handle(KeyEvent e)
        {
            switch(e.getCode())
            {
                case LEFT:
                {
                    boolean left=true; 
                  for(int i=0;i<imh.size();i++)
                  {
                    if(character.getX()-64==imh.get(i).getX()&&character.getY()==imh.get(i).getY()) 
                            {
                                left=false;
                            } 
                  }
                  if(left) 
                  {
                      if(!collision_Boxs_Left(boxs,imh, character)&&!collision_Left(boxs, character)){
                          Node_Left(boxs, dest, character, group);
                          Move_Box_Left(boxs, character, dest);
                          character.setX(character.getX()-64);steps++;
                  }}  
                }break; 
                case RIGHT:
                {
                    boolean right=true; 
                  for(int i=0;i<imh.size();i++)
                  {
                    if(character.getX()+64==imh.get(i).getX()&&character.getY()==imh.get(i).getY()) 
                            {
                                right=false;
                            } 
                  }
                   if(right) 
                   {
                       if(!collision_Boxs_Right(boxs,imh, character)&&!collision_Right(boxs, character)){
                       Node_Right(boxs, dest, character, group);    
                       Move_Box_Right(boxs, character, dest);
                       character.setX(character.getX()+64);steps++;
                   }}
                }break;
                case UP:
                {
                    boolean up=true; 
                  for(int i=0;i<imh.size();i++)
                  {
                    if(character.getY()-64==imh.get(i).getY()&&character.getX()==imh.get(i).getX()) 
                            {
                                up=false;
                            } 
                  }
                   if(up) 
                   {
                     if(!collision_Boxs_Up(boxs,imh, character)&&!collision_Up(boxs, character)){   
                         Node_Up(boxs, dest, character, group);
                         Move_Box_Up(boxs, character, dest);
                         character.setY(character.getY()-64); steps++;   
                   }}
                }break;  
                case DOWN:
                {
                    boolean down=true; 
                  for(int i=0;i<imh.size();i++)
                  {
                    if(character.getY()+64==imh.get(i).getY()&&character.getX()==imh.get(i).getX()) 
                            {
                                down=false;
                            } 
                  }
              if(down)
                {
                    if(!collision_Boxs_Down(boxs,imh, character)&&!collision_Down(boxs, character)){
                        Node_Down(boxs, dest, character, group);
                        Move_Box_Down(boxs, character, dest);
                        character.setY(character.getY()+64);steps++; 
                }}
                }break;
            }
        if(counter==count)
        {
           typ.Page_Win(scene,group,level);
        }
    lebal.setText("Steps :: "+steps+"");
    lebal.setTranslateX(5);  lebal.setTranslateY(600);
    lebal.setFont(new Font("Arial",25)); lebal.setTextFill(Color.YELLOW);
        } 
     });
    group.getChildren().addAll(lebal);
      }
  public boolean collision_Boxs_Up(ArrayList<ImageView>boxs,ArrayList<ImageView>stones,ImageView character)
  {
      boolean check=false;
   for (int i = 0; i < boxs.size(); i++) 
    {
        for (int j = 0; j <stones.size(); j++)
        {
            if(character.getY()-64==boxs.get(i).getY()&&
                    character.getX()-boxs.get(i).getX()==0){
            if(stones.get(j).getY()==boxs.get(i).getY()-64&&stones.get(j).getX()-boxs.get(i).getX()==0){
                check =true ;
            break;
            }}
        }
    }
     if(check)
        return true;
    else 
        return false;
  }
  public boolean collision_Boxs_Down(ArrayList<ImageView>boxs,ArrayList<ImageView>stones,ImageView character)
  {
      boolean check=false;
   for (int i = 0; i < boxs.size(); i++) 
    {
        for (int j = 0; j <stones.size(); j++)
        {
            if(character.getY()+64==boxs.get(i).getY()&&
                    character.getX()-boxs.get(i).getX()==0){
            if(stones.get(j).getY()==boxs.get(i).getY()+64&&stones.get(j).getX()-boxs.get(i).getX()==0){
                check =true ;
            break;
            }}
        }
    }
     if(check)
        return true;
    else 
        return false;
  }
public boolean collision_Boxs_Right(ArrayList<ImageView>boxs,ArrayList<ImageView>stones,ImageView character)
  {
      boolean check=false;
   for (int i = 0; i < boxs.size(); i++) 
    {
        for (int j = 0; j <stones.size(); j++)
        {
            if(character.getX()+64==boxs.get(i).getX()&&
                    character.getY()-boxs.get(i).getY()==0){
            if(stones.get(j).getX()==boxs.get(i).getX()+64&&stones.get(j).getY()-boxs.get(i).getY()==0){
                check =true ;
            break;
            }}
        }
    }
     if(check)
        return true;
    else 
        return false;
  }  
public boolean collision_Boxs_Left(ArrayList<ImageView>boxs,ArrayList<ImageView>stones,ImageView character)
  {
      boolean check=false;
   for (int i = 0; i < boxs.size(); i++) 
    {
        for (int j = 0; j <stones.size(); j++)
        {
            if(character.getX()-64==boxs.get(i).getX()&&
                    character.getY()-boxs.get(i).getY()==0){
            if(stones.get(j).getX()==boxs.get(i).getX()-64&&stones.get(j).getY()-boxs.get(i).getY()==0){
                check =true ;
            break;
            }}
        }
    }
     if(check)
        return true;
    else 
        return false;
  }
public boolean collision_Left(ArrayList<ImageView>boxs,ImageView character)
{
    boolean check=false ; 
    for (int i = 0; i < boxs.size(); i++) 
    {
        for (int j = 0; j <boxs.size(); j++)
        {
            if(character.getX()-64==boxs.get(i).getX()&&
                    character.getY()-boxs.get(i).getY()==0){
            if(boxs.get(i).getX()-64==boxs.get(j).getX()
               &&boxs.get(i).getY()-boxs.get(j).getY()==0){
                check =true ;
            break;
            }
        }
        }
    }
    boolean bb=false;
    if(check)
    return true;
    else 
        return false;
    }
public boolean collision_Right(ArrayList<ImageView>boxs,ImageView character)
{
    boolean check=false ; 
    for (int i = 0; i < boxs.size(); i++) 
    {
        for (int j = 0; j <boxs.size(); j++)
        {
            if(character.getX()+64==boxs.get(i).getX()&&
                    character.getY()-boxs.get(i).getY()==0){
            if(boxs.get(i).getX()+64==boxs.get(j).getX()&&boxs.get(i).getY()-boxs.get(j).getY()==0){
                check =true ;
            break;
            }
        }
        }
    }
    boolean bb=false;
    if(check)
    return true;
    else 
        return false;
    }
 public boolean collision_Down(ArrayList<ImageView>boxs,ImageView character)
{
    boolean check=false ; 
    for (int i = 0; i < boxs.size(); i++) 
    {
        for (int j = 0; j <boxs.size(); j++)
        {
            if(character.getY()+64==boxs.get(i).getY()&&character.getX()-boxs.get(i).getX()==0){
            if(boxs.get(i).getY()+64==boxs.get(j).getY()&&boxs.get(i).getX()-boxs.get(j).getX()==0){
                check =true ;
            break;
            }
        }
        }
    }
    if(check)
    return true;
    else 
        return false;
    }
 public boolean collision_Up(ArrayList<ImageView>boxs,ImageView character)
{
    boolean check=false ; 
    for (int i = 0; i < boxs.size(); i++) 
    {
        for (int j = 0; j <boxs.size(); j++)
        {
       if(character.getY()-64==boxs.get(i).getY()&&character.getX()-boxs.get(i).getX()==0){
            if(boxs.get(i).getY()-64==boxs.get(j).getY()&&boxs.get(i).getX()-boxs.get(j).getX()==0){
                check =true ;
            break;
            }
        }
        }
    }
    if(check)
    return true;
    else 
        return false;
    }
 public  void Node_Right(ArrayList<ImageView>boxs,ArrayList<ImageView>dest,ImageView character,Group group)
{
    Image img3=new Image("/pic/box_blue.png");Image img2=new Image("/pic/box_yellow.png");
    boolean check=false; int x=0,y=0;
    for(int i=0;i<boxs.size();i++)
    {
        for(int j=0;j<dest.size();j++)
        {
        if(character.getX()+64==boxs.get(i).getX()&&character.getY()==boxs.get(i).getY())
         {   
          if(boxs.get(i).getX()+64==dest.get(j).getX()&&boxs.get(i).getY()==dest.get(j).getY())
          {
            check=true;counter++;
            x=i; y=j;
           break;
          }  
        }
        }
        if(check)
        {
            boxs.get(x).setImage(img3); dest.get(y).setVisible(false);
        }
        
    }
}
public  void Node_Left(ArrayList<ImageView>boxs,ArrayList<ImageView>dest,ImageView character,Group group)
{
    Image img3=new Image("/pic/box_blue.png");Image img2=new Image("/pic/box_yellow.png");
    boolean check=false; int x=0,y=0;
    for(int i=0;i<boxs.size();i++)
    {
        for(int j=0;j<dest.size();j++)
        {
        if(character.getX()-64==boxs.get(i).getX()&&character.getY()==boxs.get(i).getY())
         {   
          if(boxs.get(i).getX()-64==dest.get(j).getX()&&boxs.get(i).getY()==dest.get(j).getY())
          {
            check=true;counter++;
            x=i;  y=j;
           break;
          }  
        }
        }
        if(check)
        {
            boxs.get(x).setImage(img3); dest.get(y).setVisible(false);
        }
        
    }
}
public  void Node_Up(ArrayList<ImageView>boxs,ArrayList<ImageView>dest,ImageView character,Group group)
{
    
    Image img3=new Image("/pic/box_blue.png");Image img2=new Image("/pic/box_yellow.png");
    boolean check=false; int x=0,y=0;
    for(int i=0;i<boxs.size();i++)
    {
        for(int j=0;j<dest.size();j++)
        {
        if(character.getY()-64==boxs.get(i).getY()&&character.getX()==boxs.get(i).getX())
         {   
          if(boxs.get(i).getY()-64==dest.get(j).getY()&&boxs.get(i).getX()==dest.get(j).getX())
          {
            check=true;counter++;
            x=i; y=j;
           break;
          }  
        }
        }
        if(check)
        {
            boxs.get(x).setImage(img3); dest.get(y).setVisible(false);
        }
        
    }
}
public  void Node_Down(ArrayList<ImageView>boxs,ArrayList<ImageView>dest,ImageView character,Group group)
{
    
    Image img3=new Image("/pic/box_blue.png");Image img2=new Image("/pic/box_yellow.png");
    boolean check=false; int x=0,y=0;
    for(int i=0;i<boxs.size();i++)
    {
        for(int j=0;j<dest.size();j++)
        {
        if(character.getY()+64==boxs.get(i).getY()&&character.getX()==boxs.get(i).getX())
         {   
          if(boxs.get(i).getY()+64==dest.get(j).getY()&&boxs.get(i).getX()==dest.get(j).getX())
          {
            check=true;counter++;
            x=i; y=j;
           break;
          }  
        }
        }
        if(check)
        {
            boxs.get(x).setImage(img3); dest.get(y).setVisible(false);
        }
        
    }
}
public void node_yellow(ImageView box,ArrayList<ImageView>dest)
{
    boolean check=false;      int x=0;Image img2=new Image("/pic/box_yellow.png");
    for(int i=0;i<dest.size();i++)
    {
   if(box.getX()==dest.get(i).getX()&&box.getY()==dest.get(i).getY())
   {  
       check=true;x=i;break;}
    }
    if(check)
    {
      box.setImage(img2);dest.get(x).setVisible(true);counter--;
    }
}
public void Move_Box_Down(ArrayList<ImageView>boxs,ImageView character,ArrayList<ImageView>dest)
{
     boolean check=false; int x=0;
    for(int i=0;i<boxs.size();i++)
    {
        if(character.getY()+64==boxs.get(i).getY()&&character.getX()==boxs.get(i).getX())
         {   
            check=true;
            x=i; 
           break;
          }  
    }
        if(check)
        {
            node_yellow(boxs.get(x), dest);  boxs.get(x).setY(boxs.get(x).getY()+64);
        }
        
    }
public void Move_Box_Up(ArrayList<ImageView>boxs,ImageView character,ArrayList<ImageView>dest)
{
     boolean check=false; int x=0;
    for(int i=0;i<boxs.size();i++)
    {
        if(character.getY()-64==boxs.get(i).getY()&&character.getX()==boxs.get(i).getX())
         {   
            check=true;
            x=i; 
           break;
          }  
    }
        if(check)
        {
            node_yellow(boxs.get(x), dest);  boxs.get(x).setY(boxs.get(x).getY()-64);
        }
        
    }
public void Move_Box_Left(ArrayList<ImageView>boxs,ImageView character,ArrayList<ImageView>dest)
{
     boolean check=false; int x=0;
    for(int i=0;i<boxs.size();i++)
    {
        if(character.getX()-64==boxs.get(i).getX()&&character.getY()==boxs.get(i).getY())
         {   
            check=true;
            x=i; 
           break;
          }  
    }
        if(check)
        {
            node_yellow(boxs.get(x), dest);  boxs.get(x).setX(boxs.get(x).getX()-64);
        }
        
    }
public void Move_Box_Right(ArrayList<ImageView>boxs,ImageView character,ArrayList<ImageView>dest)
{
     boolean check=false; int x=0;
    for(int i=0;i<boxs.size();i++)
    {
        if(character.getX()+64==boxs.get(i).getX()&&character.getY()==boxs.get(i).getY())
         {   
            check=true;
            x=i; 
           break;
          }  
    }
        if(check)
        {
            node_yellow(boxs.get(x), dest);  boxs.get(x).setX(boxs.get(x).getX()+64);
        }
        
    }
}
