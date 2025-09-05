// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormFuncionario extends javax.swing.JFrame {

    private Contratado contratado;
    private static BDFuncionario bdFuncionario;
    private static FormFuncionario formFuncUnic;
    
    private FormFuncionario() {
        initComponents();
        bdFuncionario = BDFuncionario.getInstancia();
    }
    
    // Singleton
    public static FormFuncionario getInstancia(){
        if (formFuncUnic == null){
            formFuncUnic = new FormFuncionario();
            return formFuncUnic;
        }
        return formFuncUnic;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        lbIdade = new javax.swing.JLabel();
        lbCpf = new javax.swing.JLabel();
        lbSetor = new javax.swing.JLabel();
        lbCargo = new javax.swing.JLabel();
        lbSalario = new javax.swing.JLabel();
        lbDataContrat = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        ftfIdade = new javax.swing.JFormattedTextField();
        tfSetor = new javax.swing.JTextField();
        tfCargo = new javax.swing.JTextField();
        tfSalario = new javax.swing.JTextField();
        ftfDataContrat = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabFuncionario = new javax.swing.JTable();
        mBar = new javax.swing.JMenuBar();
        menuFuncionario = new javax.swing.JMenu();
        itMenuVisualizar = new javax.swing.JMenuItem();
        itMenuSair = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário de Funcionários");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btRemover.setText("Remover por CPF");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar por CPF");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar por CPF");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        lbNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbNome.setText("NOME:");

        lbIdade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbIdade.setText("IDADE:");

        lbCpf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbCpf.setText("CPF:");

        lbSetor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbSetor.setText("SETOR:");

        lbCargo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbCargo.setText("CARGO:");

        lbSalario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbSalario.setText("SALÁRIO:");

        lbDataContrat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbDataContrat.setText("DATA DE CONTRATO:");

        try {
            ftfIdade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfIdade.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        try {
            ftfDataContrat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfDataContrat.setToolTipText("");
        ftfDataContrat.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        tabFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "NOME", "IDADE", "SETOR", "CARGO", "SALARIO", "DATA_DE_CONTRATO"
            }
        ));
        tabFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabFuncionario);
        if (tabFuncionario.getColumnModel().getColumnCount() > 0) {
            tabFuncionario.getColumnModel().getColumn(6).setMinWidth(120);
        }

        menuFuncionario.setText("Funcionário");

        itMenuVisualizar.setMnemonic('V');
        itMenuVisualizar.setText("Visualizar");
        itMenuVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuVisualizarActionPerformed(evt);
            }
        });
        menuFuncionario.add(itMenuVisualizar);

        itMenuSair.setMnemonic('S');
        itMenuSair.setText("Sair");
        itMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuSairActionPerformed(evt);
            }
        });
        menuFuncionario.add(itMenuSair);

        mBar.add(menuFuncionario);

        menuSobre.setText("Ajuda");

        jMenuItem1.setMnemonic('S');
        jMenuItem1.setText("Sobre...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuSobre.add(jMenuItem1);

        mBar.add(menuSobre);

        setJMenuBar(mBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDataContrat)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbCpf)
                            .addComponent(lbSetor)
                            .addComponent(lbCargo)
                            .addComponent(lbNome)
                            .addComponent(lbSalario)
                            .addComponent(lbIdade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ftfDataContrat, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfSalario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCargo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfSetor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btLimpar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btSair))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btCadastrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btConsultar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btRemover)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btAtualizar))))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCpf)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdade)
                    .addComponent(ftfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSetor)
                    .addComponent(tfSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCargo)
                    .addComponent(tfCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSalario)
                    .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataContrat)
                    .addComponent(ftfDataContrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizar)
                    .addComponent(btRemover)
                    .addComponent(btConsultar)
                    .addComponent(btCadastrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrar();
        atualizarTab();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparForm();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        atualizar();
        atualizarTab();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        remover();
        atualizarTab();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void tabFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabFuncionarioMouseClicked
        selecionarTab();
    }//GEN-LAST:event_tabFuncionarioMouseClicked

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "Os Funcionários armazenados no Banco de Dados podem ser gerenciados a\n"
                + "partir do Formulário. Você pode utilizar as opções de gestão no\n"
                + "formulário e através do menu de opções", "Sobre", 1);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itMenuVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuVisualizarActionPerformed
        consultar();
    }//GEN-LAST:event_itMenuVisualizarActionPerformed

    private void itMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuSairActionPerformed
        sair();
    }//GEN-LAST:event_itMenuSairActionPerformed

    public Contratado validaForm(){
        contratado = new Contratado();
        
        try{
            contratado.setNome(tfNome.getText());
            contratado.setCpf(Integer.parseInt(tfCpf.getText().trim()));
            contratado.setIdade(Integer.parseInt((ftfIdade.getText().trim())));
            contratado.setSetor(tfSetor.getText());
            contratado.setCargo(tfCargo.getText());
            contratado.setSalario(Double.parseDouble(tfSalario.getText().trim()));
            String dataCont[] = ftfDataContrat.getText().split("/");
            contratado.setDataContrat(
                    String.format("%02d", Integer.parseInt(dataCont[0].trim()))+"/"
                    +String.format("%02d", Integer.parseInt(dataCont[1].trim()))+"/"
                    +String.format("%04d", Integer.parseInt(dataCont[2].trim())));
            return contratado;
        }
        catch(StringGrdException sge){
            JOptionPane.showMessageDialog(null, "O Valor de entrada deve conter menos que 25 letras!", "ERRO de Entrada", 0);
        }
        catch(StringVaziaException sve){
            JOptionPane.showMessageDialog(null, "Todos os campos deve estar preenchidos!", "Entrada Inválida", 0);
        }
        catch(CpfPeqException cpe){
            JOptionPane.showMessageDialog(null, "O CPF deve ser um número positivo!", "CPF Inválido", 0);
        }
        catch(CpfGrdException cge){
            JOptionPane.showMessageDialog(null, "O CPF deve conter menos que 10 digitos!", "CPF Inválido", 0);
        }
        catch(IdadePeqException ipe){
            JOptionPane.showMessageDialog(null, "A Idade deve ser Maior ou Igual a 18!", "Idade Inválida", 0);
        }
        catch(SalPeqException spe){
            JOptionPane.showMessageDialog(null, "O Salário deve ser maior que R$1400,00!", "Salário Inválido", 0);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O Valor de Entrada deve ser um inteiro!", "ERRO de Entrada", 0);
        }
        
        return null;
    }//fim defineFunc
    
    
    public void limparForm(){
        tfNome.setText("");
        ftfIdade.setText("");
        tfCpf.setText("");
        tfSetor.setText("");
        tfCargo.setText("");
        tfSalario.setText("");
        ftfDataContrat.setText("");
        tfCpf.requestFocus();
    }
    
    public void cadastrar(){
        contratado = validaForm();
        
        if(contratado != null){
            contratado = bdFuncionario.cadContrat(contratado);
            if(contratado != null){
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!", "Cadastro de Funcionário", 1);
                limparForm();
            }
            else{
                JOptionPane.showMessageDialog(null, "CPF de Funcionário já cadastrado.", "ERRO de Cadastro", 0);
            }
        }
    }//fim cadastrar
    
    public void atualizar(){
        contratado = validaForm();
        
        if(contratado != null){
            contratado = bdFuncionario.attContratCpf(contratado);
            if(contratado != null){
                JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso!", "Atualização de Funcionário", 1);
                limparForm();
            }
            else{
                JOptionPane.showMessageDialog(null, "CPF de Funcionário Inexistente!", "ERRO de Atualização", 0);
            }
        }
    }//fim atualizar
    
    public void remover(){
        contratado = new Contratado();
        try{
            contratado.setCpf(Integer.parseInt(tfCpf.getText()));
            
            contratado = bdFuncionario.delContratCpf(contratado);
            if(contratado != null){
                JOptionPane.showMessageDialog(null, "Funcionário removido com sucesso!", "Remoção de Funcionário", 1);
                limparForm();
            }
            else{
                JOptionPane.showMessageDialog(null, "CPF de Funcionário Inexistente!", "ERRO de Remoção", 0);
            }
        }
        catch(CpfPeqException cpe){
            JOptionPane.showMessageDialog(null, "O CPF deve ser um número positivo!", "CPF Inválido", 0);
        }
        catch(CpfGrdException cge){
            JOptionPane.showMessageDialog(null, "O CPF deve conter menos que 10 digitos!", "CPF Inválido", 0);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O Valor de entrada deve ser um inteiro!", "ERRO de Entrada", 0);
        }

    }//fim remover
    
    public void consultar(){
        contratado = new Contratado();
        try{
            contratado.setCpf(Integer.parseInt(tfCpf.getText()));
            
            contratado = bdFuncionario.consContratCpf(contratado);
            
            if(contratado != null){
                tfCpf.setText(Integer.toString(contratado.getCpf()));
                tfNome.setText(contratado.getNome());
                ftfIdade.setText(Integer.toString(contratado.getIdade()));
                tfSetor.setText(contratado.getSetor());
                tfCargo.setText(contratado.getCargo());
                tfSalario.setText(Double.toString(contratado.getSalario()));
                ftfDataContrat.setText(contratado.getDataContrat());
                tfCpf.requestFocus();
                JOptionPane.showMessageDialog(null, "Verifique os dados da consulta.", "Consulta de Funcionário", 1);
                limparForm();
            }
            else{
                JOptionPane.showMessageDialog(null, "CPF de Funcionário Inexistente!", "ERRO de Consulta", 0);        }
        }
        catch(CpfPeqException cpe){
            JOptionPane.showMessageDialog(null, "O CPF deve ser um número positivo!", "CPF Inválido", 0);
        }
        catch(CpfGrdException cge){
            JOptionPane.showMessageDialog(null, "O CPF deve conter menos que 10 digitos!", "CPF Inválido", 0);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O Valor de entrada deve ser um inteiro!", "ERRO de Entrada", 0);
        }
    }
    
    public void atualizarTab(){
        DefaultTableModel modelo = (DefaultTableModel) tabFuncionario.getModel();
        
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(Contratado c: bdFuncionario.getBdFuncionario()){
            modelo.insertRow(posLin, new Object[]{
                c.getCpf(),
                c.getNome(),
                c.getIdade(),
                c.getSetor(),
                c.getCargo(),
                c.getSalario(),
                c.getDataContrat()
            });
            posLin++;
        }
        
        
    }
    
    public void selecionarTab(){
        DefaultTableModel modelo = (DefaultTableModel) tabFuncionario.getModel();
        tfCpf.setText(modelo.getValueAt(tabFuncionario.getSelectedRow(), 0).toString());
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
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSair;
    private javax.swing.JFormattedTextField ftfDataContrat;
    private javax.swing.JFormattedTextField ftfIdade;
    private javax.swing.JMenuItem itMenuSair;
    private javax.swing.JMenuItem itMenuVisualizar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbDataContrat;
    private javax.swing.JLabel lbIdade;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSalario;
    private javax.swing.JLabel lbSetor;
    private javax.swing.JMenuBar mBar;
    private javax.swing.JMenu menuFuncionario;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JTable tabFuncionario;
    private javax.swing.JTextField tfCargo;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfSetor;
    // End of variables declaration//GEN-END:variables
}
