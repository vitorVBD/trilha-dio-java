public class Main {
    public static void main(String[] args) {

        Cliente vitor = new Cliente();
        vitor.setNome("Vitor");

        Conta cc = new ContaCorrente(vitor);
        cc.depositar(150);

        Conta poupanca = new ContaPoupanca(vitor);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
