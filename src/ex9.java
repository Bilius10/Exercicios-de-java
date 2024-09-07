import java.util.Scanner;

public class ex9 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("");
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();

        if (idade <= 12){

            System.out.println("Criança");

        }else if (idade <= 17){

            System.out.println("Adolescente");

        }else if (idade <= 64){

            System.out.println("Adulto");

        }else{
            System.out.println("Idoso");
        }
        teclado.close();
    }
}
