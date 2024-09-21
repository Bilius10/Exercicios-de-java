public class Projeto02 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			String resposta = (i % 2 == 0)? "Par":"Impar";
			System.out.println(i+"--"+resposta);
		}
	}
}
