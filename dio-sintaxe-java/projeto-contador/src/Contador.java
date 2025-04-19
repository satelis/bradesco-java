import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            int primeiroNum = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int segundoNum = scanner.nextInt();

            for (int i = 1; i <= contar(primeiroNum, segundoNum); i++) {
                System.out.println(i);
            }
        } catch (InputMismatchException e) {
            System.err.println("Os parametros digitados devem ser NÚMEROS INTEIROS.");
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        }
    }

    static int contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois > parametroUm) {
            return parametroDois - parametroUm;
        } else {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser MAIOR que o primeiro parâmetro.");
        }
    }
}
