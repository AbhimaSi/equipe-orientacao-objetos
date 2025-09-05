// Nome: Abhimael Sidney Setni Rogatti RA: 2618001

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormPres extends javax.swing.JFrame {
    private static FormPres formPresUnic;
    private static BDMemEquipe bdMemEquipe;
    private Presidente presidente;
    
    private FormPres() {
        initComponents();
        bdMemEquipe = BDMemEquipe.getInstancia();
    }
    
    //Singleton
    public static FormPres getInstancia(){
        if(formPresUnic == null){
            formPresUnic = new FormPres();
            return formPresUnic;
        }
        return formPresUnic;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCpf = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbIdade = new javax.swing.JLabel();
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
        lbNumMdt = new javax.swing.JLabel();
        lbNumMandato = new javax.swing.JLabel();
        lbTipoEleicao = new javax.swing.JLabel();
        rbDireta = new javax.swing.JRadioButton();
        rbIndireta = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPres = new javax.swing.JTable();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        mBar = new javax.swing.JMenuBar();
        menuPresidente = new javax.swing.JMenu();
        itMenuVisualizar = new javax.swing.JMenuItem();
        itMenuSair = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário de Presidentes");

        lbCpf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbCpf.setText("CPF:");

        lbNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbNome.setText("NOME:");

        lbIdade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbIdade.setText("IDADE:");

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
        ftfDataContrat.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        lbNumMdt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbNumMdt.setText("NÚMERO DE MANDATO:");

        lbNumMandato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbNumMandato.setText("1");

        lbTipoEleicao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTipoEleicao.setText("TIPO DE ELEIÇÃO:");

        rbDireta.setSelected(true);
        rbDireta.setText("Direta");
        rbDireta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDiretaActionPerformed(evt);
            }
        });

        rbIndireta.setText("Indireta");
        rbIndireta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIndiretaActionPerformed(evt);
            }
        });

        tabPres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NUM_MANDATO", "NOME", "SALÁRIO", "SAL_EXTRA", "DATA_ELEIÇÃO"
            }
        ));
        tabPres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabPres);

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar por Mandato");
        btConsultar.setEnabled(false);
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar por Mandato");
        btAtualizar.setEnabled(false);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btRemover.setText("Remover por Mandato");
        btRemover.setEnabled(false);
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        menuPresidente.setText("Presidente");

        itMenuVisualizar.setMnemonic('V');
        itMenuVisualizar.setText("Visualizar");
        itMenuVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuVisualizarActionPerformed(evt);
            }
        });
        menuPresidente.add(itMenuVisualizar);

        itMenuSair.setMnemonic('S');
        itMenuSair.setText("Sair");
        itMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuSairActionPerformed(evt);
            }
        });
        menuPresidente.add(itMenuSair);

        mBar.add(menuPresidente);

        menuAjuda.setText("Ajuda");

        jMenuItem1.setMnemonic('S');
        jMenuItem1.setText("Sobre...");
        jMenuItem1.setToolTipText("");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuAjuda.add(jMenuItem1);

        mBar.add(menuAjuda);

        setJMenuBar(mBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNumMdt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNumMandato))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRemover))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTipoEleicao)
                        .addGap(18, 18, 18)
                        .addComponent(rbDireta)
                        .addGap(18, 18, 18)
                        .addComponent(rbIndireta))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbCargo)
                            .addComponent(lbSalario)
                            .addComponent(lbSetor)
                            .addComponent(lbIdade)
                            .addComponent(lbNome)
                            .addComponent(lbCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfSetor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfCargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDataContrat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfDataContrat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btLimpar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btSair))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
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
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumMdt)
                    .addComponent(lbNumMandato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipoEleicao)
                    .addComponent(rbDireta)
                    .addComponent(rbIndireta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btConsultar)
                    .addComponent(btAtualizar)
                    .addComponent(btRemover))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbDiretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDiretaActionPerformed
        rbIndireta.setSelected(false);
    }//GEN-LAST:event_rbDiretaActionPerformed

    private void rbIndiretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIndiretaActionPerformed
        rbDireta.setSelected(false);
    }//GEN-LAST:event_rbIndiretaActionPerformed

    private void tabPresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPresMouseClicked
        selecionaMandato();
    }//GEN-LAST:event_tabPresMouseClicked

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

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparForm();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "O Banco de Dados de Equipe só pode conter um único Presidente"
                + "\n e pode ser gerenciado a partir do Formulário. Você pode utilizar as\n opções de gestão"
                + " no formulário e através do menu de opções. ", "Sobre", 1);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuSairActionPerformed
        sair();
    }//GEN-LAST:event_itMenuSairActionPerformed

    private void itMenuVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuVisualizarActionPerformed
        consultar();
    }//GEN-LAST:event_itMenuVisualizarActionPerformed

    public Presidente validaForm(){
        presidente = new Presidente();
        
        try{
            presidente.setCpf(Integer.parseInt(tfCpf.getText().trim()));
            presidente.setNome(tfNome.getText());
            presidente.setIdade(Integer.parseInt((ftfIdade.getText().trim())));
            presidente.setSetor(tfSetor.getText());
            presidente.setCargo(tfCargo.getText());
            presidente.setSalario(Double.parseDouble(tfSalario.getText().trim()));
            String dataCont[] = ftfDataContrat.getText().split("/");
            presidente.setDataContrat(
                    String.format("%02d", Integer.parseInt(dataCont[0].trim()))+"/"
                    +String.format("%02d", Integer.parseInt(dataCont[1].trim()))+"/"
                    +String.format("%04d", Integer.parseInt(dataCont[2].trim())));
            if(rbDireta.isSelected()){
                presidente.setTipoEleicao("Direta");
            }
            else{
                presidente.setTipoEleicao("Indireta");
            }
            return presidente;
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
        catch(EntradaIncorretaException eie){
            JOptionPane.showMessageDialog(null, "Valor de entrada inválido!", "Entrada Inválida", 0);
        }
        
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O Valor de Entrada deve ser um inteiro!", "ERRO de Entrada", 0);
        }
        
        return null;
    }//fim defineFunc
    
    public void cadastrar(){
        presidente = validaForm();
        
        if(presidente != null){
            presidente = bdMemEquipe.cadMemCpf(presidente);
            if(presidente != null){
                JOptionPane.showMessageDialog(null, "Presidente cadastrado com sucesso!", "Cadastro de Presidente", 1);
                limparForm();
            }
            else{
                JOptionPane.showMessageDialog(null, "Mandato de Presidente já cadastrado.", "ERRO de Cadastro", 0);
            }
        }
    }//fim cadastrar
    
    public void atualizar(){
        presidente = validaForm();
        if(presidente != null){
            try{
                presidente.setNumMandato(Integer.parseInt(lbNumMandato.getText()));
                presidente = bdMemEquipe.attPresNumMandato(presidente);
                if(presidente != null){
                    JOptionPane.showMessageDialog(null, "Presidente atualizado com sucesso!", "Atualização de Presidente", 1);
                    limparForm();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Mandato de Presidente Inexistente!", "ERRO de Atualização", 0);
                }
            }

            catch(ValPeqException vpe){
                JOptionPane.showMessageDialog(null, "O Valor de entrada deve ser maior que 0!", "Valor Inválido", 0);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "O Valor de entrada deve ser um inteiro!", "ERRO de Entrada", 0);
            }

        }

    }//fim atualizar
        
    public void remover(){
        presidente = new Presidente();
        try{
            presidente.setNumMandato(Integer.parseInt(lbNumMandato.getText()));
            
            presidente = bdMemEquipe.delPresNumMandato(presidente);
            if(presidente != null){
                JOptionPane.showMessageDialog(null, "Presidente removido com sucesso!", "Remoção de Presidente", 1);
                limparForm();
            }
            else{
                JOptionPane.showMessageDialog(null, "Mandato de Presidente Inexistente!", "ERRO de Remoção", 0);
            }
        }
        catch(ValPeqException vpe){
            JOptionPane.showMessageDialog(null, "O Valor de entrada deve ser maior que 0!", "Valor Inválido", 0);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O Valor de entrada deve ser um inteiro!", "ERRO de Entrada", 0);
        }

    }//fim remover
    
    public void consultar(){
        presidente = new Presidente();
        try{
            presidente.setNumMandato(Integer.parseInt(lbNumMandato.getText()));
            
            presidente = bdMemEquipe.consPresNumMandato(presidente);
            
            if(presidente != null){
                tfCpf.setText(Integer.toString(presidente.getCpf()));
                tfNome.setText(presidente.getNome());
                ftfIdade.setText(Integer.toString(presidente.getIdade()));
                tfSetor.setText(presidente.getSetor());
                tfCargo.setText(presidente.getCargo());
                tfSalario.setText(Double.toString(presidente.getSalario()));
                ftfDataContrat.setText(presidente.getDataContrat());
                if(presidente.getTipoEleicao().equals("Direta")){
                    rbDireta.setSelected(true);
                    rbIndireta.setSelected(false);
                }
                else{
                    rbDireta.setSelected(false);
                    rbIndireta.setSelected(true);
                }
                tfCpf.requestFocus();
                JOptionPane.showMessageDialog(null, "Verifique os dados da consulta.", "Consulta de Funcionário", 1);
                limparForm();
            }
            else{
                JOptionPane.showMessageDialog(null, "Número de Mandato Inexistente!", "ERRO de Consulta", 0);        }
        }
        catch(ValPeqException vpe){
            JOptionPane.showMessageDialog(null, "O Valor de entrada deve ser maior que 0!", "Valor Inválido", 0);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O Valor de entrada deve ser um inteiro!", "ERRO de Entrada", 0);
        }
        
    }
    
    public void limparForm(){
        tfNome.setText("");
        ftfIdade.setText("");
        tfCpf.setText("");
        tfSetor.setText("");
        tfCargo.setText("");
        tfSalario.setText("");
        ftfDataContrat.setText("");
        rbDireta.setSelected(true);
        rbIndireta.setSelected(false);
        deselecionaMandato();
        tfCpf.requestFocus();
    }
    
    public void atualizarTab(){
        DefaultTableModel modelo = (DefaultTableModel) tabPres.getModel();
        
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(Presidente p: bdMemEquipe.getBdPres()){
            modelo.insertRow(posLin, new Object[]{
                p.getNumMandato(),
                p.getNome(),
                p.getSalario(),
                p.getSalExtra(),
                p.getDataContrat()
            });
        }

    }
    
    public void deselecionaMandato(){
        lbNumMandato.setText(Integer.toString(bdMemEquipe.getNumMandatoPres()+1));
        btAtualizar.setEnabled(false);
        btConsultar.setEnabled(false);
        btRemover.setEnabled(false);
    }
    
    public void selecionaMandato(){
        DefaultTableModel modelo = (DefaultTableModel) tabPres.getModel();
        lbNumMandato.setText(modelo.getValueAt(tabPres.getSelectedRow(), 0).toString());
        btAtualizar.setEnabled(true);
        btConsultar.setEnabled(true);
        btRemover.setEnabled(true);
    }
    
    public void sair(){
        int x = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_CANCEL_OPTION);
        
        if(x == 0){
            dispose();
        }
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
            java.util.logging.Logger.getLogger(FormPres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPres().setVisible(true);
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
    private javax.swing.JLabel lbNumMandato;
    private javax.swing.JLabel lbNumMdt;
    private javax.swing.JLabel lbSalario;
    private javax.swing.JLabel lbSetor;
    private javax.swing.JLabel lbTipoEleicao;
    private javax.swing.JMenuBar mBar;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuPresidente;
    private javax.swing.JRadioButton rbDireta;
    private javax.swing.JRadioButton rbIndireta;
    private javax.swing.JTable tabPres;
    private javax.swing.JTextField tfCargo;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfSetor;
    // End of variables declaration//GEN-END:variables
}
