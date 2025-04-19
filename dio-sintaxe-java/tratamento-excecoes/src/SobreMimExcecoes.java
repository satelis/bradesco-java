import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class SobreMimExcecoes {
    public static void main(String[] args) {
        try {
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
            scanner.close();
        }
        catch (InputMismatchException e) {
            System.err.println("Os campos de IDADE e ALTURA precisam receber dados númericos!");
            System.out.println("OBS: No campo de altura, utilize o ponto final ao invés da vírgula.");
        }
    }
}


