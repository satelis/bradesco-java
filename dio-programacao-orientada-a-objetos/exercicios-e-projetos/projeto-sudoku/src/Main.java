import model.Board;
import model.Space;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
import static util.BoardTemplate.TABULEIRO_TEMPLATE;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private static Board board;

    private final static int BOARD_LIMIT = 9;

    public static void main(String[] args) {
        final var positions = Stream.of(args)
                .collect(Collectors.toMap(
                        k -> k.split(";")[0],
                        v -> v.split(";")[1]
                ));
        int option = -1;

        while (true) {
            System.out.println("Selecione uma das opções a seguir:");
            System.out.println("1 - Iniciar um novo Jogo");
            System.out.println("2 - Colocar um novo número");
            System.out.println("3 - Remover um número");
            System.out.println("4 - Visualizar jogo atual");
            System.out.println("5 - Verificar status do jogo");
            System.out.println("6 - Limpar e resetar jogo");
            System.out.println("7 - Finalizar jogo");
            System.out.println("8 - Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    startGame(positions);
                    break;
                case 2:
                    inputNumber();
                    break;
                case 3:
                    removeNumber();
                    break;
                case 4:
                    showCurrentGame();
                    break;
                case 5:
                    showGameStatus();
                    break;
                case 6:
                    clearGame();
                    break;
                case 7:
                    finishGame();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, selecione uma das opções do menu.");
                    break;
            }
        }
    }

    private static void startGame(Map<String, String> positions) {
        if (nonNull(board)) {
            System.out.println("O jogo já foi iniciado!");
            return;
        }
        List<List<Space>> spaces = new ArrayList<>();
        for (int i = 0; i < BOARD_LIMIT; i++) {
            spaces.add(new ArrayList<>());
            for(int j = 0; j < BOARD_LIMIT; j++) {
                var positionConfig = positions.get("%s,%s".formatted(i, j));
                var expected = Integer.parseInt(positionConfig.split(",")[0]);
                var fixed = Boolean.parseBoolean(positionConfig.split(",")[1]);
                var currentSpace = new Space(expected, fixed);
                spaces.get(i).add(currentSpace);
            }
        }

        board = new Board(spaces);
        System.out.println("O jogo está pronto para começar!");
    }

    private static void inputNumber() {
        if (isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado!");
            return;
        }
        System.out.println("Informe a coluna que deseja inserir o número: ");
        var col = runUntilGetValidNumber(0, 8);
        System.out.println("Informe a linha que deseja inserir o número: ");
        var row = runUntilGetValidNumber(0, 8);
        System.out.println("Informe o número a ser inserido na posição [" + col + "," + row + "]:");
        var value = runUntilGetValidNumber(1,9);

        if (!board.changeValue(col, row, value)) {
            System.out.println("A posição selecionada tem um valor fixo!");
        }
    }

    private static void removeNumber() {
        if (isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado!");
            return;
        }
        System.out.println("Informe a coluna que deseja inserir o número: ");
        var col = runUntilGetValidNumber(0, 8);
        System.out.println("Informe a linha que deseja inserir o número: ");
        var row = runUntilGetValidNumber(0, 8);

        if(!board.erase(col, row)) {
            System.out.println("A posição selecionada tem um valor fixo!");
        }

    }

    private static void showCurrentGame() {
        if (isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado!");
            return;
        }
        var args = new Object[81];
        var argPos = 0;

        for (int i = 0; i < BOARD_LIMIT; i++) {
            for (var col: board.getSpaces()) {
                args[argPos ++] = " " + (isNull(col.get(i).getActual()) ? " " : col.get(i).getActual());
            }
        }
        System.out.println("Seu jogo atualmente está: ");
        System.out.printf((TABULEIRO_TEMPLATE) + "\n", args);
    }

    private static void showGameStatus() {
        if (isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado!");
            return;
        }
        System.out.println("O jogo atualmente está: " + board.getstatus().getLabel());
        if(board.hasErrors()) {
            System.out.println("O jogo contém erros!");
        } else
            System.out.println("O jogo não contém erros.");
    }

    private static void clearGame() {
        if (isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado!");
            return;
        }

        System.out.println("Tem certeza que deseja limpar todo seu jogo e perder seu progresso?");
        String confirm = scanner.next();
        while (!confirm.equalsIgnoreCase("sim") || !confirm.equalsIgnoreCase("não")) {
            System.out.println("Escolha inválida! Digite 'sim' ou 'não'");
            confirm = scanner.next();
        }

        if (confirm.equalsIgnoreCase("sim")) {
            board.reset();
        }
    }

    private static void finishGame() {
        if (isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado!");
            return;
        }

        if (board.gameIsFinished()) {
            System.out.println("Parabens! Você concluiu o jogo.");
            showCurrentGame();
            board = null;
        }
        else if (board.hasErrors()) {
            System.out.println("Seu jogo possuí erros, verifique seu tabuleiro novamente.");
        }
        else {
            System.out.println("Você ainda precisa preencher algum espaço.");
        }
    }

    private static int runUntilGetValidNumber(final int min, final int max) {
        var current = scanner.nextInt();
        while (current < min || current > max) {
            System.out.printf("Informe um número entre %s e %s\n.", min, max);
            current = scanner.nextInt();
        }
        return current;
    }

}
