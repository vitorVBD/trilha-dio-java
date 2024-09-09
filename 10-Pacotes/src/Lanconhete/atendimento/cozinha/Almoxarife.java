package Lanconhete.atendimento.cozinha;

public class Almoxarife {

    private void controlarEntrada() {
        System.out.println("Controlando a entrada dos itens");
    }

    private void controlarSaida() {
        System.out.println("Controlando a saída dos itens");
    }

    void entregarIngredientes() {
        System.out.println("Entregando ingredientes");
        controlarSaida();
    }

    void trocarGas() {
        System.out.println("Almoxarife trocando gás");
    }
}
