import java.util.ArrayList;
import java.util.Scanner;
public class atividade5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        lista.add("A");
        lista.add("B");
        lista.add("C");

        lista.add("D");
        lista.add("E");
        lista.remove(2);
        lista.set(0, "Z");
        System.out.println(lista.get(3));
        leitor.close();
    }
}
