package Arreglos;

public class Act10 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,6,6};
        int numeroN = 0;
        int comparacion = 0;

        System.out.println("Ingrese un numero N, El cual sera comparado con la cantidad de numeros primos del arreglo");
        numeroN = Utils.leerInt();

        comparacion = cantidadDePrimos(arr);

        if (numeroN == comparacion) {
            System.out.println("Hay " + numeroN + " cantidad de numeros primos");
        } else {
            System.out.println("No hay " + numeroN + "cantidad de numeros primos sino que hay " + comparacion);
        }
    }
    public static int cantidadDePrimos(int[]arr){
        int cantidad = 0;
        for (int i = 0; i < MAX; i++) {
            if (esPrimo(arr[i])) {
                cantidad++;
            }
        }
        return cantidad;
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        int i = 2;
        while (i * i <= numero) {
            if (numero % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
