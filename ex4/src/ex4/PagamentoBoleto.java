
package ex4;


   public class PagamentoBoleto extends Pagamento {
    private double desconto = 0.5; // 10% de desconto

    public PagamentoBoleto(double valor) {
        super(valor);
    }

    public double calcularValor() {
        return valor - (valor * desconto);
    }
} 

