import java.util.HashMap;
import java.util.Scanner;

public class agenda {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        HashMap<String, String> agenda = new HashMap<>();

        while (true){

            System.out.println("1-Add contato/ 2-Remove contato/ 3-Buscar");
            int opcao = teclado.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Nome: ");
                    String nome = teclado.next();
                    System.out.print("Telefone: ");
                    String telefone = teclado.next();
                    agenda = adcionarContato(agenda, nome, telefone);
                    break;
                case 2:
                    System.out.print("Nome: ");
                    nome = teclado.next();
                    agenda = removerContato(agenda, nome);
                    break;
                case 3:
                    System.out.print("Nome: ");
                    nome = teclado.next();
                    buscarContato(agenda, nome);
                    break;
                default:
                    System.out.println("Saindo");
                    break;
            }
        }
    }

    public static HashMap<String, String> adcionarContato(HashMap<String, String> hash, String nome, String telefone){
        hash.put(nome, telefone);
        return hash;
    }

    public static HashMap<String, String> removerContato(HashMap<String, String> hash, String nome){
        hash.remove(nome);
        return hash;
    }

    public static void buscarContato(HashMap<String, String> hash, String nome){
        System.out.println(hash.get(nome));
    }
}
