public class Act9 {
    public static void main(String[] args) {
        /*
         * Escribir un programa que mientras el usuario ingrese un número
         * entero entre 1 y 10, pida ingresar un carácter, y por cada carácter
         * ingresado imprima:
         * a. “letra minúscula” si el carácter es una letra del abecedario en
         * minúscula;
         * b. “letra mayúscula” si el carácter es una letra del abecedario
         * en mayúscula;
         * c. “dígito” si el carácter corresponde a un número;
         * d. “otro” para los restantes casos de caracteres.
         */
        opciones();
    }
    public static void opciones(){
        int numero = 0;
        System.out.println("Ingrese un numero entre 1 y 10");
        numero = Utils.leerInt();

        while (numeroValido(numero)) {
            char caracter = ' ';
            System.out.println("Ingrese un caracter");
            caracter = Utils.leerChar();
            if (caracter >= 'a' && caracter <= 'z') {
                System.out.println("letra minuscula");
            } else if (caracter >= 'A' && caracter <= 'Z') {
                System.out.println("Mayusula");
            } else if (caracter >= '1' && caracter <= '9'){
                System.out.println("Digito");
            } else {
                System.out.println("otro");
            }
            System.out.println("Ingrese 0 para terminar");
            numero = Utils.leerInt();
        }

    }
    public static boolean numeroValido(int numero){
        boolean valorDeVerdad = false;
        if (numero >= 1 && numero <= 10) {
            valorDeVerdad = true;
        }
        return valorDeVerdad;
    }
}
