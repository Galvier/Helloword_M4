import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double prova = null;
        Double notaMedia = ValidacoesEntrada.notaEntrada(prova);

        String aprovacao = ValidacoesEntrada.calculoAprovacao(notaMedia);
        System.out.println(aprovacao + "Nota: " + notaMedia);
    }
}