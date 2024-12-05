import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um
 * resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado
 * tipo.
 */

public class SupplierExample {
    public static void main(String[] args) throws Exception {
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo(a)!")
                .limit(5)
                .toList();

        listaSaudacoes.forEach(s -> System.out.println(s));
    }
}
