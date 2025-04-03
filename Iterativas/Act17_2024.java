package Iterativas;

public class Act17_2024 {
    /*
     * 17. Escribir un programa que dado un valor ingresado por el
     * usuario menor que 10 y mayor a 1, muestre por pantalla una
     * cuenta regresiva de números desde dicho valor hasta el 0
     * inclusive.
     */
    public static void main(String[] args) {

        int numeroIngresado = 0;

        System.out.println("Ingrese un numero menor a 10 y mayor a 1");
        numeroIngresado = Utils.leerInt();

        if ((numeroIngresado > 1) && (numeroIngresado < 10)) {
            System.out.print("Cuenta regresiva ");
            for (int i = numeroIngresado; i >= 0; i--) {
                System.out.print("|" + i + "|");
            }
        } else {
            System.out.println("numero no valido");
        }

    }
}
