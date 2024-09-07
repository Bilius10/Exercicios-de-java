import java.util.Scanner;

public class ex2 {
    
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    System.out.print("Numero 1: ");
    double num1 = teclado.nextDouble();

    System.out.print("Numero 2: ");
    double num2 = teclado.nextDouble();

    System.out.println("Operação: (/) (*) (-) (+)");
    String operacao = teclado.next();

    if (operacao.equals("/")){

        System.out.println(num1 / num2);

    }else if (operacao.equals("*")){

        System.out.println(num1 * num2);

    }else if (operacao.equals("-")){

        System.out.println(num1 - num2);

    }else if (operacao.equals("+")){

        System.out.println(num1 + num2);

    }
    teclado.close();
    }
}
