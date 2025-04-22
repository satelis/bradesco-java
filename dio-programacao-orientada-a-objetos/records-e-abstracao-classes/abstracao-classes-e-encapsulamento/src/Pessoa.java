import java.time.OffsetDateTime;

public class Pessoa {
    private final String nome;
    private int idade;

    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = 1;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    private int ultimoAnoIdade = OffsetDateTime.now().getYear();

    public void aumentoIdade() {
        if (this.ultimoAnoIdade >= OffsetDateTime.now().getYear()) {
            return;
        } else {
            this.idade += 1;
            this.ultimoAnoIdade = OffsetDateTime.now().getYear();
        }
    }
}
