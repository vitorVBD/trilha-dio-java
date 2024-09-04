package edu.vitor.aula;

public class Variaveis {

    public static void main(String[] args) {
        String meuNome = "Vitor"; // variável tipo string

        int anoDeFabricacao = 1998; // variável tipo inteiro

        boolean verdadeira = true; // variável tipo booleana

        long cep = 25815470; // variável tipo numérica

        anoDeFabricacao = 2024; // alterando apenas ao valor da variável

        String pirmeiroNome = "Vitor";
        String segundoNome = "Bittencourt";

        String nomeCompleto = nomeCompleto(pirmeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome); // + ou .concat para concatenar
    }

}
