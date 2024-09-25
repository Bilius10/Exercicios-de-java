import java.util.*;

public class trocoMercado {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<Double> valoresReal = new ArrayList<>(List.of(100.00, 50.00, 20.00, 10.00,
                5.00, 2.00, 1.00, 0.5, 0.25, 0.10, 0.05, 0.01));

        System.out.print("Digite o valor da compra: ");
        String valor = teclado.next();
        double valorCompra = Double.parseDouble(valor.replace(",", "."));

        System.out.print("Valor recebido: ");
        valor = teclado.next();
        double valorRecebido = Double.parseDouble(valor.replace(",", "."));

        double diferenca = valorRecebido - valorCompra;

        if(valorCompra == valorRecebido){
            System.out.println("Valor correto");

        }else if(valorCompra < valorRecebido){
            List<Double> trocos = calcularTroco(diferenca, valoresReal);
            System.out.println("------------------------------");
            System.out.printf("Troco: R$ %.2f%n", diferenca);
            printarTroco(trocos, valoresReal);

        }else{
            System.out.println("Compra negada");

        }

    }
    public static List<Double> calcularTroco(double diferenca, List<Double> list){
        int x = 0;
        List<Double> trocos = new ArrayList<>();
        while (diferenca > 0.01){
            if(diferenca - list.get(x) >= 0){
                diferenca -=  list.get(x);
                trocos.add(list.get(x));

            }else{
                x++;
            }
        }
        return trocos;
    }

    public static void printarTroco(List<Double> troco, List<Double> valoresReal){

        for (Double v : valoresReal) {
            if (troco.contains(v)){
                int i = Collections.frequency(troco, v);
                String tipo = (v > 1)? "Nota":"Moeda";
                System.out.println(i+" "+tipo+"(s) de R$"+v);
            }
        }
    }
}
