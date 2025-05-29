package Arreglos;

public class PapelYHojaAct5 {
    final static int MAXE = 16;
    final static int SEPARADOR = -1;

    public static void main(String[] args) {
        int[]arrE = {-1,5,5,7,7,-6,4,9,10,-4,1,1,2,7,-9,-8};

        int inicio = 0;

        int fin = -1;

        int contadorPedido = 0;
        int empanada = 7;
        int pedidoUsuario = 2;

        while (inicio < MAXE) {
            inicio = buscarInicio(arrE, fin+1);
            if (inicio < MAXE) {
                fin = buscarFin(arrE, inicio);
                contadorPedido++;
                if (pedidoUsuario == contadorPedido) {
                    int posicionAInsertar = buscarPosicion(arrE, inicio, fin, empanada);
                    corrimientoDerecha(arrE, posicionAInsertar);
                    arrE[posicionAInsertar] = empanada;
                    fin = fin + 1;
                }
            }
        }
        mostrarArreglo(arrE);
    }
    public static int buscarPosicion(int[]arrE, int inicio, int fin, int empanada){
        while (inicio <= fin && empanada > arrE[inicio]) {
            inicio++;
        }
        
            return inicio;
        
    }
    public static void corrimientoDerecha(int[]arrE, int pos){
        for(int i = MAXE-1; i > pos; i--){
            arrE[i] = arrE[i-1];
        }
    }
    public static int buscarInicio(int[]arrE, int pos){
        while (pos < MAXE && arrE[pos] <= SEPARADOR) {
            pos++;
        }
        return pos;
    }
    public static int buscarFin(int[]arrE, int pos){
        while (pos < MAXE && arrE[pos] > SEPARADOR) {
            pos++;
        }
        return pos-1;
    }
    public static void mostrarArreglo(int[] arr) {
        for (int pos = 0; pos < MAXE; pos++) {
            System.out.print("|" + arr[pos] + "|");
        }
    }
}
