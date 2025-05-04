package sistema.banco;

public interface IConta {
    boolean sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void extrato();
}
