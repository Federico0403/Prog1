public class Act7 {
    public static void main(String[] args) {
        /*
         * Escribir un programa que mientras el usuario cargue desde
         * teclado un número entero distinto de 0, imprima por pantalla la
         * suma que se obtiene de invocar un método que calcula la
         * sumatoria de los primeros 200 números naturales (son números
         * enteros entre 1 y 200).
         */
        condicion();
    }

    public static void condicion(){
        int numero = 0;
        System.out.println("Ingrese un numero");
        numero = Utils.leerInt();

        while (numero != 0) {
            sumatoria();
            System.out.println("Ingrese 0 para terminar");
            numero = Utils.leerInt();
        }
    }

    public static void sumatoria(){
        int sumatoria = 0;
        final int MAX = 200;
        for (int i = 0; i <= MAX; i++) {
            sumatoria += i;
        }
        System.out.println(sumatoria);
    }
}
