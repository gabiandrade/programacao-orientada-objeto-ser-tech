package aula.heranca.exercicio;

public class TesteApp {

    static void main() {

        String nomeLivro = "Codigo Limpo";
        Livro livro =
                new Livro(nomeLivro,
                        "123456",
                        100.0,
                        "Esqueci o nome",
                        "editora",
                        100 );
        System.out.println(livro);
        
    }


}
