import java.util.Scanner;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Kaio Jorge");
        nomes.add("Hulk");


      //  for (String i : nomes){
        //    System.out.println(i);
      //  }
       for(int i = 0; i < nomes.size(); i++){
       System.out.println("Posição" + i + ": " + nomes.get(i));
            //System.out.println(nomes.get(i));
        //if (nomes.contains("Hulk")) {
            //  nomes.set(1,"Natalia");
            //  nomes.remove("Pedro");
          //  System.out.println("Esse nome existe na lista!");
     //   } else {
            //System.out.println("Nome não existe na lista!");
            //System.out.println(nomes.get(0));
        }}}
    //}
