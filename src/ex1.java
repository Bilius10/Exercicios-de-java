import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws Exception {
        System.out.println("");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero : ");
        int num = teclado.nextInt();

        if (num > 0){
            System.err.println("Numero é positivo");
        }else if (num < 0){
            System.out.println("Numero negativo");
        }else{
            System.out.println("Numero é 0 ");
        }
        teclado.close();
    }
}

