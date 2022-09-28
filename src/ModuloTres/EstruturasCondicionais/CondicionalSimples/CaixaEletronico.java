package ModuloTres.EstruturasCondicionais.CondicionalSimples;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        System.out.println("Saldo inicial: " + saldo);
        System.out.println("Valor debitado: " + valorSolicitado);

        if (valorSolicitado < saldo){
            saldo -= valorSolicitado;
        }

        System.out.println("Saldo final: " + saldo);
    }
}
