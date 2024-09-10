package Funcionalidades.multifuncional;

import Funcionalidades.musica.IPod;
import Funcionalidades.navegador.InterfaceInternet;
import Funcionalidades.telefone.InterfaceTelefone;

public class Multifuncional implements IPod, InterfaceInternet, InterfaceTelefone {
    public void tocar() {
        System.out.println("Tocando música ");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo telefone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

}
