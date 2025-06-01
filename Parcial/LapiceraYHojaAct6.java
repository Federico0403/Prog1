package Parcial;

public class LapiceraYHojaAct6 {
    final static int MAXP = 28;
    final static int MAXR = 2;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        int[]arrP = {0, 0, 9, 12, 18, 0, 1, 5, 43, 73, 88, 0, 8, 9, 52, 0, 1, 10, 90, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        int[]arrR = {44,60};

        int inicio = 0;
        int fin = -1;

        int contador = 0;

        while (inicio < MAXP) {
            inicio = buscarInicio(arrP, fin+1);
            if (inicio < MAXP) {
                fin = buscarFin(arrP, inicio);
                recorrerR(arrP,arrR,inicio,fin);
                contador = contador+2;
                fin = fin + MAXR;
            }
        }
        System.out.println("Productos regalados" + contador);
        mostrarArreglo(arrP);
    }
    public static void recorrerR(int[]arrP,int[]arrR,int inicio, int fin){
        for (int i = 0; i < MAXR; i++) {
            int posicion = buscarPosicion(arrP, inicio, fin, arrR[i]);
            corrimientoDerecha(arrP,posicion);
            arrP[posicion] = arrR[i];
            fin= fin+1;
        }
    }
    public static int buscarPosicion(int[]arrP, int inicio, int fin, int pos){
        while (inicio <= fin && pos > arrP[inicio]) {
            inicio++;
        }
        System.out.println(inicio);
        return inicio;
    }
    public static void corrimientoDerecha(int[]arrP, int pos){
        for (int i = MAXP-1; i > pos; i--) {
            arrP[i] = arrP[i-1];
        }
    }
    public static int buscarInicio(int[]arrE, int pos){
        while (pos < MAXP && arrE[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }
    public static int buscarFin(int[]arrE, int pos){
        while (pos < MAXP && arrE[pos] != SEPARADOR) {
            pos++;
        }
        return pos-1;
    }
    public static void mostrarArreglo(int[] arr) {
        for (int pos = 0; pos < MAXP; pos++) {
            System.out.print("|" + arr[pos] + "|");
        }
    }
}
