package com.factorymethod;

//cria a classe Logistica para executar o programa
public class Logistica {
    public static void main(String[] args) {
        //cria um novo objeto do tipo FabricaCaminhao
        FabricaTransporte fabricaCaminhao = new FabricaCaminhao();

        //cria um novo objeto do tipo FabricaNavio
        FabricaTransporte fabricaNavio = new FabricaNavio();

        //cria um Transporte caminhao atravez da fabricaCaminhao
        Transporte caminhao = fabricaCaminhao.criarTransporte();
        //executa o metodo entregar para definir o transporte da entrega
        caminhao.entregar();

        //cria um Transporte navio atravez da fabricaNavio
        Transporte navio = fabricaNavio.criarTransporte();
        //executa o metodo entregar para definir o transporte da entrega
        navio.entregar();
    }
}
