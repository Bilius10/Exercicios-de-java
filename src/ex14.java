import java.util.Scanner;

public class ex14 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int inicio = teclado.nextInt();
        int fim = teclado.nextInt();
        
        for(int x = inicio; x <= fim; x++){

            boolean primo = true;

            for(double y = 2; y < x; y++){

                if(x % y == 0){
                    primo = false;
                }

            }
            
            if(primo){
                System.out.println(x+" é primo");
            }

        }

    } 
}

