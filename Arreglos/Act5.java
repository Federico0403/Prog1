package Arreglos;

public class Act5 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9,1};
        invertir(arr);
        mostrarArreglo(arr);
    }
    public static void invertir(int[]arr){
        int izquierda = 0;
        int derecha = MAX-1;
        int auxiliar = 0;
        while (izquierda < derecha) {
            auxiliar = arr[izquierda];
            arr[izquierda] = arr[derecha];
            arr[derecha] = auxiliar;

            izquierda++;
            derecha--;
        }
    }
    public static void mostrarArreglo(int arr[]){
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("|"+arr[pos]+"|");
        }
    }
}
