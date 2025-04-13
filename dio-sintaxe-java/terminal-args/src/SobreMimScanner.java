import java.util.Scanner;
import java.util.Locale;

public class SobreMimScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Pede e recebe os dados do usuário
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        //Imprime os dados para o usuário
        System.out.println("---FICHA PESSOAL---");
        System.out.println("Olá! Me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("E tenho " + altura + " cm de altura.");
    }
}
