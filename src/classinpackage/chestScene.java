package classinpackage;

import java.util.concurrent.TimeUnit;

public class chestScene {
    public static void chestStuff(){
        int [] chestLabel = {23062,11001,92480,18943,11901};
        System.out.print("there are 5 chests \n");
        System.out.print(" Chest 1 labeled "  + chestLabel[0] + "\n");
        System.out.print(" Chest 2 labeled "  + chestLabel[1] + "\n");
        System.out.print(" Chest 3 labeled "  + chestLabel[2] + "\n");
        System.out.print(" Chest 4 labeled "  + chestLabel[3] + "\n");
        System.out.print(" Chest 5 labeled "  + chestLabel[4] + "\n");
        try {
            TimeUnit.SECONDS.sleep(5);
            // delay 0.5 second
//        TimeUnit.MICROSECONDS.sleep(10000);
            // delay 1 minute
            //TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.print(" \n What are you going to do ?");






    }
}
