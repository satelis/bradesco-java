public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv  = new SmartTv();

        System.out.println("Televisão desligada.");
        smartTv.ligar();

        smartTv.desligar();
        smartTv.ligar();

        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.avancarCanal();
        smartTv.voltarCanal();
        smartTv.voltarCanal();
        smartTv.irParaCanal(33);

        System.out.println("Canal atual: "+ smartTv.canal);

    }
}
