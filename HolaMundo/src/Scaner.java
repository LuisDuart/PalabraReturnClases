import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        //capturar información del usuario
        Scanner scanner=new Scanner(System.in);//clase para leer informacion de la consola
        System.out.println("Proporciona tu nombre\n");


        String usuario = scanner.nextLine();// codigo dinamico o mas bien valores
        String saludar ="saludos"; // codigo duro

        System.out.println(saludar+" "+ usuario);

        // en vez de String podemos usar var pro solo en javas avanzados

    }
}
