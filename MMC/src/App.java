import java.util.Scanner;

public class App {

    private static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int calcularMMC(int a, int b) {
        return (a * b) / calcularMDC(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int mmc = calcularMMC(numero1, numero2);
        System.out.println("O Mínimo Múltiplo Comum (MMC) de " + numero1 + " e " + numero2 + " é: " + mmc);
    }
}

