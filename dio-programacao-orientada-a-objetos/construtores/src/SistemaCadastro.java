public class SistemaCadastro {
    public static void main(String[] args) {

        Pessoa marcos = new Pessoa("044044044-57", "marcos");

        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
