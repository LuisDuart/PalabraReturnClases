import java.util.Scanner;

public class EstacionConSwitch {
    public static void main(String[] args) {

        int mes = 0;
        String estacion =" ";
        Scanner meses = new Scanner(System.in);
        System.out.println("proporciona un mes entre 1 y 12");
        mes = Integer.parseInt(meses.nextLine());

        switch (mes){
            case 1: case 2 : case 12:
                estacion ="invierno";
                break;

            case 3: case 4: case 5:
                estacion =" primavera";
                break;

            case 6: case 7: case 8:
                estacion="verano";
                break;
            case 9: case 10: case 11:
                estacion= "otoño";
                break;

            default:
                estacion =" mes desconocido";
                break;
        }

        System.out.println("estacion = " + estacion);
    }
}
