import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class sound2 {
    public static void sound2(){
     File play = new File ("C:\\Users\\vu nguyen\\Desktop\\New folder\\test\\src\\images\\foot step 5.wav");
    PlaySound(play);
    }
    static void PlaySound(File Sound){
        try{
            Clip clip= AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            clip.loop(1);             //change loop


            Thread.sleep(clip.getMicrosecondLength()/500); //time that the program end

        }catch (Exception e) {
        }
        }
    }

