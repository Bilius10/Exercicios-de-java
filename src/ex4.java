import java.util.Scanner;

public class ex4 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = teclado.nextDouble();

        System.out.print("Altura: ");
        double altura = teclado.nextDouble();

        
        double imc = (peso)/Math.pow(altura, 2);

        if (imc < 18.5){

            System.out.println("Bixo ta magrelo");

        }else if (imc < 25){

            System.out.println("Ta lá fi");

        }else if (imc < 29.9){

            System.out.println("Bixo ta engordando");

        }else if (imc > 30){

            System.out.println("Ai ta foda a situação");

        }
        teclado.close();
    }
}
