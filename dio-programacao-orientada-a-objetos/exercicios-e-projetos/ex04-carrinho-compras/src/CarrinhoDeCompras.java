import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    public List<Item> Carrinho;

    public CarrinhoDeCompras() {
        this.Carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> ItemsParaRemocao = new ArrayList<>();
        for (Item it : Carrinho) {
            if (it.getNome().equalsIgnoreCase(nome)) {
                ItemsParaRemocao.add(it);
            }
        }
        Carrinho.removeAll(ItemsParaRemocao);
    }

    public double calcularValorTotal() {
        double soma = 0.0;

        for (Item item : Carrinho) {
            soma += item.getPreco() * item.getQuantidade();
        }
        return soma;
    }

    public void exibirItens() {
        System.out.println(Carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Carne", 25.00, 2);
        carrinhoDeCompras.adicionarItem("Frango", 19.99, 1);
        carrinhoDeCompras.adicionarItem("Suco", 10.00, 2);

        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("Frango");

        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());
    }
}
