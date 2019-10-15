package classinpackage;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FinalScene {
    public static void main(String[] agrs){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("    Suddenly, a creepy, bloody face appears; without a body and chase you, you run in fear, scare and afraid of dead. \n" +"you ran to  the end of the way and there are no other way to go. but that thing disappeared... \n");
        imageRedFace.imadesRedGuy();
        try {
            TimeUnit.SECONDS.sleep(10);
            // delay 0.5 second
//        TimeUnit.MICROSECONDS.sleep(10000);
            // delay 1 minute
            //TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.print("  you calm your self and sit down, but you feel that something hard behind your back, you turned  around to see what it is, and you see 5 small chests on the ground\n");
            System.out.print("1.take a look\n");

            choice = input.nextInt();
        switch (choice) {
            case 1:
                chestScene.chestStuff();
                break;
        }
            while (choice !=1){
                System.out.print("1.take a look\n");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        chestScene.chestStuff();
                    break;
            }
            }
    }
}







