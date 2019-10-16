package classinpackage;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class chestScene {
    public static void main(String args[]) {
        //        variables and arrays
        int choice = 0;
        boolean invalid = true;
        Scanner input = new Scanner(System.in);
        int[] chestLabel = {23062, 11001, 92480, 18943, 11901};
        String[] questions = {"1.Interact with those chest", "2.Crying in a corner", "3.Kick on those chests"};
        System.out.print("\nthere are 5 chests, each of them labeled a number:\n");
        //----------------------------------------------

        for (int i = 0; i < chestLabel.length; i++) {
            {
                System.out.print("chest labeled " + chestLabel[i] + "\n");
            }
        }
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.print(" \nWhat are you going to do ?\n");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        test1();
    }
    public static void test1(){
        int choice;
        String[] questions = {"1.Interact with those chest", "2.Crying in a corner", "3.Kick on those chests"};
        Scanner input = new Scanner(System.in);
        boolean invalid = true;

        System.out.println(questions[0]);
        System.out.println(questions[1]);
        System.out.println(questions[2]);

        while (true) {
            choice = input.nextInt();
            if (choice >= 4) {
                invalid = false;
                System.out.print("choose again \n");
            }
            if (choice == 1) {
                interactChests();
                break;
            } else if (choice == 2) {
                CryingInACorner();
                break;
            } else if (choice == 3) {
                KickingChest();
                break;
            }
        }
        }


    public static void interactChests(){
        System.out.print("ggh   ");
    }

    public static void CryingInACorner(){
        int choice2;
        Scanner input = new Scanner(System.in);
        System.out.print(" you were too afraid to move, you sit in a corner and cried to died");
        System.out.print("\n try again?");
        System.out.print("\n1.yes\n2.no\n");
        choice2 = input.nextInt();
        if (choice2 == 1){
            test1();
        }
        else if (choice2 == 2){
            System.exit(0);
        }
    }
    public static void KickingChest(){
        for (int i = 0; i <= 4; i++){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            System.out.print(" kick! \n");
            kick.sound2();
        }
        System.out.print("you kicked on those chest to see something would react. But nothing happened \n");
    }
}
