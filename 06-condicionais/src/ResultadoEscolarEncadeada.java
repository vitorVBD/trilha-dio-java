public class ResultadoEscolarEncadeada {
    public static void main(String[] args) {

        double nota = 6.5;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}