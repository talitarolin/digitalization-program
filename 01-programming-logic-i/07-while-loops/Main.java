public class Main {
    public static void main(String[] args) {
        int energia = 100;
        while (energia > 0) {
            System.out.println("Energia: " + energia);
            energia -= 30;
        }
        System.out.println("Sem energia!");
    }
}
