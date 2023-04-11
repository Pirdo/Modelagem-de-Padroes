package com.factorymethod;

//cria a classe FabricaCaminhao implementando a interface FabricaTransporte
public class FabricaCaminhao implements FabricaTransporte{
    @Override
     //utiliza do polimorfismo para alterar o comportamento do metodo
    public Transporte criarTransporte() {
        return new Caminhao();
    }
}
