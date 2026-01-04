interface FabricaDeCarros {
    String getNome();

    Carro criarSedan();

    Carro criarSUV();
}

class FabricaToyota implements FabricaDeCarros {
    @Override
    public String getNome() {
        return "Toyota";
    }

    @Override
    public Carro criarSedan() {
        return new CarroImpl("Toyota", "Corolla", TipoCarro.SEDAN);
    }

    @Override
    public Carro criarSUV() {
        return new CarroImpl("Toyota", "RAV4", TipoCarro.SUV);
    }
}

class FabricaHonda implements FabricaDeCarros {
    @Override
    public String getNome() {
        return "Honda";
    }

    @Override
    public Carro criarSedan() {
        return new CarroImpl("Honda", "Civic", TipoCarro.SEDAN);
    }

    @Override
    public Carro criarSUV() {
        return new CarroImpl("Honda", "CR-V", TipoCarro.SUV);
    }
}
