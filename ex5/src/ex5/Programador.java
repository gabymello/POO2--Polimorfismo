
package ex5;



    public class Programador extends Funcionario {
    private int horasTrabalhadas;
    private double valorPorHora;

    public Programador(String nome, double salarioBase, int horasTrabalhadas, double valorPorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public double calcularSalario() {
        return salarioBase + (horasTrabalhadas * valorPorHora);
    }
}

