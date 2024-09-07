import java.util.Scanner;

public class ex16 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o numero de termos exibido: ");
        int vezes = teclado.nextInt();
        int termo1 = 0;
        int termo2 = 1;
        
        for(int x = 0; x <= vezes; x++){

            System.out.print(termo1 + "+" + termo2 + "=");
            int soma = termo1 + termo2;
            System.out.println(soma);
            termo1 = termo2;
            termo2 = soma;
        }
        teclado.close();
    }
}
