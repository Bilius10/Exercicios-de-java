import java.util.Random;
import java.util.Scanner;

public class ex20 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("Escolha par ou impar");
        String opcao = teclado.nextLine();
        
        if(opcao.equals("par")){

            String usuario = "par";
            String robo = "impar";

        }else{

            String usuario = "impar";
            String robo = "par";

        }

        System.out.println("Digite um numero: ");
        int numUsuario = teclado.nextInt();
        int numRobo = gerador.nextInt(100);
        System.out.println(numRobo);

        if((numRobo + numUsuario) % 2 == 0){

            System.out.println("O par ganhou");

        }else{

            System.out.println("Impar ganhou");
        }
        teclado.close();
    }
}
