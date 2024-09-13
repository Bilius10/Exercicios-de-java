import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class ParesLista {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Integer> numero = new ArrayList<>();

        for(int x = 1; x <= 10; x++){

            System.out.println("Digite um numero: ");
            int num = teclado.nextInt();
            numero.add(num);

        }

        List recebido = pares(numero, n -> n % 2 ==0);
        System.out.println(recebido);

        );
    }

    public static <T> List<T> pares(List<T> list, Predicate<T> predicate){

        List<T> pares = new ArrayList<>();

        for (T e : list){

            if(predicate.test(e)){
                pares.add(e);
            }
        }

        return pares;
    }
}
