import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


public class ListaReversa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int x = 1; x <= 5; x++){
            System.out.print("Digite um numero: ");
            numeros.add(teclado.nextInt());
        }

        List inverso = inverterLista(numeros);
        System.out.println("Certa: "+numeros);
        System.out.println("Inverso: "+inverso);

    }
    
    public static List<Integer> inverterLista(List<Integer> numeros) {

        List<Integer> devolve = new ArrayList<>();

        for(int x = numeros.size()-1; x >= 0; x--){
            devolve.add(numeros.get(x));
        }
        return devolve;
        
    }
}
