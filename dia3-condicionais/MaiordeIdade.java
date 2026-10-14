import java.util.Scanner;

public class MaiordeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("qual a sua idade? ");
        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("você é maior de idade ");
        } else {
            System.err.println("você não é maior de idade ");
        }

        sc.close();
    }
    
}
