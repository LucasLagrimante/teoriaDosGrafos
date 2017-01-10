package grafosxml;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);// deixa a janela no centro da tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemCriaGrafos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemVisualizar = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuEstatisticas = new javax.swing.JMenu();
        jMenuItemDados = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuAlgoritmos = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuCadastrar.setText("Cadastrar");

        jMenuItemCriaGrafos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCriaGrafos.setText("Criar Grafos");
        jMenuItemCriaGrafos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCriaGrafosActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCriaGrafos);
        jMenuCadastrar.add(jSeparator1);

        jMenuItemVisualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemVisualizar.setText("Visualizar Grafo");
        jMenuItemVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisualizarActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemVisualizar);
        jMenuCadastrar.add(jSeparator3);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemSair);

        jMenuBar1.add(jMenuCadastrar);

        jMenuEstatisticas.setText("Estatísticas");

        jMenuItemDados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemDados.setText("Obter Dados");
        jMenuItemDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDadosActionPerformed(evt);
            }
        });
        jMenuEstatisticas.add(jMenuItemDados);
        jMenuEstatisticas.add(jSeparator4);

        jMenuAlgoritmos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuAlgoritmos.setText("Algoritmos");
        jMenuAlgoritmos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAlgoritmosActionPerformed(evt);
            }
        });
        jMenuEstatisticas.add(jMenuAlgoritmos);

        jMenuBar1.add(jMenuEstatisticas);

        jMenuEditar.setText("Editar");
        jMenuBar1.add(jMenuEditar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemCriaGrafosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCriaGrafosActionPerformed
        TelaMain tm = new TelaMain();
        tm.setVisible(true);
    }//GEN-LAST:event_jMenuItemCriaGrafosActionPerformed

    private void jMenuItemDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDadosActionPerformed
        DadosGrafos tm = new DadosGrafos();
        tm.setVisible(true);
    }//GEN-LAST:event_jMenuItemDadosActionPerformed

    private void jMenuItemVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisualizarActionPerformed
        GrafoView tm = new GrafoView();
        tm.setVisible(true);
    }//GEN-LAST:event_jMenuItemVisualizarActionPerformed

    private void jMenuAlgoritmosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAlgoritmosActionPerformed
        Algoritmos tm = new Algoritmos();
        tm.setVisible(true);
    }//GEN-LAST:event_jMenuAlgoritmosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuAlgoritmos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenu jMenuEstatisticas;
    private javax.swing.JMenuItem jMenuItemCriaGrafos;
    private javax.swing.JMenuItem jMenuItemDados;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemVisualizar;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
