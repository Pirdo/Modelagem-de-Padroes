package com.singleton;

public class Singleton {
    // Cria um atributo do tipo da instância, utilizando o volatile para garantir
    // que uma Thread aguarde a execução da classe que está sendo executada por uma
    // outra Thread
    private static volatile Singleton instance;

    // Atributos normais da classe
    private String data;

    // Construtor da classe
    private Singleton(String data) {
        this.data = data;
    }

    // Método para resgatar a instância atual
    public static Singleton getInstance(String data) {
        // Cria uma variável local para não termos problemas com dois registros na
        // memória, por conta do volatile
        Singleton result = instance;
        // Verifica se uma instância já existe para que as Threads não fiquem presas
        // aguardando
        if (result == null) {
            // Cria um bloco synchronized para garantir que o Multi Thread não execute o
            // mesmo código ao mesmo tempo
            synchronized (Singleton.class) {
                // Atribui o valor da instância já criada para o registro local
                result = instance;
                // Verifica se uma instância já existe
                if (result == null) {
                    // Se não existe instância, cria uma nova
                    instance = result = new Singleton(data);
                }
            }
        }
        // Retorna a instância
        return result;
    }
}
