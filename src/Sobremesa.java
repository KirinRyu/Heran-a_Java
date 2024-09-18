public class Sobremesa implements Produto{

    public Sobremesa(String descricao, double preco, String tamanho) {
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    private String descricao;

    private double preco;

    private String tamanho;

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void mostrarItens() {
        System.out.println(this.descricao);
        System.out.println(this.preco);
    }
    public String getTamanho() {
        return tamanho;
    }
}
