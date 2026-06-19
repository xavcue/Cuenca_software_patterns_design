package com.cuenca.patterns.ejercicio3_validacion_tributaria;

interface ValidadorFactura {
    void validarFactura(String cliente, double total);
}

class ServicioGobierno {
    public void validarConFormatoGobierno(String ruc, String valor) {
        System.out.println("Validando con servicio del gobierno");
        System.out.println("RUC: " + ruc);
        System.out.println("Valor: " + valor);
    }
}

class AdaptadorGobierno implements ValidadorFactura {
    private final ServicioGobierno servicio;

    public AdaptadorGobierno(ServicioGobierno servicio) {
        this.servicio = servicio;
    }

    @Override
    public void validarFactura(String cliente, double total) {
        String ruc = "0102030405001";
        String valor = String.valueOf(total);

        servicio.validarConFormatoGobierno(ruc, valor);
    }
}

public class ValidacionTributariaAdapter {
    public static void main(String[] args) {
        ServicioGobierno servicioGobierno = new ServicioGobierno();
        ValidadorFactura validador = new AdaptadorGobierno(servicioGobierno);

        validador.validarFactura("Cliente Demo", 250.75);
    }
}