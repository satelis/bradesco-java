public class Boleto {
    private double valor;
    private boolean pago = false;
    static int numBoletos = 0;

    public Boleto(double valor) {
        this.valor = valor;
        numBoletos++;
    }

    public void boletoPagar() {
        numBoletos--;
        pago = true;
    }

    public double getValor() {
        return valor;
    }

    public boolean getPago() {
        return pago;
    }
}
