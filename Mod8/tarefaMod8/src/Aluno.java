public class Aluno {

    public String nome;

    public int nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public  void setNota(int nota) {
        this.nota = nota;
    }

    public int recebeNota(int nota){
        setNota(nota);
        return nota;
    }
}
