import java.util.Scanner;
public class SomaAteN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite um número:");
        int n = sc.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        System.out.println("soma = " + soma );
        sc.close();
    }
}
