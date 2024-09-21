import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Projeto06 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		List<String> filmes = new ArrayList<>();
		List<String> compras = new ArrayList<>();
		
		int escolha = 0;
		int escolhaLista;
		
		while (escolha != 4) {
			System.out.println("1-Visualizar 2-Incluir 3-Excluir 4-Sair");
			escolha = teclado.nextInt();
			
			switch (escolha) {
			case 1:
				System.out.println("1-Filme 2-Compra");
				escolhaLista = teclado.nextInt();
				
				if(escolhaLista == 1) {
					filmes.forEach(item -> System.out.println(item));
				}else {
					compras.forEach(item -> System.out.println(item));
				}
				
				break;
			case 2:
				System.out.println("1-Filme 2-Compra");
				escolhaLista = teclado.nextInt();
				
				System.out.print("INSIRA: ");
				String valor = teclado.next();
				if(escolhaLista == 1) {
					filmes.add(valor);
				}else {
					compras.add(valor);
				}
				
				break;
			case 3:
				System.out.println("1-Filme 2-Compra");
				escolhaLista = teclado.nextInt();
				
				System.out.print("INSIRA: ");
				valor = teclado.next();
				if(escolhaLista == 1) {
					filmes.remove(valor);
				}else {
					compras.remove(valor);
				}
				
				break;
			default:
				System.out.println("Saindo");
				break;
			}
			
		}
		
	}

}
