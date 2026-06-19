package com.cuenca.patterns.ejercicio5_documentos;

interface Documento {
    void configurar();
    void abrir();
}

class Carta implements Documento {
    @Override
    public void configurar() {
        System.out.println("Configurando carta");
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo carta");
    }
}

class Factura implements Documento {
    @Override
    public void configurar() {
        System.out.println("Configurando factura");
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo factura");
    }
}

class Curriculum implements Documento {
    @Override
    public void configurar() {
        System.out.println("Configurando curriculum");
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo curriculum");
    }
}

abstract class CreadorDocumento {
    protected abstract Documento crearDocumento();

    public void crearConfigurarYAbrir() {
        Documento documento = crearDocumento();
        documento.configurar();
        documento.abrir();
    }
}

class CreadorCarta extends CreadorDocumento {
    @Override
    protected Documento crearDocumento() {
        return new Carta();
    }
}

class CreadorFactura extends CreadorDocumento {
    @Override
    protected Documento crearDocumento() {
        return new Factura();
    }
}

class CreadorCurriculum extends CreadorDocumento {
    @Override
    protected Documento crearDocumento() {
        return new Curriculum();
    }
}

public class DocumentosFactory {
    public static void main(String[] args) {
        CreadorDocumento carta = new CreadorCarta();
        carta.crearConfigurarYAbrir();

        CreadorDocumento factura = new CreadorFactura();
        factura.crearConfigurarYAbrir();

        CreadorDocumento curriculum = new CreadorCurriculum();
        curriculum.crearConfigurarYAbrir();
    }
}