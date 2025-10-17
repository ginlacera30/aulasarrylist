import java.util.Scanner;
import java.util.ArrayList;
public class atividade9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Boolean> lista = new ArrayList<>();

        lista.add(true);
        lista.add(false);
        lista.add(true);

        lista.add(false);
        lista.remove(0);
        lista.set(1, true);

        if (lista.contains(false)) {
            System.out.println("Esse nome existe na lista!");
              } else {
            System.out.println("Nome não existe na lista!");
            System.out.println(lista.get(1));
        }

        }
}
