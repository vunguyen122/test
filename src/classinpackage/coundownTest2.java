package classinpackage;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class coundownTest2 {
    int secondspassed;
    int test33;
    int timeFoot;
    Random ran =new Random();
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            timeFoot = ran.nextInt(20) + 1;
            secondspassed++;
            timeFoot = secondspassed;
            System.out.print(" " + secondspassed);
            if (timeFoot == 5) {
                timer.cancel();
                footStepSound.soundFoot2();
                timer.cancel();
            }
        }


    };
    public void start(){
        timer.scheduleAtFixedRate(task,100,10000); // delay la khoang timer se chay
    }
    public static void Foot2(){
        coundownTest test123 = new coundownTest();
        test123.start();
    }
}

