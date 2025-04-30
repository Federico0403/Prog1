package Arreglos;

public class Act11 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int[]arrA = {1,2,3,4,5,6,7,8,9,10};
        int[]arrB = {10,9,8,7,6,5,4,3,2,1};

        if (comparacionDeArreglos(arrA,arrB)) {
            System.out.println("el arrego b contiene a");
        } else {
            System.out.println("El arreglo b no contiene a");
        }
    }
    public static boolean comparacionDeArreglos(int[]arrA, int[]arrB) {
        boolean todosEncontrados = true;
        int i = 0;
        while (i < MAX) {
            boolean encontrado = false;
            int j = 0;
    
            while (j < MAX) {
                if (arrA[i] == arrB[j]) {
                    encontrado = true;
                }
                j++;
            }
            if (!encontrado) {
                todosEncontrados = false;
            }
    
            i++;
        }
    
        return todosEncontrados;
    }
    
}
