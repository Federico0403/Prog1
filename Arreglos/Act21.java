package Arreglos;

public class Act21 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[]arr = {10,9,8,7,6,5,4,3,2,1};
        System.out.println("Ingrese un número a insertar en el siguiente arreglo (ordenado de forma decreciente):");
        mostrarArreglo(arr);
        int numero = Utils.leerInt();

        insertar(numero, arr);

        System.out.println("Arreglo actualizado:");
        mostrarArreglo(arr);
    }

    public static void insertar(int numero, int[] arr) {
        int pos = 0;
        while (pos < MAX && arr[pos] > numero) {
            pos++;
        }

        if (pos < MAX) {
            corrimientoDerecha(arr, pos);
            arr[pos] = numero;
        } else {
            System.out.println("El número no se insertó porque es menor que todos los elementos.");
        }
    }

    public static void corrimientoDerecha(int[] arr, int desde) {
        for (int i = MAX - 1; i > desde; i--) {
            arr[i] = arr[i - 1];
        }
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println();
    }
}