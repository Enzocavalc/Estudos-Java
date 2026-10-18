import java.util.Scanner;

public class CalculadoraComMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Somar");
        System.out.println("2 - subtrair");
        System.out.println("3 - multiplicar");
        System.out.println("4 - dividir");

        System.out.print("Escolha uma opção: ");
        int n = sc.nextInt();

        System.out.print("digite o primeiro número: ");
        double a = sc.nextDouble();

        System.out.print("digite o segundo número: ");
        double b = sc.nextDouble();

    switch (n) {
        case 1:
            System.out.println(a + b);
            break;
        case 2:
            System.out.println(a - b);
            break;
        case 3:
            System.out.println(a * b);
            break;
        case 4:
            if (b == 0) {
                System.out.println("Erro...divisão inválida");
            } else {
                System.out.println(a / b);
            }
            break;

            default:
                System.out.println("opção inválida"); 
        }

        sc.close();
    }
    
}