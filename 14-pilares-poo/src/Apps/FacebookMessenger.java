package Apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico no Facebook cloud");
    }
    
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo Facebook");
        salvarHistoricoMensagem();
    }
}
