package programming_logic_ii.challenge_01;

public class Aluno {

    private final String nome;
    private final double ga;
    private final double gb;

    public Aluno(String nome, double ga, double gb) {
        this.nome = nome;
        this.ga = ga;
        this.gb = gb;
    }

    public String getNome() {
        return nome;
    }

    public double calcularGrauFinal() {
        final double PESO_GA = 1.0 / 3.0;
        final double PESO_GB = 2.0 / 3.0;
        return (ga * PESO_GA) + (gb * PESO_GB);
    }
}
