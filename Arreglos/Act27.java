package Arreglos;

public class Act27 {
    final static int MAX = 10;
    final static int SEPARADOR = 0;
    public static void main(String[] args) {
        int[]arr = {0,1,1,0,3,1,0,0,1,0};
        
        int inicio = 0; // para que entre una vez al while 
        int fin = -1;//tengo que poner -1 ya que en buscar inicio busca desde fin+1
        int numeroN = pedirNumero();
        int tamañoSec = 0;

        while (inicio < MAX) {
            inicio = buscarInicio(arr, fin+1);
            if (inicio < MAX) {
                fin = buscarFin(arr, inicio);
                tamañoSec = tamañoSecuencia(arr, inicio, fin);
                if (tamañoSec == numeroN) {
                    eliminarSecuencia(arr, inicio, tamañoSec);
                    fin = inicio;
                }
            }
        }
        mostrarArreglo(arr);
    }

    public static void eliminarSecuencia(int[]arr, int inicio, int tamañoSec){
        for (int i = inicio; i < MAX - tamañoSec; i++) {
            arr[i] = arr[i+tamañoSec];
        }
        for (int i = MAX - tamañoSec; i < MAX; i++) {
            arr[i] = SEPARADOR;
        }
    }

    public static int pedirNumero(){
        System.out.println("Ingrese un numero N para buscar N tamaño en secuencias y eliminarlo");
        int numero = Utils.leerInt();
        return numero;
    }

    public static int tamañoSecuencia(int[]arr, int inicio, int fin){
        return fin - inicio +1;
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


