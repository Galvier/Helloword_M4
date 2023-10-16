import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaNum = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = entradaNum.nextInt();
//        Double num2 = Double.valueOf(num);
        Double num2 = (double) num;

        System.out.println("Numero convertido: " + num2);
    }
}