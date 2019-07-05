import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class rectangulo {
    public static void main(String[] args) {

        int alto=0 , ancho=0;

        var areaRectangulo =new Scanner(System.in);
        System.out.println("proporciona el alto");
        alto=areaRectangulo.nextInt();
        System.out.println("proporciona el ancho");
        ancho=areaRectangulo.nextInt();
        System.out.println("Area: "+(alto * ancho));
        System.out.println("perimetro: "+((alto + ancho)*2));


    }
}
