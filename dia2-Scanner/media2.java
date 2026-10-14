import java.util.Scanner;
public class media2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("dê o primeiro valor para sua média: ");
    double v1 = sc.nextDouble();

    System.out.print("agora o segundo valor: ");
    double v2 = sc.nextDouble();

    System.out.print("agora o terceiro: " );
    double v3 = sc.nextDouble();

    double vt = (v1 + v2 + v3)/ 3;
    System.out.print("sua média é de: " + vt );

    sc.close();
    }
}
