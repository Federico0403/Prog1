public class Act11 {
    public static void main(String[] args) {
        mayorDeDos();
    }

    public static void mayorDeDos(){
        System.out.println("Ahora debera ingresar 20 numeros y se mostrara el mas grande ingresado");
        int numero = 0;
        int mayor = 0;
        for (int i = 0; i < 20; i++) {
            System.err.println("Ingrese el numero " + i );
            numero= Utils.leerInt();
            if (numero > mayor) {
                mayor = numero;
            }
        }
        System.out.println("El numero mas grande fue " + mayor);
    }
}
