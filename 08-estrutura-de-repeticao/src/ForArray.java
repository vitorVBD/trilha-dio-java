public class ForArray {
    public static void main(String[] args) {
        
        String alunos[] = {"Vitor", "Felipe", "Jonas", "Julia", "Marcos"};


        for (int x = 0; x <= alunos.length; x++) {
            System.out.println("O aluno no indice " + x + " é " + alunos[x]);
        }
    }
}
