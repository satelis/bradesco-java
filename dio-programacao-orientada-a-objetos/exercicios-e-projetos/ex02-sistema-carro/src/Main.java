public class Main {
    public static void main(String[] args) {
        var eco = new Carro("ford");
        eco.ligar();
        eco.desligar();
        eco.ligar();
        eco.acelerar();
        eco.aumentarMarcha();
        for (int i = 0; i <= 120; i++) {
            eco.acelerar();
        }

        eco.desligar();
    }
}
