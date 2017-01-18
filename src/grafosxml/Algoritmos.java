package grafosxml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.HashSet;

public class Algoritmos extends javax.swing.JFrame {

    Grafo grafo;

    List<No> listaNos = new ArrayList<No>();
    List<Aresta> listaArestas = new ArrayList<Aresta>();
    String nomeAresta;
    String origemAresta;
    String destinoAresta;
    
    List<List<No>> listaAdjacenciaNos = new ArrayList<List<No>>();
    List<No> nosVisitados = new ArrayList<No>();
    List<No> todosNos = new ArrayList<No>();
    List<No> nosDestino = new ArrayList<No>();
    List<No> nosOrigem = new ArrayList<No>();

//    protected static mxGraph graph = new mxGraph();
//    protected static HashMap m = new HashMap();
//    private mxGraphComponent graphComponent;
//    private mxCell cell = null;

//    public static HashMap getM() {
//        return m;
//    }

//    public static mxGraph getGraph() {
//        return graph;
//    }

    Object parent;

    public Algoritmos() {
        initComponents();
        setLocationRelativeTo(null); // deixa a janela no centro da tela

//        parent = graph.getDefaultParent();
//        graphComponent = new mxGraphComponent(graph);

//        graphComponent.setPreferredSize(new Dimension(10, 10));
//        graphComponent.setBackground(Color.WHITE);
//        graphComponent.setComponentPopupMenu(popupMenu);
//        jPanel1.add(graphComponent);

//        graphComponent.getGraphControl().addMouseListener(new MouseAdapter() {
//            public void mouseReleased(MouseEvent e) {
//                cell = (mxCell) graphComponent.getCellAt(e.getX(), e.getY());
//            }
//        });
//        getContentPane().setBackground(Color.white);
//
//        graphComponent.validate();
//        graphComponent.repaint();
//        jPanel1.validate();
//        jPanel1.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        Remover = new javax.swing.JMenuItem();
        abc = new javax.swing.JMenuItem();
        jBAbrirGrafo = new javax.swing.JButton();
        jTNomeGrafo = new javax.swing.JTextField();
        jBDijkstra = new javax.swing.JButton();
        jBKruskal = new javax.swing.JButton();
        jBPrim = new javax.swing.JButton();
        jButtonMalgrange = new javax.swing.JButton();
        jButtonTopologica = new javax.swing.JButton();
        jButtonProfundidade = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        Remover.setText("Remover");
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });
        popupMenu.add(Remover);

        abc.setText("Cor");
        popupMenu.add(abc);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jBAbrirGrafo.setText("Abrir Grafo");
        jBAbrirGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAbrirGrafoActionPerformed(evt);
            }
        });

        jTNomeGrafo.setEnabled(false);

        jBDijkstra.setText("Dijkstra");
        jBDijkstra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDijkstraActionPerformed(evt);
            }
        });

        jBKruskal.setText("Kruskal");
        jBKruskal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBKruskalActionPerformed(evt);
            }
        });

        jBPrim.setText("Prim");
        jBPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPrimActionPerformed(evt);
            }
        });

        jButtonMalgrange.setText("Malgrange");
        jButtonMalgrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMalgrangeActionPerformed(evt);
            }
        });

        jButtonTopologica.setText("Topológica");
        jButtonTopologica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTopologicaActionPerformed(evt);
            }
        });

        jButtonProfundidade.setText("Profundidade");
        jButtonProfundidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfundidadeActionPerformed(evt);
            }
        });

        jButton1.setText("Testar Planaridade");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAbrirGrafo)
                        .addGap(18, 18, 18)
                        .addComponent(jTNomeGrafo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBDijkstra)
                                .addGap(18, 18, 18)
                                .addComponent(jBPrim)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonTopologica)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jBKruskal)
                                .addGap(32, 32, 32)
                                .addComponent(jButtonMalgrange)
                                .addGap(37, 37, 37)
                                .addComponent(jButtonProfundidade)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAbrirGrafo)
                    .addComponent(jTNomeGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDijkstra)
                    .addComponent(jBPrim)
                    .addComponent(jButtonTopologica)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBKruskal)
                    .addComponent(jButtonMalgrange)
                    .addComponent(jButtonProfundidade))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(418, 157));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        graphComponent.setPreferredSize(new Dimension(jPanel1.getWidth() - 10, jPanel1.getHeight() - 10));
