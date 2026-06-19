package com.cuenca.patterns.ejercicio7_metricas;

class RegistroMetricas {
    private static final RegistroMetricas instancia = new RegistroMetricas();

    private int contador = 0;

    private RegistroMetricas() {
        System.out.println("Registro central de metricas creado");
    }

    public static RegistroMetricas getInstancia() {
        return instancia;
    }

    public void aumentarContador() {
        contador++;
    }

    public void mostrarMetricas() {
        System.out.println("Contador: " + contador);
    }
}

public class MetricasSingleton {
    public static void main(String[] args) {
        RegistroMetricas metricas1 = RegistroMetricas.getInstancia();
        RegistroMetricas metricas2 = RegistroMetricas.getInstancia();

        metricas1.aumentarContador();
        metricas2.aumentarContador();

        metricas1.mostrarMetricas();

        System.out.println(metricas1 == metricas2);
    }
}