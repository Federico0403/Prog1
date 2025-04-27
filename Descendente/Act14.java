public class Act14 {
    public static void main(String[] args) {
        mientras();
    }
    public static void mientras(){
        char caracter = ' ';
        System.out.println("Ingrese un caracter");
        caracter = Utils.leerChar();

        while (caracter != '*') {
            metodo(caracter);
            System.out.println("INGRESE OTRO CARACTER O * PARA TERMINAR");
            caracter = Utils.leerChar();
        }
    }
    public static void metodo(char caracter){
        if (caracter == 'a' ||caracter == 'e' ||caracter == 'i' ||caracter == 'o' ||caracter == 'u') {
            System.out.println("VOCAL");
        } else if (caracter >= 'a' && caracter <= 'z') {
            System.out.println("CONSONANTE");
        } else if (caracter >= '1' && caracter <= '9') {
            System.out.println("DIGITO");
        } else {
            System.out.println("OTRO " + caracter);
        }
    }
}
