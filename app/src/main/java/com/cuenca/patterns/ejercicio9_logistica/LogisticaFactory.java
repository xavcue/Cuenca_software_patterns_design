package com.cuenca.patterns.ejercicio9_logistica;

interface Transporte {
    void entregar();
}

class TransporteTerrestre implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega por transporte terrestre");
    }
}

class TransporteMaritimo implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega por transporte maritimo");
    }
}

class TransporteAereo implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega por transporte aereo");
    }
}

abstract class PlanificadorLogistica {
    protected abstract Transporte crearTransporte();

    public void planificarEnvio() {
        Transporte transporte = crearTransporte();
        System.out.println("Planificando envio");
        transporte.entregar();
    }
}

class LogisticaTerrestre extends PlanificadorLogistica {
    @Override
    protected Transporte crearTransporte() {
        return new TransporteTerrestre();
    }
}

class LogisticaMaritima extends PlanificadorLogistica {
    @Override
    protected Transporte crearTransporte() {
        return new TransporteMaritimo();
    }
}

class LogisticaAerea extends PlanificadorLogistica {
    @Override
    protected Transporte crearTransporte() {
        return new TransporteAereo();
    }
}

public class LogisticaFactory {
    public static void main(String[] args) {
        PlanificadorLogistica terrestre = new LogisticaTerrestre();
        terrestre.planificarEnvio();

        PlanificadorLogistica maritima = new LogisticaMaritima();
        maritima.planificarEnvio();

        PlanificadorLogistica aerea = new LogisticaAerea();
        aerea.planificarEnvio();
    }
}