public class primitivosFlotatantes {

    public static void main(String[] args) {
        //float y double

        System.out.println("bits tipo float:" + Float.SIZE);
        System.out.println("biytes tipo float:" + Float.BYTES);
        System.out.println("valor maximo tipo float:" + Float.MAX_VALUE);
        System.out.println("valor minimo tipo float:" + Float.MIN_VALUE);

        System.out.println("bits tipo double:" + Double.SIZE);
        System.out.println("biytes tipo double:" + Double.BYTES);
        System.out.println("valor maximo tipo double:" + Double.MAX_VALUE);
        System.out.println("valor minimo tipo double:" + Double.MIN_VALUE);

        float floatvar= 0.5F;// si no se le pone la f pasa literal como double pero no cabe en el float tambien se puede omitir el cero .05
        double boublevar=0.10;// tambbien se le puede poner la D ejemplo .010D;

        var prubaNumero= 10.0F;
        var prubaNumero2= 10.0;// esta pasa como double


    }
}
