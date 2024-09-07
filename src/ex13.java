import java.util.Scanner;

public class ex13 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String senha = "Mcqueen";

        for(int x = 1; x <= 3; x++){

            String teste = teclado.nextLine();
            if(teste.equals(senha)){

                System.out.println("Acesso permitido");
                break;

            }else if(x == 3){

                System.out.println("Acesso negado");

            }
        
        }
        teclado.close();
    }
}
