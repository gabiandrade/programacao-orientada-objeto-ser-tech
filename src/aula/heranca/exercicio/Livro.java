package aula.heranca.exercicio;

public class Livro extends Produto {

    private String autor;
    private String editora;
    private int quantidadePaginas;

    public Livro() {
    }

    public Livro(String nome, String codigoBarras, double valor,
                 String autor, String editora, int quantidadePaginas) {
        super(nome, codigoBarras, valor);
        this.autor = autor;
        this.editora = editora;
        this.quantidadePaginas = quantidadePaginas;
    }

    public Livro(String autor, String editora, int quantidadePaginas) {
        this.autor = autor;
        this.editora = editora;
        this.quantidadePaginas = quantidadePaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", quantidadePaginas=" + quantidadePaginas +
                " nome ='" + nome + '\'' +
                '}';
    }
}
