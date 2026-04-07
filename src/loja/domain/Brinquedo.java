package loja.domain;


public class Brinquedo {
    private String nomeBrinquedo;
    private int quantidadeEstoque;
    private double precoBrinquedo;
    private String codigoBarras;

    public Brinquedo() {
    }

    public Brinquedo(String nomeBrinquedo, int quantidadeEstoque,
                     double precoBrinquedo, String codigoBarras) {
        this.nomeBrinquedo = nomeBrinquedo;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoBrinquedo = precoBrinquedo;
        this.codigoBarras = codigoBarras;
    }


    public void setNomeBrinquedo(String nomeBrinquedo) {
        this.nomeBrinquedo = nomeBrinquedo;
    }

    public String getNomeBrinquedo() {
        return nomeBrinquedo;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPrecoBrinquedo() {
        return precoBrinquedo;
    }

    public void setPrecoBrinquedo(double precoBrinquedo) {
        this.precoBrinquedo = precoBrinquedo;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }


    public void mostrarInformacoes() {
        System.out.println("Nome: " + nomeBrinquedo);
        System.out.println("Preco do Brinquedo: " + precoBrinquedo);
        System.out.println("Codigo Barras: " + codigoBarras);
    }

    /*@Override
    public String toString() {
        return "Brinquedo{" +
                "nomeBrinquedo='" + nomeBrinquedo + '\'' +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", precoBrinquedo=" + precoBrinquedo +
                ", codigoBarras='" + codigoBarras + '\'' +
                '}';
    }*/
}
