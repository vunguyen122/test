import java.util.Scanner;

public class thungiem {
    public static void main(String[] args) {
        boolean invalid = true;
        while (invalid ==true) {
            int choice;
        Scanner input = new Scanner(System.in);
            System.out.println("1 or 2");
            choice = input.nextInt();
            if (choice == 1) {
                sound2.sound2();
                break;
            } else if (choice == 2) {
                test.imades();
                break;
            } else {
                System.out.println("choose again");
                invalid = true;
            }
        }
    }
}




