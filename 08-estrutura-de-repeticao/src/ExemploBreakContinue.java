public class ExemploBreakContinue {
    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) //break para parar a iteração e continue para voltar a iteração
                continue; //break

            System.out.println(numero);
        }
    }
}
