import java.util.Scanner;
import java.util.ArrayList;
public class atividade3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(19.99);
        lista.add(35.50);
        lista.add(12.00);
        lista.add(49.90);
        lista.add(27.80);

        lista.remove(0);
        lista.add(100.00);
        lista.set(2, 100.00);


        System.out.println(lista.get(3));
        leitor.close();
        }
    }