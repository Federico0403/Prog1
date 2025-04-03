package Iterativas;

public class Act8_2024 {

    /*
     * Escribir un programa que mientras que el usuario ingrese un
     * número entero distinto de 0, pida ingresar otro número entero y lo
     * imprima.
     */
    public static void main(String[] args) {

        int numeroIngresado = 0;
        int condicion = 0;

        System.out.println("Ingrese un numero");
        numeroIngresado = Utils.leerInt();

        while (numeroIngresado != condicion) {
            System.err.println("Ingrese otro numero");
            numeroIngresado = Utils.leerInt();
            // If ingresado para no mostrar el 0 cuando se corta el bucle
            if (numeroIngresado != 0) {
                System.out.println("Su numero fue :|" + numeroIngresado + "|");
            }
        }
    }
}
