package Arreglos;

public class Practica {
    final static int MAX = 11;
    final static int SEPARADOR = 0;
    public static void main(String[] args) {
        int[] arr = {0, 5, 5, 0, 8, 8, 0, 3, 2, 3,0};
        
        int inicio = 0; // para que entre una vez al while 
        int fin = -1;//tengo que poner -1 ya que en buscar inicio busca desde fin+1

        int cont = 0;
        int suma = 0;

        // mientras haya secuencias = mientras haya un inicio valido
        while (inicio < MAX) {
            // buscar inicio 
            inicio = buscarInicio(arr, fin + 1);
            // si el inicio existe
            if (inicio < MAX) {
                // buscar fin de la secuencia
                fin = buscarFin(arr, inicio);
                // sumar los elementros mostrar los resultados
                cont++;
                suma = sumaDeSecuencias(arr, inicio, fin);
                System.out.println("la suma de los elementos de la secuencia " + cont + " es " + suma);
            }
        }
    }
    // retorna la pos de inicio de la proxima secuencia, buscando a partir del pos
    public static int buscarInicio(int[]arr, int pos){
        // buscar un elemento distintos del SEPARADOR
        // mientras la pos sea menor a MAX y donde estoy parado sea un separador
        while (pos < MAX && arr[pos] == SEPARADOR) {
            pos++;
        }
        // Dos alternativas:
        // - Encuentro efectivamente un inicio valido : arreglo[pos] != SEPARADOR -> return pos
        // - me quedo sin arreglo, no hay inicio valido : pos == MAX -> return MAX; == return pos
        return pos;
    }

    public static int buscarFin(int[]arr, int pos){
        // mientras tenga elemento en el arreglo y donde estoy parado no sea igual a separador -> avanzo
        while (pos < MAX && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos-1;
    }
    // procesa una secuencia, retorna la suma de sus elementos
    public static int sumaDeSecuencias(int[]arr, int inicio, int fin){
        int suma = 0;
        for (int i = inicio; i <= fin; i++) {
            suma += arr[i];
        }
        return suma;
    }
    
}
