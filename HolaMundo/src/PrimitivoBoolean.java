public class PrimitivoBoolean {

    public static void main(String[] args) {
       // System.out.println("bits tipo float:" + Boolean.SIZE);
        //System.out.println("biytes tipo float:" + Boolean.BYTES);
        System.out.println("valor maximo tipo float:" + Boolean.TRUE);
        System.out.println("valor minimo tipo float:" + Boolean.FALSE);

        boolean boleanVar= true;
        if(boleanVar)
            System.out.println("la variable contiene un valor verdadero");
        else
            System.out.println("la variable contiene un valor falso");

        var edad=23;
        var adulto=edad>=18;// por el tipo de operador se sabe que es boolean ya nos va a regresar un true o false
        if(adulto)
            System.out.println("eres mayor de edad puedes pasar");
        else
            System.out.println("eres menor de edad no puedes pasar");

    }
}
