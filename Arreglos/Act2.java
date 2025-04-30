package Arreglos;

public class Act2 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int [] arr = {10,2,3,5,4,8,6,9,8,5};
        promedio(arr);
    }
    public static void promedio(int arr[]){
        int suma = 0;
        double promedio = 0;
        for (int pos = 0; pos < MAX; pos++) {
            suma += arr[pos];
        }
        promedio = ((double)suma/MAX);
        System.out.println("Promedio es " + promedio);
    }
}
