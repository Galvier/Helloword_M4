package org.example;

/**
 * @author jonathan
 *
 * Método principal do programa
 *
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.cadastrarFuncionario("José", 12345678, "Secretario");

        Medico medico = new Medico();
        medico.cadastrarMedico("Silvio", 1234, "Endócrino");

        Cliente cliente = new Cliente();
        cliente.cadastrarCliente("Ana", "0098765432", "Rua 1", "MedSP");
    }
}