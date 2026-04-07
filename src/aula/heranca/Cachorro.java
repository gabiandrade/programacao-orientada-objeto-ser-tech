package aula.heranca;

import aula.heranca.interfaces.AnimalInterface;

public class Cachorro extends Animal implements AnimalInterface {


    private int ossoEnterrado;

    public void latir() {
        System.out.printf("%s latiu\n", nome);
    }

    public void correr() {
        System.out.printf("%s correndo\n", nome);
    }


    @Override
    public void comer() {
        System.out.printf("%s comendo ração\n", nome);
    }


    @Override
    public void beber() {
        System.out.printf("%s bebendo agua\n", nome);
    }

    @Override
    public void barulhoDoAnimal() {

    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "ossoEnterrado=" + ossoEnterrado +
                ", nome='" + nome + '\'' +
                '}';
    }


}
