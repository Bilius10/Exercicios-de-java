import java.util.Scanner;

public class ex5 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = teclado.nextInt();

        if (num >= 80){

            System.out.println("A");

        }else if (num >= 60){

            System.out.println("B");

        }else if (num >= 40){

            System.out.println("C");

        }else if(num >= 20){

            System.out.println("D");

        }else if(num >= 10){

            System.out.println("E");

        }else if(num >= 0){

            System.out.println("F");

        }
        teclado.close();
    }
}
