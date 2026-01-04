enum TipoCarro {
    SEDAN("Sedan"),
    SUV("SUV");

    private final String nome;

    TipoCarro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

interface Carro {
    String getMarca();

    String getModelo();

    TipoCarro getTipo();

    void exibirDetalhes();
}

class CarroImpl implements Carro {
    private final String marca;
    private final String modelo;
    private final TipoCarro tipo;

    public CarroImpl(String marca, String modelo, TipoCarro tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public TipoCarro getTipo() {
        return tipo;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("  " + marca + " " + modelo + " (" + tipo.getNome() + ")");
    }
}
