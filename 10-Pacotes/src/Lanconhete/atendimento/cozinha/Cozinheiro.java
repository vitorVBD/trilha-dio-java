package Lanconhete.atendimento.cozinha;

import Lanconhete.atendimento.Atendente;

public class Cozinheiro {

    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando lanche natural hamburguer no balcao");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco no balcão");
    }

    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println("Preparando lanche tipo hamburguer");
    }

    private void prepararSuco() {
        System.out.println("Preparando suco");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararSuco();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("Selecionando o pão, salada, ovo e caner");
    }

    private void selecionarIngredientesSuco() {
        System.out.println("Selecionando fruta");
    }

    private void lavarIngredientes() {
        System.out.println("Lavando ingredientes");
    }

    private void espremerFruta() {
        System.out.println("Espremendo fruta");
    }

    private void fritarIngredientes() {
        System.out.println("Fritando a carne e ovo para hamburguer");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
