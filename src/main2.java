import java.util.Scanner;

public class main2 {
    public static void main(String[] args){
        int choice;
        System.out.println("play sound or display image, or both?");

        Scanner input = new Scanner(System.in);
        choice = input.nextInt();

switch (choice){
    case 1:
        main.sound();
        break;
    case  2:
        test.imades();
        break;
    case 3:
        test.imades();

        main.sound();

}


    }
}