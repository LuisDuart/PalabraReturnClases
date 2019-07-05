import java.util.Scanner;

public class operadoresAsignacion {

    public static void main(String[] args) {
    /*
        int a=3 ,b=2;
        int c =a;

        //operador de composicion se puede aplicar a + - * /%
        a+=1; //a=a+1;
        System.out.println("a = " + a);

        a+=3; // a=a +3;
        System.out.println("a = " + a);

        b -=1;
        System.out.println("b = " + b);

        //*= , /=, %=;


        // OPERADOR UNARIO

        int d=3;
        int e=-d;
        System.out.println("e = " + e);

        boolean f = true;
        boolean g = !f;

        System.out.println("g = " + g);

        //posincremento lo mismo para --
        int h =3;
        int j =h++;
        System.out.println("h = " + h);
        System.out.println("j = " + j);
        //preincremento lo mismo oara --
        int k=3;
        int l=++k;
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        if (a % 2 !=0)                                //(a % 2 == 0)

            System.out.println("es numero impar");
        else
            System.out.println("es numero par");



        Scanner edad = new Scanner (System.in);
        int tuEdad =0;
        System.out.println("ingresa tu edad");
        tuEdad=edad.nextInt();

        if (tuEdad >= 18)
        System.out.println("eres un adulto");
        else
        System.out.println("eres un niño");*/
        int a =-8;
        int valorMinimo =0 , valorMaximo= 10;
    // tmb se puede hacer en un if
        //boolean resultado=a>=valorMinimo && a <= valorMaximo;// resegresa verdadero si ambos son verdaderos si uno es falso
        //System.out.println("resultado = " + resultado);
        // and si uno es falso todo es falso y ya no se ejecuta
        if (a <= valorMinimo && a<=valorMaximo)
        System.out.println("estas dentro de rango");

        else
            System.out.println("estas fuera de rango");

        /*
         operador or tmb conocidos como corto circuito si cualquiera es verdadero
         todo es verdadero
        */

        boolean vacaciones = true;
        boolean diaDescanso= false;

        if(vacaciones || diaDescanso)
            System.out.println("puede asistir al partido del hijo");

        else
            System.out.println("el padre esta ocupado");


    }

}
