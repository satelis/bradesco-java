import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private final List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int num) {
        numerosList.add(num);
    }

    public int calcularSoma() {
        int soma = 0;
        if (!numerosList.isEmpty()) {
            for (int i : numerosList) {
                soma += i;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNum = Integer.MIN_VALUE;
        if (!numerosList.isEmpty()) {
            for (int i : numerosList) {
                if (i > maiorNum) {
                    maiorNum = i;
                }
            }
        }
        return maiorNum;
    }

    public int encontrarMenorNumero() {
        int menorNum = Integer.MAX_VALUE;
        if (!numerosList.isEmpty()) {
            for (int i : numerosList) {
                if (i < menorNum) {
                    menorNum = i;
                }
            }
        }
        return menorNum;
    }

    public void exibirNumeros() {
        System.out.println(numerosList);
    }


    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(1);

        somaNumeros.exibirNumeros();
        System.out.println("Soma total de todos os números: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
    }
}
