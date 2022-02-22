
package Start;

import java.util.ArrayList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
public abstract class Levels extends SokoBan {
        ArrayList<ImageView>imh=new ArrayList<ImageView>(); 
        public abstract void design(Scene scene,Group gg);
}
