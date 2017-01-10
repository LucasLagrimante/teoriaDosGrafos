package grafosxml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class DadosGrafos extends javax.swing.JFrame {

    Grafo grafo;

    public DadosGrafos() {
        initComponents();
        setLocationRelativeTo(null);// deixa a janela no centro da tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jBOrdemGrafo = new javax.swing.JButton();
        jBConjuntoVertices = new javax.swing.JButton();
        jBConjuntoArestas = new javax.swing.JButton();
        jBVerticesAdjacentes = new javax.swing.JButton();
        jBArestasAdjacentes = new javax.swing.JButton();
        jBIncidenciaAresta = new javax.swing.JButton();
        jBGrauVertice = new javax.swing.JButton();
        jBArestasIndependentes = new javax.swing.JButton();
        jBVerticesIsolados = new javax.swing.JButton();
        jBAbrirGrafo = new javax.swing.JButton();
        jtArqGrafo = new javax.swing.JTextField();
        jBGrauRecepcao = new javax.swing.JButton();
        jBGrauEmissao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConjuntoArestas = new javax.swing.JTextArea();
        jBFechar = new javax.swing.JButton();
        jBVerticesTerminais = new javax.swing.JButton();
        jBVerticesIndependentes = new javax.swing.JButton();
        jtOrdemGrafo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtConjuntoVertices = new javax.swing.JTextArea();
        jBVerticesFontes = new javax.swing.JButton();
        jBVerticesSumidouros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBOrdemGrafo.setText("Ordem do grafo");
        jBOrdemGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOrdemGrafoActionPerformed(evt);
            }
        });

        jBConjuntoVertices.setText("Exibir conjunto dos vértices");
        jBConjuntoVertices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConjuntoVerticesActionPerformed(evt);
            }
        });

        jBConjuntoArestas.setText("Exibir conjunto das arestas");
        jBConjuntoArestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConjuntoArestasActionPerformed(evt);
            }
        });

        jBVerticesAdjacentes.setText("Vértices adjacentes");
        jBVerticesAdjacentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerticesAdjacentesActionPerformed(evt);
            }
        });

        jBArestasAdjacentes.setText("Arestas adjacentes");
        jBArestasAdjacentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBArestasAdjacentesActionPerformed(evt);
            }
        });

        jBIncidenciaAresta.setText("Incidência das arestas");
        jBIncidenciaAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIncidenciaArestaActionPerformed(evt);
            }
        });

        jBGrauVertice.setText("Graus dos vértices");
        jBGrauVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGrauVerticeActionPerformed(evt);
            }
        });

        jBArestasIndependentes.setText("Arestas independentes");
        jBArestasIndependentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBArestasIndependentesActionPerformed(evt);
            }
        });

        jBVerticesIsolados.setText("Vértices isolados");
        jBVerticesIsolados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerticesIsoladosActionPerformed(evt);
            }
        });

        jBAbrirGrafo.setText("Abrir grafo");
        jBAbrirGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAbrirGrafoActionPerformed(evt);
            }
        });

        jtArqGrafo.setEditable(false);
        jtArqGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtArqGrafoActionPerformed(evt);
            }
        });

        jBGrauRecepcao.setText("Graus de recepção");
        jBGrauRecepcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGrauRecepcaoActionPerformed(evt);
            }
        });

        jBGrauEmissao.setText("Graus de emissão");
        jBGrauEmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGrauEmissaoActionPerformed(evt);
            }
        });

        jtConjuntoArestas.setEditable(false);
        jtConjuntoArestas.setColumns(20);
        jtConjuntoArestas.setRows(5);
        jScrollPane1.setViewportView(jtConjuntoArestas);

        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        jBVerticesTerminais.setText("Vértices terminais");
        jBVerticesTerminais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerticesTerminaisActionPerformed(evt);
            }
        });

        jBVerticesIndependentes.setText("Vértices independentes");
        jBVerticesIndependentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerticesIndependentesActionPerformed(evt);
            }
        });

        jtOrdemGrafo.setEditable(false);

        jtConjuntoVertices.setEditable(false);
        jtConjuntoVertices.setColumns(20);
        jtConjuntoVertices.setRows(5);
        jScrollPane2.setViewportView(jtConjuntoVertices);

        jBVerticesFontes.setText("Vértices fontes");
        jBVerticesFontes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerticesFontesActionPerformed(evt);
            }
        });

        jBVerticesSumidouros.setText("Vértices sumidouros");
        jBVerticesSumidouros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerticesSumidourosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBFechar)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBVerticesIsolados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBGrauEmissao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBGrauVertice, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBGrauRecepcao, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBVerticesTerminais, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBIncidenciaAresta, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jBArestasAdjacentes, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBVerticesAdjacentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jBArestasIndependentes, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBVerticesIndependentes, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jBConjuntoVertices, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jBConjuntoArestas, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jBAbrirGrafo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtArqGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBOrdemGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtOrdemGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jBVerticesFontes, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBVerticesSumidouros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtArqGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAbrirGrafo)
                    .addComponent(jBOrdemGrafo)
                    .addComponent(jtOrdemGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBConjuntoVertices)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jBConjuntoArestas)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGrauVertice)
                    .addComponent(jBIncidenciaAresta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVerticesTerminais)
                    .addComponent(jBVerticesIsolados))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGrauRecepcao)
                    .addComponent(jBGrauEmissao))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBArestasAdjacentes)
                    .addComponent(jBVerticesAdjacentes))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBArestasIndependentes)
                    .addComponent(jBVerticesIndependentes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVerticesFontes)
                    .addComponent(jBVerticesSumidouros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jBFechar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jBAbrirGrafoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);
        File xmlFileLer = new File(fileChooser.getSelectedFile().getName());
        jtArqGrafo.setText(fileChooser.getSelectedFile().getName().substring(0, fileChooser.getSelectedFile().getName().lastIndexOf(".")));

        XStream xstream = new XStream(new DomDriver());
        xstream.processAnnotations(Grafo.class);
        grafo = (Grafo) xstream.fromXML(xmlFileLer);
        grafo.geraMatriz();
        grafo.geraMatrizIncidencia();
        String xml = xstream.toXML(grafo);
        System.out.println(xml);

    }      