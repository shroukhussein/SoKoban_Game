package Audio;

import Game.game;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class sound {
 
    public sound(){};

    
      public void restart()
    {
        try{
        InputStream music =new FileInputStream(new File("res/audio/res.wav"));
        AudioStream  audios=new AudioStream(music);
        AudioPlayer.player.start(audios);
        }
        catch(Exception e)
        {
            
        }
    }
    
        public void step()
    {
        try{
        InputStream music =new FileInputStream(new File("res/audio/move.wav"));
        AudioStream  audios=new AudioStream(music);
        AudioPlayer.player.start(audios);
        }
        catch(Exception e)
        {
            
        }
    }
      public void win()
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
    
         public void next()
    {
         try{
        InputStream music =new FileInputStream(new File("res/audio/next.wav"));
        AudioStream  audios=new AudioStream(music);
        AudioPlayer.player.start(audios);
        }
        catch(Exception e)
        {
            
        }
         
    }
             public void start()
    {
         try{
        InputStream music =new FileInputStream(new File("res/audio/Hello Baby Girl.wav"));
        AudioStream  audios=new AudioStream(music);
        AudioPlayer.player.start(audios);
        }
        catch(Exception e)
        {
            
        }
         
    }
                 public void end()
    {
         try{
        InputStream music =new FileInputStream(new File("res/audio/Bye Bye.wav"));
        AudioStream  audios=new AudioStream(music);
        AudioPlayer.player.start(audios);
        }
        catch(Exception e)
        {
            
        }
         
    }
}
