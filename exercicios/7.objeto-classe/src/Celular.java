public class Celular {


    //String guarda palavras
    private String marca = "Samsung";

    //Int guarda números inteiros (da primeira vez que eu fiz tinha adicionado 100.00
    private int bateria = 100;

    //Boolean guarda verdadeiro/false
    private boolean ligado = false;


    //ação: ligar o celular
    public void ligar() {
        ligado = true; //Muda a chave interna pra verdadeiro
        System.out.println("O celular está ligando!");
    }
}
