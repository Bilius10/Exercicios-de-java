import java.util.Scanner;

public class Projeto05 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Numero :");
		int num = teclado.nextInt();
		
		boolean isPrimo = true;	
		
		for(int x = 2; x < num; x++) {
			
			if(num % x == 0) {
				isPrimo = false;
				break;
			}
		}
		if(num <= 1) {
			isPrimo = false;
		}
		
		
		System.out.println(num+"  "+isPrimo);
	}
}
