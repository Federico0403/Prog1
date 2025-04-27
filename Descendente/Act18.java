public class Act18 {
    public static void main(String[] args) {
        funcion();
    }
    public static void funcion() {
        for (int numero = 2; numero <= 10000; numero++) {
            int sumaDivisores = 0;
            
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    sumaDivisores += i;
                }
            }
            
            if (sumaDivisores == numero) {
                System.out.println(numero + " es un número perfecto.");
            }
        }
    }
}
