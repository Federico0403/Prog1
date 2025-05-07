package Arreglos;

public class Act33 {
    final static int MAX = 20;
    final static int SEPARADOR = 0;
    public static void main(String[] args) {
        int[]arr = {0,0,2,3,0,5,3,7,0,9,2,0,3,5,4,0,3,6,0,0};
        int[]arrB = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int numeroUsuario = pedirNumero();

        int inicio = 0; // para que entre una vez al while 
        int fin = -1;//tengo que poner -1 ya que en buscar inicio busca desde fin+1
        int inicioB = 0;

        while (inicio < MAX) {
            inicio = buscarInicio(arr, fin+1);
            if (inicio < MAX) {
                fin = buscarFin(arr, inicio);
                // Verificar que el tamaño de la secuencia de igual a N (n dado por el usuario)
                int tamañoSec = tamañoSecuencia(arr, inicio, fin);
                if (numeroUsuario == tamañoSec) {
                    // copiar la secuencia encontrada, en otro arreglo repleto de ceros
                    copiarSec(arr, arrB, inicio, fin, inicioB);
                    inicioB += numeroUsuario+1;
                }
            }
        }
        mostrarArreglo(arrB);
        
    }

    public static void copiarSec(int[]arr, int[]arrB, int inicio, int fin, int inicioB){
        int j = inicioB;
        for (int i = inicio; i <= fin; i++) {
            j++;
            arrB[j] = arr[i];
        }
    }

    public static int tamañoSecuencia(int[]arr, int inicio, int fin){
        return fin - inicio +1;
    }

    public static int pedirNumero(){
        System.out.println("Ingrese un numero");
        int numero = 0;
        return numero = Utils.leerInt();
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
