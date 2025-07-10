# 📊 Proyecto: Implementación de Grafos en Java

## 📌 Información General

- **Título**: Estructura de Datos - Grafos (BFS, DFS, Matriz de Adyacencia)
- **Asignatura**: Estructura de Datos
- **Carrera**: Computación
- **Estudiante**: Sebastian Rafael Ceron Miranda
- **Fecha**: 07/07/2025
- **Profesor**: Ing. Pablo Torres

---

## 🔍 Descripción del Proyecto

Este proyecto consiste en la implementación de un grafo no dirigido en Java, utilizando listas de adyacencia. Se incluyen funcionalidades para:

- Agregar nodos y aristas
- Imprimir el grafo
- Recorridos: BFS y DFS
- Generación e impresión de la matriz de adyacencia

El proyecto aplica conceptos de grafos, estructuras dinámicas y algoritmos de búsqueda, reforzando la comprensión de las conexiones entre nodos.

---

## 🧠 Estructuras y Clases Implementadas

### ✅ Clase `Node`
- Representa un nodo del grafo
- Atributos:
  - `value`: identificador del nodo
  - `neighbors`: lista de vecinos conectados
- Métodos:
  - `addNeighbor()`
  - `getValue()`
  - `getNeighbors()`

### ✅ Clase `Graph`
- Almacena todos los nodos del grafo
- Permite añadir nodos y aristas
- Métodos principales:
  - `addNode(int value)`
  - `addEdge(Node src, Node dest)`
  - `printGraph()`
  - `getDFS(Node startNode)`
  - `getBFS(Node startNode)`
  - `getAdjacencyMatrix()`
  - `printAdjacencyMatrix()`

---

## 🔄 Algoritmos Implementados

### 🔹 BFS (Breadth-First Search)
Recorre el grafo en **amplitud** desde el nodo de inicio usando una cola.

### 🔹 DFS (Depth-First Search)
Recorre el grafo en **profundidad** de forma recursiva.

### 🔹 Matriz de Adyacencia
Permite visualizar si hay conexión entre nodos mediante una matriz binaria `0` y `1`.

---

## ✅ Ejemplo de Uso

```java
Graph graph = new Graph();

Node a = graph.addNode(0);
Node b = graph.addNode(1);
Node c = graph.addNode(2);
Node d = graph.addNode(3);

graph.addEdge(a, b);
graph.addEdge(a, c);
graph.addEdge(b, d);

graph.printGraph();
graph.getDFS(a);
graph.getBFS(a);
graph.printAdjacencyMatrix();