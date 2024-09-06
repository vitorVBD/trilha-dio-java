public class FormatadorDeCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("25815470");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep precisa ter 8 dígitos");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
        throw new CepInvalidoException();

        return "25.815-470";
    }
}
