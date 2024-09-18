public class Combo {
    public Bebida bebida;
    public Sobremesa sobremesa;
    public Burger burger;

    public static void criarCombo(int i) {
        if(i == 1) {
            Burger b = new Burger("100g de Hamburger", 4.99, 100);
            Sobremesa s = new Sobremesa("Casquinha", 1.99, "Pequeno");
            Bebida be = new Bebida("Dolly", 2.99, 300);
            b.mostrarItens();
            s.mostrarItens();
            be.mostrarItens();
        } else if (i==2) {
            Burger b = new Burger("200g de Hamburger", 8.99, 200);
            Sobremesa s = new Sobremesa("Magnum", 5.99, "Giga");
            Bebida be = new Bebida("Vinho", 222.99, 50);
            b.mostrarItens();
            s.mostrarItens();
            be.mostrarItens();
        } else {
            System.out.println("tu é bobo?");
        }

    }
}
