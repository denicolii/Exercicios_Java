import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro numero:");
        int num3 = scanner.nextInt();

        int maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        System.out.println("O maior número é: " + maior);
    }
}

