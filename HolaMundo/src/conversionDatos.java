import java.util.Scanner;

public class conversionDatos {
    public static void main(String[] args) {
    
        int edad= Integer.parseInt("20");
        System.out.println("edad = " + edad);

        var edad2= Integer.parseInt("20");
        System.out.println("edad = " + edad2);

        double valorPi= Double.parseDouble("3.14");
        System.out.println("valorPi = " + valorPi);
        
        char c= "hola".charAt(0);// va el indice entre el caracter
        System.out.println("c = " + c);


        //var scanner=new Scanner(System.in);
       // int edad3=Integer.parseInt(scanner.nextLine());
       // System.out.println("edad = "+edad3);


        String edadTexto=String.valueOf(25);// convertir un primitivo a una cadena
        System.out.println("edadTexto = " + edadTexto);

        String edadTexto2= ""+ valorPi;
        System.out.println("edadTexto2 = " + edadTexto2);

        byte b=10;
        short s= b;

       // no es posile por el tipo de variable byte b2= s;

        //casting

        byte b2=(byte) s; // asi lo abligamos si se tiene una expresion se pone entre parentesis (s+1) por ejemplo
    }
}
