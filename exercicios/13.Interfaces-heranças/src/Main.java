public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoa1 = new PessoaFisica("Marcelo Gabriel", "123.456.789-10");
        PessoaJuridica empresa1 = new PessoaJuridica("K'rovo Design", "12.345.678/0001-99");

        System.out.println("--- Sistema de Cadastro ---");
        System.out.println(pessoa1.toString());
        System.out.println(empresa1.toString());
    }
}