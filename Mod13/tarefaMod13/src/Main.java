public class Main {
    public static void main(String[] args) {

        PessoaFisica pessoa  = new PessoaFisica();
        pessoa.setNome("Joao");
        pessoa.setEndereco("R. bahia");
        pessoa.setCpf("1234");

        PessoaJuridica empresa = new PessoaJuridica();
        empresa.setNome("EBAC");
        empresa.setEndereco("R. Parana");
        empresa.setCnpj("78901239013889");

        System.out.println("Cliente: " + pessoa.getNome() + ", CPF numero: " + pessoa.getCpf() + ", endereço: " + pessoa.getEndereco());
        System.out.println(pessoa.getNome() + " é CEO da " + empresa.getNome() + ", CNPJ numero: " + empresa.getCnpj() + " que encontra-se na " + empresa.getEndereco());
    }
}