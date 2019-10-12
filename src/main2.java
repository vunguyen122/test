import java.util.Scanner;

public class main2 {
    public static void main(String[] args){
        int choice;
        System.out.println("play sound or display image, or both?");

        Scanner input = new Scanner(System.in);
        choice = input.nextInt();

switch (choice){
    case 1:
        sound2.sound2();
        break;
    case  2:
        test.imades();
        break;
    case 3:
        sound2.sound2();
        test.imades();
        break;
}
    if (choice == 2){
        System.out.println(" you asdfas?");
        choice = input.nextInt();
        if (choice == 1 ){
            main.sound();
        }
    }
    System.out.println(" now stop");
    }
}
