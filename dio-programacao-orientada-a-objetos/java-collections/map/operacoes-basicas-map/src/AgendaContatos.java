import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;

        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Julia", 123456);
        agendaContatos.adicionarContato("Julia", 5665);
        agendaContatos.adicionarContato("Julia Barbosa", 111111111);
        agendaContatos.adicionarContato("Julia Lenhare", 654987);
        agendaContatos.adicionarContato("Camila Cavalcante", 111111111);
        agendaContatos.adicionarContato("Julia", 4444);

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Camila Cavalcante");
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Julia"));

    }
}
