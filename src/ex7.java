import java.util.Scanner;

public class ex7 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("");

        System.out.print("Inicio: ");
        int inicio =  teclado.nextInt();

        System.out.print("Fim: ");
        int fim = teclado.nextInt();

        System.out.println("");

        for(int x = inicio; x <= fim; x++){

            if (x % 2 == 0){

                System.out.println("Par: "+ x);
            }else{

                System.out.println("Impar: "+ x);
            }
            System.out.println("");
        }
        teclado.close();
    }
}
