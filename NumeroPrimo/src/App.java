import java.util.Scanner;

public class App {

    private static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void gerarNumerosPrimos(int n) {
        int contador = 0;
        int numeroAtual = 2;

        System.out.println("Os primeiros " + n + " números primos são:");

        while (contador < n) {
            if (ehPrimo(numeroAtual)) {
                System.out.print(numeroAtual + " ");
                contador++;
            }
            numeroAtual++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números primos desejada: ");
        int quantidadePrimos = scanner.nextInt();


        gerarNumerosPrimos(quantidadePrimos);

        scanner.close();
    }
}

