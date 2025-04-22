public class Act1 {
    public static void main(String[] args) {
        /*
         * Escribir un diseño de programa que mientras que el usuario
         * ingrese un número distinto de 0, pida ingresar otro número y lo
         * imprima.
         */
        resolucion();
    }

    public static void resolucion(){
        int numero = 1;

        System.out.println("Ingrese un numero distinto de 0");
        numero = Utils.leerInt();

        while (numero != 0) {
            System.out.println("Ingrese un numero");
            numero = Utils.leerInt();
            System.out.println("su numero fue" + numero);
        }
    }
}
