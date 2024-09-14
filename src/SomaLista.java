import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SomaLista {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Integer> numero1 = new ArrayList<>();
        List<Integer> numero2 = new ArrayList<>();

        while (true){
            System.out.println("Digite os numero que deseja somar");
            System.out.println(" ");
            System.out.print("Numero 1: ");
            numero1.add(teclado.nextInt());
            System.out.print("Numero 2: ");
            numero2.add(teclado.nextInt());
            System.out.println(" ");
            System.out.println("continuar? ");
            String continuar = teclado.next();

            if (continuar.equals("n")){
                break;
            }
        }

        List<Integer> numero3 = somaLista(numero1, numero2);
        System.out.println(numero3);
    }

    public static List<Integer> somaLista(List<Integer> list1, List<Integer> list2){

        List<Integer> soma = new ArrayList<>();

        for (int x = 0; x <= list1.size()-1; x++){
            soma.add(list1.get(x)+list2.get(x));

        }
        return soma;
    }
}
