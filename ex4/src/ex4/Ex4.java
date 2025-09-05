
package ex4;

import java.util.ArrayList;
import java.util.List;


public class Ex4 {

    public static void main(String[] args) {
         List<Pagamento> pagamentos = new ArrayList<>();

        Pagamento p1 = new PagamentoCartaoCredito(300);
        Pagamento p2 = new PagamentoBoleto(100);

        pagamentos.add(p1);
        pagamentos.add(p2);

        for (Pagamento p : pagamentos) {
            System.out.println("Valor final a pagar:" + p.calcularValor());
        }
    }
}
    