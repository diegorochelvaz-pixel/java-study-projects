package com.Pos.Diego;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Maquina implements Equipamento, Runnable {
    private String nome;
    private int temperatura;
    private double pressao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public double getPressao() {
        return pressao;
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
    }

    public Maquina(String nome, int temperatura, double pressao) {
        this.nome = nome;
        this.temperatura = temperatura;
        this.pressao = pressao;
    }

    public void ligar() {
        System.out.println(nome + " foi ligada.");
    }

    public void desligar() {
        System.out.println(nome + " foi desligado(a)");
    }

    public void parametros(int temperatura, double pressao) {
    }

    @Override
    public String toString() {
        return "Parâmetros da Máquina:" +
                "nome='" + nome + '\'' +
                ", temperatura=" + temperatura +
                ", pressao=" + pressao;
    }

    @Override
    public void run() {
        Random random = new Random();

        try {
            Thread.sleep(random.nextInt(5000));
        } catch (InterruptedException e) {
            System.out.println("Thread interrompida");

        }

    }
}