//        graphComponent.validate();
//        graphComponent.repaint();
//        jPanel1.validate();
//        jPanel1.repaint();
    }//GEN-LAST:event_formWindowOpened

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        formWindowOpened(null);
    }//GEN-LAST:event_formComponentResized

    private void jBAbrirGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAbrirGrafoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);
        File xmlFileLer = new File(fileChooser.getSelectedFile().getName());
        jTNomeGrafo.setText(fileChooser.getSelectedFile().getName().substring(0, fileChooser.getSelectedFile().getName().lastIndexOf(".")));
        XStream xstream = new XStream(new DomDriver());
        xstream.processAnnotations(Grafo.class);
        grafo = (Grafo) xstream.fromXML(xmlFileLer);
        grafo.geraMatriz();
        grafo.geraMatrizIncidencia();
        String xml = xstream.toXML(grafo);
        System.out.println(xml);
        listaNos.clear();
        listaArestas.clear();

        for (No n : grafo.getNos()) {
            listaNos.add(n);
        }
        for (Aresta a : grafo.getArestas()) {
            listaArestas.add(a);
        }
        grafo.setNos(listaNos);
        grafo.setArestas(listaArestas);
//        grafo.mostraGrafoDesign(grafo, grafo.getId(), null);
    }//GEN-LAST:event_jBAbrirGrafoActionPerformed

    private void jBKruskalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKruskalActionPerformed
        // PARTE 1: PEGA OS DADOS DO GRAFO ABERTO E CRIA UM NOVO GRAFO IDÊNTICO PARA SER MANIPULADO.
        Grafo g = grafo.copiaGrafo(grafo, grafo.getId()+"-kruskal");   
        // PARTE 2: LIMPA A TELA.
//        graph.removeCells(graphComponent.getCells(new Rectangle(0, 0, graphComponent.getWidth(), graphComponent.getHeight())));
        jTNomeGrafo.setText("");
        // PARTE 3: APLICA O ALGORITMO PARA ESCOLHER AS ARESTAS.
        List<Aresta> arestasOrdenadas = new ArrayList<Aresta>();
        List<Aresta> novasArestas = new ArrayList<Aresta>();
        List<No> nosLigados = new ArrayList<No>();
        List<No> nosSoltos = new ArrayList<No>();
        for(Aresta are : g.getArestas()){
            arestasOrdenadas.add(are);
        }
        Collections.sort(arestasOrdenadas);
        int j = 0;
        while(novasArestas.size()<(g.getNos().size()-1) && arestasOrdenadas.size() != j){
            for(Aresta ares : arestasOrdenadas){
                if(novasArestas.size() == 0){
                    nosLigados.add(g.getNoById(ares.getOrigem()));
                    nosLigados.add(g.getNoById(ares.getDestino()));
                    novasArestas.add(ares);
                    j++;
                }
                else{
                    if(nosLigados.contains(g.getNoById(ares.getOrigem())) || nosLigados.contains(g.getNoById(ares.getDestino()))){
                        if(nosLigados.contains(g.getNoById(ares.getOrigem())) && nosLigados.contains(g.getNoById(ares.getDestino()))){
                            if((nosSoltos.contains(g.getNoById(ares.getOrigem())) && !nosSoltos.contains(g.getNoById(ares.getDestino()))) || (nosSoltos.contains(g.getNoById(ares.getDestino())) && !nosSoltos.contains(g.getNoById(ares.getOrigem())))){
                                novasArestas.add(ares);
                                j++;
                                nosSoltos.clear();
                            }
                        }
                        else{
                            if(!nosSoltos.contains(g.getNoById(ares.getOrigem())) && !nosSoltos.contains(g.getNoById(ares.getDestino()))){
                                novasArestas.add(ares);
                                j++;
                                if(!nosLigados.contains(g.getNoById(ares.getOrigem())))
                                    nosLigados.add(g.getNoById(ares.getOrigem()));
                                if(!nosLigados.contains(g.getNoById(ares.getDestino())))
                                    nosLigados.add(g.getNoById(ares.getDestino()));
                            }
                            else{
                                novasArestas.add(ares);
                                j++;
                                if(!nosSoltos.contains(g.getNoById(ares.getOrigem()))){
                                    nosSoltos.add(g.getNoById(ares.getOrigem()));
                                    nosLigados.add(g.getNoById(ares.getOrigem()));
                                }
                                if(!nosSoltos.contains(g.getNoById(ares.getDestino()))){
                                    nosSoltos.add(g.getNoById(ares.getDestino()));
                                    nosLigados.add(g.getNoById(ares.getDestino()));
                                }
                            }
                        }   
                    }
                    else{
                        novasArestas.add(ares);
                        j++;
                        nosLigados.add(g.getNoById(ares.getOrigem()));
                        nosLigados.add(g.getNoById(ares.getDestino()));
                        nosSoltos.add(g.getNoById(ares.getOrigem()));
                        nosSoltos.add(g.getNoById(ares.getDestino()));
                    }
                }
            }
        }
        g.getArestas().clear();
        g.setArestas(novasArestas);
        // PARTE 4: VISUALIZA O NOVO GRAFO.
