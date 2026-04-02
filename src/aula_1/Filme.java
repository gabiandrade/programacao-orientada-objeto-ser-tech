package aula_1;

public class Filme {
    //modificador tipo nomeAtributo
    private String nome;
    private int duracao;
    private String diretor;
    private int nota;
    private String genero;

    //construtor - n tem retorno e é o mesmo nome da classe

    Filme(){}
    Filme(String nome){
        this.nome = nome;
    }

    Filme(String nome, int duracao, String diretor, int nota, String genero){
        this.nome = nome;
        this.duracao = duracao;
        this.diretor = diretor;
        this.nota = nota;
        this.genero = genero;
    }



    //metodos get e setter


    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "aula_1.Filme{" +
                "nome='" + nome + '\'' +
                ", duracao=" + duracao +
                ", diretor='" + diretor + '\'' +
                ", nota=" + nota +
                ", genero='" + genero + '\'' +
                '}';
    }
}
