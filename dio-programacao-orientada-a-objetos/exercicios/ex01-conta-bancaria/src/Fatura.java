public class Fatura extends Boleto {

    public Fatura(double valor) {
        super(valor + (valor * 0.2));
    }
}