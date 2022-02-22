package Start;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import main.player;
public class SokoBan extends Application {
       Group root=new Group();
       Scene scene =new Scene(root,700,660,Color.BLANCHEDALMOND);
       public Image im,im2,im3,im4,im5;
       public ImageView img,img2,img3,img4,img5;
 public void start(Stage primaryStage) throws FileNotFoundException, IOException, ClassNotFoundException
 { 
        Typ t=new Typ();
        t.page_1(scene, root); 
        per character=new per("Samaa",12,2);
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("character.txt"));
        out.writeObject(character);
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("character.txt"));
        per character2=(per) in.readObject();
        System.out.println(character2.getName()+"\t"+character2.getSteps());
        primaryStage.setScene(scene);
        primaryStage.show();
 }
    public static void main(String[] args) {
        launch(args);
    }
    
}
