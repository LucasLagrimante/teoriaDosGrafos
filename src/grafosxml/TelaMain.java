package grafosxml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import static java.lang.Integer.parseInt;

public class TelaMain extends javax.swing.JFrame {

    public static List<No> listaNos = new ArrayList<No>();
    public static List<Aresta> listaArestas = new ArrayList<Aresta>();
    List<Object> listaNosCombo = new ArrayList<>();
    public static String nomeAresta;
    public static String origemAresta;
    public static String destinoAresta;
    int valorAresta;
    public static Grafo grafo;

    public TelaMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jbSalvar = new javax.swing.JButton();
        jbMostrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtNomeGrafo = new javax.swing.JTextField();
        jBRepresentacoes = new javax.swing.JButton();
        jBAlgoritmos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtValor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbCriarAresta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbArestas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jbRemoverAresta = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jbCriarNos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtVertices = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbNos = new javax.swing.JTable();
        jbRemoverVertice = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jBPropriedades = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jbSalvar.setText("Salvar Grafo");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbMostrar.setText("Abrir Grafo");
        jbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nome do grafo:");

        jtNomeGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeGrafoActionPerformed(evt);
            }
        });

        jBRepresentacoes.setText("Representações");
        jBRepresentacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRepresentacoesActionPerformed(evt);
            }
        });

        jBAlgoritmos.setText("Algoritmos");
        jBAlgoritmos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlgoritmosActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("Nome da aresta:");

        jtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Criar Aresta");

        jLabel4.setText("Origem");

        jLabel5.setText("Destino");

        jbCriarAresta.setText("Criar");
        jbCriarAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCriarArestaActionPerformed(evt);
            }
        });

        jtbArestas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Valor", "Origem", "Destino"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtbArestas);

        jLabel3.setText("Arestas Direcionadas?");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Sim");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Não");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jbRemoverAresta.setText("Remover Aresta");
        jbRemoverAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverArestaActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbCriarAresta))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbRemoverAresta)
                                .addGap(87, 87, 87)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jbCriarAresta)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbRemoverAresta)
                .addGap(5, 5, 5))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Criar Vértice");

        jbCriarNos.setText("Criar");
        jbCriarNos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCriarNosActionPerformed(evt);
            }
        });

        jLabel1.setText("Número de Vértices:");

        jtVertices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtVerticesActionPerformed(evt);
            }
        });

        jtbNos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome vértice"
            }
        ));
        jScrollPane1.setViewportView(jtbNos);

        jbRemoverVertice.setText("Remover Vértice");
        jbRemoverVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverVerticeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbCriarNos)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtVertices, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbRemoverVertice)
                                .addGap(14, 14, 14)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtVertices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCriarNos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbRemoverVertice)
                .addGap(7, 7, 7))
        );

        jButton1.setText("Exibir Grafo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBPropriedades.setText("Propriedades");
        jBPropriedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPropriedadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jbMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBRepresentacoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAlgoritmos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPropriedades)
                        .addGap(0, 22, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel8)
                .addGap(38, 38, 38)
                .addComponent(jtNomeGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtNomeGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbMostrar)
                    .addComponent(jBRepresentacoes)
                    .addComponent(jBAlgoritmos)
                    .addComponent(jButton1)
                    .addComponent(jBPropriedades))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtVerticesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtVerticesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtVerticesActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        if (jtNomeGrafo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite nome para o grafo");
        } else {
            XStream xstream = new XStream(new DomDriver());
            xstream.processAnnotations(Grafo.class);
            String nomeGrafo = jtNomeGrafo.getText();
            Grafo g = new Grafo(nomeGrafo, "directed", listaNos, listaArestas);
            if (jRadioButton1.isSelected()) {
                g.setTipo("directed");
            }
            if (jRadioButton2.isSelected()) {
                g.setTipo("undirected");
            }
            System.out.println(xstream.toXML(g));
            String xml = xstream.toXML(g);
            g = null;
            g = (Grafo) xstream.fromXML(xml);
            try {
                File xmlFile = new File(nomeGrafo + ".xml");
                xstream.toXML(g, new FileWriter(xmlFile));
            } catch (IOException ex) {
                System.out.println("Erro ao Gravar Arquivo");
            }
            DefaultTableModel linhaN = (DefaultTableModel) jtbNos.getModel();
            while (linhaN.getRowCount() != 0) {
                listaNos.remove(0);
                linhaN.removeRow(0);
            }
            DefaultTableModel linhaA = (DefaultTableModel) jtbArestas.getModel();
            while (linhaA.getRowCount() != 0) {
                listaArestas.remove(0);
                linhaA.removeRow(0);
            }

            GraphSession.setGrafo(g);

            jtNomeGrafo.setText("");
            JOptionPane.showMessageDialog(null, "Dados Salvos com Sucesso");
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarActionPerformed

        XStream xstream = new XStream(new DomDriver());
        xstream.processAnnotations(Grafo.class);

        JFileChooser fileChooser = new JFileChooser();

        fileChooser.showOpenDialog(this);

        File xmlFileLer = new File(fileChooser.getSelectedFile().getName());
        Grafo g = (Grafo) xstream.fromXML(xmlFileLer);
        grafo = g;
        String xml = xstream.toXML(g);
        System.out.println(xml);

        GraphSession.setGrafo(g);

        jtNomeGrafo.setText(fileChooser.getSelectedFile().getName().substring(0, fileChooser.getSelectedFile().getName().lastIndexOf(".")));

        DefaultTableModel linhaN = (DefaultTableModel) jtbNos.getModel();
        while (linhaN.getRowCount() != 0) {
            listaNos.remove(0);
            linhaN.removeRow(0);
        }

        for (No n : g.getNos()) {
            listaNos.add(n);
            linhaN.addRow(new String[]{n.getId()});
        }

        DefaultTableModel linhaA = (DefaultTableModel) jtbArestas.getModel();

        while (linhaA.getColumnCount() != 0 && linhaA.getRowCount() != 0) {
            listaArestas.remove(0);
            linhaA.removeRow(0);
        }

        for (Aresta a : g.getArestas()) {
            listaArestas.add(a);
            linhaA.addRow(new String[]{a.getNomeAresta(), Integer.toString(a.getValorAresta()), a.getOrigem(), a.getDestino()});
        }

        if ("undirected".equals(g.getTipo())) {
            jRadioButton2.setSelected(true);
        }

        if ("directed".equals(g.getTipo())) {
            jRadioButton1.setSelected(true);
        }

        List<No> listaVertices = g.getNos();
        for (int i = 0; i < listaVertices.size(); i++) {
            jComboBox1.addItem(listaVertices.get(i).getId());
            jComboBox2.addItem(listaVertices.get(i).getId());
        }
    }//GEN-LAST:event_jbMostrarActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jbCriarNosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCriarNosActionPerformed

        DefaultTableModel linha = (DefaultTableModel) jtbNos.getModel();
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        while (linha.getRowCount() != 0) {
            listaNos.remove(0);
            linha.removeRow(0);
        }
        for (int i = 1; i <= parseInt(jtVertices.getText()); i++) {
            listaNos.add(new No("n" + i));
            linha.addRow(new String[]{"n" + i});
            listaNosCombo.add(i);
            jComboBox1.addItem("n" + i);
            jComboBox2.addItem("n" + i);
        }
        jtVertices.setText("");
    }//GEN-LAST:event_jbCriarNosActionPerformed

    private void jbCriarArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCriarArestaActionPerformed
        nomeAresta = jtNome.getText();
        if (jtValor.getText().equals("")) {
            valorAresta = 0;
        } else {
            valorAresta = Integer.parseInt(jtValor.getText());
        }
        origemAresta = (String) jComboBox1.getSelectedItem();
        destinoAresta = (String) jComboBox2.getSelectedItem();
        DefaultTableModel linha = (DefaultTableModel) jtbArestas.getModel();
        listaArestas.add(new Aresta(nomeAresta, valorAresta, origemAresta, destinoAresta));
        linha.addRow(new String[]{nomeAresta, Integer.toString(valorAresta), origemAresta, destinoAresta});
        jtNome.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jtValor.setText("");
    }//GEN-LAST:event_jbCriarArestaActionPerformed

    private void jbRemoverVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverVerticeActionPerformed
        listaNos.remove(jtbNos.getSelectedRow());
        ((DefaultTableModel) jtbNos.getModel()).removeRow(jtbNos.getSelectedRow());
    }//GEN-LAST:event_jbRemoverVerticeActionPerformed

    private void jbRemoverArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverArestaActionPerformed
        listaArestas.remove(jtbArestas.getSelectedRow());
        ((DefaultTableModel) jtbArestas.getModel()).removeRow(jtbArestas.getSelectedRow());
    }//GEN-LAST:event_jbRemoverArestaActionPerformed

    private void jtNomeGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeGrafoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeGrafoActionPerformed

    private void jtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeActionPerformed

    private void jBRepresentacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRepresentacoesActionPerformed
        if (GraphSession.getGrafo() == null) {
            JOptionPane.showMessageDialog(null, "Grafo não existente");
        } else {
            frmRepresentacoes frr = new frmRepresentacoes();
            frr.setVisible(true);
        }
    }//GEN-LAST:event_jBRepresentacoesActionPerformed

    private void jBAlgoritmosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlgoritmosActionPerformed
        if (GraphSession.getGrafo() == null) {
            JOptionPane.showMessageDialog(null, "Grafo não existente");
        } else {
            Algoritmos tm = new Algoritmos();
            tm.setVisible(true);
        }
    }//GEN-LAST:event_jBAlgoritmosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (GraphSession.getGrafo() == null) {
            JOptionPane.showMessageDialog(null, "Grafo não existente");
        } else {
            ExibirGrafo ra = new ExibirGrafo();
            ra.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jBPropriedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPropriedadesActionPerformed
        
        JOptionPane.showMessageDialog(null,"A ordem do grafo é: " + grafo.getNos().size());
        
        int grau = 0, grau2 = 0, i = 0;
        
        if (grafo.getTipo().equals("unidirected")) {
            
            for (i = 0; i <= grafo.getNos().size() - 1; i++) {
                String vertice1 = grafo.getNos().get(i).getId();
                for (int j = 0; j <= grafo.getArestas().size() - 1; j++) {
                    if (vertice1.equals(grafo.getArestas().get(j).getOrigem()) || vertice1.equals(grafo.getArestas().get(j).getDestino())) {
                        grau++;
                    }
                }
                
                JOptionPane.showMessageDialog(null, "vertice: "
                                              + grafo.getNos().get(i).getId()
                                              + " " + grau, "Grau do Vertice", 0);
                grau = 0;
            }
            
        }
        if (grafo.getTipo().equals("directed")) {
            for (i = 0; i <= grafo.getNos().size() - 1; i++) {
                String vertice1 = grafo.getNos().get(i).getId();
                for (int j = 0; j <= grafo.getArestas().size() - 1; j++) {
                    if (vertice1.equals(grafo.getArestas().get(j).getOrigem())) {
                        grau++;
                    }
                    if (vertice1.equals(grafo.getArestas().get(j).getDestino())) {
                        grau2++;
                    }
                }
                JOptionPane.showMessageDialog(null,"\n vertice: " + grafo.getNos().get(i).getId() + " Grau de Emissão " + grau
                                              + "\n vertice: " + grafo.getNos().get(i).getId() + " Grau de Recepção " + grau2);
                grau = 0;
                
                grau2 = 0;
            }

        }

    }//GEN-LAST:event_jBPropriedadesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBAlgoritmos;
    private javax.swing.JButton jBPropriedades;
    private javax.swing.JButton jBRepresentacoes;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbCriarAresta;
    private javax.swing.JButton jbCriarNos;
    private javax.swing.JButton jbMostrar;
    private javax.swing.JButton jbRemoverAresta;
    private javax.swing.JButton jbRemoverVertice;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNomeGrafo;
    private javax.swing.JTextField jtValor;
    private javax.swing.JTextField jtVertices;
    private javax.swing.JTable jtbArestas;
    private javax.swing.JTable jtbNos;
    // End of variables declaration//GEN-END:variables
}
