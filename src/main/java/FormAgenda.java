// Nome: Abhimael Sidney Setni Rogatti RA: 2618001

import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

public class FormAgenda extends javax.swing.JFrame {
    private Jogo jogo;
    
    private static FormAgenda formAgdUnic;
    private static BDAgenda agenda;
    
    private FormAgenda() {
        initComponents();
        agenda = BDAgenda.getInstancia();
    }

    //Singleton
    public static FormAgenda getInstancia(){
        if(formAgdUnic == null){
            formAgdUnic = new FormAgenda();
            return formAgdUnic;
        }
        return formAgdUnic;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSair = new javax.swing.JButton();
        btLimparForm = new javax.swing.JButton();
        btLimparAgd = new javax.swing.JButton();
        lbEquipeAdv = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        tfEquipeAdv = new javax.swing.JTextField();
        ftfData = new javax.swing.JFormattedTextField();
        ftfHora = new javax.swing.JFormattedTextField();
        btCadastrar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabAgenda = new javax.swing.JTable();
        lbCod = new javax.swing.JLabel();
        tfCod = new javax.swing.JTextField();
        mBar = new javax.swing.JMenuBar();
        menuAgenda = new javax.swing.JMenu();
        itMenuVisualizar = new javax.swing.JMenuItem();
        itMenuSair = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itMenuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agenda de Jogos");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btLimparForm.setText("Limpar");
        btLimparForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparFormActionPerformed(evt);
            }
        });

        btLimparAgd.setText("Limpar Agenda");
        btLimparAgd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparAgdActionPerformed(evt);
            }
        });

        lbEquipeAdv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbEquipeAdv.setText("EQUIPE ADVERSÁRIA:");

        lbData.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbData.setText("DATA:");

        lbHora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbHora.setText("HORA:");

        try {
            ftfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfData.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        try {
            ftfHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfHora.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar Código");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar Código");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btRemover.setText("Remover Código");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        tabAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "COD", "EQUIPE_ADVERSÁRIA", "DATA", "HORA"
            }
        ));
        jScrollPane1.setViewportView(tabAgenda);
        if (tabAgenda.getColumnModel().getColumnCount() > 0) {
            tabAgenda.getColumnModel().getColumn(0).setMaxWidth(75);
        }

        lbCod.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbCod.setText("PESQUISAR COD:");

        menuAgenda.setText("Agenda");

        itMenuVisualizar.setMnemonic('V');
        itMenuVisualizar.setText("Visualizar...");
        itMenuVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuVisualizarActionPerformed(evt);
            }
        });
        menuAgenda.add(itMenuVisualizar);

        itMenuSair.setMnemonic('S');
        itMenuSair.setText("Sair");
        itMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuSairActionPerformed(evt);
            }
        });
        menuAgenda.add(itMenuSair);

        mBar.add(menuAgenda);

        menuAjuda.setText("Ajuda");

        itMenuSobre.setMnemonic('S');
        itMenuSobre.setText("Sobre...");
        itMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(itMenuSobre);

        mBar.add(menuAjuda);

        setJMenuBar(mBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(btLimparForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCod, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163)
                        .addComponent(btLimparAgd)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbData)
                                        .addComponent(lbHora))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ftfData, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(ftfHora)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btCadastrar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btConsultar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btAtualizar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btRemover))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbEquipeAdv)
                                        .addComponent(tfEquipeAdv, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(42, 42, 42))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbEquipeAdv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEquipeAdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbData)
                            .addComponent(ftfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftfHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbHora))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrar)
                            .addComponent(btAtualizar)
                            .addComponent(btConsultar)
                            .addComponent(btRemover))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimparAgd))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCod)
                        .addComponent(tfCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimparForm))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparFormActionPerformed
        limparForm();
    }//GEN-LAST:event_btLimparFormActionPerformed

    private void btLimparAgdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparAgdActionPerformed
        agenda.limpaAgenda();
        atualizarTab();
    }//GEN-LAST:event_btLimparAgdActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrar();
        atualizarTab();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        atualizar();
        atualizarTab();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        remover();
        atualizarTab();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void itMenuVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuVisualizarActionPerformed
        consultar();
    }//GEN-LAST:event_itMenuVisualizarActionPerformed

    private void itMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuSairActionPerformed
        sair();
    }//GEN-LAST:event_itMenuSairActionPerformed

    private void itMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuSobreActionPerformed
        JOptionPane.showMessageDialog(null, "Os Jogos Agendados podem ser gerenciados a partir \ndo Formulário. "
                + "Você pode utilizar as opções de gestão no formulário e \natravés do menu de opções", "Sobre", 1);
    }//GEN-LAST:event_itMenuSobreActionPerformed

    public Jogo validaForm(){
        jogo = new Jogo();
        try{
            jogo.setEquipeAdv(tfEquipeAdv.getText());
            jogo.setDataHora(ftfData.getText().trim() + " " + ftfHora.getText().trim());
            return jogo;
        }
        catch(StringVaziaException sve){
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "ERRO de Entrada", 0);
        }
        
        catch(StringGrdException sge){
            JOptionPane.showMessageDialog(null, "O Valor de entrada deve conter menos que 25 letras!", "ERRO de Entrada", 0);
        }
        return null;
    }
    public void cadastrar(){
        jogo = validaForm();
        
        if(jogo != null){
            jogo.setCodJogo(agenda.getCod());
            jogo = agenda.cadJogo(jogo);
            if(jogo != null){
                JOptionPane.showMessageDialog(null, "Jogo cadastrado com sucesso!", "Cadastro de Jogo", 1);
                limparForm();
            }
            else{
                JOptionPane.showMessageDialog(null, "Jogo já cadastrado.", "ERRO de Cadastro", 0);
            }
        }
    }
    
    public void consultar(){
        jogo = new Jogo();
        try{
            jogo.setCodJogo(Integer.parseInt(tfCod.getText()));
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O Código deve ser um inteiro!", "ERRO de Código", 0);
        }
            
        jogo = agenda.consJogoCod(jogo);
            
        if(jogo != null){
            tfEquipeAdv.setText(jogo.getEquipeAdv());
            ftfData.setText(jogo.getDataHora().split(" ")[0]);
            ftfHora.setText(jogo.getDataHora().split(" ")[1]);
            JOptionPane.showMessageDialog(null, "Verifique os dados da consulta.", "Consulta de Jogo", 1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Jogo Inexistente.", "ERRO de Consulta", 1);
        }
    }
    public void atualizar(){
        jogo = validaForm();
        if(jogo != null){
            jogo.setCodJogo(Integer.parseInt(tfCod.getText()));
            jogo = agenda.attJogoCod(jogo);

            if(jogo != null){
                JOptionPane.showMessageDialog(null, "Jogo atualizado com sucesso!", "Atualização de Jogo", 1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Jogo Inexistente.", "ERRO de Atualização", 1);
            }
        }
        
    }
    public void remover(){
        jogo = new Jogo();
        try{
            jogo.setCodJogo(Integer.parseInt(tfCod.getText()));
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O Código deve ser um inteiro!", "ERRO de Código", 0);
        }

        
        jogo = agenda.delJogoCod(jogo);
        
        if(jogo != null){
            if(jogo != null){
                JOptionPane.showMessageDialog(null, "Jogo removido com sucesso!", "Remoção de Jogo", 1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Jogo Inexistente.", "ERRO de Remoção", 1);
            }
        }
    }
    public void atualizarTab(){
        DefaultTableModel modelo = (DefaultTableModel) tabAgenda.getModel();
        
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(Jogo j: agenda.getAgenda()){
            modelo.insertRow(posLin, new Object[]{
                j.getCodJogo(),
                j.getEquipeAdv(),
                j.getDataHora().split(" ")[0],
                j.getDataHora().split(" ")[1]
            });
            posLin++;
        }
    }
    
    public void selecionarTab(){
        DefaultTableModel modelo = (DefaultTableModel) tabAgenda.getModel();
        tfCod.setText(modelo.getValueAt(tabAgenda.getSelectedRow(), 0).toString());
    }
    
    public void limparForm(){
        tfEquipeAdv.setText("");
        ftfData.setText("");
        ftfHora.setText("");
        tfEquipeAdv.requestFocus();
    }
    
    public void sair(){
        int x = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_CANCEL_OPTION);
        
        if(x == 0){
            dispose();
        }
    }
    
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
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btLimparAgd;
    private javax.swing.JButton btLimparForm;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSair;
    private javax.swing.JFormattedTextField ftfData;
    private javax.swing.JFormattedTextField ftfHora;
    private javax.swing.JMenuItem itMenuSair;
    private javax.swing.JMenuItem itMenuSobre;
    private javax.swing.JMenuItem itMenuVisualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCod;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbEquipeAdv;
    private javax.swing.JLabel lbHora;
    private javax.swing.JMenuBar mBar;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JTable tabAgenda;
    private javax.swing.JTextField tfCod;
    private javax.swing.JTextField tfEquipeAdv;
    // End of variables declaration//GEN-END:variables
}
