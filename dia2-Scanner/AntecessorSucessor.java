import java.util.Scanner;
public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("informe um número: ");
        int n1 = sc.nextInt();

        int n2 = n1 - 1;
        int n3 = n1 + 1;

        System.out.print("o número antecessor ao escolhido é "
         + n2 + " e o sucessor é " + n3 );

         sc.close();

    }
}
