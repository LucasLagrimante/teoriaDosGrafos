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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
    }// </editor-fold>//GEN-END:initComponents

    private void jBAbrirGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAbrirGrafoActionPerformed
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

    }//GEN-LAST:event_jBAbrirGrafoActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jtArqGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtArqGrafoActionPerformed

    }//GEN-LAST:event_jtArqGrafoActionPerformed

    private void jBOrdemGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOrdemGrafoActionPerformed
        jtOrdemGrafo.setText(grafo.getOrdem() + "");
    }//GEN-LAST:event_jBOrdemGrafoActionPerformed

    private void jBConjuntoVerticesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConjuntoVerticesActionPerformed
        jtConjuntoVertices.setText(grafo.getConjuntoVertices());
    }//GEN-LAST:event_jBConjuntoVerticesActionPerformed

    private void jBConjuntoArestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConjuntoArestasActionPerformed
        jtConjuntoArestas.setText(grafo.getConjuntoArestas());
    }//GEN-LAST:event_jBConjuntoArestasActionPerformed

    private void jBIncidenciaArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIncidenciaArestaActionPerformed
        JOptionPane.showMessageDialog(null, "As incidências das arestas são:\n" + grafo.getIncidenciaArestas(grafo));
    }//GEN-LAST:event_jBIncidenciaArestaActionPerformed

    private void jBGrauEmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGrauEmissaoActionPerformed
        JOptionPane.showMessageDialog(null, "Os graus de emissão dos vértices são:\n" + grafo.getMensagemGrau(grafo, "Emissao"));
    }//GEN-LAST:event_jBGrauEmissaoActionPerformed

    private void jBGrauRecepcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGrauRecepcaoActionPerformed
        JOptionPane.showMessageDialog(null, "Os graus de recepção dos vértices são:\n" + grafo.getMensagemGrau(grafo, "Recepcao"));
    }//GEN-LAST:event_jBGrauRecepcaoActionPerformed

    private void jBGrauVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGrauVerticeActionPerformed
        JOptionPane.showMessageDialog(null, "Os graus dos vértices são:\n" + grafo.getMensagemGrau(grafo, "Vertice"));
    }//GEN-LAST:event_jBGrauVerticeActionPerformed

    private void jBArestasAdjacentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBArestasAdjacentesActionPerformed
        JOptionPane.showMessageDialog(null, "Os Grupos de arestas adjacentes são:\n" + grafo.getArestasAdjacentes());
    }//GEN-LAST:event_jBArestasAdjacentesActionPerformed

    private void jBVerticesAdjacentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerticesAdjacentesActionPerformed
        JOptionPane.showMessageDialog(null, "Os pares de vértices adjacentes são:" + grafo.getVerticesAdjacentes());
    }//GEN-LAST:event_jBVerticesAdjacentesActionPerformed

    private void jBArestasIndependentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBArestasIndependentesActionPerformed
        JOptionPane.showMessageDialog(null, "As arestas independentes são:\n" + grafo.getArestasIndependentes());
    }//GEN-LAST:event_jBArestasIndependentesActionPerformed

    private void jBVerticesIndependentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerticesIndependentesActionPerformed
        JOptionPane.showMessageDialog(null, "Os vértices independentes são:\n" + grafo.getVerticesIndependentes());
    }//GEN-LAST:event_jBVerticesIndependentesActionPerformed

    private void jBVerticesIsoladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerticesIsoladosActionPerformed
        JOptionPane.showMessageDialog(null, "Os vértices isolados são:" + grafo.getVerticesIsolados(grafo));
    }//GEN-LAST:event_jBVerticesIsoladosActionPerformed

    private void jBVerticesTerminaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerticesTerminaisActionPerformed
        JOptionPane.showMessageDialog(null, "Os vértices terminais são:\n" + grafo.getVerticesTerminais(grafo));
    }//GEN-LAST:event_jBVerticesTerminaisActionPerformed

    private void jBVerticesFontesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerticesFontesActionPerformed
        JOptionPane.showMessageDialog(null, "Os vértices fontes são:\n" + grafo.getVerticesFontes(grafo));
    }//GEN-LAST:event_jBVerticesFontesActionPerformed

    private void jBVerticesSumidourosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerticesSumidourosActionPerformed
        JOptionPane.showMessageDialog(null, "Os vértices sumidouros são:\n" + grafo.getVerticesSumidouros(grafo));
    }//GEN-LAST:event_jBVerticesSumidourosActionPerformed

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
            java.util.logging.Logger.getLogger(DadosGrafos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosGrafos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosGrafos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosGrafos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosGrafos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAbrirGrafo;
    private javax.swing.JButton jBArestasAdjacentes;
    private javax.swing.JButton jBArestasIndependentes;
    private javax.swing.JButton jBConjuntoArestas;
    private javax.swing.JButton jBConjuntoVertices;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBGrauEmissao;
    private javax.swing.JButton jBGrauRecepcao;
    private javax.swing.JButton jBGrauVertice;
    private javax.swing.JButton jBIncidenciaAresta;
    private javax.swing.JButton jBOrdemGrafo;
    private javax.swing.JButton jBVerticesAdjacentes;
    private javax.swing.JButton jBVerticesFontes;
    private javax.swing.JButton jBVerticesIndependentes;
    private javax.swing.JButton jBVerticesIsolados;
    private javax.swing.JButton jBVerticesSumidouros;
    private javax.swing.JButton jBVerticesTerminais;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtArqGrafo;
    private javax.swing.JTextArea jtConjuntoArestas;
    private javax.swing.JTextArea jtConjuntoVertices;
    private javax.swing.JTextField jtOrdemGrafo;
    // End of variables declaration//GEN-END:variables
}
