public class Carro extends Veiculo {

    @Override
    public void ligar() {
        conferirCombustivel();
        conferirCambio();
        System.out.println("Carro Ligado!");
    }

    private void conferirCombustivel () {
        System.out.println("Conferindo combustível.");
    }

    private void conferirCambio () {
        System.out.println("Conferindo cambio em P.");
    }
}
