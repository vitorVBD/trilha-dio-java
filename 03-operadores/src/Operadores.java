public class Operadores {
    public static void main(String[] args) {
        // atribuição: =

        String nome = "Vitor";
        String sobrenome = "Bittencourt";
        int idade = 26;
        double peso = 78.3;
        char sexo = 'M';
        boolean doadorDeOrgao = false;

        // operadores: + - / * %

        double soma = 10.5 + 15.3;
        int subtração = 113 - 25;
        int multiplicação = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 5);

        // + usado com strings faz uma concatenação

        String nomeCompleto = nome + sobrenome;
        System.out.println(nomeCompleto);

        String linguagem = "Linguagem " + "JAVA";
        System.out.println(linguagem);

        // operadores ternários: ?:

        int a, b;
        a = 6;
        b = 6;
        String result = a == b ? "verdadeiro" : "falso";

        System.out.println(result);

        // operadores comparativos < > != ==

        // para comparar objetos:

        String nomeUm = "Vitor";
        String nomeDois = new String("Vitor");

        System.out.println(nomeUm.equals(nomeDois)); //usar equals


        // operadores lógicos &&  ||

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("as duas são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("uma ou outra é verdadeira");
        }
    
    }
}
