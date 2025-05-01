import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato c : contatoSet) {
           if (c.getNome().startsWith(nome)) {
               contatosPorNome.add(c);
           }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero) {
        Contato contatoAtualizado = null;

        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Julia", 123456);
        agendaContatos.adicionarContato("Julia", 0);
        agendaContatos.adicionarContato("Julia Barbosa", 111111111);
        agendaContatos.adicionarContato("Julia Lenhare", 654987);
        agendaContatos.adicionarContato("Camila Cavalcante", 111111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Julia"));

        System.out.println("Contato atualizado " + agendaContatos.atualizarNumeroContato("Camila Cavalcante", 555555));
    }

}
