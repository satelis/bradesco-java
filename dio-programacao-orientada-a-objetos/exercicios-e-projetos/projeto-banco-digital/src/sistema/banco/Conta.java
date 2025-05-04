package sistema.banco;

public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 1;

    private final Cliente cliente;
    protected final int agencia;
    protected int numero;
    protected double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        Banco.contasList.add(this);
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Valor sacado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Valor depositado com sucesso! Saldo atual: R$ " + saldo);
    }

    public void transferir(double valor, Conta contaDestino) {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso! Saldo atual: R$ " + saldo);
        }
    }

    public void extrato() {
        System.out.printf("==== Extrato %s ====\n", getClass().getSimpleName());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Agência " + agencia);
        System.out.println("Numero " + numero);
        System.out.println("Saldo R$" + saldo);
        System.out.println(" - * - ");
    }

    @Override
    public String toString() {
        return "Conta {" +
                "cliente=" + cliente.getNome() +
                '}';
    }
}
