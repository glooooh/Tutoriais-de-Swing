package Tutorial5;

import java.awt.Font;

public class FormatarFonte extends javax.swing.JDialog {

    public FormatarFonte(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoAumentar = new javax.swing.JButton();
        botaoDiminuir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formatar Fonte");

        botaoAumentar.setText("Aumentar");
        botaoAumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAumentarActionPerformed(evt);
            }
        });

        botaoDiminuir.setText("Diminuir");
        botaoDiminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDiminuirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoAumentar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoDiminuir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(botaoAumentar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoDiminuir)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAumentarActionPerformed
        Notepad notepad = (Notepad) this.getParent();
        Font f1 = notepad.getAreaDeTexto().getFont();
        Font f2 = new Font(f1.getName(), f1.getStyle(), f1.getSize()+1);
        notepad.getAreaDeTexto().setFont(f2);
    }//GEN-LAST:event_botaoAumentarActionPerformed

    private void botaoDiminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDiminuirActionPerformed
        Notepad notepad = (Notepad) this.getParent();
        Font f1 = notepad.getAreaDeTexto().getFont();
        Font f2 = new Font(f1.getName(), f1.getStyle(), f1.getSize()-1);
        notepad.getAreaDeTexto().setFont(f2);
    }//GEN-LAST:event_botaoDiminuirActionPerformed

    public void FormartarFonteJDialog() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormatarFonte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormatarFonte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormatarFonte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormatarFonte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormatarFonte dialog = new FormatarFonte(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAumentar;
    private javax.swing.JButton botaoDiminuir;
    // End of variables declaration//GEN-END:variables
}
