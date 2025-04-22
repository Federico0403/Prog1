public class Act8 {
    public static void main(String[] args) {
        /*
         * Realizar un programa que dado dos números enteros y un
         * carácter (todos ingresados por el usuario) muestre por pantalla el
         * resultado de una operación matemática básica según el valor del
         * carácter ingresado. Si se ingresó el carácter ‘a’ debe realizar la
         * suma, para ‘b’ la resta, para ‘c’ la multiplicación y para ‘d’ la
         * división entre ambos números.
         */
        char caracter = ' ';
        int numero1 = 0;
        int numero2 = 0;
        System.out.println("Ingrese un caracter a b c o d");
        caracter = Utils.leerChar();
        System.out.println(" y ingrese dos numeros \n numero 1 ");
        numero1 = Utils.leerInt();
        System.err.println("Numero 2");
        numero2 = Utils.leerInt();

        if (caracter >= 'a' && caracter <= 'z') {
            programa(caracter, numero1, numero2);
        }
        
    }
    public static void programa(char caracter, int numero1, int numero2){
        switch (caracter) {
            case 'a':
                System.out.println("Suma " + (numero1 + numero2));
                break;
            case 'b':
                System.out.println("Resta " + (numero1-numero2));
                break;
            case 'c':
                System.out.println("Multiplicacion " + (numero1*numero2));
                break;
            case 'd':
                System.out.println("Division " + (numero1/numero2));
                break;
            default:
                System.out.println("Numero invalido");
                break;
        }
    }
}
