import java.util.Scanner;

public class Estaciondelyear {

    public static void main(String[] args) {
        int mes = 0;
        String estacion =" ";
        Scanner meses = new Scanner(System.in);
        System.out.println("proporciona un mes entre 1 y 12");
        mes = Integer.parseInt(meses.nextLine());
        
        if (mes ==1 || mes ==2 ||mes == 12){
            estacion = "invierno";
        }
        
        else if (mes ==3 || mes ==4 ||mes == 5){
            estacion = "primavera";
        }
        else if (mes ==6 || mes ==7 ||mes == 8){
           estacion = "verano";
        }
        else if (mes ==9 || mes ==10 ||mes == 11){
            estacion = "otoño";
        }
        else{
            estacion = "el mes no existe";
        }

        System.out.println("estacion = " + estacion);
    }
    
    
}
