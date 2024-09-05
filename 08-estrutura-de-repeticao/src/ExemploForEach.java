public class ExemploForEach {
    public static void main(String[] args) {
        
        String alunos[] = {"Vitor" , "Felipe", "Jonas", "Julia", "Marcos"};

        for(String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
