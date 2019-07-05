public class primitivosInt {

    public static void main(String[] args) {
        //byte, short, int, long

        System.out.println("bits tipo byte:" + Byte.SIZE);
        System.out.println("biytes tipo byte:" + Byte.BYTES);
        System.out.println("valor maximo tipo byte:" + Byte.MAX_VALUE);
        System.out.println("valor minimo tipo byte:" + Byte.MIN_VALUE);

        System.out.println("bits tipo short:" + Short.SIZE);
        System.out.println("biytes tipo short:" + Short.BYTES);
        System.out.println("valor maximo tipo short:" + Short.MAX_VALUE);
        System.out.println("valor minimo tipo short:" + Short.MIN_VALUE);

        System.out.println("bits tipo int:" + Integer.SIZE);
        System.out.println("biytes tipo int:" + Integer.BYTES);
        System.out.println("valor maximo tipo int:" + Integer.MAX_VALUE);
        System.out.println("valor minimo tipo int:" + Integer.MIN_VALUE);

        System.out.println("bits tipo long:" + Long.SIZE);
        System.out.println("biytes tipo long:" + Long.BYTES);
        System.out.println("valor maximo tipo long:" + Long.MAX_VALUE);
        System.out.println("valor maximo tipo long:" + Long.MIN_VALUE);

        byte bytevar=15;
        short shortvar=100;
        int intvar=500;
        long longvar=1000;

        System.out.println("longvar = " + longvar);
        System.out.println("intvar = " + intvar);
        System.out.println("shortvar = " + shortvar);
        System.out.println("bytevar = " + bytevar);

        var numero=10;// var agarra int para que sea long se agrega una L ejemplo= 10L
        System.out.println("numero = " + numero);

        //pqra octales y hexadecimales

        byte b1= 0xa;// osea seria 10 pero en hexadecimal   se necesita un 0x antes del valor en hexadecimal
        System.out.println("b1 = " + b1);

        // para octal
        byte b2=012;       // se necesita un 0 antes del valor octal
        System.out.println("b2 = " + b2);


        // no se puede agregar un 0 antes de un numero en decimal porque puede traer errores porque parareci¿eria que esta en octal
        // si se tiene que poner un 0 antes se tiene que hacer una conversion a una cadena y agregar un formato para imprimir ceros a la izquierda.


    }


}
