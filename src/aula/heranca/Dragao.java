package aula.heranca;

import aula.heranca.interfaces.AnimalInterface;
import aula.heranca.interfaces.AnimalVoador;

public class Dragao extends AnimalVoadorConcreto implements AnimalInterface, AnimalVoador {


    public void soltarFogo() {
        System.out.printf("%s soltando fogo\n", getNome());
    }

    @Override
    public void voar(){
        System.out.println("dragão voando. Nosso teste está aqui");
    }

    @Override
    public void comer() {
        System.out.println("Dragão está comendo comida de dragão");
    }

    @Override
    public void beber() {
        System.out.println("Dragão bebendo água");
    }
}
