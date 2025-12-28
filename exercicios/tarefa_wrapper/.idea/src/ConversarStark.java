import java.util.Scanner;

public class ConversarStark {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("==== SISTEMA DE CONVERSÃO STARK ====");
        System.out.println("Digite um número inteiro:");

        int valorPrimitivo = leitor.nextInt();

        System.out.println("Valor Primitivo (Tony): " + valorPrimitivo);

        Integer valorWrapper = valorPrimitivo;

        System.out.println("Valor Wrapper (Homem de Ferro): " + valorWrapper);

        double valorConvertido = valorWrapper.doubleValue();

        System.out.println("Valor após Casting (Double): " + valorConvertido);

        leitor.close();
    }
}
