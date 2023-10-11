package org.example;

public class Medico {

    private  String nome;

    private String especialidade;

    private int crm;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    /**
     *
     * Método para cadastro de novos médicos
     *
     * @param nome nome da pessoa a ser cadastrada
     * @param crm Conselho Regional de Medicina
     * @param especialidade especialidade do médico a ser cadastrado
     */

    public void cadastrarMedico(String nome, int crm, String especialidade){
        setNome(nome);
        setCrm(crm);
        setEspecialidade(especialidade);
        System.out.println();
        System.out.println("Médico cadastrado: " + this.nome + ", CRM: " + this.crm + ", Especialidade: " + this.especialidade);
        System.out.println("*******************************");
    }
}
