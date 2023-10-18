import java.util.Scanner;

public class App {

    private static boolean ehPalindromo(String palavra) {
        palavra = palavra.replaceAll("\\s", "").toLowerCase();

        int comprimento = palavra.length();

        for (int i = 0; i < comprimento / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(comprimento - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra para verificar se é um palíndromo: ");
        String palavra = scanner.nextLine();

        if (ehPalindromo(palavra)) {
            System.out.println("'" + palavra + "' é um palíndromo!");
        } else {
            System.out.println("'" + palavra + "' não é um palíndromo.");
        }
        scanner.close();
    }
}

