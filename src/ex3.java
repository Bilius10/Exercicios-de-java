import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um ano");
        int ano = teclado.nextInt();

        if((ano % 4 == 0 || ano % 400 == 0) && ano % 100 != 0){

            System.out.println(ano + " é Bissexto");

        }else{

            System.out.println(ano + " não é Bissexto");

        }
        teclado.close();
    }
}
