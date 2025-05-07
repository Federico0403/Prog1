package Arreglos;

public class Act32 {
    final static int MAX = 20;
    final static int SEPARADOR = 0;
    public static void main(String[] args) {
        int[]arr = {0,0,2,3,4,5,0,7,8,9,0,2,3,5,4,0,3,6,0,0};
        int numeroUsuario = pedirNumero();

        int inicio = 0; // para que entre una vez al while 
        int fin = -1;//tengo que poner -1 ya que en buscar inicio busca desde fin+1

        while (inicio < MAX) {
            inicio = buscarInicio(arr, fin+1);
            if (inicio < MAX) {
                fin = buscarFin(arr, inicio);
                if (numeroUsuario >= inicio && numeroUsuario <= fin) {
                    System.out.println("inicio " + inicio + " fin " + fin);
                }
            }
        }
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
}
