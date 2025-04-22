public class Act5 {
    public static void main(String[] args) {
        /*
         * Hacer un método que dado un número entero con valor inicial 1,
         * haga una iteración incrementando el número de a uno hasta un
         * valor MAX = 4 (constante). Mientras itera deberá imprimir el
         * número. Luego invocarlo desde el programa principal y cuando
         * termina, imprimir por pantalla “terminó”.
         */
        int numero = incremento();
        System.out.println("Termino " + numero);
    }

    public static int incremento(){
        final int MAX = 4;
        int i;
        for (i = 0; i <= MAX; i++) {
            System.out.println("Numero = " + i + " Hasta " + MAX);
        }
        return i-1;
    }
}
