import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MediaAluno {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Integer> notas = new ArrayList<>();

        int num;


        for (int x = 1; x <=5; x++){

            System.out.print("Digite um numero "+x+": ");
            num = teclado.nextInt();
            notas.add(num);

        }

        double media = calcularMedia(notas);
        System.out.println(media);
    }
    public static double calcularMedia(List<Integer> list){
        int soma = 0;

        for (int e : list){
            soma += e;
        }
        return  (double) soma / 5;
    }
}
