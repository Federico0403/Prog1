package Arreglos;

public class Act17 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[]arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("Ingrese un numero a agregar al siguiente arreglo");
        mostrarArreglo(arr);
        int numero = Utils.leerInt();

        corrimientoDerecha(arr, numero);

        mostrarArreglo(arr);
    }

    public static void corrimientoDerecha(int[] arr, int numero) {
        for (int i = MAX - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = numero;
    }
    public static void mostrarArreglo(int arr[]){
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("|"+arr[pos]+"|");
        }
    }
}
