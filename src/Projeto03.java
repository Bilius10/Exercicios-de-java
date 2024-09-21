
public class Projeto03 {
	
	public static void main(String[] args) {
		
		int numero = 1;
		int soma = 0;
		
		while (numero <= 100) {
			soma += (numero % 2 != 0)? numero : 0;
			numero++;
		}
		System.out.println(soma);
	}
	
}
