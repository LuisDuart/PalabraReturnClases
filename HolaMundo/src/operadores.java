public class operadores {
    public static void main(String[] args) {

        int a=3, b=5;

        //int c=a+b;
        System.out.println("la suma es: "+(a+b));
        System.out.println(a+b +" esta fue la suma");// si primero esta la suma no se tiene que poner en parentesis

        int d=a-b;
        System.out.println("d = " + d);

        int e=a*b;
        System.out.println("e = " + e);

        float f=b/a;
        System.out.println("f = " + f);

        int g =a%b;
        System.out.println("g = " + g);


        int h=6%2;

        if (h==0)
            System.out.println("el numero es par");
        else
            System.out.println("el numero es impar");
    }
}
