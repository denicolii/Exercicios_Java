import java.util.Scanner;

public class App {


    private static void calcularFibonacci(int n) {
        int primeiroTermo = 0, segundoTermo = 1;

        System.out.println("Sequência de Fibonacci até " + n + ":");
        System.out.print(primeiroTermo + ", " + segundoTermo + ", ");

        for (int i = 2; i <= n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(proximoTermo + ", ");

            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número até o qual deseja calcular a sequência de Fibonacci: ");
        int numeroEscolhido = scanner.nextInt();

        calcularFibonacci(numeroEscolhido);

        scanner.close();
    }
}

