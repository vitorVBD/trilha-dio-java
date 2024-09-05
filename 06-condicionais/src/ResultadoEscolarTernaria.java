public class ResultadoEscolarTernaria {
    public static void main(String[] args) {
        
        double nota = 8;

        String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado"; //usado para otimizar algoritmos

        System.out.println(resultado);
    }
}