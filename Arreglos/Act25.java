package Arreglos;

public class Act25 {
    final static int MAX = 10;
    final static int SEPARADOR = 0;
    public static void main(String[] args) {
        int[]arr = {0,1,1,1,0,1,1,0,1,0};
        
        int inicio = 0; // para que entre una vez al while 
        int fin = -1;//tengo que poner -1 ya que en buscar inicio busca desde fin+1
        int secuenciasRecorridas = 0;
        int anteultimaSec = contadorSec(arr, inicio, fin);
        System.out.println(anteultimaSec);
        while (inicio < MAX) {
            inicio = buscarInicio(arr, fin+1);
            if (inicio < MAX) {
                fin = buscarFin(arr, inicio);
                // cuento la cantidad de secuencias:
                secuenciasRecorridas++;
                // muestro la anteultima secuencia:
                if (secuenciasRecorridas == anteultimaSec) {
                    System.out.println("inicio " + inicio + " fin " + fin);
                }
            }
        }
    }

    public static int contadorSec(int[]arr, int inicio, int fin){
        int contadorDeSecuencias = 0;
        while (inicio < MAX) {
            inicio = buscarInicio(arr, fin+1);
            if (inicio < MAX) {
                fin = buscarFin(arr, inicio);
                // cuento la cantidad de secuencias:
                contadorDeSecuencias++;
                // muestro la anteultima secuencia:
            }
        }
        return contadorDeSecuencias-1;
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


