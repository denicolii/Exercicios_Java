import java.util.Scanner;

public class App {

    private static String inverterString(String original) {
        StringBuilder reversa = new StringBuilder();
        for (int i = original.length() - 1; i >= 0; i--) {
            reversa.append(original.charAt(i));
        }
        return reversa.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para inverter: ");
        String originalString = scanner.nextLine();

        String stringInvertida = inverterString(originalString);
        System.out.println("String invertida: " + stringInvertida);

        scanner.close();
    }
}
