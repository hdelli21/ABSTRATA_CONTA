package Main;

import CONTA.Conta_Corrente;
import CONTA.Conta_Poupanca;

public class Main {
    public static void main(String[] args) {
  
        Conta_Poupanca contaPoupanca = new Conta_Poupanca(1000.00);
        contaPoupanca.consultar();
        contaPoupanca.depositar(200);
        contaPoupanca.sacar(500);
        contaPoupanca.sacar(800);
        contaPoupanca.consultar();

        Conta_Corrente contaCorrente = new Conta_Corrente(1000.00, 500.00);
        contaCorrente.consultar();
        contaCorrente.depositar(300);
        contaCorrente.sacar(1200);
        contaCorrente.sacar(200);
        contaCorrente.consultar();
    }
}