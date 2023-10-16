import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um numero");
        int num = scanner.nextInt();

        if (num %2 == 0) {
            System.out.println("Esse numero è par");
        } else {
            System.out.println("Numero impar");
        }
    }
}
