package Arreglos;

public class Act16 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[]arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("ingrese hasta que numero se haga el corrimiento derecha");
        int numero = Utils.leerInt();
        corrimientoIzquierda(numero, arr);
        mostrarArreglo(arr);
    }
    public static void corrimientoIzquierda(int pos, int[]arr){
        for (int i = pos; i < MAX-1; i++) {
            arr[i] = arr[i+1];
        }
        
    }
    public static void mostrarArreglo(int arr[]){
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("|"+arr[pos]+"|");
        }
    }
}
