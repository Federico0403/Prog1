public class Act15 {
    public static void main(String[] args) {
        int numero = 0;
        System.out.println("ingrese un numero");
        numero = Utils.leerInt();

        sumatoria(numero);

    }
    public static void sumatoria(int numero){
        int sumatoria = 0;
        for (int i = 1; i <= numero; i++) {
            sumatoria += i;
        }
        System.out.println(sumatoria);
    }
}
