import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParteDois {

    public static String generos(){



    Set<String> listaDeHomens = new HashSet<>();
    Set<String> listaDeMulheres = new HashSet<>();


    while (true){
        System.out.println("Digite um nome e genero(Ex: Marcelo-M) ou 'sair' para encerrar: ");
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();

        if (entrada.equalsIgnoreCase("sair")) {
            break;
        } else {
            String[] partes = entrada.split("-");
            if(partes.length ==2){
                String nome = partes[0];
                String genero = partes[1];

                if (genero.equalsIgnoreCase("F")){

                    listaDeMulheres.add(nome);
                } else {
                    listaDeHomens.add(nome);
                }
            }
        }
    }
    String listaDeGeneros = "lista de homens: " + listaDeHomens +  " lista de mulheres: " + listaDeMulheres;
      return listaDeGeneros;
    }
}