import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Olá, " + nome + "! Você tem "
         + idade + " anos.");

        sc.close();
    }
}
