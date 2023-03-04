import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i, count;
        boolean found = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int num = scanner.nextInt();
        scanner.close();

        if (num == 0) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
            return;
        }

        count = 2; // começa com 2 porque já temos os dois primeiros números (0 e 1)
        while (count <= num) {
            n3 = n1 + n2;
            if (n3 == num) {
                found = true;
                break;
            }
            n1 = n2;
            n2 = n3;
            count++;
        }

        if (found) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }
}