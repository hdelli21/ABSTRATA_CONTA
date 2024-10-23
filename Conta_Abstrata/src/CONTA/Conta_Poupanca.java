package CONTA;

public class Conta_Poupanca extends Conta_Bancaria {
    private static final double TAXA_SAQUE = 1.00; // Taxa fixa para saques
    private static final double TAXA_DEPOSITO = 0.50; // Taxa fixa para depósitos
    private static final double TAXA_CONSULTA = 0.25; // Taxa para consulta de saldo

    public Conta_Poupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + TAXA_SAQUE;
        if (valorComTaxa > getSaldo()) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            setSaldo(getSaldo() - valorComTaxa);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + (valor - TAXA_DEPOSITO));
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    @Override
    public void consultar() {
        setSaldo(getSaldo() - TAXA_CONSULTA);
        System.out.println("Consulta realizada. Seu saldo é de R$ " + getSaldo());
    }
}