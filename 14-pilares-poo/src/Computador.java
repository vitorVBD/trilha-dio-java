import Apps.FacebookMessenger;
import Apps.MsnMessenger;
import Apps.ServicoMensagemInstantanea;
import Apps.Telegram;

public class Computador {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "tlg";

        if (appEscolhido.equals("msn")) {
            smi = new MsnMessenger();
        } else if (appEscolhido.equals("fcb")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
