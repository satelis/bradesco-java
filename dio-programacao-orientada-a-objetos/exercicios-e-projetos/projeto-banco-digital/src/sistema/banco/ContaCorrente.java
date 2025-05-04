package sistema.banco;

public class ContaCorrente extends Conta {

    private static int sequencial = 1;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        numero = sequencial++;
    }
}
