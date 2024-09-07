public class ternarios {
    
    public static void main(String[] args) {
        
        //Só posso doar se tiver pelo menos 500 reais
        double salario = 400;
        String resposta = (salario >= 500)? "Pode fazer a doação" : "Não pode fazer a doação";
        System.out.println(resposta);

        //par ou impar
        int num = 4;
        resposta = (num % 2 == 0)? "Par" : "Impar";
        System.out.println(resposta);

        //menor ou maior que 18
        int idade = 17;
        resposta = (idade >= 18)? "Maior de idade":"Menor de idade";
        System.out.println(resposta);

        //maior numero entre 2
        int num1 = 4;
        int num2 = 2;
        resposta = (num1 > num2)? (num1+" Maior que "+num2) : (num2+" MAior que "+num1);
        System.out.println(resposta);

        //nota escolar
        double nota1 = 4.5;
        double nota2 = 7.4;
        double nota3 = 10;
        double nota4 = 8.5;

        resposta = ((nota1+nota2+nota3+nota4)/4 >= 7)? "Passou":"Não passou";
        System.out.println(resposta);

        //temperatura frio ou quente
        int temp = 40;
        resposta = (temp > 30)? "Esta quente":"Não esta quente";
        System.out.println(resposta);
    }
}
