package Iterativas;


public class Act10_2024 {
    /*
     * 10. Escribir un programa que mientras que el usuario ingrese un
     * número entero entre 1 y 10 inclusive, lleve la suma de los
     * números ingresados. Finalmente, cuando sale del ciclo muestre
     * por pantalla el resultado de la suma. ¿En qué casos termina?
     */
    public static void main(String[] args) {

        int numeroIngresado = 0;
        int suma = 0;

        System.out.println("Ingrese un numero del 1 al 10");
        numeroIngresado = Utils.leerInt();

        while ((numeroIngresado >= 1) && (numeroIngresado <= 10)) {
            suma += numeroIngresado;
            if ((numeroIngresado >= 1) && (numeroIngresado <= 10)) {
                System.out.println("ingrese otro numero");
                numeroIngresado = Utils.leerInt();
            }
        }
        System.out.println("Su numero fue |" + suma + "|");
    }
}
