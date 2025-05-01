import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProduto() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(String nome, long codigo, int quantidade, double preco) {
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEst = 0d;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEst += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEst;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;

        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;

        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQntXValor() {
        Produto produtoMaiorQuantidadeValor = null;

        double maiorValor = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() * p.getQuantidade() > maiorValor) {
                    maiorValor = p.getPreco() * p.getQuantidade();
                    produtoMaiorQuantidadeValor = p;
                }
            }
        }
        return produtoMaiorQuantidadeValor;
    }

    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();

        estoqueProduto.adicionarProduto("Produto A", 1L, 10, 5.0);
        estoqueProduto.adicionarProduto("Produto B", 2L, 4, 10.0);
        estoqueProduto.adicionarProduto("Produto C", 3L, 2, 20.0);

        estoqueProduto.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estoqueProduto.calcularValorTotalEstoque());
        System.out.println("Produto mais caro " + estoqueProduto.obterProdutoMaisCaro());
        System.out.println("Produto mais barato " + estoqueProduto.obterProdutoMaisBarato());
        System.out.println("Produto com maior valor (Estoque * Preço): " + estoqueProduto.obterProdutoMaiorQntXValor());

    }
}

