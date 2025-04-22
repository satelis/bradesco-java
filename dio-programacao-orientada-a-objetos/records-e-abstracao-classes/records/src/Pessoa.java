public record Pessoa(String nome, int idade) {

    public Pessoa {
        System.out.println("----*----");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println("----*----");
    }

    public Pessoa (String nome) {
        this(nome, 1);
    }
}
