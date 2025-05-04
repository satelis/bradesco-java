package sistema.usuario;

import sistema.banco.*;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente clienteHenrique = new Cliente("Henrique");
        Cliente clienteJulia = new Cliente("Julia");

        System.out.println(banco.getContas());

        Conta cc = new ContaCorrente(clienteHenrique);
        Conta cc1 = new ContaCorrente(clienteJulia);
        Conta poupanca = new ContaPoupanca(clienteHenrique);

        System.out.println(banco.getContas());

        cc.extrato();
        cc1.extrato();
        poupanca.extrato();

        cc.depositar(100);
        cc.extrato();
        cc.transferir(50, poupanca);
        cc.extrato();
        poupanca.extrato();
    }
}
