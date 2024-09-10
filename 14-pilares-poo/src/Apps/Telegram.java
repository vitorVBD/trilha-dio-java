package Apps;

public class Telegram extends ServicoMensagemInstantanea {
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico no Telegram cloud");
    }
    
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }
}
