import java.util.Scanner;

public class ex11 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int num = 0;
        int sum = 0;

        while (num >= 0) {
            num = teclado.nextInt();
            sum += num;
        }

        System.out.println(sum);

        teclado.close();
    }
    
}
