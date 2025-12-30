import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TarefaColecoes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== LISTA DE PRESENÇA ===");
        System.out.println("=== Digite os nomes separados por virgula");

        String resposta = leitor.nextLine();
        String[] vetoresNomes = resposta.split(",");

        List<String> listaNomes = new ArrayList<>();

        for (String nome : vetoresNomes) {
            listaNomes.add(nome.trim());
        }

        System.out.println("Lista bagunçada: " + listaNomes);
        Collections.sort(listaNomes);

        System.out.println("Lista ordenada (A-Z): " + listaNomes);

        System.out.println("--- RELATORIO FINAL ---");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        leitor.close();
    }
}