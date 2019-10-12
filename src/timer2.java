import java.util.Timer;
import java.util.TimerTask;

public class timer2 {

    int secondspassed;
    int test33;
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            secondspassed++;
            test33 =secondspassed;
            System.out.print(" " + secondspassed);
                if (test33 == 5) {
                    sound2.sound2();
                    timer.cancel();
                }


        }

    };
    public void start(){
        timer.scheduleAtFixedRate(task,5000,1000);

    }
    public static void timer2 (){
        coundownTest test12 = new coundownTest();
        test12.start();
    }
}


