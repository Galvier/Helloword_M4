package org.example;

public class Cliente {

    private String nome;

    private String endereço;

    private String convenio;

    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     *
     * Método para cadastro de novos clientes
     *
     * @param nome nome da pessoa a ser cadastrada
     * @param cpf numero do CADASTRO DE PESSOA FÍSICA.
     * @param endereço endereço do cliente a ser cadastrado
     * @param convenio convenio médico usado pelo cliente
     */

    public void cadastrarCliente (String nome, String cpf, String endereço, String convenio){
        setNome(nome);
        setCpf(cpf);
        setEndereço(endereço);
        setConvenio(convenio);

        System.out.println();
        System.out.println("Cliente cadastrado: " + this.nome + ", CPF: " + this.cpf + ", Endereço: " + this.endereço + ", Convênio: " + this.convenio);
        System.out.println("*******************************");
    }


}
