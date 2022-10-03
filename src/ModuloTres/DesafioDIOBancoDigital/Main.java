package ModuloTres.DesafioDIOBancoDigital;

public class Main {
    public static void main(String[] args) {

        Conta contaCorrente1 = new ContaCorrente();
        Conta contaPoupanca1 = new ContaPoupanca();

        contaCorrente1.imprimirExtrato();
        contaPoupanca1.imprimirExtrato();

    }
}
