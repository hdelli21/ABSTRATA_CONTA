package CONTA;

abstract class Conta_Bancaria {

    public double saldo;

    public Conta_Bancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void atualizarSaldo(double valor) {
        this.saldo = valor;
    }

    // Métodos abstratos
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void consultar();
}