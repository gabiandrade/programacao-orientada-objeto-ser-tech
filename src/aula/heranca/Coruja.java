package aula.heranca;

import aula.heranca.interfaces.AnimalInterface;
import aula.heranca.interfaces.AnimalVoador;

public class Coruja extends AnimalVoadorConcreto implements AnimalInterface {

    @Override
    public void barulhoDoAnimal() {
        System.out.println("Barulho da coruja cru cru");
    }

    public void enviarCarta() {
        System.out.printf("%s enviando carta\n", getNome());
    }

    @Override
    public void comer() {
        System.out.printf("%s comendo\n", nome);
    }

    @Override
    public void beber() {
        System.out.printf("%s bebendo\n", nome);
    }
}
