import java.util.Scanner;

public class ex12 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int par = 0;
        int impar = 0;

        for (int x = 1; x <= 10; x++){

            int num = teclado.nextInt();

            if (num % 2 == 0){

                par += 1;

            }else{

                impar += 1;
            }
           
        }

        System.out.println("Pares: "+par+" Impar: "+impar);
        teclado.close();
    }
}
