public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("Televisão ligada!");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Televisão desligada.");
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume atual: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume atual: " + volume);
    }

    public void irParaCanal(int novoCanal) {
        if (novoCanal < 1 || novoCanal > 100) {
            System.out.println("Canal inválido.");
        } else {
            canal = novoCanal;
        }
    }

    public void voltarCanal() {
        if (canal > 1) {
            canal--;
        } else {
            canal = 100;
        }

        System.out.println("Canal atual: " + canal);
    }

    public void avancarCanal() {
        if (canal < 100) {
            canal++;
        } else {
            canal = 1;
        }
        System.out.println("Canal atual: " + canal);
    }


}


