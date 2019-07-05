import java.util.Scanner;

public class elMayorDeDosNumeros {
    public static void main(String[] args) {

        int numero1 = 0;
        int numero2 = 0;
        Scanner numeros = new Scanner(System.in);

        System.out.println("Proporciona el primer número");
        numero1 = Integer.parseInt(numeros.nextLine());

        System.out.println("proporciona el segundo número");
        numero2 = Integer.parseInt(numeros.nextLine());

        if (numero1 != numero2) {
            var numeroMayor = (numero1 > numero2) ? numero1 : numero2; //?:en caso de que la expresion ser verdadera devuelve el valor de la 1
            // de lo contrario devuelve el valor de la segunda experesion
            System.out.println("el numero mayor es :"+ numeroMayor);

        }else
            System.out.printf("Los numero son iguales " +numero1+" = "+numero2);

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero2:");
        int numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println("El numero mayor es:");
        System.out.println(numero1 > numero2 ? numero1 : numero2);

*//*
        Scanner sc = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        var numero1 = Integer.parseInt(sc.nextLine());
        System.out.println("Proporciona el numero2:");
        var numero2 = Integer.parseInt(sc.nextLine());
        if (numero1 != numero2) {
            var numeroMayor = (numero1 > numero2) ? numero1 : numero2;
            System.out.println("El numero mayor es: "+numeroMayor);
        } else {
            System.out.println("Los números son iguales ...");
        }
*/
    }
}
