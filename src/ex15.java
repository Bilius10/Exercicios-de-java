import java.util.Scanner;

public class ex15 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String operacao = "";

        while (!operacao.equals("sair")) {

            System.out.println("Operação: (/) (*) (-) (+) (sair)");
            operacao = teclado.next();
            
            if(!operacao.equals("sair")){

                System.out.print("Numero 1: ");
                double num1 = teclado.nextDouble();
            
                System.out.print("Numero 2: ");
                double num2 = teclado.nextDouble();

                switch (operacao) {

                    case "/":
                        if(num2 != 0){
                            System.out.println(num1 / num2);
                            break;
                        }

                    case "*":
                        System.out.println(num1 * num2);
                        break;
                    
                    case "+":
                        System.out.println(num1 + num2);
                        break;
                    
                    case "-":
                        System.out.println(num1 - num2);
                        break;

                    default:
                        System.out.println("Operação invalida");
                        break;
                }
            }
        }
        
        teclado.close();
    }
}
