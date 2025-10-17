import java.util.Scanner;
import java.util.ArrayList;

public class atividade4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Boolean> lista = new ArrayList<>();

        lista.add(true);
        lista.add(false);
        lista.add(true);
        lista.remove(1);
        lista.set(0, false);


        for (Boolean i : lista) {
            System.out.println(i);
            leitor.close();
        }

    }}