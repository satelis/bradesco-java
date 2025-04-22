import java.util.Scanner;

public class ContaBancaria {
    private double saldo;
    private final double chequeEspecial;
    private double chequeUsado;

    //construtor padrão
    public ContaBancaria(double saldo) {
        this.saldo = saldo;

        if (saldo <= 500) {
            chequeEspecial = 50;
        }
        else {
            chequeEspecial = saldo / 2;
        }
    }

    //métodos consulta
    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);;
    }

    public void consultarLimiteChequeEspecial() {
        System.out.println("Limite atual do Cheque Especial: " + (chequeEspecial - chequeUsado));
    }

    public boolean verificarContaUsaChequeE() {
        return chequeUsado > 0;
    }

    //métodos recebimento
    public void depositarDinheiro(double valor) {
        saldo = saldo + valor;
        System.out.println("Depósito realizado! Saldo atual: " + saldo);
    }

    //métodos pagamento
    public void sacarDinheiro(double valorSacado) {
        if (saldo < valorSacado) {
            System.out.println("Saldo insuficiente!");
        }
        else {
            saldo = saldo - valorSacado;
            System.out.println("Saque realizado! Saldo atual: " + saldo);
        }
    }

    public void escolhaPagamento(Boleto boleto, Scanner scanner) {

        System.out.println("Deseja pagar o boleto usando:");
        System.out.println("1- Saldo da conta. \n2- Cheque especial. \n3- Voltar.");
        int e = scanner.nextInt();

        switch (e) {
            case 1:
                pagarBoletoSaldo(boleto);
                break;
            case 2:
                pagarBoletoCheque(boleto);
                break;
            case 3:
                break;
            default:
                System.out.println("Escolha inválida!");
                break;
        }
    }

    public void pagarBoletoSaldo(Boleto boleto) {
        if (!boleto.getPago()) {
            if (saldo < boleto.getValor()) {
                System.out.println("Saldo insuficiente!");
            }
            else {
                saldo = saldo - boleto.getValor();
                boleto.boletoPagar();
                System.out.println("Boleto pago!");
            }
        } else
            System.out.println("Esse boleto já foi pago!");
    }

    public void pagarBoletoCheque(Boleto boleto) {
        if (!boleto.getPago()) {
            if (chequeEspecial - chequeUsado < boleto.getValor()) {
                System.out.println("Limite insuficiente!");
            }
            else {
                chequeUsado = chequeUsado + boleto.getValor();
                boleto.boletoPagar();
                System.out.println("Boleto pago!");
            }
        } else
            System.out.println("Esse boleto já foi pago!");
    }

    public Fatura gerarFatura() {
        if (verificarContaUsaChequeE()) {
            var fatura = new Fatura(chequeUsado);
            return fatura;
        }
        else {
            System.out.println("O cliente não utilizou o limite, portanto não tem uma fatura em aberto!");
            return null;
        }
    }

    public void pagarFatura(Fatura boleto) {
        //verificando se há uma fatura em aberto
        if (boleto != null) {
            if (!boleto.getPago()) {
                if (saldo < boleto.getValor()) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo = saldo - boleto.getValor();
                    boleto.boletoPagar();
                    chequeUsado = 0;
                    System.out.println("Fatura paga!");
                    consultarLimiteChequeEspecial();
                }
            } else
                System.out.println("A fatura já foi paga!");
        }
    }
}
