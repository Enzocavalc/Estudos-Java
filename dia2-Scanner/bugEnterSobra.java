import  java.util.Scanner;
public class bugEnterSobra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("informe seu nome: ");
        String nome = sc.nextLine();

        System.out.print("digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        
        System.out.print("em que cidade você mora: ");
        String city = sc.nextLine();

        System.out.print("Seu nome é " + nome + " você tem " + idade + " de idade "
         + "e mora em " + city + "." );

        sc.close();
    }
    
}
