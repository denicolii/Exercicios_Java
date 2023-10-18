import java.util.Scanner;

public class App {

    private static int contarDigitos(int numero) {
        return String.valueOf(numero).length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int numeroDeDigitos = contarDigitos(numero);
        System.out.println("O número de dígitos de " + numero + " é: " + numeroDeDigitos);

        scanner.close();
    }
}

