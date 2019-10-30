package Tutorial5;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

public class Notepad extends javax.swing.JFrame {

    public Notepad() {
        initComponents();
    }

    public JTextArea getAreaDeTexto() {
        return areaDeTexto;
    }
    
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
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Notepad().setVisible(true);
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        areaDeTexto = new javax.swing.JTextArea();
        barraDoMenu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        novoArquivo = new javax.swing.JMenuItem();
        abrirArquivo = new javax.swing.JMenuItem();
        salvarArquivo = new javax.swing.JMenuItem();
        fecharArquivo = new javax.swing.JMenuItem();
        fechar = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        localizar = new javax.swing.JMenuItem();
        substituir = new javax.swing.JMenuItem();
        menuFormatar = new javax.swing.JMenu();
        formatarFonte = new javax.swing.JMenuItem();
        menuExibir = new javax.swing.JMenu();
        barraDeFerramentas = new javax.swing.JMenuItem();
        barraDeStatus = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        exibirAjuda = new javax.swing.JMenuItem();
        sobreOBlocoDeNotas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaDeTexto.setColumns(20);
        areaDeTexto.setRows(5);
        jScrollPane1.setViewportView(areaDeTexto);

        menuArquivo.setText("Arquivo");

        novoArquivo.setText("Novo Arquivo");
        menuArquivo.add(novoArquivo);

        abrirArquivo.setText("Abrir Arquivo");
        abrirArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirArquivoActionPerformed(evt);
            }
        });
        menuArquivo.add(abrirArquivo);

        salvarArquivo.setText("Salvar Arquivo");
        salvarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarArquivoActionPerformed(evt);
            }
        });
        menuArquivo.add(salvarArquivo);

        fecharArquivo.setText("Fechar Arquivo");
        menuArquivo.add(fecharArquivo);

        fechar.setText("Fechar");
        menuArquivo.add(fechar);

        barraDoMenu.add(menuArquivo);

        menuEditar.setText("Editar");

        localizar.setText("Localizar");
        menuEditar.add(localizar);

        substituir.setText("Substituir");
        menuEditar.add(substituir);

        barraDoMenu.add(menuEditar);

        menuFormatar.setText("Formatar");

        formatarFonte.setText("Fonte");
        formatarFonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatarFonteActionPerformed(evt);
            }
        });
        menuFormatar.add(formatarFonte);

        barraDoMenu.add(menuFormatar);

        menuExibir.setText("Exibir");

        barraDeFerramentas.setText("Barra de Ferramentas");
        menuExibir.add(barraDeFerramentas);

        barraDeStatus.setText("Barra de Status");
        menuExibir.add(barraDeStatus);

        barraDoMenu.add(menuExibir);

        menuAjuda.setText("Ajuda");

        exibirAjuda.setText("Exibir Ajuda");
        menuAjuda.add(exibirAjuda);

        sobreOBlocoDeNotas.setText("Sobre o Bloco de Notas");
        menuAjuda.add(sobreOBlocoDeNotas);

        barraDoMenu.add(menuAjuda);

        setJMenuBar(barraDoMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirArquivoActionPerformed
        JFileChooser abrir = new JFileChooser();
        int opcao = abrir.showOpenDialog(this);
        if (opcao == JFileChooser.APPROVE_OPTION) {
            areaDeTexto.setText("");
            
            try {
                Scanner scan = new Scanner(new FileReader(abrir.getSelectedFile().getPath()));
                while (scan.hasNext()){
                    areaDeTexto.append(scan.nextLine() + "\n");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Notepad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_abrirArquivoActionPerformed

    private void salvarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarArquivoActionPerformed
        JFileChooser salvar = new JFileChooser();
        int opcao = salvar.showSaveDialog(this);
        
        try {
            FileWriter arquivo = new FileWriter(salvar.getSelectedFile().getPath());
            
            BufferedWriter saida = new BufferedWriter(arquivo);
            saida.write(areaDeTexto.getText());
            saida.close();
        } catch (IOException ex) {
            Logger.getLogger(Notepad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salvarArquivoActionPerformed

    private void formatarFonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatarFonteActionPerformed
        FormatarFonte fonte = new FormatarFonte(this, false);
        fonte.setVisible(true);
    }//GEN-LAST:event_formatarFonteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrirArquivo;
    private javax.swing.JTextArea areaDeTexto;
    private javax.swing.JMenuItem barraDeFerramentas;
    private javax.swing.JMenuItem barraDeStatus;
    private javax.swing.JMenuBar barraDoMenu;
    private javax.swing.JMenuItem exibirAjuda;
    private javax.swing.JMenuItem fechar;
    private javax.swing.JMenuItem fecharArquivo;
    private javax.swing.JMenuItem formatarFonte;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem localizar;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuExibir;
    private javax.swing.JMenu menuFormatar;
    private javax.swing.JMenuItem novoArquivo;
    private javax.swing.JMenuItem salvarArquivo;
    private javax.swing.JMenuItem sobreOBlocoDeNotas;
    private javax.swing.JMenuItem substituir;
    // End of variables declaration//GEN-END:variables
}
