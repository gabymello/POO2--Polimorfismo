
package ex3;

import java.util.ArrayList;
import java.util.List;


public class Ex3 {


    public static void main(String[] args) {
      
   List<ContaBancaria> contas = new ArrayList<>();

        ContaBancaria conta1 = new ContaCorrente(2000);
        ContaBancaria conta2 = new ContaPoupanca(10000);

        contas.add(conta1);
        contas.add(conta2);

        for (ContaBancaria conta : contas) {
            conta.depositar(200);
            conta.sacar(300);
            System.out.println("Saldo atual: R$" + conta.getSaldo());
            System.out.println("");

            // Usando instanceof para acessar método específico da poupança
            if (conta instanceof ContaPoupanca) {
                ((ContaPoupanca) conta).renderJuros();
                System.out.println("Saldo final após juros: R$" + conta.getSaldo());
                System.out.println("");
            }
        }
    }
}