package com.factorymethod;

public class Logistica {
    public static void main(String[] args) {
        FabricaTransporte fabricaCaminhao = new FabricaCaminhao();
        FabricaTransporte fabricaNavio = new FabricaNavio();

        Transporte caminhao = fabricaCaminhao.criarTransporte();
        caminhao.entregar();

        Transporte navio = fabricaNavio.criarTransporte();
        navio.entregar();
    }
}
