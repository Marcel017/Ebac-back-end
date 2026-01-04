import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("═══════════════════════════════════════");
        System.out.println("   ABSTRACT FACTORY - FABRICA DE CARROS");
        System.out.println("═══════════════════════════════════════");
        System.out.println();
        System.out.println("Escolha a marca:");
        System.out.println("1 - Toyota");
        System.out.println("2 - Honda");
        System.out.print("Opcao: ");

        int opcao = scanner.nextInt();
        FabricaDeCarros fabrica;

        if (opcao == 1) {
            fabrica = new FabricaToyota();
        } else {
            fabrica = new FabricaHonda();
        }

        System.out.println();
        System.out.println("Fabrica selecionada: " + fabrica.getNome());
        System.out.println();

        Carro sedan = fabrica.criarSedan();
        Carro suv = fabrica.criarSUV();

        System.out.println("Carros produzidos:");
        sedan.exibirDetalhes();
        suv.exibirDetalhes();

        System.out.println();
        System.out.println("═══════════════════════════════════════");

        scanner.close();
    }
}
