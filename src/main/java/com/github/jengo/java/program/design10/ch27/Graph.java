package com.github.jengo.java.program.design10.ch27;

import java.util.List;

public interface Graph<V> {

    /**
     * Return the number of vertices in the graph
     */
    int getSize();

    /**
     * Return the vertices in the graph
     */
    List<V> getVertices();

    /**
     * Return the object for the specified vertex index
     */
    V getVertex(int index);

    /**
     * Return the index for the specified vertex object
     */
    int getIndex(V vertex);

    /**
     * Return the neighbors of vertex with the specified index
     */
    List<Integer> getNeighbors(int index);

    /**
     * Return the degree for a specified vertex index
     */
    int getDegree(int index);

    /**
     * Return the adjacency matrix
     */
    int[][] getAdjacencyMatrix();

    /**
     * Print the adjacency matrix
     */
    void printAdjacencyMatrix();

    /**
     * Print the edges
     */
    void printEdges();

    /**
     * Obtain a depth-first search tree
     */
    AbstractGraph.Tree dfs(int index);

    /**
     * Obtain a breadth-first search tree
     */
    AbstractGraph<V>.Tree bfs(int index);

    /**
     * Return a Hamiltonian path from the specified vertex
     * Return null if the graph does not contain a Hamiltonian path
     */
    List<Integer> getHamiltonianPath(V vertex);

    /**
     * Return a Hamiltonian path from the specified vertex label
     * Return null if the graph does not contain a Hamiltonian path
     */
    List<Integer> getHamiltonianPath(int index);
}
