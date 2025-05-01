import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEvento {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEvento() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        LocalDate dataAtual = LocalDate.now();


        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento é: " + entry.getValue() + " e acontecerá na data: " + entry.getKey());
                break;
            }
        }
    }


    public static void main(String[] args) {
        AgendaEvento agendaEvento = new AgendaEvento();

        agendaEvento.adicionarEvento(LocalDate.of(2025, Month.SEPTEMBER, 21), "Aniversário!", "Atração 1");
        agendaEvento.adicionarEvento(LocalDate.of(2025, Month.NOVEMBER, 17), "Aniversário da Julia!", "Atração 2");
        agendaEvento.adicionarEvento(LocalDate.of(2026, Month.JANUARY, 1), "Ano novo!", "Atração 3");
        agendaEvento.adicionarEvento(LocalDate.of(2009, Month.SEPTEMBER, 20), "Corrida", "Atração 4");

        agendaEvento.exibirAgenda();
        agendaEvento.obterProximoEvento();
    }
}
