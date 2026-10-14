import java.util.Scanner;

public class DolarParaReal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("informe o valor em reais que quer converter para dólares: ");
        double reais = sc.nextDouble();

        double dolar = 5.03;
        double valort = reais/ dolar;

        System.out.print("o valor em dólares é de " + valort);
        sc.close();
    }
}
