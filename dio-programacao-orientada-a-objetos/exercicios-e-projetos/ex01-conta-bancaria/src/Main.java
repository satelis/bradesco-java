import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Bem vindo! Obrigado por criar uma conta em nosso banco.");
        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "! Por favor, digite seu saldo inicial: ");
        double saldoIni = scanner.nextDouble();

        var nubank = new ContaBancaria(saldoIni);


        System.out.println("Conta criada com sucesso!");

        boolean ligado = true;

        var netflix = new Boleto(100);

        do {
            System.out.println("\n-- CONSULTAS --");
            System.out.println("1- Consultar saldo. \n2- Consultar o limite do seu Cheque Especial.\n3- Consultar número de boletos a pagar.");
            System.out.println("-- PAGAMENTOS --");
            System.out.println("4- Fazer um depósito. \n5- Sacar dinheiro. \n6- Pagar boleto. \n7- Gerar e pagar fatura do Cheque Especial.");
            System.out.println("-- CONTROLE --");
            System.out.println("8- Sair");

            System.out.println("\nDigite o que quer fazer:");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    nubank.consultarSaldo();
                    break;
                case 2:
                    nubank.consultarLimiteChequeEspecial();
                    break;
                case 3:
                    System.out.println("Você possui "+ Boleto.numBoletos + " boleto(s) a pagar.");
                    break;
                case 4:
                    System.out.println("Digite quanto deseja depositar: ");
                    nubank.depositarDinheiro(scanner.nextDouble());
                    break;
                case 5:
                    System.out.println("Digite quanto deseja sacar: ");
                    nubank.sacarDinheiro(scanner.nextDouble());
                    break;
                case 6:
                    nubank.escolhaPagamento(netflix, scanner);
                    break;
                case 7:
                    nubank.pagarFatura(nubank.gerarFatura());
                    break;
                case 8:
                    System.out.println("Volte logo!");
                    ligado = false;
                    break;
                default:
                    System.out.println("Escolha inválida!");
                    break;
            }
        } while(ligado);
    }
}
