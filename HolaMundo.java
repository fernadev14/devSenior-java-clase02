import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] arg) {

        // imprime pero salta de linea
        System.out.println("Hola mundo");

        // imprime pero no salta de linea
        System.out.print("Hola Fernando");
        System.out.print(", como estas?");

        // printf es para crear una cadena de argumentos colocando %tipoDato
        System.out.printf("Aqui va una cadena: %s%n", "Fernando");
        System.out.printf("Aqui va un numero: %d%n", 10);
        System.out.printf("Mi nombre es %s y tengo %d años", "Fernando", 24);

        // para pedir datos por teclado
        var entrada = new Scanner(System.in);

        System.out.println("");
        System.out.print("Ingrese su nombre: ");
        var entero = entrada.nextLine();
        System.out.println("Su nombre es: " + entero);

        entrada.close();

    }

}