package org.example;

public class Funcionario {
    private String nome;

    private int funcional;

    private String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFuncional() {
        return funcional;
    }

    public void setFuncional(int funcional) {
        this.funcional = funcional;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     *
     * Método para cadastro de novos funcionários
     *
     * @param nome nome da pessoa a ser cadastrada
     * @param funcional numero do funcionario na empresa.
     * @param cargo cargo exercido pela pessoa
     *
     */

    public void cadastrarFuncionario(String nome, int funcional, String cargo){
        setNome(nome);
        setFuncional(funcional);
        setCargo(cargo);
        System.out.println();
        System.out.println("Funcionário cadastrado: " + this.nome + ", CRM: " + this.funcional + ", Especialidade: " + this.cargo);
        System.out.println("*******************************");
    }
}
