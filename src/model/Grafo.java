/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

public class Grafo {

    private String id;
    private TipoGrafo tipo = TipoGrafo.unidirected;
    private ArrayList<Vertice> vertices = new ArrayList<>();
    private ArrayList<Aresta> arestas = new ArrayList<>();

    public Grafo() {
    }

    public Grafo(String id, TipoGrafo tipo) {
        this.id = id;
        this.tipo = tipo;
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

    public ArrayList<Aresta> getArestas() {
        return arestas;
    }

    public void setArestas(Aresta arestas) {
        this.arestas.add(arestas);
    }

    public ArrayList<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(Vertice v) {
        this.vertices.add(v);
    }

    public void setVertice(Vertice vertice) {
        this.vertices.add(vertice);
    }

    public int getOrdem() {
        return vertices.size();
    }

    public int getQuantidadeAretas() {
        return arestas.size();
    }
    
    public int[][] matrizAdjacencia(Grafo grafo){
        
        int[][] ma = new int[grafo.getVertices().size()][grafo.getVertices().size()];
            
        for(int i=0;i<grafo.getVertices().size();i++){
                for(int j = 0; i < grafo.getVertices().size();i++){
                    ma[i][j] = 0;
        }
    
    }  
    
        if(grafo.getTipo() == TipoGrafo.unidirected){
            
            for(int i=0;i<grafo.getVertices().size();i++){
                String v1 = grafo.getVertices().get(i).getId();
                    
                for(int j=0;j<grafo.getArestas().size();j++){
                    if(v1.equals(grafo.getArestas().get(j).getSource())){
                        
                        for(int k = 0; k<grafo.getVertices().size();k++){
                            String v2 = grafo.getVertices().get(k).getId();
                            
                            if(v1.equals(grafo.getArestas().get(j).getSource()) && v2.equals(grafo.getArestas().get(j).getTarget())){
                                ma[i][k] = 1;
                                ma[k][i] = 1;
                                break;
                }
                }
            }
        }
    }
    }
        if(grafo.getTipo() == TipoGrafo.directed){
            for(int i=0;i<grafo.getVertices().size();i++){
                String vertice1 = grafo.getVertices().get(i).getId();
        
                for(int j=0;j<grafo.getArestas().size();j++){
                    if(vertice1.equals(grafo.getArestas().get(j).getSource())){
                
                        for(int k = 0; k<grafo.getVertices().size();k++){
                            String vertice2 = grafo.getVertices().get(k).getId();
                    
                            if(vertice1.equals(grafo.getArestas().get(j).getSource()) && vertice2.equals(grafo.getArestas().get(j).getTarget())){
                            ma[i][k] = 1;
                            break;
                }
                }
            }
        }
    }
    }
        
    return ma;
    }
    
    public int[][] matrizIncidencia(Grafo grafo){
        
        int[][] mi = new int[grafo.getVertices().size()][grafo.getArestas().size()];
        
        for(int i=0;i<grafo.getVertices().size();i++){
            for(int j = 0; i <grafo.getArestas().size();i++){
                mi[i][j] = 0;
            }
    
        }
        if(grafo.getTipo() == TipoGrafo.unidirected){
            for(int i=0;i<grafo.getArestas().size();i++){
                String vertice1 = grafo.getArestas().get(i).getSource();
                String vertice2 = grafo.getArestas().get(i).getTarget();
                for(int k = 0; k<grafo.getVertices().size();k++){
                    if(vertice1.equals(grafo.getVertices().get(k).getId())){
                        for(int j = 0; j<grafo.getVertices().size();j++){
                            if(vertice2.equals(grafo.getVertices().get(j).getId())){
                                mi[k][i] = 1;
                                mi[j][i] = 1;
                                break;
                            }
                        }
                    }
                }
            }
         }
        if(grafo.getTipo() == TipoGrafo.directed){
            for(int i=0;i<grafo.getArestas().size();i++){
                String vertice1 = grafo.getArestas().get(i).getSource();
                String vertice2 = grafo.getArestas().get(i).getTarget();
                for(int k = 0; k<grafo.getVertices().size();k++){
                    if(vertice1.equals(grafo.getVertices().get(k).getId())){
                        for(int j = 0; j<grafo.getVertices().size();j++){
                            if(vertice2.equals(grafo.getVertices().get(j).getId())){
                                mi[k][i] = 1;
                                mi[j][i] = -1;
                                break;
                            }
                        }
                    }
                }
            }
         }
        

        return mi;    
    }
    
    public ArrayList<ArrayList> listaAdjacencia(Grafo grafo){
        ArrayList<ArrayList> listaIncidencia = new ArrayList<ArrayList>();
        
        if(grafo.getTipo() == TipoGrafo.directed){
            for(int i=0;i<grafo.getVertices().size();i++){
                ArrayList<String> lista = new ArrayList<String>();
                String v1 = grafo.getVertices().get(i).getId();
                lista.add(v1);
                for(int j=0;j<grafo.getVertices().size();j++){
                    if(v1.equals(grafo.getArestas().get(j).getSource())){
                        lista.add(grafo.getArestas().get(j).getTarget());
                    } 
                }
             listaIncidencia.add(lista);
           }
       }
     
         if(grafo.getTipo() == TipoGrafo.unidirected){
            for(int i=0;i<grafo.getVertices().size();i++){
                ArrayList<String> lista = new ArrayList<String>();
                String v1 = grafo.getVertices().get(i).getId();
                lista.add(v1);
                for(int j=0;j<grafo.getArestas().size();j++){
                    if(v1.equals(grafo.getArestas().get(j).getTarget()) || v1.equals(grafo.getArestas().get(j).getSource()) ){
                        if(v1.equals(grafo.getArestas().get(j).getSource())){
                            lista.add(grafo.getArestas().get(j).getTarget());
                        }else{
                            lista.add(grafo.getArestas().get(j).getSource());
                        }
                    }   
                  }
              listaIncidencia.add(lista);
             }
       }   
        return listaIncidencia;
    }
}    
