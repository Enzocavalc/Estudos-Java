import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Me informe a nota do seu primeiro bimestre: ");
        double n1 = sc.nextDouble();

        System.out.print(" Agora a nota do segundo bimestre: ");
        double n2 = sc.nextDouble();

        System.out.print(" A do terceiro tambem: ");
        double n3 = sc.nextDouble();

        System.out.print(" E a do quarto: ");
        double n4 = sc.nextDouble();

        double nm = (n1 + n2 + n3 + n4)/ 4;

        if ( nm >= 6) {
        System.out.print(" você foi aprovado! " );
        } else if ( nm >= 4) {
            System.out.print(" você esta de recuperação!" );
        } else {
            System.out.print(" você esta reprovado D: " );
        }

        sc.close();
    }
}
