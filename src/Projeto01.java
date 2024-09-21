import java.util.Scanner;

public class Projeto01 {
	public static void main(String[] args) throws Exception {
	        
	    Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = teclado.nextInt();
	
		if(idade >= 18 && idade <= 65){
			System.out.print("Obrigatorio o voto");
			
		}else if(idade >= 16 || idade >= 65 ){
			System.out.print("Pode votar, não é obrigatorio");
			
		}else{
			System.out.print("Não pode votar ");
			
		}
		
	        
    }

}
