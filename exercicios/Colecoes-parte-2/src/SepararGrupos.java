import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SepararGrupos {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        System.out.println("=== BALADA DO MARCELO ===");
        while (true) {
            System.out.println("Digite o nome da pessoa(ou 'sair' para encerrar):");
            String nome = s.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite o sexo (M/F):");
            String sexo = s.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                grupoMasculino.add(nome);
                System.out.println("Adicionado ao grupo Masculino!");
            } else if (sexo.equalsIgnoreCase("F")) {
                grupoFeminino.add(nome);
                System.out.println("Adcionado ao grupo Feminino!");
            } else {
                System.out.println("Sexo inválido! Não entrou em nenhum grupo.");
            }

            System.out.println("-----------------------------------");
        }

        System.out.println("\n=== RESULTADO DOS GRUPOS ===");

        System.out.println("HOMENS:");
        System.out.println(grupoMasculino);
        System.out.println("MULHERES:");
        System.out.println(grupoFeminino);

        s.close();
    }
}