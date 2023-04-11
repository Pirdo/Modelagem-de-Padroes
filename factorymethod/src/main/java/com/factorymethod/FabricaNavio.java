package com.factorymethod;

//cria a classe FabricaNavio implementando a interface FabricaTransporte
public class FabricaNavio implements FabricaTransporte{
    @Override
     //utiliza do polimorfismo para alterar o comportamento do metodo
    public Transporte criarTransporte() {
        return new Navio();
    }
}
