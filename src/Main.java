import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Selecione seu combo");
        System.out.println("1. Combo Master");
        System.out.println("2. Super Combo");
        System.out.print("Sua escolha: ");

        Scanner input = new Scanner(System.in);

        int tipo;
        Combo combo = new Combo();
        combo.criarCombo(tipo = input.nextInt());
        System.out.println(combo);
        input.close();
    }
}