import java.util.Scanner;
import java.util.ArrayList;

public class atividade7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<>();

        lista.add(22.5);
        lista.add(30.50);
        lista.add(18.7);
        lista.add(26.3);
        lista.add(28.1);

        lista.remove(3);
        lista.set(2, 25.0);
        for (Double i : lista) {
            System.out.println(i);
        }
            leitor.close();
    }
}
