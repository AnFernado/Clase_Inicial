import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        // comentarios de una linea  -/*  */ para varios.      salto de linea \n

        //entradas
        Scanner variable = new Scanner(System.in); //Captura por teclado
        System.out.print("Type your date : ");  // pidiendo
        byte dato = variable.nextByte();
        System.out.println(dato);

        String Name = "Fe";
        byte Age = 22;
        System.out.println("Hello  "+Name +" ,tu tienes " +Age +" Años");


    }
}

/*
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        // Esto es un comentario
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your age: ");
        byte age = sc.nextByte();
        System.out.print("Type your name: ");
        String name = sc.next();
        System.out.println("Hello "+name+", age: "+age);

        if (age > 14 && age < 18 ){
            System.out.println(name.toUpperCase() + " is a teen");
        }else if(age >=18){
            System.out.println(name + " is an adult");
        }
        else{
            System.out.println(name + " is a child");
        }
        String password = null;
        String psw= "MisionTic2021";

        do{
            System.out.println("Type your password: ");
            password = sc.next();
        }while(!password.equals(psw));

    }
}
 */
