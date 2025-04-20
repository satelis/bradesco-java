package lanchonete.atendimento;

public class Atendente {
    public void servindoMesa() {
        pegarLancheCozinha();
        System.out.println("SERVINDO MESA");
    }
    private void pegarLancheCozinha() {
        System.out.println("PEGANDO O LANCHE NA COZINHA");
    }
    public void receberPagamento() {
        System.out.println("RECEBENDO O PAGAMENTO");
    }
    private void pegarPedidoBalcao() {
        System.out.println("PEGANDO O PEDIDO NO BALCAO");
    }
}
