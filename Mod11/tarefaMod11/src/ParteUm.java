import java.util.*;
import java.util.regex.Pattern;

public class ParteUm {

    public static String ListaNomes(){

        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separando-os por virgula:");
        String entrada = s.nextLine();

        Set<String> lista = new HashSet<>(Arrays.asList(entrada.split(",")));
        List<String> nomesOrdenados = new ArrayList<>(lista);
        Collections.sort(nomesOrdenados);

        return lista.toString();

    }
}
