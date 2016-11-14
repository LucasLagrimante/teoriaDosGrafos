/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Aresta {
    
    private String id, source, target;
    private Vertice v1;
    private Vertice v2;

    public Aresta() {
    }
    
    /*public Aresta(String id, Vertice v1, Vertice v2) {
        this.id = id;
        this.setV1(v1);
        this.setV2(v2);
    }*/

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public Vertice getV1() {
        return v1;
    }

    public void setV1(Vertice v1) {
        this.v1 = v1;
        source = v1.getId();
    }

    public Vertice getV2() {
        return v2;
    }

    public void setV2(Vertice v2) {
        this.v2 = v2;
        target = v2.getId();
    }
    
    
}
