package Apps;

public class MsnMessenger extends ServicoMensagemInstantanea {

    public void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico na msn cloud");
    }

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo msn");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo msn");
        salvarHistoricoMensagem();
    }
}
