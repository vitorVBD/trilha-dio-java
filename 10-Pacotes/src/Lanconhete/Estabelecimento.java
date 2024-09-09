package Lanconhete;

import Lanconhete.area.cliente.Cliente;
import Lanconhete.atendimento.Atendente;
import Lanconhete.atendimento.cozinha.Almoxarife;
import Lanconhete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();

        // ações que o estabelecimento precisa ter ciencia
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

    
        Atendente atendente = new Atendente();
        atendente.servindoMesa();
        atendente.receberPagamento();


        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
    }
}
