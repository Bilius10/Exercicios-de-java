
import java.util.HashMap;
import java.util.Scanner;

public class ContagemCaractere {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = teclado.next();

        HashMap<Character, Integer> recebe = contarCarctere(palavra);

        for (HashMap.Entry<Character, Integer> entry : recebe.entrySet()) {
            System.out.println("Caractere '" + entry.getKey() + "' tem valor " + entry.getValue());
        }

    }

    public static HashMap<Character, Integer>contarCarctere(String palavra){
        HashMap<Character, Integer> contar = new HashMap<>();

        int x = 0;
        for (char p : palavra.toCharArray()){
            contar.put(p, x);
            x ++;
        }

        return contar;
    }
}
