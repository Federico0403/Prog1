package Arreglos;

public class Act20 {
    final static int MAX = 10;
    
    public static void main(String[] args) {
        int[]arr = {0,1,2,3,4,3,6,7,3,9};

        System.out.println("Ingrese un numero para buscar en el siguiente arreglo");
        mostrarArreglo(arr);
        System.out.println("Escribalo:");
        int numero = Utils.leerInt();

        borrarOcurrencia(numero, arr);
        mostrarArreglo(arr);
        

    }
    public static void borrarOcurrencia(int numero, int[] arr) {
        int i = 0;
        while (i < MAX) {
            if (arr[i] == numero) {
                corrimientoIzquierda(i, arr);
            } else {
                i++;
            }
        }
    }
    public static void corrimientoIzquierda(int pos, int[]arr){
        if (pos == MAX - 1) {
            arr[pos] = 0;
        } else {
            for (int i = pos; i < MAX - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[MAX - 1] = 0;
        }
    }
    
    public static void mostrarArreglo(int arr[]){
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("|"+arr[pos]+"|");
        }
    }
}
