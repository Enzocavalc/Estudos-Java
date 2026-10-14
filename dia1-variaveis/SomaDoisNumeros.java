import java.util.Scanner;
public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("para somar dois valores digite o primeiro: ");
        int v1 = sc.nextInt();

        System.out.print("agora informe o segundo valor: ");
        int v2 = sc.nextInt();

        int soma = v1 + v2;

        System.out.print("a soma dos dois valores é de " + soma);

        sc.close();

    }
    
}
