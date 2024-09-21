import java.util.Scanner;

public class Projeto04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Numero 1:");
		double num1 = teclado.nextInt();
		
		System.out.print("Numero 2: ");
		double num2 = teclado.nextInt();
		
		System.out.println("+, -, *, /");
		String opcao = teclado.next();
		
		double resultado = 0;
		
		switch (opcao) {
		case "+": {
			resultado = num1+num2;
			break;
		}
		case "-": {
			resultado = num1-num2;
			break;
		}
		case "*": {
			resultado = num1*num2;
			break;
		}
		case "/": {
			resultado = num1/num2;
			break;
		}
		default:
			System.out.println("Não existe");
		}
		System.out.println(num1+" "+opcao+" "+num2+" = "+resultado);
	}
}
