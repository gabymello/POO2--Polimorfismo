
package ex3;



   public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial = 4000.0;

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na Conta Corrente.");
        } else {
            System.out.println("Saldo insuficiente na Conta Corrente.");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado na Conta Corrente.");
    }
} 

