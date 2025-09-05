
package ex5;

import java.util.ArrayList;
import java.util.List;


public class Ex5 {

    
    public static void main(String[] args) {
      List<Funcionario> funcionarios = new ArrayList<>();

        Funcionario f1 = new Gerente("gaby", 200, 2000);
        Funcionario f2 = new Programador("rafa", 2300, 20, 15);

        funcionarios.add(f1);
        funcionarios.add(f2);

        for (Funcionario f : funcionarios) {
            System.out.println("Funcionário: " 
                    + f.getNome() + " Salário: " + f.calcularSalario());
        }
}
    }
 

