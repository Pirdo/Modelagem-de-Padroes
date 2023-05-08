package com.prototype.controller;

import com.prototype.model.Automovel;

/**
 * Hello world!
 *
 */
public class Loja 
{
    public static void main( String[] args ) throws CloneNotSupportedException
    {
        Automovel a = new Automovel();
        a.setMarca("Nissan");
        a.setModelo("GTR R35");
        a.setTipo("Esportivo");
        System.out.println("Marca A: " + a.getMarca() + " Modelo A: " +  a.getModelo() + " Tipo A: " + a.getTipo());
        
        Automovel b = a.clone();
        System.out.println("Marca: " + b.getMarca());

        b.setModelo("GTR R34");
        System.out.println("Marca A: " + a.getMarca() + " Modelo A: " +  a.getModelo() + " Tipo A: " + a.getTipo());
        System.out.println("Marca B: " + b.getMarca() + " Modelo B: " + b.getModelo() + " Tipo B: " + b.getTipo());
    }
}
