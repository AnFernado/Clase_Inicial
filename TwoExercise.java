import java.util.Scanner;

public class TwoExercise {
    public static void main(String[] args) {
        // El programa se detiene cuando los dos ultimos numeros sen iguales

        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();    //Lectura numero 1
        int number2;
        int count =1;

        do {

            number2 = number1;
            System.out.println("Type your number" +count +": ");
            number1 = sc.nextInt();    //lectura numero 2
            count++;
        }
        while (number2 != number1);


    }
}
