public class PalabraReturnClases {
    //main
    public static void main(String[] args) {

        Suma s = crearObjetoSuma();// variable suma que es igual al metodo
        int resultado = s.a + s.b;
        System.out.println("resultado = " + resultado);
    }

    public static Suma crearObjetoSuma(){// metodo
        Suma s = new Suma(3,4);// objeto dentro del metodo
        return s;

    }
}   // clase suma
    class Suma{
        int a;// atributos de la clase
        int b;

        Suma (int a , int b){// constructor
            this.a=a;
            this.b=b;
        }
    }

