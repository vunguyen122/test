import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class sound {
void playMusic(String musicLocation) {

    try {
        File musicPath = new File(musicLocation);
        if (musicPath.exists()) {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
             clip.start();
            JOptionPane.showMessageDialog(null, " press OK to stop");
        } else {
            System.out.println("cant find file");
        }


    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
}
