package CONTA;

public class Conta_Corrente extends Conta_Bancaria {
        private static final double TAXA_SAQUE = 1.50; // Taxa para saques
        private static final double TAXA_DEPOSITO = 0.75; // Taxa para depósitos
        private static final double TAXA_CONSULTA = 0.30; // Taxa para consulta de saldo
        private double limite; // Limite adicional após o saldo acabar
    
        public Conta_Corrente(double saldoInicial, double limiteInicial) {
            super(saldoInicial);
            this.limite = limiteInicial;
        }
    
        public double getLimite() {
            return limite;
        }
    
        public void atualizarLimite(double valor) {
            this.limite = valor;
        }
    
        @Override
        public void sacar(double valor) {
            double valorComTaxa = valor + TAXA_SAQUE;
            if (valorComTaxa <= getSaldo()) {
                atualizarSaldo(getSaldo() - valorComTaxa);
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
                
            } else if (valorComTaxa <= (getSaldo() + limite)) {
                double valorRestante = valorComTaxa - getSaldo();
                atualizarSaldo(0);
                atualizarLimite(limite - valorRestante);
                System.out.println("Saque de R$ " + valor + " realizado utilizando o limite.");
            } else {
                System.out.println("Saldo e limite insuficientes para realizar o saque.");
            }
        }
    
        @Override
        public void depositar(double valor) {
            atualizarSaldo(getSaldo() + (valor - TAXA_DEPOSITO));
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }
    
        @Override
        public void consultar() {
            atualizarSaldo(getSaldo() - TAXA_CONSULTA);
            System.out.println("Consulta realizada. Seu saldo é de R$ " + getSaldo() + " e seu limite disponível é de R$ " + getLimite());
        }
    }

