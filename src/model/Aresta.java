/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Kaio
 */
public class Aresta {
    
    private String id, source, target;
    private Vertice fonte;
    private Vertice alvo;

    public Aresta() {
    }
    
    public Aresta(String id, Vertice fonte, Vertice alvo) {
        this.id = id;
        this.setFonte(fonte);
        this.setAlvo(alvo);
    }

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

    public Vertice getFonte() {
        return fonte;
    }

    public void setFonte(Vertice fonte) {
        this.fonte = fonte;
        source = fonte.getId();
    }

    public Vertice getAlvo() {
        return alvo;
    }

    public void setAlvo(Vertice alvo) {
        this.alvo = alvo;
        target = alvo.getId();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
