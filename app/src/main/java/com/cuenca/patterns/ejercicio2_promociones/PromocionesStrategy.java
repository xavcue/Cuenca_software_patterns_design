package com.cuenca.patterns.ejercicio2_promociones;

interface Promocion {
    double aplicar(double precio);
}

class BlackFriday implements Promocion {
    @Override
    public double aplicar(double precio) {
        return precio * 0.50;
    }
}

class DosPorUno implements Promocion {
    @Override
    public double aplicar(double precio) {
        return precio / 2;
    }
}

class SinPromocion implements Promocion {
    @Override
    public double aplicar(double precio) {
        return precio;
    }
}

class Checkout {
    private Promocion promocion;

    public Checkout(Promocion promocion) {
        this.promocion = promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    public void calcular(double precio) {
        System.out.println("Precio final: " + promocion.aplicar(precio));
    }
}

public class PromocionesStrategy {
    public static void main(String[] args) {
        Checkout checkout = new Checkout(new SinPromocion());

        checkout.calcular(100);

        checkout.setPromocion(new BlackFriday());
        checkout.calcular(100);

        checkout.setPromocion(new DosPorUno());
        checkout.calcular(100);
    }
}