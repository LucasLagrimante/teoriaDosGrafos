package grafosxml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class TelaMain extends javax.swing.JFrame {

    List<No> listaNos = new ArrayList<No>();
    List<Aresta> listaArestas = new ArrayList<Aresta>();
    String nomeAresta;
    String origemAresta;
    String destinoAresta;
    int valorAresta;

    public TelaMain() {
        initComponents();
        setLocationRelativeTo(null);// deixa a janela no centro da tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtVertices = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jbMostrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbNos = new javax.swing.JTable();
        jbCriarNos = new javax.swing.JButton();
        jtOrigem = new javax.swing.JTextField();
        jtDestino = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbCriarAresta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbArestas = new javax.swing.JTable();
        jtFechar = new javax.swing.JButton();
        jbRemoverVertice = new javax.swing.JButton();
        jbRemoverAresta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtNomeGrafo = new javax.swing.JTextField();
        jtValor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nº Vértices:");

        jtVertices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtVerticesActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar Grafo");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbMostrar.setText("Mostrar Grafo");
        jbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarActionPerformed(evt);
            }
        });

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

        jtbNos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome vértice"
            }
        ));
        jScrollPane1.setViewportView(jtbNos);

        jbCriarNos.setText("Criar Vértices");
        jbCriarNos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCriarNosActionPerformed(evt);
            }
        });

        jtOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtOrigemActionPerformed(evt);
            }
        });

        jtDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDestinoActionPerformed(evt);
            }
        });

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

        jtFechar.setText("Fechar");
        jtFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFecharActionPerformed(evt);
            }
        });

        jbRemoverVertice.setText("Remover Vértice");
        jbRemoverVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverVerticeActionPerformed(evt);
            }
        });

        jbRemoverAresta.setText("Remover Aresta");
        jbRemoverAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverArestaActionPerformed(evt);
            }
        });

        jLabel6.setText("Nome da aresta:");

        jtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeActionPerformed(evt);
            }
        });

        jLabel8.setText("Nome do grafo:");

        jtNomeGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeGrafoActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtVertices, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbCriarNos))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtNomeGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbMostrar)
                                .addGap(82, 82, 82)
                                .addComponent(jtFechar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbRemoverVertice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbRemoverAresta))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbCriarAresta))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtNomeGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtVertices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCriarNos)
                    .addComponent(jLabel4)
                    .addComponent(jtOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCriarAresta))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRemoverVertice)
                    .addComponent(jbRemoverAresta))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMostrar)
                    .addComponent(jtFechar)
                    .addComponent(jbSalvar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtVerticesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtVerticesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtVerticesActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
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
            File xmlFile = new File(nomeGrafo+".xml");
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
        jtNomeGrafo.setText("");
        JOptionPane.showMessageDialog(null, "Dados Salvos com Sucesso");
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarActionPerformed

        XStream xstream = new XStream(new DomDriver());
        xstream.processAnnotations(Grafo.class);

        JFileChooser fileChooser = new JFileChooser();

        fileChooser.showOpenDialog(this);

        File xmlFileLer = new File(fileChooser.getSelectedFile().getName());
        Grafo g = (Grafo) xstream.fromXML(xmlFileLer);
        String xml = xstream.toXML(g);
        System.out.println(xml);

        jtNomeGrafo.setText(fileChooser.getSelectedFile().getName().substring(0, fileChooser.getSelectedFile().getName().lastIndexOf(".")));
        // retona o nome do arquivo na caixa de texto "nome do grafo"
        // subtring foi usado para conseguir retornar "grafo" ao invés de "grafo.xml"
        // tive que fazer isso pq se não fizesse iria salvar depois num arquivo sem nome;

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
        
        if("undirected".equals(g.getTipo())){
            jRadioButton2.setSelected(true);
        }
        
        if("directed".equals(g.getTipo())){
            jRadioButton1.setSelected(true);
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
        while (linha.getRowCount() != 0) {
            listaNos.remove(0);
            linha.removeRow(0);
        }
        for (int i = 1; i <= parseInt(jtVertices.getText()); i++) {
            listaNos.add(new No("n" + i));
            linha.addRow(new String[]{"n" + i});
        }
        jtVertices.setText("");
    }//GEN-LAST:event_jbCriarNosActionPerformed

    private void jtOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtOrigemActionPerformed

    }//GEN-LAST:event_jtOrigemActionPerformed

    private void jtDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDestinoActionPerformed

    }//GEN-LAST:event_jtDestinoActionPerformed

    private void jbCriarArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCriarArestaActionPerformed
        nomeAresta = jtNome.getText();
        valorAresta = Integer.parseInt(jtValor.getText());
        origemAresta = jtOrigem.getText();
        destinoAresta = jtDestino.getText();
        DefaultTableModel linha = (DefaultTableModel) jtbArestas.getModel();
        listaArestas.add(new Aresta(nomeAresta, valorAresta, origemAresta, destinoAresta));
        linha.addRow(new String[]{nomeAresta, Integer.toString(valorAresta), origemAresta, destinoAresta});
        jtNome.setText("");
        jtOrigem.setText("");
        jtDestino.setText("");
        jtValor.setText("");
    }//GEN-LAST:event_jbCriarArestaActionPerformed

    private void jtFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFecharActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jtFecharActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JTextField jtDestino;
    private javax.swing.JButton jtFechar;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNomeGrafo;
    private javax.swing.JTextField jtOrigem;
    private javax.swing.JTextField jtValor;
    private javax.swing.JTextField jtVertices;
    private javax.swing.JTable jtbArestas;
    private javax.swing.JTable jtbNos;
    // End of variables declaration//GEN-END:variables
}
