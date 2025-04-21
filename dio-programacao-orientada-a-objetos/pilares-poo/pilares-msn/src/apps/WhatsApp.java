package apps;

public class WhatsApp extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo WhatsApp");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Mensagem recebida pelo WhatsApp");
    }
}
