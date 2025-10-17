import java.util.Scanner;
import java.util.ArrayList;
public class atividade6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Rio de Janeiro");
        lista.add("Belo Horizonte");
        lista.add("Salvador");

        lista.add("São Paulo");
        lista.add("Curitiba");
        lista.remove(4);
        lista.set(1, "Recife");

        if (lista.contains ("São Paulo")) {
            System.out.println("Esse nome existe na lista!");
        } else {
            System.out.println("Nome não existe na lista!");
            System.out.println(lista.get(3));
    }
    }
}
