package classinpackage;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class footStepSound {
    public static void soundFoot(){
    File play = new File ("C:\\Users\\vu nguyen\\Desktop\\New folder\\test\\src\\classinpackage\\foot step1.wav");
    PlaySound(play);
}
    static void PlaySound(File Sound){
        try{
            Clip clip= AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            clip.loop(0);             //change loop

            Thread.sleep(clip.getMicrosecondLength()/500); //time that the program end

        }catch (Exception e) {
        }
    }
    public static void soundFoot2(){
        File play = new File ("C:\\Users\\vu nguyen\\Desktop\\New folder\\test\\src\\classinpackage\\foot step 2.wav");
        PlaySound2(play);
    }
    static void PlaySound2(File Sound){
        try{
            Clip clip= AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            clip.loop(0);             //change loop

            Thread.sleep(clip.getMicrosecondLength()/100); //time that the program end

        }catch (Exception e) {
        }
    }
}
