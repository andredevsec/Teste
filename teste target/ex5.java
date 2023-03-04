import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para inverter: ");
        String stringOriginal = scanner.nextLine();

        String stringInvertida = "";

        for (int i = stringOriginal.length() - 1; i >= 0; i--) {
            stringInvertida += stringOriginal.substring(i, i + 1);
        }

        System.out.println("A string invertida é: " + stringInvertida);
    }

}
