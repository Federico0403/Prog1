package Arreglos;

public class Act18 {
    final static int MAX = 10;
    
    public static void main(String[] args) {
        int[]arr = {0,1,2,3,4,5,6,7,8,9};

        System.out.println("Ingrese un numero para buscar en el siguiente arreglo");
        mostrarArreglo(arr);
        System.out.println("Escribalo:");
        int numero = Utils.leerInt();

        borrarOcurrencia(numero, arr);
        mostrarArreglo(arr);
        

    }
    public static void borrarOcurrencia(int numero, int[]arr){
        boolean ocurrencia = false;
        int i = 0;
        while (i < MAX && !ocurrencia) {
            if (arr[i] == numero) {
                ocurrencia = true;
            }
            i++;
        }
        if (ocurrencia) {
            corrimientoIzquierda(numero, arr);
        } else {
            System.out.println("no se a encontrado ninguna ocurrencia de tu numero en el arreglo");
        }
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
