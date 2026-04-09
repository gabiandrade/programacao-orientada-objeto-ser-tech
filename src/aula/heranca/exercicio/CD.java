package aula.heranca.exercicio;

public class CD extends Produto {

    private String nomeArtista;
    private int quantidadeMusicas;
    private String gravadora;

    public CD(){}
    public CD(String nome,
              String codigoBarras,
              double valor, String nomeArtista,
              int quantidadeMusicas, String gravadora) {
        super(nome, codigoBarras, valor);
        this.nomeArtista = nomeArtista;
        this.quantidadeMusicas = quantidadeMusicas;
        this.gravadora = gravadora;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public int getQuantidadeMusicas() {
        return quantidadeMusicas;
    }

    public void setQuantidadeMusicas(int quantidadeMusicas) {
        this.quantidadeMusicas = quantidadeMusicas;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public String toString() {
        return "CD{" +
                "nome='" + nome + '\'' +
                ", gravadora='" + gravadora + '\'' +
                ", quantidadeMusicas=" + quantidadeMusicas +
                ", nomeArtista='" + nomeArtista + '\'' +
                '}';
    }
}
