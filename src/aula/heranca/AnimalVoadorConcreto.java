package aula.heranca;

import jdk.swing.interop.SwingInterOpUtils;

public abstract class AnimalVoadorConcreto extends Animal {

    private double velocidade;

    @Override
    public void barulhoDoAnimal(){
        System.out.println("Barulho do animal voador generico");
    }

    public void voar(){
        System.out.printf("%s voando", nome);
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
