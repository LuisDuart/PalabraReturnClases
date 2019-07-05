import java.util.Scanner;

public class tiendaLibros {
    public static void main(String[] args) {

        Scanner informacion = new Scanner(System.in);
        System.out.println("proporciona el nombre:\n");
        String nombre =informacion.nextLine();
        System.out.println("proporciona el id\n");
        int id = informacion.nextInt();
        System.out.println("proporciona el precio\n");
        double precio= informacion.nextDouble();
        System.out.println("proporciona el simbolo\n");
        char simbolo = informacion.next().charAt(0);
        System.out.println("proporciona el envio gratuito\n");
        boolean envio= informacion.nextBoolean();

        System.out.println(nombre+" #"+ id);
        System.out.println("Precio: "+simbolo+ precio);
        System.out.println("Envio gratuito: "+envio);


    }
}
