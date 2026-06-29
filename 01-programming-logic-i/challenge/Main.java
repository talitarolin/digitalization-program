public class Main {
    public static double somarPrecos(double[] lista) {
        double total = 0;
        for (double preco : lista) {
            total += preco;
        }
        return total;
    }

    public static void main(String[] args) {
        double[] precos = { 29.90, 49.90, 15.00, 79.90 };
        double subtotal = somarPrecos(precos);

        System.out.println("Subtotal: R$ " + String.format("%.2f", subtotal));

        double totalFinal = subtotal;
        if (subtotal > 100) {
            double desconto = subtotal * 0.10;
            totalFinal = subtotal - desconto;
            System.out.println("Desconto (10%): -R$ " + String.format("%.2f", desconto));
        }

        System.out.println("Total final: R$ " + String.format("%.2f", totalFinal));
    }
}