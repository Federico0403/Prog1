package Arreglos;

public class Act29 {
    final static int MAX = 10;
    final static int SEPARADOR = 0;
    public static void main(String[] args) {
        int[]arr = {0,5,4,3,2,10,0,2,4,0};
        
        int inicio = 0; // para que entre una vez al while 
        int fin = -1;//tengo que poner -1 ya que en buscar inicio busca desde fin+1


        while (inicio < MAX) {
            inicio = buscarInicio(arr, fin+1);
            if (inicio < MAX) {
                fin = buscarFin(arr, inicio);
                
            }
        }
        mostrarArreglo(arr);
    }

    public static boolean esDescendente(int[] arr, int inicio, int fin) {
        int i = inicio;
        boolean descendente = false;
        while (i < fin && !descendente) {
            if (arr[i] > arr[i + 1]) {
                descendente = true;
            }
            i++;
        }
        return descendente;
    }
    

    public static void eliminarSecuencia(int[]arr, int inicio, int tamañoSec){
        for (int i = inicio; i < MAX - tamañoSec; i++) {
            arr[i] = arr[i+tamañoSec];
        }
        for (int i = MAX - tamañoSec; i < MAX; i++) {
            arr[i] = SEPARADOR;
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


