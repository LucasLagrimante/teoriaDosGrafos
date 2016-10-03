/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lukin
 */
public class Grafo {
    private int aresta, vertice;

    public Grafo() {
    }

    public Grafo(int aresta, int vertice) {
        this.aresta = aresta;
        this.vertice = vertice;
    }

    public int getAresta() {
        return aresta;
    }

    public void setAresta(int aresta) {
        this.aresta = aresta;
    }

    public int getVertice() {
        return vertice;
    }

    public void setVertice(int vertice) {
        this.vertice = vertice;
    }
}
