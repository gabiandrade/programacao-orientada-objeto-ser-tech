package aula.heranca;

import aula.heranca.interfaces.AnimalInterface;

public class Gato extends Animal implements AnimalInterface {


    public void miar() {
        System.out.printf("%s miau\n", getNome());
    }

    public void lamber() {
        System.out.printf("%s lambeu o dono\n", getNome());
    }

    @Override
    public void comer() {
        System.out.printf("%s comendo wiskas sache", nome);
    }

    @Override
    public void beber() {

    }

    @Override
    public void barulhoDoAnimal() {

    }
}
