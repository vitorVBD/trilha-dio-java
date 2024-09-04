public class TiposVariaveis {
    public static void main(String[] args) {

        //tipos primitivos:
        byte ex1 = 1; //numero inteiro de 8 bits
        short ex2 = 2; //numero inteiro de 16 bits
        int ex3 = 3; //numero inteiro de 32 bits
        long ex4 = 4; //numero inteiro de 64 bits
        boolean ex5 = true; //valor booleano (true ou false)
        char ex6 = 6; //caractere Unicode de 16 bits
        float ex7 =7; //número de ponto flutuante de 32 bits
        double ex8 = 8.0; //número de ponto flutuante de 64 bits

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
         //casting
        short numeroCurto2 = (short) numeroNormal;

        //variáveis:

        int num = 10;
        num = 5;
        System.out.println(num);

        //constante:

        final double VALOR_DE_PI = 3.14;
    }
}
