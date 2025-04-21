public class Main {
    public static void main(String[] args) {
        var masculino = new Pessoa("João");
        masculino.aumentoIdade();
        var feminino = new Pessoa("Maria");
        feminino.aumentoIdade();

        System.out.println("Nome masculino: " + masculino.getNome() + ". Idade: " + masculino.getIdade());
        System.out.println("Nome feminino: " + feminino.getNome() + ". Idade: " + feminino.getIdade());

    }
}
