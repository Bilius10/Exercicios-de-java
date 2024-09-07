import java.util.Random;
import java.util.Scanner;

public class ex19 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();

        int pRobo = 0;
        int pUsuario = 0;

        String continuar = "s";
        while (!continuar.equals("n")) {

            System.out.println("0-Tesoura/1-Papel/2-Pedra");
            int escolhaJogador = teclado.nextInt();

            int escolhaRobo = gerador.nextInt(3);

            System.out.println("Robo: "+escolhaRobo);

            if(escolhaJogador == 0 && escolhaRobo == 0 || escolhaJogador == 1 && escolhaRobo == 1 || escolhaJogador == 2 && escolhaRobo == 2){

                System.err.println("Empate");

            }else if(escolhaJogador == 0 && escolhaRobo == 1 || escolhaJogador == 1 && escolhaRobo == 2 || escolhaJogador == 2 && escolhaRobo == 0){

                pRobo++;
                System.out.println("Jogador ganhou");

            }else if(escolhaJogador == 1 && escolhaRobo == 0 || escolhaJogador == 2 && escolhaRobo == 1 || escolhaJogador == 0 && escolhaRobo == 2){

                pUsuario++;
                System.out.println("Jogador ganhou");

            }

            System.out.println("Robo: "+pRobo+" Usuario: "+pUsuario);
            System.out.println("Continuar: s ou n");
            continuar = teclado.next();
        }
        teclado.close();
    }
}
