package com.Pos.Diego;

public class Fresa extends Maquina{

    public Fresa(String nome, int temperatura, double pressao) {
        super(nome, temperatura, pressao);
    }

    public void fresar() {
        System.out.println(getNome() + " esta fresando superfície" + "\n");

    }

    @Override
    public void run(){
        ligar();
        fresar();
        desligar();
        System.out.println("\n");
    }

}
