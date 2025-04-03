package Iterativas;

public class Act14_2024 {
    /*
     * 14. Pedir por consola el ingreso de 10 números enteros positivos.
     * Contar cuántas veces se ingresaron números pares y mostrarlo
     * por pantalla.
     */
    public static void main(String[] args) {

        int numero;
        int numeroPar = 0;

        System.out.println("Ingrese 10 numeros");

        for (int i = 1; i <= 10; i++) {
            System.out.print("numeros ingresados " + i + " Cantidad de numeros :");
            numero = Utils.leerInt();
            if (numero % 2 == 0) {
                numeroPar++;
            }
        }
        System.out.println("La cantidad de numeros pares fueron : " + numeroPar);
    }
}
