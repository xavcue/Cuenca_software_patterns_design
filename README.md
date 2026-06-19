# Cuenca Software Patterns Design

Proyecto desarrollado en Java utilizando Gradle.

## Realizado por:

- Xavier Cuenca

## Objetivo

Analizar diferentes escenarios de software e identificar qué patrón de diseño es el más adecuado para resolver cada problema.

## Ejercicio 1 - Pool de Conexiones

**Patrón utilizado:** Singleton

**Justificación:**

El pool de conexiones es un recurso costoso de crear y debe ser compartido por toda la aplicación. Singleton garantiza que exista una única instancia accesible desde cualquier módulo.

## Ejercicio 2 - Promociones de Tienda

**Patrón utilizado:** Strategy

**Justificación:**

Las promociones pueden cambiar según la temporada (Black Friday, 2x1 o sin promoción). Strategy permite cambiar el algoritmo de cálculo sin modificar el código del checkout.

## Ejercicio 3 - Validación Tributaria

**Patrón utilizado:** Adapter

**Justificación:**

El sistema utiliza una interfaz propia mientras que el servicio gubernamental utiliza otra estructura diferente. Adapter permite conectar ambos sistemas sin modificar el servicio externo.

## Ejercicio 4 - Despliegue en AWS y Azure

**Patrón utilizado:** Abstract Factory

**Justificación:**

Cada proveedor de nube ofrece una familia completa de servicios (almacenamiento, cola de mensajes y base de datos). Abstract Factory permite crear conjuntos compatibles sin mezclar componentes de distintos proveedores.

## Ejercicio 5 - Generación de Documentos

**Patrón utilizado:** Factory Method

**Justificación:**

El proceso de creación es el mismo para todos los documentos. Lo único que cambia es el tipo de documento generado (carta, factura o currículum).

## Ejercicio 6 - Comportamiento de Enemigos

**Patrón utilizado:** Strategy

**Justificación:**

Los enemigos pueden cambiar su comportamiento durante la ejecución del juego. Strategy permite intercambiar dinámicamente la forma de actuar del enemigo.

## Ejercicio 7 - Registro Central de Métricas

**Patrón utilizado:** Singleton

**Justificación:**

Las métricas deben almacenarse en un único punto central para evitar inconsistencias y mantener una única fuente de información.

## Ejercicio 8 - Librería Gráfica Antigua

**Patrón utilizado:** Adapter

**Justificación:**

La aplicación moderna utiliza el método render(), mientras que la librería antigua utiliza drawLine() y drawCircle(). Adapter permite reutilizar la librería existente sin modificarla.

## Ejercicio 9 - Plataforma de Logística

**Patrón utilizado:** Factory Method

**Justificación:**

La planificación del envío es igual para todas las rutas. Lo único que cambia es el tipo de transporte que debe crearse (terrestre, marítimo o aéreo).

## Ejercicio 10 - Controles de Interfaz Gráfica

**Patrón utilizado:** Abstract Factory

**Justificación:**

Cada sistema operativo debe generar una familia completa de componentes visuales compatibles entre sí, evitando mezclar estilos de Windows, macOS o Linux.

## Patrones utilizados

| Patrón | Ejercicios |
|----------|----------|
| Singleton | 1, 7 |
| Strategy | 2, 6 |
| Adapter | 3, 8 |
| Factory Method | 5, 9 |
| Abstract Factory | 4, 10 |

## Tecnologías

- Java
- Gradle
- Visual Studio Code
- Git
- GitHub