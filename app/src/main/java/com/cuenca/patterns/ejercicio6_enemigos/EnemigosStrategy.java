package com.cuenca.patterns.ejercicio6_enemigos;

interface Comportamiento {
    void actuar();
}

class Agresivo implements Comportamiento {
    @Override
    public void actuar() {
        System.out.println("El enemigo ataca");
    }
}

class Defensivo implements Comportamiento {
    @Override
    public void actuar() {
        System.out.println("El enemigo se defiende");
    }
}

class Aleatorio implements Comportamiento {
    @Override
    public void actuar() {
        System.out.println("El enemigo actua de forma aleatoria");
    }
}

class Enemigo {
    private Comportamiento comportamiento;

    public Enemigo(Comportamiento comportamiento) {
        this.comportamiento = comportamiento;
    }

    public void setComportamiento(Comportamiento comportamiento) {
        this.comportamiento = comportamiento;
    }

    public void actuar() {
        comportamiento.actuar();
    }
}

public class EnemigosStrategy {
    public static void main(String[] args) {
        Enemigo enemigo = new Enemigo(new Agresivo());

        enemigo.actuar();

        enemigo.setComportamiento(new Defensivo());
        enemigo.actuar();

        enemigo.setComportamiento(new Aleatorio());
        enemigo.actuar();
    }
}