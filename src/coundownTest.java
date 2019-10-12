import java.util.Timer;
import java.util.TimerTask;

public class coundownTest {

    int secondspassed;
    int test33;
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            secondspassed++;
            test33 =secondspassed;
            System.out.print(" " + secondspassed);
                if (test33 == 2) {
                    timer.cancel();
                    sound2.sound2();
                    }
            }

    };
    public void start(){
        timer.scheduleAtFixedRate(task,2000,1000); // delay la khoang timer se chay
    }
    public static void main(String[] args){
        coundownTest test12 = new coundownTest();
        test12.start();
    }
    }

