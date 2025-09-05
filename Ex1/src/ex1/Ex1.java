
package ex1;

public class Ex1 {

   
    public static void main(String[] args) {
         FormaGeometrica circulo = new Circulo(5);
        FormaGeometrica retangulo = new Retangulo(4, 6);
        FormaGeometrica triangulo = new Triangulo(3, 7);

   
        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
    }
}
   
