public class Act17 {
    public static void main(String[] args) {
        char caracter = ' ';
        System.out.println("ingrese un caracter");
        caracter = Utils.leerChar();
        metodo(caracter);
    }
    public static void metodo(char caracter){
        int numero = 0;
        while (caracter >= 'a' && caracter <= 'z') {
            System.out.println("Ingrese un numero entre 1 y 5");
            numero = Utils.leerInt();
            if (numero >= 1 && numero <= 5) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero * i);
                }
            }
            System.out.println("Ingrese otro caracter");
            caracter = Utils.leerChar();
        }
    }
}
