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

    
    public No getNoById(String id) {
        No a = null;
        for (No no : nos) {
            if (no.getId().equals(id)) {
                a = no;
                break;
            }
        }
        return a;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<No> getNos() {
        return nos;
    }

    public void setNos(List<No> nos) {
        this.nos = nos;
    }

    public List<Aresta> getArestas() {
        return arestas;
    }

    public void setArestas(List<Aresta> arestas) {
        this.arestas = arestas;
    }


    public int getOrdem() {
        return nos.size();
    }
    
    public Grafo copiaGrafo(Grafo grafo, String nome){
        List<No> listaNos2 = new ArrayList<No>();
        List<Aresta> listaArestas2 = new ArrayList<Aresta>();
        for (No n : grafo.getNos()) {
            listaNos2.add(n);
        }
        for (Aresta a : grafo.getArestas()) {
            listaArestas2.add(a);
        }
        Grafo g = new Grafo(nome, grafo.getTipo(), listaNos2, listaArestas2);
        return g;
    }
    
    public void salvaGrafo(Grafo grafo){
        XStream xstream = new XStream(new DomDriver());
        xstream.processAnnotations(Grafo.class);
        System.out.println(xstream.toXML(grafo));
        String xml = xstream.toXML(grafo);
        
        grafo = null;
        grafo = (Grafo) xstream.fromXML(xml);
        try {
            File xmlFile = new File(grafo.getId()+".xml");
            xstream.toXML(grafo, new FileWriter(xmlFile));
        } catch (IOException ex) {
            System.out.println("Erro ao Gravar Arquivo");
        }
    }
    
    public void mostraGrafoDesign(Grafo grafo, String nome, int[][]matriz){
        graph.getModel().beginUpdate();
        try {
            mxStylesheet stylesheet = Algoritmos.getGraph().getStylesheet();
            Hashtable<String, Object> style = new Hashtable();
            style.put(mxConstants.STYLE_SHAPE, "ellipse");
            style.put(mxConstants.STYLE_OPACITY, 50);
            style.put(mxConstants.STYLE_FONTCOLOR, "#774400");
            style.put(mxConstants.STYLE_FILLCOLOR, Color.LIGHT_GRAY);
            stylesheet.putCellStyle("ROUNDED", style);
            String nomeNo = "";
            int p1 = 10;
            int p2 = 20;
            int i = 2;

            for (No vertice : grafo.getNos()) {
                nomeNo = vertice.getId();
                mxCell v1 = (mxCell) Algoritmos.getGraph().insertVertex(parent, null, nomeNo, p1, p2, 50, 50, "ROUNDED");
                v1.setValue(nomeNo);
                Algoritmos.getM().put(nomeNo, v1);
                i++;
                if(nome.equals("topologica")){
                    p1 += 100;
                }
                else{
                    if (i % 2 == 0) {
                        p1 += 60;
                        p2 = 20;
                    } else {
                        p1 += 60;
                        p2 = 150;
                    }
                }
            }
            for (Aresta aresta : grafo.getArestas()) {
                Object parent1 = Algoritmos.getGraph().getDefaultParent();
                Object v1 = Algoritmos.getM().get(aresta.getOrigem());
                Object v2 = Algoritmos.getM().get(aresta.getDestino());
                if(matriz != null){
                    int origem = grafo.getNos().indexOf(new No(aresta.getOrigem()));
                    int destino = grafo.getNos().indexOf(new No(aresta.getDestino()));
                    Algoritmos.getGraph().insertEdge(parent1, null, aresta.getNomeAresta()+": "+matriz[destino][origem]+"/"+aresta.getValorAresta(), v1, v2);
                }else{
                    Algoritmos.getGraph().insertEdge(parent1, null, aresta.getNomeAresta()+": "+aresta.getValorAresta(), v1, v2);
                }
            }
        } finally {
            graph.getModel().endUpdate();
        }
    }


    public String getConjuntoVertices() {
        String vertices = "V={";
        for (No ver : nos) {
            String id = ver.getId();
            vertices += id + ", ";
        }
        return vertices + "}";
    }

    public String getConjuntoArestas() {
        String conj = "A={";
        for (Aresta are : arestas) {
            String origem = are.getOrigem();
            String destino = are.getDestino();
            String nome = are.getNomeAresta();
            conj += nome + "(" + origem + "," + destino + "), ";
        }
        return conj + "}";
    }

    public String getIncidenciaArestas(Grafo g) {
        String incidentes = "\n";
        for (Aresta are : arestas) {
            String origem = are.getOrigem();
            String destino = are.getDestino();
            String nome = are.getNomeAresta();
            incidentes += "Aresta: " + nome + " Incidentes: " + origem + " e " + destino + "\n";
        }
        return incidentes;
    }

    public String getMensagemGrau(Grafo g, String s) {
        String estring = "\n";
        for (int i = 0; i < g.getNos().size(); i++) {
            if (s == "Vertice") {
                estring += "Grau(" + g.getNos().get(i).getId() + "): " + g.getGrauVertice(g.getNos().get(i)) + "; \n";
            }
            if (s == "Emissao") {
                estring += "Grau(" + g.getNos().get(i).getId() + "): " + g.getGrauEmissao(g.getNos().get(i)) + "; \n";
            }
            if (s == "Recepcao") {
                estring += "Grau(" + g.getNos().get(i).getId() + "): " + g.getGrauRecepcao(g.getNos().get(i)) + "; \n";
            }
        }
        return estring;
    }

    public int getGrauEmissao(No no) {
        int grau = 0;
        for (Aresta aresta : this.arestas) {
            if (aresta.getOrigem() == no.getId()) {
                grau++;
            }
        }
        return grau;
    }

    public int getGrauRecepcao(No no) {
        int grau = 0;
        for (Aresta aresta : this.arestas) {
            if (aresta.getDestino() == no.getId()) {
                grau++;
            }
        }
        return grau;
    }

    public int getGrauVertice(No no) {
        int grau = 0;
        for (Aresta aresta : this.arestas) {
            if (aresta.getDestino() == no.getId()) {
                grau++;
            }
            if (aresta.getOrigem() == no.getId()) {
                grau++;
            }
        }
        return grau;
    }

    public String getArestasAdjacentes() {
        String arestasAd = "";
        String subArestAd = "";
        for (No vertice : nos) {
            int i = 0;
            for (Aresta ares : arestas) {
                if (vertice.getId().equals(ares.getOrigem()) || vertice.getId().equals(ares.getDestino())) {
                    subArestAd += ares.getNomeAresta() + ", ";
                    i++;
                }
            }
            if (i > 1) {
                arestasAd += "\n Pelo vértice " + vertice.getId() + ": " + subArestAd;
                subArestAd = "";
            }
        }
        return arestasAd;
    }

