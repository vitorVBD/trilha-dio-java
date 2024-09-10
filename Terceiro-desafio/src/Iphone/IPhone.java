package Iphone;

import Funcionalidades.multifuncional.Multifuncional;

public class IPhone {
    public static void main(String[] args) {
        Multifuncional iphone = new Multifuncional();


        System.out.println("Funções Ipod:");
        iphone.selecionarMusica("Waiting For The End - Linkin Park");
        iphone.tocar();
        iphone.pausar();

        System.out.println("Funções Telefone:");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.ligar("975844873");

        System.out.println("Funções Navegador:");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo");
        iphone.atualizarPagina();
    }
}
