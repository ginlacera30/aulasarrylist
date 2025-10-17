import java.util.ArrayList;
import java.util.Scanner;
public class atividade8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(7);
        lista.add(13);
        lista.add(42);
        lista.add(99);

        lista.add(88);
        lista.add(11);
        lista.remove(1);
        lista.set(0,1000);
        System.out.println(lista.size());

        leitor.close();
    }
}
