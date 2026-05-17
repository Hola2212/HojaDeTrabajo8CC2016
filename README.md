# Proyecto: Sistema de Atención de Emergencias con Priority Queue

## Descripción

Este proyecto implementa un sistema de atención de pacientes para la sección de emergencias de un hospital utilizando una estructura de datos de tipo Priority Queue.

Cada paciente posee una prioridad de atención representada por una letra entre `A` y `E`, donde:

- `A` → máxima prioridad
- `E` → mínima prioridad

El sistema permite:

- Leer pacientes desde un archivo de texto.
- Insertar pacientes en una cola con prioridad.
- Atender pacientes según su prioridad.
- Comparar dos implementaciones diferentes de Priority Queue.

El proyecto incluye dos implementaciones:

- **Implementación propia** utilizando un Heap (`VectorPriorityQueue`)
- **Implementación usando Java Collections Framework** (`JavaPriorityQueue`)

---

## Estructura del Proyecto

```text
HojaDeTrabajo8/
│
├── src/
│   ├── Main.java
│   ├── Controller.java
│   ├── Paciente.java
│   ├── IPriorityQueue.java
│   ├── VectorPriorityQueue.java
│   ├── JavaPriorityQueue.java
│   ├── FileReaderUtil.java
│   │
│   └── resources/
│       └── pacientes.txt
│
├── tests/
│   ├── PacienteTest.java
│   ├── VectorPriorityQueueTest.java
│   ├── JavaPriorityQueueTest.java
│   ├── FileReaderUtilTest.java
│   └── ControllerTest.java
│
└── README.md
```

---

## Formato del Archivo de Entrada

El archivo `pacientes.txt` contiene los pacientes en el siguiente formato:

```text
Nombre, síntoma, prioridad
```

Ejemplo:

```text
Juan Perez, fractura de pierna, C
Maria Ramirez, apendicitis, A
Carmen Sarmientos, dolores de parto, B
```

---

## Funcionalidades

- Lectura de pacientes desde archivo.
- Inserción de pacientes en una Priority Queue.
- Atención de pacientes según prioridad.
- Implementación manual de Heap.
- Uso de Java Collections Framework.
- Pruebas unitarias con JUnit.

---

## Implementación Propia con Heap

### Características

- Implementación manual de Min Heap.
- Uso de `ArrayList`.
- Operaciones:
    - `add`
    - `remove`
    - `isEmpty`
    - `size`

### Complejidad

| Operación | Complejidad |
|---|---|
| Insertar | O(log n) |
| Remover mínimo | O(log n) |
| Consultar vacío | O(1) |

---

## Implementación con Java PriorityQueue

### Características

- Uso de `java.util.PriorityQueue`
- Implementación mediante adaptador (`JavaPriorityQueue`)
- Compatible con la interfaz `IPriorityQueue`

---

## Arquitectura del Proyecto

El proyecto sigue una arquitectura desacoplada:

| Clase | Responsabilidad |
|---|---|
| Main | Configuración inicial |
| Controller | Lógica principal |
| FileReaderUtil | Lectura de archivos |
| Paciente | Modelo de datos |
| VectorPriorityQueue | Heap manual |
| JavaPriorityQueue | Adaptador para Java PQ |

---

## Ejecutar el Proyecto

### Compilar

```bash
javac src/*.java
```

### Ejecutar

```bash
java src.Main
```

---

## Cambiar Implementación de Priority Queue

En `Main.java` se puede cambiar fácilmente la implementación utilizada:

### Heap Propio

```java
IPriorityQueue<Paciente> queue =
        new VectorPriorityQueue<>();
```

### Java Collections Framework

```java
IPriorityQueue<Paciente> queue =
        new JavaPriorityQueue<>();
```

---

## Pruebas Unitarias

Se implementaron pruebas usando JUnit para validar:

- Creación de pacientes
- Comparación de prioridades
- Inserción en el Heap
- Remoción del Heap
- Orden correcto de prioridades
- Lectura de archivos
- Funcionamiento del Controller

---

## Ejemplo de Salida

```text
Orden de atención:

Carlos Méndez, dolor de pecho, A
Luis Ramírez, apendicitis, A
Sofía Pérez, dificultad respiratoria, A
Carmen Sarmientos, dolores de parto, B
...
```

---

## Datos de Prueba

El proyecto incluye un archivo de prueba con más de 50 pacientes y múltiples prioridades repetidas para validar:

- Correcto funcionamiento del Heap
- Estabilidad de la cola de prioridad
- Inserción masiva de datos
- Correcta atención según prioridad

---

## Conclusiones

- El uso de Heap permite implementar eficientemente una Priority Queue.
- La implementación manual ayuda a comprender el funcionamiento interno de un Heap.
- Java simplifica la implementación mediante `PriorityQueue`.
- La separación de responsabilidades mejora la mantenibilidad del código.
- Las pruebas unitarias permiten validar el correcto funcionamiento del sistema.

---

## Autor

Juan Pablo Flores   -   25454  
Algoritmos y Estructuras de Datos  
Universidad del Valle de Guatemala
