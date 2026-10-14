import java.util.Scanner;

public class DadosDoUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("qual é o seu nome?: ");
        String nome = sc.nextLine();

        System.out.print("qual a sua idade?: ");
        int idade = sc.nextInt();

        System.out.print("qual universidade você estuda?: ");
        String universidade = sc.nextLine();

        System.out.println("seu nome é " + nome + " você tem " + idade + " de idade " + 
        " e estuda na universidade " + universidade + ".");

        sc.close();
    }
}
