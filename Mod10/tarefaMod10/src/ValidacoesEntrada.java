import java.util.Scanner;

public class ValidacoesEntrada {

    public static Double notaEntrada (Double notaProva){


        Scanner s = new Scanner(System.in);
        Double notaMedia = 0.0;

        for(int i=1; i<5; i++){
            System.out.println("Digite a nota da prova " + i);
            notaProva = s.nextDouble();
                while (notaProva < 0 || notaProva > 10) {
                    System.out.println("Número inválido! Digite a nota entre 0 e 10: ");
                    notaProva = s.nextDouble();
                }
            notaMedia = notaMedia + notaProva;
            }
        return notaMedia / 4;
    }

    public static String calculoAprovacao(Double notaMedia) {

        if (notaMedia >= 7 && notaMedia <= 10) {
            return "Você foi aprovado!!";
        } else if (notaMedia >= 5 && notaMedia < 7) {
            return "Você está de recuperação! ";
        } else if (notaMedia >= 0 && notaMedia < 5) {
            return "Voce foi reprovado :( ";
        } else {
            return "Algo deu errado!";
        }
    }
}
