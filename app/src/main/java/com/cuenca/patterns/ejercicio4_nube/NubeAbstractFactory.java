package com.cuenca.patterns.ejercicio4_nube;

interface Almacenamiento {
    void guardar();
}

interface ColaMensajes {
    void enviar();
}

interface BaseDatos {
    void conectar();
}

class AwsAlmacenamiento implements Almacenamiento {
    @Override
    public void guardar() {
        System.out.println("Guardando en AWS S3");
    }
}

class AwsCola implements ColaMensajes {
    @Override
    public void enviar() {
        System.out.println("Enviando mensaje por AWS SQS");
    }
}

class AwsBaseDatos implements BaseDatos {
    @Override
    public void conectar() {
        System.out.println("Conectando a AWS RDS");
    }
}

class AzureAlmacenamiento implements Almacenamiento {
    @Override
    public void guardar() {
        System.out.println("Guardando en Azure Blob");
    }
}

class AzureCola implements ColaMensajes {
    @Override
    public void enviar() {
        System.out.println("Enviando mensaje por Azure Queue");
    }
}

class AzureBaseDatos implements BaseDatos {
    @Override
    public void conectar() {
        System.out.println("Conectando a Azure SQL");
    }
}

interface NubeFactory {
    Almacenamiento crearAlmacenamiento();
    ColaMensajes crearCola();
    BaseDatos crearBaseDatos();
}

class AwsFactory implements NubeFactory {
    @Override
    public Almacenamiento crearAlmacenamiento() {
        return new AwsAlmacenamiento();
    }

    @Override
    public ColaMensajes crearCola() {
        return new AwsCola();
    }

    @Override
    public BaseDatos crearBaseDatos() {
        return new AwsBaseDatos();
    }
}

class AzureFactory implements NubeFactory {
    @Override
    public Almacenamiento crearAlmacenamiento() {
        return new AzureAlmacenamiento();
    }

    @Override
    public ColaMensajes crearCola() {
        return new AzureCola();
    }

    @Override
    public BaseDatos crearBaseDatos() {
        return new AzureBaseDatos();
    }
}

public class NubeAbstractFactory {
    public static void main(String[] args) {
        NubeFactory aws = new AwsFactory();
        aws.crearAlmacenamiento().guardar();
        aws.crearCola().enviar();
        aws.crearBaseDatos().conectar();

        NubeFactory azure = new AzureFactory();
        azure.crearAlmacenamiento().guardar();
        azure.crearCola().enviar();
        azure.crearBaseDatos().conectar();
    }
}