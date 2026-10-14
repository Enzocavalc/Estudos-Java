import java.util.Scanner;

public class MaiorQueOsTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite um número: ");
        int a =sc.nextInt();

        System.out.print("agora o segundo: ");
        int b = sc.nextInt();

        System.out.print("e por ultimo o terceiro: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.print("o maior número entre os três é: " + a);
        } else if (b >= a && b >= c) {
            System.out.print("o maior número entre os três é: " + b);
        } else {
            System.out.print("o maior número entre os três é o: " + c);
        }


        sc.close();
    }

    
}
