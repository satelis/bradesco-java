public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        Moto z400 = new Moto();

        jeep.setChassi("432432");
        z400.setChassi("231356");

        z400.ligar();
        jeep.ligar();
    }
}
