public class Act3 {
    public static void main(String[] args) {
        /*
         * Escribir un diseño de programa que mientras que el usuario
         * ingrese un número natural, pida ingresar otro número cualquiera y
         * lo imprima.
         */
        resolucion();
    }
    public static void resolucion (){
        int numero = 1;
        while (numero > 0) {
            imprimirNumero();
            System.out.println("ingrese un numero negativo para terminar");
            numero = Utils.leerInt();
        }
    }
    public static void imprimirNumero(){
        int numero = 0;
        System.out.println("Ingrese un numero");
        numero = Utils.leerInt();
        System.out.println(numero);

    }
}
