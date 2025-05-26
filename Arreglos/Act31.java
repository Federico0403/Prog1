package Arreglos;

public class Act31 {
    final static int MAX = 10;
    final static int SEPARADOR = 0;
    public static void main(String[] args) {
        int[]arr = {0,2,0,4,3,1,0,2,4,0};
        
        int inicio = 0; 
        int fin = -1;

        int anteultimaSec = contadorSecuencias(arr)-1;
        int contadorSec = 0;

        while (inicio < MAX) {
            inicio = buscarInicio(arr, fin+1);
            if (inicio < MAX) {
                fin = buscarFin(arr, inicio);
                contadorSec++;
                if (anteultimaSec == contadorSec) {
                    invertirSec(arr, inicio, fin);
                }
            }
        }
        mostrarArreglo(arr);
    }
    public static int contadorSecuencias(int[]arr){
        int contador = 0;

        int inicio = 0; 
        int fin = -1;

        while (inicio < MAX) {
            inicio = buscarInicio(arr, fin+1);
            if (inicio < MAX) {
                fin = buscarFin(arr, inicio);
                contador++;
            }
        }
        return contador;
    }

    public static void invertirSec(int[] arr, int inicio, int fin) {
        while (inicio < fin) {
            int temp = arr[inicio];
            arr[inicio] = arr[fin];
            arr[fin] = temp;
            inicio++;
            fin--;
        }
    }


    public static int buscarInicio(int[]arr, int pos){
        while (pos < MAX && arr[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }
    public static int buscarFin(int[]arr, int pos){
        while (pos < MAX && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos-1;
    }
    public static void mostrarArreglo(int arr[]){
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("|"+arr[pos]+"|");
        }
    }
}


