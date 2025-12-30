import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class TarefaColecoesParte2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== SEPARADOR DE GRUPOS (M/F) ===");
        System.out.println("Digite nome e sexo separados por traço e vírgula.");

        String entrada = leitor.nextLine();
        String[] pessoasBrutas = entrada.split(",");

        List<String> listaMasculina = new ArrayList<>();
        List<String> listaFeminina = new ArrayList<>();

        for (String pessoa : pessoasBrutas) {
            String[] dados = pessoa.split("-");

            if (dados.length == 2) {
                String nome = dados[0].trim();
                String sexo = dados[1].trim();

                if (sexo.equalsIgnoreCase("M")) {
                    listaMasculina.add(nome);
                } else if (sexo.equalsIgnoreCase("F")) {
                    listaFeminina.add(nome);
                } else {
                    System.out.println("Gênero desconhecido para: " + nome);
                }
            }
        }

        Collections.sort(listaMasculina);
        Collections.sort(listaFeminina);

        System.out.println("\n--- GRUPO MASCULINO ---");
        System.out.println(listaMasculina);

        System.out.println("\n--- GRUPO FEMININO ---");
        System.out.println(listaFeminina);

        leitor.close();
    }
}