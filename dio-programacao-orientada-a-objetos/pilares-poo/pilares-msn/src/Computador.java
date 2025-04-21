import apps.*;

public class Computador {
    public static void main(String[] args) {
        ServicoMensagemInstantanea appEscolhido = null;

        //O usuário irá escolher o serviço de mensagens e usar o escolhido.

        String escolha = "wpp";

        if (escolha.equals("msn")) {
            appEscolhido = new MSNMessenger();
        }
        else if (escolha.equals("face")) {
            appEscolhido = new FacebookMessenger();
        }
        else if (escolha.equals("wpp")) {
            appEscolhido = new WhatsApp();
        }
        else if (escolha.equals("tlg")) {
            appEscolhido = new Telegram();
        }

        appEscolhido.enviarMensagem();
        appEscolhido.receberMensagem();
    }
}
