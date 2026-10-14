import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite um número para saber se ele é positivo ou negativo: ");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.print("seu número é positivo ");
        } else if (a < 0) {
            System.out.print("seu número é negativo ");
        } else {
            System.out.print("seu número é igual a zero.");
        }

        sc.close();
    }
    
}
