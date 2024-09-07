import java.util.Scanner;

public class ex8 {
    
    public static void main(String[] args) {
        
        System.out.println(" ");
        Scanner teclado = new Scanner(System.in);

        System.out.print("Numero 1:");
        int num1 = teclado.nextInt();
        System.out.print("Numero 2:");
        int num2 = teclado.nextInt();
        System.out.print("Numero 3:");
        int num3 = teclado.nextInt();

        if (num1 > num2 && num2 > num3){

            System.out.println("1: "+num1+" 2: "+num2+" 3: "+num3);

        } else if (num3 > num2 && num2 > num1){

            System.out.println("1: "+num3+" 2: "+num2+" 3: "+num1);
        
        }   else if (num2 > num3 && num3> num1){

            System.out.println("1: "+num2+" 2: "+num3+" 3: "+num1);

        }   else if (num2 > num1 && num1> num3){

            System.out.println("1: "+num2+" 2: "+num1+" 3: "+num3);

        }
        teclado.close();
    }
}
