
package ex4;


  public class PagamentoCartaoCredito extends Pagamento {
    private double taxaJuros = 0.05; 

    public PagamentoCartaoCredito(double valor) {
        super(valor);
    }

    public double calcularValor() {
        return valor + (valor * taxaJuros);
    }
}  

