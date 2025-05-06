package Arreglos;

public class Act24 {
    final static int MAX = 10;
    final static int SEPARADOR = 0;
    public static void main(String[] args) {
        int[]arr = {0,0,2,2,10,0,4,3,0,0};
        
        int inicio = 0; // para que entre una vez al while 
        int fin = -1;//tengo que poner -1 ya que en buscar inicio busca desde fin+1
        int suma = 0;
        int sumaMayor = 0;

        while (inicio < MAX) {
            inicio = buscarInicio(arr, fin+1);
            if (inicio < MAX) {
                fin = buscarFin(arr, inicio);
                suma = sumaDeSecuencias(arr, inicio, fin);
                if (suma > sumaMayor) {
                    sumaMayor = suma;
                }
            }
        }
        System.out.println("La secuencia con mayor suma es " + sumaMayor);
    }

    public static int sumaDeSecuencias(int[]arr, int inicio, int fin){
        int suma = 0;
        for (int i = inicio; i <= fin; i++) {
            suma += arr[i];
        }
        return suma;
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