//        g.mostraGrafoDesign(g, "kruskal", null);
        jTNomeGrafo.setText(g.getId());
        JOptionPane.showMessageDialog(null, "Árvore geradora mínima pelo \n algoritmo de Kruskal");
        // PARTE 5: SALVA O GRAFO EM XML.
        g.salvaGrafo(g);
    }//GEN-LAST:event_jBKruskalActionPerformed

    private void jBDijkstraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDijkstraActionPerformed
        // PARTE 1: PEGA OS DADOS DO GRAFO ABERTO E CRIA UM NOVO GRAFO IDÊNTICO PARA SER MANIPULADO.
        Grafo g = grafo.copiaGrafo(grafo, grafo.getId()+"-dijkstra");   
        // PARTE 2: LIMPA A TELA.
//        graph.removeCells(graphComponent.getCells(new Rectangle(0, 0, graphComponent.getWidth(), graphComponent.getHeight())));
        jTNomeGrafo.setText("");
        // PARTE 3: APLICA O ALGORITMO PARA ESCOLHER AS ARESTAS.
        List<No> listaNosFechados = new ArrayList<No>();
        List<No> listaNosAbertos = new ArrayList<>();
        int qtNos = listaNos.size();

        int[][] matrizD = new int[qtNos][qtNos];

        listaNosAbertos.addAll(listaNos);

        String verticeRaiz = JOptionPane.showInputDialog("Digite o vértice raiz:");

        int[] tabelaD = new int[listaNosAbertos.size() - 1];

        //eu criei essa lista provisoria
        List<No> lista = new ArrayList<>();
        lista.addAll(listaNosAbertos);

        for (int i = 0; i < tabelaD.length; i++) {
            tabelaD[i] = Integer.MAX_VALUE;
        }

        No vo = null;
        while (listaNosAbertos.size() > 0) {
            No v = null;

            int distanciaAnterior = 0;
            if (listaNosFechados.size() == 0) {

                v = No.getNoById(verticeRaiz, listaNosAbertos);
                vo = v;
            } else {
                v = listaNosAbertos.get(0);

            }
            listaNosFechados.add(v);
            listaNosAbertos.remove(v);

            if (v != vo) {
                distanciaAnterior = tabelaD[listaNosFechados.size() - 2];
                if (distanciaAnterior == Integer.MAX_VALUE) {
                    distanciaAnterior = 0;
                }

            }

            int i = listaNosFechados.size() - 1;
            for (No a : listaNosAbertos) {
                Aresta a1 = Aresta.getArestaByNos(v, a, listaArestas);
                if (a1 == null) {

                } else if (tabelaD[i] > a1.getValorAresta() + distanciaAnterior) {
                    tabelaD[i] = a1.getValorAresta() + distanciaAnterior;
                }
                i++;
            }

            for (int j = 0; j < tabelaD.length; j++) {
                System.out.print(tabelaD[j] + "- ");
            }
            System.out.println("");

        }

        int p = 1;
        String imprime = "";
        for (int j = 0; j < tabelaD.length; j++) {
            imprime += "(" + verticeRaiz + " , " + lista.get(p).getId() + ") = " + tabelaD[j] + "\n";
            p++;
        }
        
        // PARTE 4: VISUALIZA O NOVO GRAFO.
