import java.util.ArrayList;
import java.util.Scanner;
public class atividade10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<>();

        lista.add(7.5);
        lista.add(8.0);
        lista.add(9.5);

        lista.add(6.0);
        lista.add(10.0);
        lista.remove(1);
        lista.set(1, 10.0);

        double soma = 0;
        for (double nota : lista) {
            soma += nota;
        }

        double media = soma / lista.size();

        System.out.println("Média dos valores: " + media);
        leitor.close();
    }
}
