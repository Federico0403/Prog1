public class Act2 {
    public static void main(String[] args) {
        /*
         * Escribir un diseño de programa que mientras que el usuario
         * ingrese un carácter dígito o carácter letra minúscula, imprima
         * dicho carácter, y si es carácter letra minúscula, imprima si es vocal
         * o consonante.
         */
        resolucion();
    }

    public static void resolucion (){
        System.out.println("Ingrese un caracter");
        char caracter = Utils.leerChar();

        while ((caracter >= 'a' && caracter <= 'z') || (caracter >= '1' && caracter <= '9')) {
            if (caracter == 'a' ||caracter == 'e' ||caracter == 'i' ||caracter == 'o' ||caracter == 'u') {
                System.err.println("Vocal");
            } else if (caracter >= 'a' && caracter <= 'z'){
                System.out.println("Consonante");
            }
            if (caracter >= '1' && caracter <= '9') {
                System.out.println("Digito");
            }
            System.out.println("ingrese un caracter mayuscula para terminar");
            caracter = Utils.leerChar();
        }
    }
}
