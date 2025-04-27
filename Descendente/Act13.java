public class Act13 {
    public static void main(String[] args) {
        System.out.println("Ingrese 3 numeros");
        double r1 = Utils.leerDouble();
        System.out.println("dos mas");
        double r2 = Utils.leerDouble();
        System.out.println("ultimo");
        double r3 = Utils.leerDouble();

        System.out.println("Ingrese 1 2 o 3");
        int numero = Utils.leerInt();

        if (numero > 0 && numero < 4) {
            operaciones(numero, r1, r2, r3);
        } else {
            System.out.println("Error");
        }

    }
    public static void operaciones(int numero, double r1, double r2, double r3){
        double resultado = 0;
        switch (numero) {
            case 1:
                resultado = Math.sqrt(r1 - r3);
                System.out.println(resultado +" case 1");
                break;
            case 2:
                resultado = ((r1 + r2 + r3) / 3);
                System.out.println(resultado +" case 2");
                break;
            case 3:
                resultado = Math.sqrt(r3 - r2) / r1;
                System.out.println(resultado +" case 3");
                break;
            case 4:
                resultado = ((r1 + r2 + r3) / 3) / Math.sqrt(r2);
                System.out.println(resultado +" case 4");
                break;
                
            default:
            System.out.println("Error");
                break;
        }
    }
}
