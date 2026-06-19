package com.cuenca.patterns.ejercicio8_graficos;

interface Grafico {
    void render();
}

class LibreriaAntigua {
    public void drawLine() {
        System.out.println("Dibujando linea");
    }

    public void drawCircle() {
        System.out.println("Dibujando circulo");
    }
}

class AdaptadorGrafico implements Grafico {
    private final LibreriaAntigua libreria;

    public AdaptadorGrafico(LibreriaAntigua libreria) {
        this.libreria = libreria;
    }
    @Override
    public void render() {
        libreria.drawLine();
        libreria.drawCircle();
    }
}

public class GraficosAdapter {
    public static void main(String[] args) {
        LibreriaAntigua libreriaAntigua = new LibreriaAntigua();
        Grafico grafico = new AdaptadorGrafico(libreriaAntigua);

        grafico.render();
    }
}