package Arreglos;

public class Act7 {
    // NO ENTENDI BIEN LA CONSIGNA ASI QUE DUDA DE LO HECHO JAJAJAJ
    final static int MAX = 10;
    public static void main(String[] args) {
        int numeroN;
        int numeroM;
        int[]arr = {1,2,3,4,5,6,7,8,6,6};
        System.out.println("Ingrese un numero N menor a 10 a buscar en el arreglo");
        numeroN = Utils.leerInt();
        System.out.println("y un numero M por el cual sera multiplicado las ocurrencias del numero N");
        numeroM = Utils.leerInt();

        ocurrencias(arr, numeroN, numeroM);
        mostrarArreglo(arr);

    }
    public static void ocurrencias(int[]arr, int numeroN, int numeroM){
        for (int i = 0; i < MAX; i++) {
            if (arr[i] == numeroN) {
                arr[i] = arr[i] * numeroM;
            }
        }
    }
    public static void mostrarArreglo(int arr[]){
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("|"+arr[pos]+"|");
        }
    }
}
