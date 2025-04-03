package Iterativas;

public class Act6_2024 {
    /*
     * Escribir un programa que mientras el usuario ingrese un número
     * entero menor que 100 y mayor a 1, muestre por pantalla si el
     * número es múltiplo de 2 y múltiplo de 3 simultáneamente. (¿Los
     * valores mencionados en el enunciado deberían ser constantes?.
     * De a poco habría que definirlos como constantes).
     */
    public static void main(String[] args) {

        int cien = 100;
        int uno = 1;
        int numeroIngresado = 1;
        int multiplo2 = 2;
        int multiplo3 = 3;

        System.out.println("Ingrese un numero");
        numeroIngresado = Utils.leerInt();

        while ((numeroIngresado < cien) && (numeroIngresado > uno)) {
            if ((numeroIngresado % multiplo2 == 0) && (numeroIngresado % multiplo3 == 0)) {
                System.out.println("El numero es multiplo de dos y tres simultaneamente \n");
            } else {
                System.out.println("Su numero no es multiplo de dos y tres simultaneamente \n");
            }
            System.out.println("Ingrese otro numero menor a 100 y mayor a 1 para continuar");
            numeroIngresado = Utils.leerInt();
        }
    }
}
