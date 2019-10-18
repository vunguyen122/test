package room1;

import java.util.concurrent.TimeUnit;

public class delay {
    public static void delay(){
    try {
        TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException e) {
        System.err.format("IOException: %s%n", e);
    }
    }
}
