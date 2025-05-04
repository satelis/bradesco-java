package sistema.banco;

public class ContaPoupanca extends Conta {

    private static int sequencial = 1;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        numero = sequencial++;
    }
}
