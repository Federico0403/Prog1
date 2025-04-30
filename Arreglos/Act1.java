package Arreglos;

public class Act1 {
    final static int MAX = 15;
    public static void main(String[] args) {
        int [] arreglo = new int[15];
        carga(arreglo);
        mostrarArreglo(arreglo);
    }
    public static void carga(int arr[]){
        int numero = 0;
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("Ingrese un numero del 1 al 12");
            numero = Utils.leerInt();
            if (numero >= 1 && numero <= 12) {
                arr[pos] = numero;
            } else {
                System.out.println("Numero no valido");
            }
        }
    }
    public static void mostrarArreglo(int arr[]){
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("|"+arr[pos]+"|");
        }
    }
}

