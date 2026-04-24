package com.Pos.Diego;

public class Tornocnc extends Maquina{
    public Tornocnc(String nome, int temperatura, double pressao) {
        super(nome, temperatura, pressao);
    }

    public void usinar(){
        System.out.println(getNome() + " está usinando um eixo.");

    }

    @Override
    public void parametros(int temperatura, double pressao){
        System.out.println("Temperatura: " + temperatura + "\n" + "Pressão: " + pressao );
    }

    @Override
    public void run(){
        ligar();
        usinar();
        desligar();
        System.out.println("\n");

    }

}
