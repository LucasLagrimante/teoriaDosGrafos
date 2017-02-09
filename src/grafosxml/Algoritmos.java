package grafosxml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.HashSet;
import javax.swing.JFrame;

public class Algoritmos extends javax.swing.JFrame {

    Grafo grafo = TelaMain.grafo;

    List<No> listaNos = new ArrayList<No>(TelaMain.listaNos);
    List<Aresta> listaArestas = new ArrayList<Aresta>(TelaMain.listaArestas);
    String nomeAresta = TelaMain.nomeAresta;
    String origemAresta = TelaMain.origemAresta;
    String destinoAresta = TelaMain.destinoAresta;

    List<List<No>> listaAdjacenciaNos = new ArrayList<List<No>>();
    List<No> nosVisitados = new ArrayList<No>();
    List<No> todosNos = new ArrayList<No>();
    List<No> nosDestino = new ArrayList<No>();
    List<No> nosOrigem = new ArrayList<No>();
    Object parent;

    public Algoritmos() {
        initComponents();
        setLocationRelativeTo(null);
        this.grafo = GraphSession.getGrafo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        Remover = new javax.swing.JMenuItem();
        abc = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBDijkstra = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jBKruskal = new javax.swing.JButton();
        jBPrim = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButtonMalgrange = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonProfundidade = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        Remover.setText("Remover");
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });
        popupMenu.add(Remover);

        abc.setText("Cor");
        popupMenu.add(abc);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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

        jLabel1.setText("Distância:");

        jBDijkstra.setText("Dijkstra");
        jBDijkstra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDijkstraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBDijkstra)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBDijkstra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jLabel2.setText("Árvore Geradora");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBPrim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBKruskal)
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPrim)
                    .addComponent(jBKruskal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonMalgrange.setText("Malgrange");
        jButtonMalgrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMalgrangeActionPerformed(evt);
            }
        });

        jLabel3.setText("Grafo Reduzido");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jButtonMalgrange))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMalgrange)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("Ordenação");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Largura");

        jLabel4.setText("Busca em Grafo");

        jButtonProfundidade.setText("Profundidade");
        jButtonProfundidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfundidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButtonProfundidade)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(101, 101, 101))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButtonProfundidade)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Planaridade");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Planaridade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(94, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(47, 47, 47))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        setSize(new java.awt.Dimension(469, 179));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        formWindowOpened(null);
    }//GEN-LAST:event_formComponentResized

    private void jBKruskalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKruskalActionPerformed
        //Coleta os dados do respectivo grafo, e o cria novamente para este ser manipulado
        Grafo g = grafo.copiaGrafo(grafo, grafo.getId() + "-kruskal");
        //Algoritmo é implementado
        //para que seja escolhida as aresta
        List<Aresta> arestasOrdenadas = new ArrayList<Aresta>();
        List<Aresta> novasArestas = new ArrayList<Aresta>();
        List<No> nosLigados = new ArrayList<No>();
        List<No> nosSoltos = new ArrayList<No>();
        for (Aresta are : g.getArestas()) {
            arestasOrdenadas.add(are);
        }
        Collections.sort(arestasOrdenadas);
        int j = 0;
        while (novasArestas.size() < (g.getNos().size() - 1) && arestasOrdenadas.size() != j) {
            for (Aresta ares : arestasOrdenadas) {
                if (novasArestas.size() == 0) {
                    nosLigados.add(g.getNoById(ares.getOrigem()));
                    nosLigados.add(g.getNoById(ares.getDestino()));
                    novasArestas.add(ares);
                    j++;
                } else if (nosLigados.contains(g.getNoById(ares.getOrigem())) || nosLigados.contains(g.getNoById(ares.getDestino()))) {
                    if (nosLigados.contains(g.getNoById(ares.getOrigem())) && nosLigados.contains(g.getNoById(ares.getDestino()))) {
                        if ((nosSoltos.contains(g.getNoById(ares.getOrigem())) && !nosSoltos.contains(g.getNoById(ares.getDestino()))) || (nosSoltos.contains(g.getNoById(ares.getDestino())) && !nosSoltos.contains(g.getNoById(ares.getOrigem())))) {
                            novasArestas.add(ares);
                            j++;
                            nosSoltos.clear();
                        }
                    } else if (!nosSoltos.contains(g.getNoById(ares.getOrigem())) && !nosSoltos.contains(g.getNoById(ares.getDestino()))) {
                        novasArestas.add(ares);
                        j++;
                        if (!nosLigados.contains(g.getNoById(ares.getOrigem()))) {
                            nosLigados.add(g.getNoById(ares.getOrigem()));
                        }
                        if (!nosLigados.contains(g.getNoById(ares.getDestino()))) {
                            nosLigados.add(g.getNoById(ares.getDestino()));
                        }
                    } else {
                        novasArestas.add(ares);
                        j++;
                        if (!nosSoltos.contains(g.getNoById(ares.getOrigem()))) {
                            nosSoltos.add(g.getNoById(ares.getOrigem()));
                            nosLigados.add(g.getNoById(ares.getOrigem()));
                        }
                        if (!nosSoltos.contains(g.getNoById(ares.getDestino()))) {
                            nosSoltos.add(g.getNoById(ares.getDestino()));
                            nosLigados.add(g.getNoById(ares.getDestino()));
                        }
                    }
                } else {
                    novasArestas.add(ares);
                    j++;
                    nosLigados.add(g.getNoById(ares.getOrigem()));
                    nosLigados.add(g.getNoById(ares.getDestino()));
                    nosSoltos.add(g.getNoById(ares.getOrigem()));
                    nosSoltos.add(g.getNoById(ares.getDestino()));
                }
            }
        }
        g.getArestas().clear();
        g.setArestas(novasArestas);
        JOptionPane.showMessageDialog(null, "Árvore geradora mínima pelo \n algoritmo de Kruskal");
        g.salvaGrafo(g);
    }//GEN-LAST:event_jBKruskalActionPerformed

    private void jBDijkstraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDijkstraActionPerformed
        // Clona o grafo aberto para ser manipulado
        Grafo g = grafo.copiaGrafo(grafo, grafo.getId() + "-dijkstra");
        //Algoritmo é implementado
        //para que seja escolhida as aresta
        List<No> listaNosFechados = new ArrayList<No>();
        List<No> listaNosAbertos = new ArrayList<>();
        int qtNos = listaNos.size();
        int h = 0;

        int[][] matrizD = new int[qtNos][qtNos];

        listaNosAbertos.addAll(listaNos);

        String[] nosCombo = new String[qtNos];
        while (h < qtNos) {
            nosCombo[h] = (String) listaNos.get(h).getId();
            h = h + 1;
        }
        JFrame frame = new JFrame("Vértice Raiz");
        String verticeRaiz = (String) JOptionPane.showInputDialog(frame,
                "Ecolha o vértice raiz:",
                "Vértice Raiz",
                JOptionPane.QUESTION_MESSAGE,
                null,
                nosCombo,
                nosCombo[0]);

        int[] tabelaD = new int[listaNosAbertos.size() - 1];

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

        JOptionPane.showMessageDialog(null, "Caminho Minímo:\n" + imprime);
        g.salvaGrafo(g);
    }//GEN-LAST:event_jBDijkstraActionPerformed

    private void jBPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrimActionPerformed
        // Clona o grafo aberto para ser manipulado
        Grafo g = grafo.copiaGrafo(grafo, grafo.getId() + "-prim");
        //t grupo de arestas da árvore geradora mínima
        List<Aresta> t = new ArrayList<Aresta>();
        List<Aresta> arestasPossiveis = new ArrayList<Aresta>();
        List<Aresta> arestasOriginais = new ArrayList<Aresta>(listaArestas);
        //variavel v - grupo de nos do grafo original sem os nos que já estão no grupo b
        List<No> v = new ArrayList<No>(listaNos);
        //variavel b - grupo de nos da árvore geradora mínima
        List<No> b = new ArrayList<No>();
        b.add(listaNos.get(0));
        v.remove(v.get(0));
        while (b.size() <= listaNos.size()) {
            //procura as arestas do último no add ao grupo b
            for (Aresta are : arestasOriginais) {
                if (are.getOrigem().equals(b.get(b.size() - 1).getId()) || are.getDestino().equals(b.get(b.size() - 1).getId())) {
                    if (t.isEmpty()) {
                        arestasPossiveis.add(are);
                    } else {
                        for (No nov : v) {
                            if (nov.getId() == are.getOrigem()) {
                                for (No nob : b) {
                                    if (nob.getId() == are.getDestino()) {
                                        arestasPossiveis.add(are);
                                        break;
                                    }
                                }
                            }
                        }
                        for (No nov : v) {
                            if (nov.getId() == are.getDestino()) {
                                for (No nob : b) {
                                    if (nob.getId() == are.getOrigem()) {
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
            //exclui do grupo AP e AO, as arestas que possuem ambos os nos, que estao fechando circuito
            while (bw == true) {
                bw = false;
                for (Aresta aresPos : arestasPossiveis) {
                    String ao = aresPos.getOrigem();
                    String ad = aresPos.getDestino();
                    for (No no1 : b) {
                        if (no1.getId() == ao) {
                            bo = true;
                            break;
                        } else {
                            bw = false;
                            bo = false;
                        }
                    }

                    for (No no2 : b) {
                        if (no2.getId() == ad) {
                            bd = true;
                            break;
                        } else {
                            bw = false;
                            bd = false;
                        }
                    }

                    if (bo == true && bd == true) {
                        arestasPossiveis.remove(aresPos);
                        bw = true;
                        for (Aresta a : arestasOriginais) {
                            if (aresPos.getNomeAresta() == a.getNomeAresta() && aresPos.getValorAresta() == a.getValorAresta() && aresPos.getOrigem() == a.getOrigem() && aresPos.getDestino() == a.getDestino()) {
                                arestasOriginais.remove(a);
                                break;
                            }
                        }
                        break;
                    } else {
                        bw = false;
                        bo = false;
                        bd = false;
                    }
                }
                if (bw == false) {
                    break;
                }
            }

            if (arestasPossiveis.size() > 0) {
                int valorMenor = arestasPossiveis.get(0).getValorAresta();
                //ADICIONA NO GRUPO T A ARESTA QUE NO GRUPO AP TIVER O MENOR VALOR DA ARESTA                                                          
                for (Aresta aresPos : arestasPossiveis) {
                    if (aresPos.getValorAresta() < valorMenor) {
                        valorMenor = aresPos.getValorAresta();
                    }
                }
                for (Aresta aresPos : arestasPossiveis) {
                    //apos adicionar é removido do grupo ap e ao
                    if (aresPos.getValorAresta() == valorMenor) {
                        t.add(new Aresta(aresPos.getNomeAresta(), aresPos.getValorAresta(), aresPos.getOrigem(), aresPos.getDestino()));
                        for (Aresta a : arestasPossiveis) {
                            if (aresPos.getNomeAresta() == a.getNomeAresta() && aresPos.getValorAresta() == a.getValorAresta() && aresPos.getOrigem() == a.getOrigem() && aresPos.getDestino() == a.getDestino()) {
                                arestasPossiveis.remove(a);
                                break;
                            }
                        }
                        for (Aresta a : arestasOriginais) {
                            if (aresPos.getNomeAresta() == a.getNomeAresta() && aresPos.getValorAresta() == a.getValorAresta() && aresPos.getOrigem() == a.getOrigem() && aresPos.getDestino() == a.getDestino()) {
                                arestasOriginais.remove(a);
                                break;
                            }
                        }
                        break;
                    }
                }
            }

            if (b.size() < listaNos.size()) {
                String ao = t.get(t.size() - 1).getOrigem();
                String ad = t.get(t.size() - 1).getDestino();
                //busca o nó, da ultima aresta adicionada ao grupo t do grupo v e adiciona ao grupo b 
                for (No nov : v) {
                    if (nov.getId() == ao) {
                        for (No nob : b) {
                            if (nob.getId() == ad) {
                                //adiciona
                                b.add(new No(ao));
                                v.remove(new No(ao));
                                break;
                            }
                        }
                        break;
                    }
                }
                for (No nov : v) {
                    if (nov.getId() == ad) {
                        for (No nob : b) {
                            if (nob.getId() == ao) {
                                b.add(new No(ad));
                                v.remove(new No(ad));
                                break;
                            }
                        }
                        break;
                    }
                }
            } else {
                break;
            }
        }
        String T = "{";
        for (Aresta ares : t) {
            T += ares.getNomeAresta() + ", ";
        }
        T += "}";
        g.getArestas().clear();
        g.setArestas(t);

        JOptionPane.showMessageDialog(null, "Conjunto de arestas da árvore geradora mínima:\n" + T);
        g.salvaGrafo(g);
    }//GEN-LAST:event_jBPrimActionPerformed

    public List<Aresta> buscaProf(No no) {
        List<Aresta> arestasSelecionadas = new ArrayList<Aresta>();
        List<Aresta> retornoArestas = new ArrayList<Aresta>();
        nosVisitados.add(no);
        for (List<No> lista : listaAdjacenciaNos) {
            if (lista.get(0) == no) {
                for (int i = 0; i < lista.size(); i++) {
                    if (!nosVisitados.contains(lista.get(i))) {
                        for (Aresta ares : listaArestas) {
                            if ((no.getId().equals(ares.getOrigem()) && lista.get(i).getId().equals(ares.getDestino())) || (lista.get(i).getId().equals(ares.getOrigem()) && no.getId().equals(ares.getDestino()))) {
                                for (Aresta are : buscaProf(lista.get(i))) {
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
        for (Aresta are : arestasSelecionadas) {
            retornoArestas.add(are);
        }
        return retornoArestas;
    }

    private void jButtonProfundidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfundidadeActionPerformed

        Grafo g = grafo.copiaGrafo(grafo, grafo.getId() + "-profundidade");
        //  é implementado para escolher as arestas
        nosVisitados.clear();
        listaAdjacenciaNos.clear();
        listaArestas.clear();
        No no = g.getNos().get(0);
        List<Aresta> arestas = new ArrayList<Aresta>();
        for (Aresta are : g.getArestas()) {
            listaArestas.add(are);
        }
        for (List<No> list : g.listaAdjacencia(g)) {
            listaAdjacenciaNos.add(list);
        }
        for (Aresta ares : buscaProf(no)) {
            arestas.add(ares);
        }
        g.getArestas().clear();
        g.setArestas(arestas);
        JOptionPane.showMessageDialog(null, "Foi exibido o resultado do \n algoritmo Busca em Produndidade");
        g.salvaGrafo(g);
    }//GEN-LAST:event_jButtonProfundidadeActionPerformed

    private void jButtonMalgrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMalgrangeActionPerformed

        Grafo g = grafo.copiaGrafo(grafo, grafo.getId() + "-malgrange");
        List<String> ftd = new ArrayList<String>();
        List<String> fti = new ArrayList<String>();
        List<String> intersecao = new ArrayList<String>();
        List<String> analisados = new ArrayList<String>();
        List<String> analisados2 = new ArrayList<String>();

        int qt = listaNos.size();
        grafo.geraMatriz();
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

        JOptionPane.showMessageDialog(null, "Vértices Fortemente Conexos:\n" + imprimir);
        g.salvaGrafo(g);
    }//GEN-LAST:event_jButtonMalgrangeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

//    public boolean hasCiclosDeComprimentoTres() {
//                for (No origem : grafo.getNos()) {
//                    for (Aresta l1 : getLigacoesVertice(origem, true)) {
//                        for (Aresta l2 : getLigacoesVertice(l1.getDestino(), true)) {
//                            for (Aresta l3 : getLigacoesVertice(l2.getDestino(), true)) {
//                                if (origem.getId().equalsIgnoreCase(l3.getDestino().getId())) {
//                                    return true;
//                                }
//                            }
//                        }
//                    }
//                }
//                return false;
//            }
        // Se V >= 3, então
        //    E <=  3V – 6
        // Se V >= 3 e não existem ciclos de comprimento 3 então
        //    E <= 2V – 4 
        if (grafo.getNos().size() >= 3) {
//            if (hasCiclosDeComprimentoTres()) {
            if (grafo.getArestas().size() <= (3 * grafo.getNos().size() - 6)) {
                JOptionPane.showMessageDialog(null, "Grafo planar!\n");
            }
//            } else {
//                if (grafo.getArestas().count() <= (2 * grafo.getNos().count() - 4)) {
//                    JOptionPane.showMessageDialog(null, "Grafo planar!\n");
//                }
//            }
        } else {
            JOptionPane.showMessageDialog(null, "Grafo não planar!\n");
        }


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
            java.util.logging.Logger.getLogger(Algoritmos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Algoritmos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Algoritmos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Algoritmos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Algoritmos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Remover;
    private javax.swing.JMenuItem abc;
    private javax.swing.JButton jBDijkstra;
    private javax.swing.JButton jBKruskal;
    private javax.swing.JButton jBPrim;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonMalgrange;
    private javax.swing.JButton jButtonProfundidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu popupMenu;
    // End of variables declaration//GEN-END:variables
}
