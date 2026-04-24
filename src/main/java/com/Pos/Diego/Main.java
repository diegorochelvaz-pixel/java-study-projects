package com.Pos.Diego;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        //CHAMADA DE CLASSE
        Tornocnc t1 = new Tornocnc("Torno CNC",65,200);
        Fresa f1 = new Fresa("Fresa Universal",50,200);
        Compressor c1 = new Compressor("Compressor", 80, 250);

        //POOL DE THREADS
        ExecutorService pool = Executors.newFixedThreadPool(3);

        //CHAMADA DE THREAD
        pool.execute(t1);
        pool.execute(f1);
        pool.execute(c1);

        pool.shutdown();
        }
    }
