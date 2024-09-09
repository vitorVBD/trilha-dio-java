public enum EstadoBrasileiro {

    SAO_PAULO ("SP", "São Paulo", 11),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 21),
    PIAUI ("PI", "Piauí", 86),
    MARANHAO ("MA", "Maranhão", 98),
    CEARA ("CE", "Ceará", 85)
    ;

    private String sigla;
    private String nome;
    private int ibge;

    private EstadoBrasileiro (String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
