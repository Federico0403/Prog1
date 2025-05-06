package Arreglos;

public class Act23 {
    final static int MAX = 10;
    final static int SEPARADOR = 0;
    public static void main(String[] args) {
        int[]arr = {0,0,0,0,0,0,4,3,0,0};
        
        int inicio = 0; // para que entre una vez al while 
        int fin = -1;//tengo que poner -1 ya que en buscar inicio busca desde fin+1
        boolean encontrado = false;

        while (inicio < MAX && encontrado == false) {
            inicio = buscarInicio(arr, fin+1);
            if (inicio < MAX) {
                fin = buscarFin(arr, inicio);
                System.out.println("El inicio de la primera secuencia es " + inicio + " y el final es :" + fin);
                encontrado = true;
            }
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
}

