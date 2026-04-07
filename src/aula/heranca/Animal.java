package aula.heranca;

public abstract class Animal {

    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void barulhoDoAnimal();

    //Métodos concretos
    /*public void comer() {
        System.out.printf("%s comeu\n", nome);
    }*/

    //Métodos concretos
    /*public void beber() {
        System.out.printf("%s bebeu\n", nome);
    }*/

    @Override
    public String toString() {
        return "Animal Teste = {" +
                "nome='" + nome + '\'' +
                '}';
    }
}
