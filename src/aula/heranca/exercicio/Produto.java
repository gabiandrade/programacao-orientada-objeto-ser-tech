package aula.heranca.exercicio;

public class Produto {

    protected String nome;
    private String codigoBarras;
    private double valor;

    public Produto(){}
    public Produto(String nome, String codigoBarras, double valor) {
        this.nome = nome;
        this.codigoBarras = codigoBarras;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigoBarras='" + codigoBarras + '\'' +
                ", valor=" + valor +
                '}';
    }
}
