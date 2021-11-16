public class Main {
    public static void main(String[] args) {
        Cliente levi = new Cliente();
        levi.setNome("Levi");

        Conta cc = new ContaCorrente(levi);
        Conta poupanca = new ContaPoupanca(levi);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
