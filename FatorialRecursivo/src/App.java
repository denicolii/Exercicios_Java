public class App {
    public static void main(String[] args) {
        int numero = 5; 
        long resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }

    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // O fatorial de 0 e 1 é 1.
        } else {
            return n * calcularFatorial(n - 1); // 
        }
    }
}

