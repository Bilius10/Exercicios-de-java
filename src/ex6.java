import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("1-Triangulo 2-Circulo 3-Retangulo");

        int posicao =  teclado.nextInt();
        double base;
        double altura;
        
        System.out.println("");

        switch (posicao) {
            case 1:
                System.out.println("Triangulo");

                System.out.println("");

                System.out.print("Valor da base: ");
                base = teclado.nextDouble();

                System.out.print("Valor da altura: ");
                altura = teclado.nextDouble();

                System.out.println("");

                System.out.println((base * altura)/2);

                break;
            
            case 2:
                System.out.println("Circulo");

                System.out.println("");

                System.out.print("Valor do raio: ");
                double raio = teclado.nextDouble();

                System.out.println("");

                System.out.println(Math.PI * Math.pow(raio, 2));

                break;

            case 3:
                System.out.println("Retangulo");

                System.out.println("");

                System.out.print("Valor da base: ");
                base = teclado.nextDouble();

                System.out.print("Valor da altura: ");
                altura = teclado.nextDouble();

                System.out.println("");

                System.out.println(base * altura);
                break;

            default:
                System.out.println("Não existe");
                break;
        }
        teclado.close();
    }
    
    
}
