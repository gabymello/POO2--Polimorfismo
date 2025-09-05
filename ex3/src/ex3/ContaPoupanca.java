
package ex3;

public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros = 0.05;

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na Conta Poupança.");
        } else {
            System.out.println("Saldo insuficiente na Conta Poupança.");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado na Conta Poupança.");
    }

    public void renderJuros() {
        saldo += saldo * taxaJuros;
        System.out.println("Juros ativado. Novo saldo: R$" + saldo);
    }
}
