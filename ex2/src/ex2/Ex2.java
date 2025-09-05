
package ex2;

import java.util.ArrayList;
import java.util.List;


public class Ex2 {

 
    public static void main(String[] args) {
       List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Passaro());

        // Executando os métodos
        for (Animal animal : animais) {
            animal.emitirSom();
            animal.mover();
            System.out.println("");
        }
    }
}
    
    

