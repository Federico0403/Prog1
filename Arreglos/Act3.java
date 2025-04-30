package Arreglos;

public class Act3 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int [] arr = {10,2,3,5,4,8,5,9,8,5};
        double promedio = promedio(arr);
        arribaDelPromedio(promedio, arr);
    }
    public static double promedio(int arr[]){
        int suma = 0;
        double promedio = 0;
        for (int pos = 0; pos < MAX; pos++) {
            suma += arr[pos];
        }
        promedio = ((double)suma/MAX);
        System.out.println("Promedio es " + promedio);
        return promedio;
    }
    public static void arribaDelPromedio(double promedio, int [] arreglo){
        int cantElementos = 0;
        for (int i = 0; i < MAX; i++) {
            if (arreglo[i] <= promedio) {
                cantElementos++;
            }
        }
        System.out.println("El promedio supera o iguala a " + cantElementos + " elementos del arreglo");
    }
    
}

