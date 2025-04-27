public class Act16 {
    public static void main(String[] args) {
        int numero = 0;
        System.out.println("ingrese un numero");
        numero = Utils.leerInt();
        mes(numero);
    }

    public static void mes(int numero) {
        if (numero <= 12 && numero >= 1) {
            if (numero == 2) {
                System.out.println("Tiene 28 dias");
            } else if (numero == 4 || numero == 6 || numero == 9 || numero == 11) {
                System.out.println("30 dias");
            } else {
                System.out.println("31 dias");
            }
        }

    }
}
