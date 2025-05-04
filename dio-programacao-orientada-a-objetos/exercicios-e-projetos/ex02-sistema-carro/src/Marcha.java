public class Marcha {

    //todo desfazer classe marcha e unificar

    private int marcha = 0;

    public int getMarcha() {
        return marcha;
    }

    public void aumentarMarcha() {
        if (marcha < 6) {
            System.out.println("Marcha atual: " + marcha);
            marcha++;
        }
        else
            System.out.printf("Marcha já está no limite!");
    }

    public void diminuirMarcha() {
        if (marcha > 0 ) {
            marcha--;
            System.out.println("Marcha atual: " + marcha);
        }
        else
            System.out.println("Marcha já está no limite!");

    }
    /*
    se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
    se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
    se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
    se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
    se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
    se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
    se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km

    O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
    O carro só pode virar para esquerda/direita se sua velocidade for de no mínimo 1km e no máximo 40km;
     */

}
