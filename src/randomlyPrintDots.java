import java.util.Random;
import java.util.concurrent.TimeUnit;

public class randomlyPrintDots {
    public static void main(String args[]){
        int randomFall;
        int sec = 0;
        Random rand = new Random();
        randomFall = rand.nextInt(10)+1;
        for (randomFall = 0; randomFall < 10; randomFall++) {
            randomFall = rand.nextInt(10) + 1;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            System.out.print(".\n");
            sec++;
        }
        System.out.println("it took you " + sec + " sec to go here");
        if (sec <= 4 ){
            System.out.print("that's pretty quick");
        }
        else if (sec >= 5){
            System.out.print("it took so long");
        }
    }
}

