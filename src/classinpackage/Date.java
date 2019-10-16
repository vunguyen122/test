package classinpackage;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Date {
    public static void spookyPaper() {
        int choice;
        Scanner input = new Scanner(System.in);
        for (int a = 0; a <= 3; a++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
        }
                System.out.print(".");

            System.out.print("\nNothing inside but a paper\n");
            System.out.print("\nsee what inside the paper ?\n");
            System.out.print("1.yes\n2.no \n");
            choice = input.nextInt();
            if (choice == 1) {
                Date date = new Date();
                System.out.print("you look at the paper to see what it said\n");
                for (int i = 0; i <= 3; i++) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        System.err.format("IOException: %s%n", e);
                    }
                    System.out.println(".");
                }
                System.out.println("the paper said: today is " + new java.util.Date());
                System.out.println("Happy spooky Halloween");
            } else if (choice == 2) {
                System.out.print("you threw the paper back in the chest and keep dong your work\n");
                chestScene.interactChests();
            }
        }
}