package Arreglos;

public class LapiceraYHojaAct2 {
    final static int MAXC = 20;
    final static int MAXM = 5;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        int[]arrC = {4,3,8,6,2,12,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[]arrM = {2,3,5,6,12};
        int i = 0;
        recorrerCyProcesar(arrC, arrM);
        mostrarArreglo(arrC);
        System.out.println();
        mostrarArregloM(arrM);
    }
    public static void recorrerCyProcesar(int[]arrC,int[]arrM){
        int i = 0;
        while (i < MAXC && arrC[i] != SEPARADOR) {
            if (!seAsigno(arrC[i], arrM, i)) {
                System.out.println("no quedan mas mesas para asignar");
                i++;
            } else { 
                corrimientoIzquierda(arrC, i);
            }
        }
    }
    public static boolean seAsigno(int cliente, int[]arrM, int numeroCliente){
        int i = 0;
        while (i<MAXM && cliente > arrM[i]) {
            i++;
        }
        if (i < MAXM) {
            System.out.println("el ciente" + (numeroCliente+1) + " se asigno a la mesa " + i);
            arrM[i] = -arrM[i];
            return true;
        } else {
            return false;
        }
    }
    public static void corrimientoIzquierda(int[]arrC,int pos){
        System.out.println(pos);
        for (int i = pos; i < MAXC-1; i++) {
            arrC[i] = arrC[i+1];
        }
    }
    public static void mostrarArreglo(int arr[]){
        for (int pos = 0; pos < MAXC; pos++) {
            System.out.print("|"+arr[pos]+"|");
        }
    }
    public static void mostrarArregloM(int arr[]){
        for (int pos = 0; pos < MAXM; pos++) {
            System.out.print("|"+arr[pos]+"|");
        }
    }
}
