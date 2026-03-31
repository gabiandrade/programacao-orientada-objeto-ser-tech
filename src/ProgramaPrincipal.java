import java.util.Scanner;

public class ProgramaPrincipal {

    static void main() {

        //A criação do objeto
        /*Filme orgulhoEpreconceito = new Filme();
        orgulhoEpreconceito.setNome("Orgulho e Preconceito");
        orgulhoEpreconceito.setDiretor("Thiago Manhães");
        orgulhoEpreconceito.setDuracao(120);
        orgulhoEpreconceito.setGenero("Romance");
        orgulhoEpreconceito.setNota(5);
        System.out.println(orgulhoEpreconceito);*/

        Filme carros = new Filme("Carros");
        System.out.println(carros);

        Filme orgulhoEpreconceito =
                new Filme("Orgulho Preconceito",
                        120,"Thiago", 5, "Romance");

        Filme todoMundoEmPanico = new Filme();
        System.out.println(todoMundoEmPanico);

        System.out.println(todoMundoEmPanico.getNome());

        if(todoMundoEmPanico.getNome() != null){
            System.out.println(todoMundoEmPanico.getNome().contains("oi"));
        }


    }
}
