package sistema.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    protected static List<Conta> contasList = new ArrayList<>();

    public List<Conta> getContas() {
        return contasList;
    }
}

