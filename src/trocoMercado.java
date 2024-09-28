import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<BigDecimal> valoresReal = List.of(
                new BigDecimal("100.00"), new BigDecimal("50.00"), new BigDecimal("20.00"),
                new BigDecimal("10.00"), new BigDecimal("5.00"), new BigDecimal("2.00"),
                new BigDecimal("1.00"), new BigDecimal("0.50"), new BigDecimal("0.25"),
                new BigDecimal("0.10"), new BigDecimal("0.05"), new BigDecimal("0.01"));

        System.out.print("Digite o valor da compra: ");
        BigDecimal valorCompra = teclado.nextBigDecimal();

        System.out.print("Valor recebido: ");
        BigDecimal valorRecebido = teclado.nextBigDecimal();

        BigDecimal diferenca = valorRecebido.subtract(valorCompra);

        if(valorCompra.equals(valorRecebido)){
            System.out.println("Valor correto");

        }else if(valorCompra.compareTo(valorRecebido) < 0){
            List<BigDecimal> trocos = calcularTroco(diferenca, valoresReal);
            System.out.println("------------------------------");
            System.out.println("TROCO R$"+diferenca);
            printarTroco(trocos, valoresReal);

        }else{
            System.out.println("Compra negada");

        }
    }

    public static List<BigDecimal> calcularTroco(BigDecimal diferenca, List<BigDecimal> list) {
        int x = 0;

        List<BigDecimal> trocos = new ArrayList<>();

        while (list.size() != x) {
            if (diferenca.subtract(list.get(x)).compareTo(BigDecimal.ZERO) >= 0) {
                diferenca = diferenca.subtract(list.get(x));
                trocos.add(list.get(x));
            } else {
                x++;
            }
        }
        return trocos;
    }

    public static void printarTroco(List<BigDecimal> troco, List<BigDecimal> valoresReal) {
        for (BigDecimal v : valoresReal) {
            if (troco.contains(v)) {
                int i = Collections.frequency(troco, v);
                String tipo = (v.compareTo(BigDecimal.ONE) > 0) ? "Nota" : "Moeda";
                System.out.println(i + " " + tipo + "(s) de R$" + v.setScale(2, RoundingMode.HALF_UP));
            }
        }
    }
}
