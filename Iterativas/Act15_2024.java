package Iterativas;

public class Act15_2024 {
    /*
     * 15. Pedir por consola el ingreso de números enteros. Cuando se
     * ingrese un 0 se debe terminar el programa informando el
     * promedio de los números ingresados, cuál fue el mayor número y
     * cuál fue el menor número.
     */
    public static void main(String[] args) {

        double promedio = 0;
        int numeroIngresado;
        int mayorNum = Integer.MIN_VALUE;
        int menorNum = Integer.MAX_VALUE;
        int contador = 0;

        System.out.println("Ingrese un numero");
        numeroIngresado = Utils.leerInt();

        while (numeroIngresado != 0) {
            if (numeroIngresado > mayorNum) {
                mayorNum = numeroIngresado;
            } else if (numeroIngresado < menorNum) {
                menorNum = numeroIngresado;
            }
            contador++;
            promedio += numeroIngresado;
            if (numeroIngresado != 0) {
                System.out.println("Ingrese otro numero, o ingrese 0 para terminar");
                numeroIngresado = Utils.leerInt();
            }
        }
        System.out.print("La cantidad de numeros ingresados fueron |" + contador + "| y el promedio fue |" + (promedio/contador) + "|");
        System.out.println(" \n El mayor numero fue |" + mayorNum + "| y el menor fue |" + menorNum + "|");
    }
}