//        g.mostraGrafoDesign(g, "dijkstra", null);
        jTNomeGrafo.setText(g.getId());
        JOptionPane.showMessageDialog(null, "Caminho Minímo:\n" + imprime);
        // PARTE 5: SALVA O GRAFO EM XML.
        g.salvaGrafo(g);
    }//GEN-LAST:event_jBDijkstraActionPerformed

    private void jBPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrimActionPerformed
        // PARTE 1: PEGA OS DADOS DO GRAFO ABERTO E CRIA UM NOVO GRAFO IDÊNTICO PARA SER MANIPULADO.
        Grafo g = grafo.copiaGrafo(grafo, grafo.getId()+"-prim");
        // PARTE 2: LIMPA A TELA.
//        graph.removeCells(graphComponent.getCells(new Rectangle(0, 0, graphComponent.getWidth(), graphComponent.getHeight())));
        jTNomeGrafo.setText("");
        // PARTE 3: APLICA O ALGORITMO PARA ESCOLHER AS ARESTAS.
        List<Aresta> t = new ArrayList<Aresta>();                               //T: conjunto de arestas da árvore geradora mínima
        List<Aresta> arestasPossiveis = new ArrayList<Aresta>();                //AP: conjunto de arestas que se tornaram potenciais candidatas a entrarem conjunto T
        List<Aresta> arestasOriginais = new ArrayList<Aresta>(listaArestas);    //AO: conjunto de arestas do grafo original que ainda não se tornaram ou já viraram candidatas para entrarem no conjunto T
        List<No> v = new ArrayList<No>(listaNos);                               //V: conjunto de vértices do grafo original sem os vértices que já estão no conjunto B
        List<No> b = new ArrayList<No>();                                       //B: conjunto de vértices da árvore geradora mínima
        b.add(listaNos.get(0));
        v.remove(v.get(0));
        while(b.size() <= listaNos.size()){
            for (Aresta are : arestasOriginais) {   //esse 'for' procura as arestas do último vértice adicionado ao conjunto B
                if(are.getOrigem().equals(b.get(b.size()-1).getId()) || are.getDestino().equals(b.get(b.size()-1).getId())){ 
                    if(t.isEmpty()) {
                        arestasPossiveis.add(are);
                    } else {
                        for (No nov : v) {
                            if(nov.getId() == are.getOrigem()){
                                for (No nob : b) {
                                    if(nob.getId() == are.getDestino()){
                                        arestasPossiveis.add(are);
                                        break;
                                    }
                                }
                            }
                        }
                        for (No nov : v) {
                            if(nov.getId() == are.getDestino()){
                                for (No nob : b) {
                                    if(nob.getId() == are.getOrigem()){
                                        arestasPossiveis.add(are);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
            boolean bw = true;
            boolean bo = false;
            boolean bd = false;
            while(bw == true){                      //esse 'while' remove do conjunto AP e AO, as arestas que possuem ambos os vértices
                bw = false;                         //já incluídos no conjunto B, ou seja, remove do conjunto AP e AO as arestas que estão fechando circuito.
                for (Aresta aresPos : arestasPossiveis) {
                    String ao = aresPos.getOrigem();
                    String ad = aresPos.getDestino();
                    for (No no1 : b) {
                        if(no1.getId() == ao){
                            bo = true;
                            break;
                        }else{bw = false; bo = false;}
                    }
                    
                    for (No no2 : b) {
                        if(no2.getId() == ad){
                           bd = true;
                           break;
                        }else{bw = false; bd = false;}
                    }
                    
                    if(bo == true && bd == true){
                        arestasPossiveis.remove(aresPos);
                        bw = true;
                        for (Aresta a : arestasOriginais) {
                            if(aresPos.getNomeAresta() == a.getNomeAresta() && aresPos.getValorAresta() == a.getValorAresta() && aresPos.getOrigem() == a.getOrigem() && aresPos.getDestino() == a.getDestino()){
                                arestasOriginais.remove(a);
                                break;
                            }
                        }
                        break;
                    }else{bw = false; bo = false; bd = false;}
                }
                if(bw == false){break;}
            }
            
            if(arestasPossiveis.size() > 0){
                int valorMenor = arestasPossiveis.get(0).getValorAresta();//esse trecho do algoritmo adiciona ao conjunto T a aresta do conjunto AP que tiver o menor getValorAresta()  
                for (Aresta aresPos : arestasPossiveis) {                           
                    if(aresPos.getValorAresta() < valorMenor){
                        valorMenor = aresPos.getValorAresta();
                    }
                }
                for (Aresta aresPos : arestasPossiveis) {
                    if(aresPos.getValorAresta() == valorMenor){           //e quando adicionada ao conjunto T, é removida do conjunto AP e AO, pois já foi eleita aresta do conjunto T
                        t.add(new Aresta(aresPos.getNomeAresta(), aresPos.getValorAresta(), aresPos.getOrigem(), aresPos.getDestino()));
                        for (Aresta a : arestasPossiveis) {
                            if(aresPos.getNomeAresta() == a.getNomeAresta() && aresPos.getValorAresta() == a.getValorAresta() && aresPos.getOrigem() == a.getOrigem() && aresPos.getDestino() == a.getDestino()){
                                arestasPossiveis.remove(a);
                                break;
                            }
                        }
                        for (Aresta a : arestasOriginais) {
                            if(aresPos.getNomeAresta() == a.getNomeAresta() && aresPos.getValorAresta() == a.getValorAresta() && aresPos.getOrigem() == a.getOrigem() && aresPos.getDestino() == a.getDestino()){
                                arestasOriginais.remove(a);
                                break;
                            }
                        }
                        break;
                    }
                }
            }
            
            if(b.size() < listaNos.size()){                     //esse trecho do algoritmo adiciona ao conjunto B o vértice (um dos vértices da última aresta adicionada ao conjunto T) 
                String ao = t.get(t.size()-1).getOrigem();      //que está ainda no conjunto V, e depois de adicionar no conjunto B remove-o do conjunto V
                String ad = t.get(t.size()-1).getDestino();
                for (No nov : v) {
                    if(nov.getId() == ao){
                        for (No nob : b) {
                            if(nob.getId() == ad){
                                b.add(new No(ao));
                                v.remove(new No(ao));
                                break;
                            }
                        }
                        break;
                    }
                }
                for (No nov : v) {
                    if(nov.getId() == ad){
                        for (No nob : b) {
                            if(nob.getId() == ao){
                                b.add(new No(ad));
                                v.remove(new No(ad));
                                break;
                            }
                        }
                        break;
                    }
                }
            }else{
                break;  //quando todos os vértices do conjunto V estão no conjunto B o 'while' se encerra e depois é mostrado as arestas que foram para o conjunto T
            }
        }
        String T = "{";
        for (Aresta ares : t) {
            T += ares.getNomeAresta()+", ";
        }
        T += "}";
        g.getArestas().clear();
        g.setArestas(t);
        
        // PARTE 4: VISUALIZA O NOVO GRAFO.
//        g.mostraGrafoDesign(g, "prim", null);
        jTNomeGrafo.setText(g.getId());
        JOptionPane.showMessageDialog(null, "Conjunto de arestas da árvore geradora mínima:\n"+T);
        // PARTE 5: SALVA O GRAFO EM XML.
        g.salvaGrafo(g);
    }//GEN-LAST:event_jBPrimActionPerformed
    
    public List<Aresta> buscaProf(No no){
        List<Aresta> arestasSelecionadas = new ArrayList<Aresta>();
        List<Aresta> retornoArestas = new ArrayList<Aresta>();
        nosVisitados.add(no);
        for(List<No> lista : listaAdjacenciaNos){
            if(lista.get(0) == no){
                for(int i=0; i<lista.size(); i++){
                    if(!nosVisitados.contains(lista.get(i))){
                        for(Aresta ares : listaArestas){
                            if((no.getId().equals(ares.getOrigem()) && lista.get(i).getId().equals(ares.getDestino())) || (lista.get(i).getId().equals(ares.getOrigem()) && no.getId().equals(ares.getDestino()))){
                                for(Aresta are : buscaProf(lista.get(i))){
                                    arestasSelecionadas.add(are);
                                }
                                retornoArestas.add(ares);
                                break;
                            }
                        }
                    }
                }
                break;
            }
        }
        for(Aresta are : arestasSelecionadas){
            retornoArestas.add(are);
        }
        return retornoArestas;
    }
    
    private void jButtonProfundidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfundidadeActionPerformed
        // PARTE 1: PEGA OS DADOS DO GRAFO ABERTO E CRIA UM NOVO GRAFO IDÊNTICO PARA SER MANIPULADO.
            Grafo g = grafo.copiaGrafo(grafo, grafo.getId()+"-profundidade");   
        // PARTE 2: LIMPA A TELA.
//            graph.removeCells(graphComponent.getCells(new Rectangle(0, 0, graphComponent.getWidth(), graphComponent.getHeight())));
            jTNomeGrafo.setText("");
        // PARTE 3: APLICA O ALGORITMO PARA ESCOLHER AS ARESTAS.
            nosVisitados.clear();
            listaAdjacenciaNos.clear();
            listaArestas.clear();
            No no = g.getNos().get(0);
            List<Aresta> arestas = new ArrayList<Aresta>();
            for(Aresta are : g.getArestas()){
                listaArestas.add(are);
            }
            for(List<No> list : g.listaAdjacencia(g)){
                listaAdjacenciaNos.add(list);
            }
            for(Aresta ares : buscaProf(no)){
                arestas.add(ares);
            }
            g.getArestas().clear();
            g.setArestas(arestas);      
        // PARTE 4: VISUALIZA O NOVO GRAFO.
//            g.mostraGrafoDesign(g, "profundidade", null);
            jTNomeGrafo.setText(g.getId());
            JOptionPane.showMessageDialog(null, "Foi exibido o resultado do \n algoritmo Busca em Produndidade");
        // PARTE 5: SALVA O GRAFO EM XML.
            g.salvaGrafo(g);
    }//GEN-LAST:event_jButtonProfundidadeActionPerformed

    private void jButtonTopologicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTopologicaActionPerformed
        
        // PARTE 1: PEGA OS DADOS DO GRAFO ABERTO E CRIA UM NOVO GRAFO IDÊNTICO PARA SER MANIPULADO.
        Grafo g = grafo.copiaGrafo(grafo, grafo.getId()+"-topologica");   
        // PARTE 2: LIMPA A TELA.
//        graph.removeCells(graphComponent.getCells(new Rectangle(0, 0, graphComponent.getWidth(), graphComponent.getHeight())));
        jTNomeGrafo.setText("");
        // PARTE 3: APLICA O ALGORITMO PARA ESCOLHER AS ARESTAS.
        List<Aresta> manipulaArestas = new ArrayList<Aresta>();
        List<Aresta> novasArestas = new ArrayList<Aresta>();
        List<No> manipulaNos = new ArrayList<No>();
        List<No> listaOrdem = new ArrayList<No>();
        String noId="";
        int j=1;
        int tamanho = g.getNos().size();
        while(tamanho != 0){
            tamanho--;
            manipulaArestas.clear();
            manipulaNos.clear();
            manipulaArestas.addAll(g.getArestas());
            manipulaNos.addAll(g.getNos());
            for(No nos : manipulaNos){
                int i=0;
                noId = nos.getId();
                for(Aresta ares : manipulaArestas){
                    if(nos.getId().equals(ares.getDestino())){
                        i++;
                        break;
                    }
                }
                if(i == 0){
                    for(Aresta ares : manipulaArestas){
                        if(nos.getId() == ares.getOrigem()){
                            g.getArestas().remove(ares);
                        }
                    }
                    listaOrdem.add(nos);
                    g.getNos().remove(new No(noId));
                }
            }
        }
        if(listaOrdem.size() != tamanho){
            listaOrdem.addAll(g.getNos());
        }
        for(int i=1; i<listaOrdem.size(); i++){
            Aresta novaAresta = new Aresta ("A"+j, 1, listaOrdem.get(i-1).getId(), listaOrdem.get(j).getId());
            novasArestas.add(novaAresta);
            j++;
        }
        g.getNos().clear();
        g.setNos(listaOrdem);
        g.getArestas().clear();
        g.setArestas(novasArestas); 
        // PARTE 4: VISUALIZA O NOVO GRAFO.
//        g.mostraGrafoDesign(g, "topologica", null);
        jTNomeGrafo.setText(g.getId());
        JOptionPane.showMessageDialog(null, "Foi exibido o resultado do \n algoritmo de Ordem Topológica");
        // PARTE 5: SALVA O GRAFO EM XML.
        g.salvaGrafo(g);  
        
    }//GEN-LAST:event_jButtonTopologicaActionPerformed

    private void jButtonMalgrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMalgrangeActionPerformed
       // PARTE 1: PEGA OS DADOS DO GRAFO ABERTO E CRIA UM NOVO GRAFO IDÊNTICO PARA SER MANIPULADO.
        Grafo g = grafo.copiaGrafo(grafo, grafo.getId() + "-malgrange");
        // PARTE 2: LIMPA A TELA.
//        graph.removeCells(graphComponent.getCells(new Rectangle(0, 0, graphComponent.getWidth(), graphComponent.getHeight())));
        jTNomeGrafo.setText("");
        // PARTE 3: APLICA O ALGORITMO PARA ESCOLHER AS ARESTAS.
        List<String> ftd = new ArrayList<String>();
        List<String> fti = new ArrayList<String>();
        List<String> intersecao = new ArrayList<String>();
        List<String> analisados = new ArrayList<String>();
        List<String> analisados2 = new ArrayList<String>();

        int qt = listaNos.size();
        int[][] matrizADJ = grafo.getMatriz();

        int i = 0, j = 0, contador = 0;

        int proximoDaLista = 0;
        ftd.add(0, listaNos.get(0).getId());
        analisados.add(i, listaNos.get(0).getId());

        while (contador < listaNos.size()) {

            while (j < qt) {

                if (matrizADJ[i][j] == 1) {
                    if (!ftd.contains(analisados)) {
                        ftd.add(listaNos.get(j).getId());
                    }

                }
                j++;
            }

            proximoDaLista++;
            analisados.add(i, listaNos.get(i).getId());
            i = proximoDaLista;
            contador++;
            j = 0;
        }
        List novaLista = new ArrayList(new HashSet(ftd));

        contador = 0;
        int proximoDaLista2 = 0;
        i = 0;
        j = 0;

        fti.add(0, listaNos.get(0).getId());
        analisados2.add(j, listaNos.get(0).getId());

        while (contador < listaNos.size()) {

            while (i < qt) {

                if (matrizADJ[i][j] == 1) {
                    if (!fti.contains(analisados2)) {
                        fti.add(listaNos.get(i).getId());
                    }

                }
                i++;
            }

            proximoDaLista2++;
            analisados2.add(j, listaNos.get(j).getId());
            j = proximoDaLista2;
            contador++;
            i = 0;
        }

        List novaLista2 = new ArrayList(new HashSet(fti));

        novaLista.retainAll(novaLista2);
        intersecao.addAll(novaLista);

        String imprimir = "(";
        for (int r = 0; r < intersecao.size(); r++) {
            imprimir += intersecao.get(r) + ",";
        }
        imprimir += ")";

        //listaNos.remove(new No((String) cell.getValue()));
        //cell = null;
        // PARTE 4: VISUALIZA O NOVO GRAFO.
//        g.mostraGrafoDesign(g, "malgrange", null);
        jTNomeGrafo.setText(g.getId());
        JOptionPane.showMessageDialog(null, "Vértices Fortemente Conexos:\n" + imprimir);
        // PARTE 5: SALVA O GRAFO EM XML.
        g.salvaGrafo(g); 
    }//GEN-LAST:event_jButtonMalgrangeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Algoritmos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Algoritmos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Algoritmos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Algoritmos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Algoritmos().setVisible(true);
            }
        });
//    
//        ViewHome frame = new ViewHome();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 320);
//        frame.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Remover;
    private javax.swing.JMenuItem abc;
    private javax.swing.JButton jBAbrirGrafo;
    private javax.swing.JButton jBDijkstra;
    private javax.swing.JButton jBKruskal;
    private javax.swing.JButton jBPrim;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonMalgrange;
    private javax.swing.JButton jButtonProfundidade;
    private javax.swing.JButton jButtonTopologica;
    private javax.swing.JTextField jTNomeGrafo;
    private javax.swing.JPopupMenu popupMenu;
    // End of variables declaration//GEN-END:variables
}
