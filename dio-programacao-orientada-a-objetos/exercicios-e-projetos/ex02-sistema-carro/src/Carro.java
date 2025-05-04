public class Carro {

    Marcha marchaAtual = new Marcha();
    String marca;
    int velocidade;
    boolean carroLigado;

    public Carro(String marca) {
        this.marca = marca;
        this.velocidade = 0;
    }

    public void ligar() {
        if (carroLigado) {
            System.out.println("O carro já está ligado!");
        }
        else {
            System.out.println("Carro ligado!");
            carroLigado = true;
        }
    }

    public void desligar() {
        if (carroLigado) {
            if (marchaAtual.getMarcha() == 0) {
                System.out.println("Carro desligado.");
                carroLigado = false;
            }
            else {
                System.out.println("O carro deve estar em ponto morto para desligar.");
            }
        }
        else {
            System.out.printf("O carro já está desligado.");
        }
    }

    public void aumentarMarcha() {
        marchaAtual.aumentarMarcha();
    }

    public void acelerar() {
        //todo acelerar
        if (marchaAtual.getMarcha() == 0) {
            System.out.println("Carro em ponto morto, não é possível acelerar.");
        }
        else if (velocidade < 120) {
            velocidade++;
            System.out.println("Velocidade atual: " + velocidade + " km/h");
        }
        else {
            System.out.println("Velocidade no limite!");
        }
        //incrementar em 1km (max 120km)
    }

    public void freiar() {
        //todo diminuir velocidade
        //
    }

    public void virar() {
        //todo virar esquerda ou direita
    }

    public void verificarVelocidade() {
        //todo verificar velocidade
    }
}
