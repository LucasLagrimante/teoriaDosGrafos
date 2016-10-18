/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;


public class Grafo {
    
    private String id;
    private TipoGrafo tipo;
    private ArrayList <Vertice> vertices;
    private ArrayList <Aresta> arestas = new ArrayList<>();

    public Grafo() {
        this("", TipoGrafo.unidirected);
    }

    public Grafo(String id, TipoGrafo tipo) {
        this.id = id;
        this.tipo = tipo;
        vertices = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TipoGrafo getTipo() {
        return tipo;
    }

    public void setTipo(TipoGrafo tipo) {
        this.tipo = tipo;
    }

    public ArrayList getArestas() {
        return arestas;
    }

    public void setArestas(Aresta arestas) {
        this.arestas.add(arestas);
    }

    public ArrayList getVertices() {
        return vertices;
    }

    public void setVertices(Vertice v) {
        vertices.add(v);
    }

    public Object getVertices(int selectedIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVertice(Vertice vertice) {
        this.vertices.add(vertice);
    }

   
}
