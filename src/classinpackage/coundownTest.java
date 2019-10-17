package classinpackage;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class coundownTest {

    int secondspassed;
    int test33;
    int timeFoot;
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            Random ran =new Random();
            timeFoot = ran.nextInt(10) + 1;
            secondspassed++;
            timeFoot = secondspassed;
            System.out.print(" " + secondspassed);
            if ( timeFoot ==1) {
                if (timeFoot ==2){

                }
                timer.cancel();
                footStepSound.soundFoot();
                coundownTest2.Foot2();
                timer.cancel();
            }
        }
    };
    public void start(){
        timer.scheduleAtFixedRate(task,200,1000); // delay la khoang timer se chay
    }
    public static void main(String args[]){
        coundownTest test12 = new coundownTest();
        test12.start();
    }
    }

