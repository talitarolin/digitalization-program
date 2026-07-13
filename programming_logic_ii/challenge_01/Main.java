package programming_logic_ii.challenge_01;

public class Main {

    public static void main(String[] args) {

        // Em vez de dois arrays, utilizar um unico array de objetos Aluno,
        //Dessa forma, encapsula as informações de aluno para um objeto.

        Aluno[] alunos = {
                new Aluno("Ana", 8.0, 9.0),
                new Aluno("Bruno", 6.5, 7.0),
                new Aluno("Carla", 5.0, 6.5)
        };
 
        for (Aluno aluno : alunos) {
            double media = aluno.calcularGrauFinal();

            System.out.printf("%s : %.2f%n", aluno.getNome(), media);
        }
    }
}
