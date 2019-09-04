package view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {
    int tipo = 0 ;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        botaoVerificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labMenssagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código:");

        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });

        botaoVerificar.setText("Verificar");
        botaoVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerificarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/café (3).png"))); // NOI18N
        jLabel2.setText("jLabel2");

        labMenssagem.setForeground(Color.RED);
        labMenssagem.setText("BNF");
        labMenssagem.setToolTipText("");
        labMenssagem.setText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(198, 198, 198)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCodigo)
                            .addComponent(labMenssagem, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(botaoVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labMenssagem, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        start();
    }//GEN-LAST:event_txtCodigoActionPerformed
    private void botaoVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerificarActionPerformed
        start();      
    }//GEN-LAST:event_botaoVerificarActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        
    }//GEN-LAST:event_txtCodigoKeyPressed

    public void start() {
        String str = txtCodigo.getText();
        
        if(validacao(str)) {
            labMenssagem.setForeground(Color.GREEN);
            labMenssagem.setText("Está correto a atribuição");
            bnfAtibuiçao(tipo, str);
        } else {
            labMenssagem.setForeground(Color.RED);
            tipo = 0;
            labMenssagem.setText("Atribuição incorreta");
        }
    }
    
    public void bnfAtibuiçao(int tipo,String bnf){
        switch(tipo){
            case(1):
                BnfInt bi = new BnfInt(bnf);
                labMenssagem.setForeground(Color.BLACK);
                labMenssagem.setText(bi.converter());
            break;
            
            case(2):
                BnfString bs = new BnfString(bnf);
                labMenssagem.setForeground(Color.BLACK);
                labMenssagem.setText(bs.converter());
            break;
            
            case(3):
                BnfChar bc = new BnfChar(bnf);
                labMenssagem.setForeground(Color.BLACK);
                labMenssagem.setText(bc.converter());
            break;
            
            case(4):
                Bnfboolean bb = new Bnfboolean(bnf);
                labMenssagem.setForeground(Color.BLACK);
                labMenssagem.setText(bb.converter());
            break;
            
            case(5):
                BnfFloat bf = new BnfFloat(bnf);
                labMenssagem.setForeground(Color.BLACK);
                labMenssagem.setText(bf.converter());
             break;
             
            case(6):
                BnfDouble bd = new BnfDouble(bnf);
                labMenssagem.setForeground(Color.BLACK);
                labMenssagem.setText(bd.converter());
            break;
        }
    }
    
    
    public boolean validacao(String str){
    
    /*
    REGEX
    
    \s*(public\s+|private\s+|protected\s+|default\s+)?int\s+[a-zA-Z]\w*\s*(=(\s*\+\s*|\s*-\s*)?(\s*\d+\s*((\+|-|\/|\*)\s*\d+\s*)*|\s*\(\s*\d+\s*((\+|-|\/|\*)\s*\d+\s*)*\s*\)\s*))?\s*;\s*
    
    \s*(public\s+|private\s+|protected\s+|default\s+)?String\s+[a-zA-Z]\w*\s*(=\s*"(\s*\w*\s*)*"(\s*\+\s*"(\s*\w*\s*)*"\s*)*)?\s*;\s*
    
    \s*(public\s+|private\s+|protected\s+|default\s+)?char\s+[a-zA-Z]\w*\s*(;|=\s*'\w'\s*;)
    
    \s*(public\s+|private\s+|protected\s+|default\s+)?boolean\s+[a-zA-Z]\w*\s*(;|=\s*(!*\s*)*(true|false)\s*;)
    
    \s*(public\s+|private\s+|protected\s+|default\s+)?float\s+[a-zA-Z]\w*\s*(=(\s*\+\s*|\s*-\s*)?(\s*\d+((\.\d+)?(f|F))?\s*((\+|-|\/|\*)\s*\d+((\.\d+)?(f|F))?\s*)*|\s*\(\s*\d+((\.\d+)?(f|F))?\s*((\+|-|\/|\*)\s*\d+((\.\d+)?(f|F))?\s*)*\s*\)\s*))?\s*;\s*
    
    \s*(public\s+|private\s+|protected\s+|default\s+)?double\s+[a-zA-Z]\w*\s*(=(\s*\+\s*|\s*-\s*)?(\s*\d+((\.\d+)?(f|F)?)?\s*((\+|-|\/|\*)\s*\d+((\.\d+)?(f|F)?)?\s*)*|\s*\(\s*\d+((\.\d+)?(f|F)?)?\s*((\+|-|\/|\*)\s*\d+((\.\d+)?(f|F)?)?\s*)*\s*\)\s*))?\s*;\s*
    */
    
    
    if(str.matches("\\s*(public\\s+|private\\s+|protected\\s+|default\\s+)?int\\s+[a-zA-Z]\\w*\\s*(=(\\s*\\+\\s*|\\s*-\\s*)?(\\s*\\d+\\s*((\\+|-|\\/|\\*)\\s*\\d+\\s*)*|\\s*\\(\\s*\\d+\\s*((\\+|-|\\/|\\*)\\s*\\d+\\s*)*\\s*\\)\\s*))?\\s*;\\s*")){
        tipo = 1;
        return true;
    }else if(str.matches("\\s*(public\\s+|private\\s+|protected\\s+|default\\s+)?String\\s+[a-zA-Z]\\w*\\s*(=\\s*\"(\\s*\\w*\\s*)*\"(\\s*\\+\\s*\"(\\s*\\w*\\s*)*\"\\s*)*)?\\s*;\\s*")){
        tipo = 2;
        return true;
    }else if(str.matches("\\s*(public\\s+|private\\s+|protected\\s+|default\\s+)?char\\s+[a-zA-Z]\\w*\\s*(;|=\\s*'\\w'\\s*;)")){
        tipo = 3;
        return true;
    }else if(str.matches("\\s*(public\\s+|private\\s+|protected\\s+|default\\s+)?boolean\\s+[a-zA-Z]\\w*\\s*(;|=\\s*(!*\\s*)*(true|false)\\s*;)")){
        tipo = 4;
        return true;
    }else if(str.matches("\\s*(public\\s+|private\\s+|protected\\s+|default\\s+)?float\\s+[a-zA-Z]\\w*\\s*(=(\\s*\\+\\s*|\\s*-\\s*)?(\\s*\\d+((\\.\\d+)?(f|F))?\\s*((\\+|-|\\/|\\*)\\s*\\d+((\\.\\d+)?(f|F))?\\s*)*|\\s*\\(\\s*\\d+((\\.\\d+)?(f|F))?\\s*((\\+|-|\\/|\\*)\\s*\\d+((\\.\\d+)?(f|F))?\\s*)*\\s*\\)\\s*))?\\s*;\\s*")){
        tipo = 5;
        return true;
    }else if(str.matches("\\s*(public\\s+|private\\s+|protected\\s+|default\\s+)?double\\s+[a-zA-Z]\\w*\\s*(=(\\s*\\+\\s*|\\s*-\\s*)?(\\s*\\d+((\\.\\d+)?(f|F)?)?\\s*((\\+|-|\\/|\\*)\\s*\\d+((\\.\\d+)?(f|F)?)?\\s*)*|\\s*\\(\\s*\\d+((\\.\\d+)?(f|F)?)?\\s*((\\+|-|\\/|\\*)\\s*\\d+((\\.\\d+)?(f|F)?)?\\s*)*\\s*\\)\\s*))?\\s*;\\s*")){
        tipo = 6;
        return true;
    }
    
    return false;
}
 
 
public boolean isInteger(String s) {
    try { 
        Integer.parseInt(s); 
    } catch(NumberFormatException | NullPointerException e) { 
        return false; 
    }

    return true;
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labMenssagem;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables

    public TelaLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
}
