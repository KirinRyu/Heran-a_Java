public class Bebida implements Produto{

    public Bebida(String descricao, double preco, int ml) {
        this.descricao = descricao;
        this.preco = preco;
        this.ml = ml;
    }
    public void mostrarItens() {
        System.out.println(this.descricao);
        System.out.println(this.preco);
    }
    private String descricao;
    private double preco;
    private int ml;

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getMl() {
        return ml;
    }
}
