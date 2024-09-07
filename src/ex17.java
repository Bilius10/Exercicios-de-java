import java.util.Scanner;

public class ex17 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 2) {
            
            System.out.println("1-escolher numero/2-Sair");
            opcao = teclado.nextInt();

            if (opcao == 1) {

                System.out.print("Digite um numero: ");
                int num = teclado.nextInt();

                for(int x = 0; x <=10; x++){
                    System.out.print(num + "x" +x+ "=");
                    System.out.println(num * x);
                }

            }

        }
        teclado.close();

    }
}
