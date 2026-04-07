import aula.heranca.*;

public class Aplicacao {

    static void main() {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Caramelo");
        cachorro.comer();
        cachorro.beber();
        System.out.println(cachorro);
        System.out.println();

        Gato gato = new Gato();
        gato.setNome("Dominique");
        gato.comer();
        System.out.println(gato);
        System.out.println();


        Dragao dragao = new Dragao();
        dragao.setNome("Banguela");
        dragao.setVelocidade(100.0);
        dragao.barulhoDoAnimal();
        dragao.voar();
        dragao.comer();
        dragao.beber();
        dragao.soltarFogo();
        System.out.println(dragao);
        System.out.println();

        Coruja coruja = new Coruja();
        coruja.setNome("Edwiges");
        coruja.beber();
        coruja.voar();
        coruja.enviarCarta();
        coruja.barulhoDoAnimal();
        System.out.println(coruja);
        System.out.println();
    }
}
