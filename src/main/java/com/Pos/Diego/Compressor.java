package com.Pos.Diego;

public class Compressor extends Maquina{
    public Compressor(String nome, int temperatura, double pressao) {
        super(nome, temperatura, pressao);
    }

    public void comprimirAr(){
        System.out.println(getNome() + " começou a compressão de ar" + "\n");
    }

    public void run(){
        ligar();
        comprimirAr();
        desligar();
        System.out.println("\n");
    }

}
