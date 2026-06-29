public class main {
    String diaDaSemana = "Segunda";
    {
        switch (diaDaSemana) {
            case "Segunda":
                System.out.println("Inicio da semana, vamos com tudo!");
                break;
            case "Sexta":
                System.out.println("Sextou!");
                break;
            case "Sábado":
            case "Domingo":
                System.out.println("Fim de semana!");
                break;
            default:
                System.out.println("Mais um dia de foco!");
        }
    }
}
