import java.util.Scanner;

public class sentenciasControl {
    public static void main(String[] args) {

        float calificacion=0;

        Scanner calificaciones =new Scanner(System.in);

        System.out.println("Proporciona un valor entre 0 y 10");
        calificacion = Float.parseFloat(calificaciones.nextLine()) ;

        if(calificacion >= 9 && calificacion<=10){

            System.out.println("calificacion = A");
        }

        else if (calificacion >=8 && calificacion <9){
            System.out.printf("calificacion = B");
        }
        else if (calificacion >=7 && calificacion <8){
            System.out.printf("calificacion = C");
        }

        else if (calificacion >=6 && calificacion<7) {
            System.out.printf("calificacion = d");
        }
        else if(calificacion >=0 && calificacion <6){
            System.out.printf("calificacion = F");

            }
        else {
            System.out.println("valor desconocido");
        }
        }
    }

