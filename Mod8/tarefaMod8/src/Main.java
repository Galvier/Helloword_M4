public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.nome = "Juliano";


        double notaProva1 = Math.random() * 101;
        double notaProva2 = aluno.recebeNota(8);
        double notaProva3= aluno.recebeNota(10);
        double notaProva4 = aluno.recebeNota(10);


        System.out.println("Nota da prova 1:" + notaProva1);
        System.out.println("Nota da prova 2:" + notaProva2);
        System.out.println("Nota da prova 3:" + notaProva3);
        System.out.println("Nota da prova 4:" + notaProva4);

        double notaMedia;
        notaMedia = (notaProva1 + notaProva2 + notaProva3 + notaProva4) / 4;

        System.out.println();
        System.out.println("Nota Média:" + notaMedia);
    }
}