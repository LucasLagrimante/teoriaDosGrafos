package grafosxml;

import com.mxgraph.model.mxCell;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxStylesheet;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import com.thoughtworks.xstream.io.xml.DomDriver;
import static grafosxml.Algoritmos.graph;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

@XStreamAlias("graph")
public class Grafo {

    @XStreamAlias("id")
    @XStreamAsAttribute
    private String id;
    @XStreamAlias("edgedefault")
    @XStreamAsAttribute
    private String tipo;
    @XStreamImplicit(itemFieldName = "node")
    private List<No> nos;
    @XStreamImplicit(itemFieldName = "edge")
    private List<Aresta> arestas;
    @XStreamOmitField
    private int[][] matriz;
    @XStreamOmitField
    private int[][] matrizI;
    @XStreamOmitField
    private int[][] matrizValue;
    Object parent;
    @XStreamOmitField
    List<List<No>> adjacencia = new ArrayList<List<No>>();
    
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
