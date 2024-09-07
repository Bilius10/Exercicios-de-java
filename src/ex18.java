import java.util.Random;
import java.util.Scanner;

public class ex18 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();

        int numUsuario = -1;
        int numRobo = gerador.nextInt(101);

        System.out.println("O numero é entre 0 e 100");

        while (numUsuario != numRobo) {
            numUsuario = teclado.nextInt();

            if(numUsuario > numRobo){
                System.out.println("O numero é menor");
            }else if(numUsuario < numRobo){
                System.out.println("O numero é maior");
            }

        }
        System.out.println("Parabens o numero é "+numRobo);
        teclado.close();
    }
}
