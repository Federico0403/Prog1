package Arreglos;

public class Act26 {
    final static int MAX = 10;
    final static int SEPARADOR = 0;
    public static void main(String[] args) {
        int[]arr = {0,1,1,1,3,1,1,0,1,0};
        
        int inicio = 0; // para que entre una vez al while 
        int fin = -1;//tengo que poner -1 ya que en buscar inicio busca desde fin+1


        int inicioMayor = 0;
        int finMayor = 0;
        int tamañoSec = 0;
        int mayorTamañoSec = 0;

        while (inicio < MAX) {
            inicio = buscarInicio(arr, fin+1);
            if (inicio < MAX) {
                fin = buscarFin(arr, inicio);
                // cuento el tamaño de la secuencia
                tamañoSec = tamañoSecuencia(arr, inicio, fin);
                // comparo y me quedo con la de mayor tamaño
                if (tamañoSec > mayorTamañoSec) {
                    mayorTamañoSec = tamañoSec;
                    inicioMayor = inicio;
                    finMayor = fin;
                }
            }
        }
        System.out.println("La secuencia de mayor tamaño tiene " + mayorTamañoSec + " numeros separados ");
        System.out.println("Y se ubica en " + inicioMayor + " y el final en " + finMayor);
    }

    public static int tamañoSecuencia(int[]arr, int inicio, int fin){
        int tamaño = 0;
        for (int i = inicio; i <= fin; i++) {
            tamaño++;
        }
        return tamaño;
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
}


