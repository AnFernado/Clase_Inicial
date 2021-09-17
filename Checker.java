import java.util.Scanner;

public class Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte option = -1;
        while(option != 0){

            System.out.println("---Welcome---");
            System.out.println("1. Option 1.");
            System.out.println("2. Option 2.");
            System.out.println("\n0. Exit.");
            System.out.print("Choose an option: ");
            option = sc.nextByte();


        }


    }
}


//               MENUS
/*

            switch (option){
                case 1:
                    System.out.println("Option 1 selected.");
                    break;
                case 2:
                    System.out.println("Option 2 selected.");
                    break;
                case 0:
                    System.out.println("Good bye!");
                    break;
                default:
                    System.out.println("Choose a valid option.");
                    break;
            }

 */
