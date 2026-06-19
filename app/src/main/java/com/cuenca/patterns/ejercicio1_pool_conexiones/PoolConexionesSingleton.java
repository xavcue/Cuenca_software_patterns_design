package com.cuenca.patterns.ejercicio1_pool_conexiones;

class PoolConexiones {
    private static final PoolConexiones instancia = new PoolConexiones();

    private PoolConexiones() {
        System.out.println("Creando pool de conexiones...");
    }

    public static PoolConexiones getInstancia() {
        return instancia;
    }

    public void obtenerConexion() {
        System.out.println("Conexion obtenida del pool compartido.");
    }
}

public class PoolConexionesSingleton {
    public static void main(String[] args) {
        PoolConexiones pool1 = PoolConexiones.getInstancia();
        PoolConexiones pool2 = PoolConexiones.getInstancia();

        pool1.obtenerConexion();
        pool2.obtenerConexion();

        System.out.println(pool1 == pool2);
    }
}