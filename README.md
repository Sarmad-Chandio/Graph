# Graph Implementation in Java (Using Adjacency List)

This repository contains a basic implementation of an undirected graph using an adjacency list in Java.

## 📄 Description

The `Graph` class is implemented using a `HashMap<String, ArrayList<String>>`, where each key represents a vertex, and the associated list holds its adjacent vertices. This is an efficient way to represent sparse graphs.

### Features:

- Add vertex to the graph
- Add undirected edge between vertices
- Remove edge between vertices
- Remove a vertex and all associated edges
- Print the current state of the graph

---

## 🧠 Concepts Used

- **HashMap**: Used for mapping vertex names to their adjacency lists.
- **ArrayList**: Used to maintain a dynamic list of connected vertices.
- **Undirected Graph**: Each edge is bidirectional; adding an edge updates both involved vertices.

---

## 📁 Files

- `Graph.java`: Contains the core logic for the graph implementation.
- `Main.java`: Demonstrates usage with sample operations and expected output.

---

## ✅ Example Output

Running `Main.java` will produce:

