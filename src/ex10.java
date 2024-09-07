import java.util.Scanner;

public class ex10 {
    
    public static void main(String[] args) {
        
        Scanner teclado =  new Scanner(System.in);

        System.out.println("");
        System.err.print("Digite sua quantia em real: ");
        double real = teclado.nextDouble();

        System.out.println("");

        System.out.print("1-Dolar 2-Euro 3-Libra: ");
        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(real*0.2);
                break;
            case 2:
                System.out.println(real*0.18);
                break;
            case 3:
                System.out.println(real*0.16);
                break;
        
            default:
                System.out.println("Não Existe");
                break;
        }
        teclado.close();
    }
}
