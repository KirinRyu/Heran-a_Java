public class Burger implements Produto{

    public Burger(String descricao, double preco, int gramas) {
        this.descricao = descricao;
        this.preco = preco;
        this.gramas = gramas;
    }

    private String descricao;
    private double preco;
    private int gramas;

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
    @Override
    public void mostrarItens() {
        System.out.println(this.descricao);
        System.out.println(this.preco);
    }
    public int getGramas() {
        return gramas;
    }

}
