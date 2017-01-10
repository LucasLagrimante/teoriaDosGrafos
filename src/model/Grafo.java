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
    public Grafo(String id, String tipo, List<No> nos, List<Aresta> arestas) {
        this.id = id;
        this.tipo = tipo;
        this.nos = nos;
        this.arestas = arestas;
        geraMatriz();
    }

    public void geraMatriz() {
        int Qtdenos = nos.size();
        matriz = new int[Qtdenos][Qtdenos];
        for (int i = 0; i < Qtdenos; i++) {
            for (int j = 0; j < Qtdenos; j++) {
                matriz[i][j] = 0;
            }
        }
        for (Aresta are : arestas) {
            int posO = nos.indexOf(new No(are.getOrigem()));
            int posD = nos.indexOf(new No(are.getDestino()));
            matriz[posO][posD] = 1;
            if (tipo.equals("undirected")){
                matriz[posD][posO] = 1;
            }
        }
    }
    
    public int[][] getMatrizComValue() {
        int Qtdenos = nos.size();
        matrizValue = new int[Qtdenos][Qtdenos];
        for (int i = 0; i < Qtdenos; i++) {
            for (int j = 0; j < Qtdenos; j++) {
                matrizValue[i][j] = 0;
            }
        }
        for (Aresta are : arestas) {
            int posO = nos.indexOf(new No(are.getOrigem()));
            int posD = nos.indexOf(new No(are.getDestino()));
            matrizValue[posO][posD] = are.getValorAresta();
        }
        return matrizValue;
    }
    
    
    public void geraMatrizIncidencia() {
        int Qtarestas = arestas.size();
        int Qtdenos = nos.size();
        matrizI = new int[Qtarestas][Qtdenos];
        for (int i = 0; i < Qtarestas; i++) {
            for (int j = 0; j < Qtdenos; j++) {
                matrizI[i][j] = 0;
            }
        }
        for (Aresta are : arestas){
            for (No no : nos) {
                int posA = arestas.indexOf(are);
                int posV = nos.indexOf(no);
                
                if(tipo.equals("directed")){
                    if(nos.indexOf(new No(are.getDestino())) == posV){
                        matrizI[posA][posV] = 1;
                    }

                    if(nos.indexOf(new No(are.getOrigem())) == posV){
                        matrizI[posA][posV] = -1;
                    }
                }
                if (tipo.equals("undirected")){
                    if(nos.indexOf(new No(are.getDestino())) == posV || nos.indexOf(new No(are.getOrigem())) == posV){
                        matrizI[posA][posV] = 1;
                    }
                }
            }
        }
    }
    
    public List<List<No>> listaAdjacencia(Grafo g){
        adjacencia.clear();
        List<No> nosg = new ArrayList<No>();
        List<Aresta> arestasg = new ArrayList<Aresta>();
        for(No no : g.getNos()){
            nosg.add(no);
        }
        for(Aresta are : g.getArestas()){
            arestasg.add(are);
        }
        for(No no : nosg){
            List<No> vertice = new ArrayList<No>();
            vertice.add(no);
            for(No no1 : nosg){
                for(Aresta are : arestasg){
                    if((are.getOrigem().equals(no.getId()) && are.getDestino().equals(no1.getId())) || (are.getOrigem().equals(no1.getId()) && are.getDestino().equals(no.getId()))){
                        vertice.add(no1);
                        break;
                    }
                }
            }
            adjacencia.add(vertice);
        }
        return adjacencia;
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
