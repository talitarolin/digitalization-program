public class Main {

public static void main(String[] args) {

        String[] alunos = {"Ana", "Bruno", "Carla"};

        double[][] notas = {
            {8.0, 9.0},
            {6.5, 7.0},
            {5.0, 6.5}
        };

        for (int i = 0; i < alunos.length; i++) {
            double ga = notas[i][0];
            double gb = notas[i][1];
            double grauFinal = (ga * 0.3333) + (gb * 0.6667);

            System.out.printf("%s : %.2f%n", alunos[i], grauFinal);
        }
    }
}
