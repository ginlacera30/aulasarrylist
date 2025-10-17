import java.util.Scanner;
import java.util.ArrayList;
public class atividade2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
                ArrayList<Integer> idades = new ArrayList<>();
        idades.add(18);
        idades.add(25);
        idades.add(30);
        idades.add(40);
        idades.add(22);

        idades.remove(1);
        idades.set(1,99);

           System.out.println(idades.size());
     leitor.close();   }
    }

