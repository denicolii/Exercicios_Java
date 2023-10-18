import java.util.Scanner;

public class App {

    private static double calcularMedia(int[] numeros) {
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        return (double) soma / numeros.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanhoArray = scanner.nextInt();

        int[] numeros = new int[tamanhoArray];

        System.out.println("Digite os elementos do array:");

        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        double media = calcularMedia(numeros);
        System.out.println("A média aritmética é: " + media);

        scanner.close();
    }
}

