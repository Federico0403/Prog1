package Arreglos.Parcial;

public class Act5P {
    final static int MAXE = 16;
    final static int SEPARADOR = 0; 
    public static void main(String[] args) {
        int[]arrE = {-1,5,5,7,7,-6,4,9,10,-4,1,1,2,7,-9,-8};

        int numeroPedido = 2;
        int empanadaAagregar = 7;
        int contadoPedido = 0;
        int inicio = 0;
        int fin = -1;
        int posicionAInsertar = 7;

        while (inicio < MAXE) {
            inicio = buscarInicio(arrE, fin+1);
            if (inicio < MAXE) {
                fin = buscarFin(arrE, inicio);
                contadoPedido++;
                if (contadoPedido == numeroPedido) {
                    posicionAInsertar = buscarPosicion(arrE, inicio, fin, empanadaAagregar);
                    System.out.println(posicionAInsertar);
                    insertarEmpanada(arrE, posicionAInsertar, empanadaAagregar);
                    fin = fin+1;
                }
            }
        }
        mostrarArreglo(arrE);
    }
    public static int buscarPosicion(int[]arrE, int inicio, int fin, int empanada){
        int i = inicio; boolean encontrado = false;
        while (i <= fin && !encontrado) {
            if (empanada < arrE[i]) {
                encontrado = true;
            } else {
                i++;
            }
        }
        return i;
    }
    public static void insertarEmpanada(int[]arrE, int posicionAInsertar, int empanada){
        corrimientoDerecha(arrE, posicionAInsertar);
        arrE[posicionAInsertar] = empanada;
    }
    public static void corrimientoDerecha(int[]arrE,int pos){
        for (int i = MAXE-1; i > pos; i--) {
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
