// Nome: Abhimael Sidney Setni Rogatti RA: 2618001

import javax.swing.JOptionPane;

public class FormEquipe extends javax.swing.JFrame {
    private static FormEquipe formEquipeUnic;
    
    private static BDAgenda bdAgenda;
    
    private static BDMemEquipe bdMemEquipe;
    private static BDFuncionario bdFunc;
    
    private static BDEquipe bdEquipe;
    
    private Equipe equipe;
    
    private FormEquipe() {
        initComponents();
        bdAgenda = BDAgenda.getInstancia();
        bdEquipe = BDEquipe.getInstancia();
        bdMemEquipe = BDMemEquipe.getInstancia();
        bdFunc = BDFuncionario.getInstancia();
    }
    
    //Singleton
    public static FormEquipe getInstancia(){
        if(formEquipeUnic == null){
            formEquipeUnic = new FormEquipe();
            return formEquipeUnic;
        }
        return formEquipeUnic;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbClube = new javax.swing.JLabel();
        lbPais = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();
        lbEsporte = new javax.swing.JLabel();
        lbPatrimonio = new javax.swing.JLabel();
        lbDataCriacao = new javax.swing.JLabel();
        tfNomeClube = new javax.swing.JTextField();
        tfPais = new javax.swing.JTextField();
        tfEstado = new javax.swing.JTextField();
        tfEsporte = new javax.swing.JTextField();
        tfPatrimonio = new javax.swing.JTextField();
        tftDataCriacao = new javax.swing.JFormattedTextField();
        lbPremio = new javax.swing.JLabel();
        tfPremio = new javax.swing.JTextField();
        btAdcDist = new javax.swing.JButton();
        btAdc = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        lbCadastro = new javax.swing.JLabel();
        lbNC = new javax.swing.JLabel();
        lbNumContratados = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btLimparDist = new javax.swing.JButton();
        btLimparBd = new javax.swing.JButton();
        mBar = new javax.swing.JMenuBar();
        menuEquipe = new javax.swing.JMenu();
        itMenuVisualizar = new javax.swing.JMenuItem();
        itMenuSair = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itMenuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Equipe");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lbClube.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbClube.setText("CLUBE:");

        lbPais.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPais.setText("PAÍS:");

        lbEstado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbEstado.setText("ESTADO:");

        lbEsporte.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbEsporte.setText("ESPORTE:");

        lbPatrimonio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPatrimonio.setText("PATRIMÔNIO:");

        lbDataCriacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbDataCriacao.setText("DATA DE CRIAÇÃO:");

        try {
            tftDataCriacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tftDataCriacao.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        lbPremio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPremio.setText("PRÊMIO:");

        btAdcDist.setText("Adcionar e Distribuir");
        btAdcDist.setEnabled(false);
        btAdcDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdcDistActionPerformed(evt);
            }
        });

        btAdc.setText("Adcionar");
        btAdc.setEnabled(false);
        btAdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdcActionPerformed(evt);
            }
        });

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

        lbCadastro.setForeground(new java.awt.Color(255, 0, 0));
        lbCadastro.setText("Já Cadastrado");

        lbNC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNC.setText("NÚMERO DE CONTRATADOS:");

        lbNumContratados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNumContratados.setText("0");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.setEnabled(false);
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.setEnabled(false);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btRemover.setText("Remover");
        btRemover.setEnabled(false);
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btLimparDist.setText("Limpar Distribuição");
        btLimparDist.setEnabled(false);
        btLimparDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparDistActionPerformed(evt);
            }
        });

        btLimparBd.setText("Limpar Banco de Dados");
        btLimparBd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparBdActionPerformed(evt);
            }
        });

        menuEquipe.setText("Equipe");

        itMenuVisualizar.setMnemonic('V');
        itMenuVisualizar.setText("Visualizar...");
        itMenuVisualizar.setEnabled(false);
        itMenuVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuVisualizarActionPerformed(evt);
            }
        });
        menuEquipe.add(itMenuVisualizar);

        itMenuSair.setMnemonic('S');
        itMenuSair.setText("Sair");
        itMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuSairActionPerformed(evt);
            }
        });
        menuEquipe.add(itMenuSair);

        mBar.add(menuEquipe);

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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btAdc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAdcDist)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLimparDist))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbDataCriacao)
                                    .addComponent(lbPatrimonio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPatrimonio, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(tftDataCriacao)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbEsporte)
                                    .addComponent(lbEstado)
                                    .addComponent(lbPais)
                                    .addComponent(lbClube))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPais, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tfEstado, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfEsporte, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(197, 197, 197))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfNomeClube, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbCadastro))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(btConsultar)
                                .addGap(18, 18, 18)
                                .addComponent(btAtualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btRemover)
                                .addGap(79, 79, 79)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPremio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPremio, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(lbNC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNumContratados)
                                .addGap(0, 17, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btLimparBd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btSair)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbClube)
                    .addComponent(tfNomeClube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPais)
                    .addComponent(tfPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstado)
                    .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEsporte)
                    .addComponent(tfEsporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPatrimonio)
                    .addComponent(tfPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataCriacao)
                    .addComponent(tftDataCriacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btConsultar)
                    .addComponent(btAtualizar)
                    .addComponent(btRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPremio)
                    .addComponent(tfPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNC)
                    .addComponent(lbNumContratados))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdcDist)
                    .addComponent(btAdc)
                    .addComponent(btLimparDist))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar)
                    .addComponent(btLimparBd))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdcActionPerformed
        adcionarPremio();
    }//GEN-LAST:event_btAdcActionPerformed

    private void btAdcDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdcDistActionPerformed
        adcionarDistribuirPremio();
    }//GEN-LAST:event_btAdcDistActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparForm();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void itMenuVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuVisualizarActionPerformed
        consultarEquipe();
    }//GEN-LAST:event_itMenuVisualizarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrarEquipe();
        verificaEquipe();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultarEquipe();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        atualizarEquipe();
        verificaEquipe();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        removerEquipe();
        verificaEquipe();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        verificaEquipe();
    }//GEN-LAST:event_formWindowActivated

    private void btLimparBdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparBdActionPerformed
        limparBD();
        verificaEquipe();
    }//GEN-LAST:event_btLimparBdActionPerformed

    private void btLimparDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparDistActionPerformed
        limparDistribuicao();
    }//GEN-LAST:event_btLimparDistActionPerformed

    private void itMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuSobreActionPerformed
        JOptionPane.showMessageDialog(null, "A Equipe pode ser gerenciada através deste Formulário. Para que possa"
                + "\n haver adição de prêmios é necessário que haja pelo menos um Presidente, um Técnico e um Jogador.\n"
                + "Também é possivel limpar o Banco de Dados através do botão [Limpar Banco de Dados]", "Sobre", 1);
    }//GEN-LAST:event_itMenuSobreActionPerformed

    private void itMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuSairActionPerformed
        sair();
    }//GEN-LAST:event_itMenuSairActionPerformed

    public void verificaEquipe(){//fim verificaEquipe
        if(bdEquipe.getBdEquipe().getNomeClube() != ""){
            
            lbCadastro.setText("Já Cadastrado");
            
            tfNomeClube.setText(bdEquipe.getBdEquipe().getNomeClube());
            tfNomeClube.setEditable(false);
            
            btConsultar.setEnabled(true);
            btAtualizar.setEnabled(true);
            btRemover.setEnabled(true);

            if(bdMemEquipe.valEquipe()){
                tfPremio.setEditable(true);
                btAdc.setEnabled(true);
                btAdcDist.setEnabled(true);
                btLimparDist.setEnabled(true);
            }

            itMenuVisualizar.setEnabled(true);
        
        }
        
        else{
        
            lbCadastro.setText("");
            
            tfNomeClube.setText("");
            tfNomeClube.setEditable(true);
            
            btConsultar.setEnabled(false);
            btAtualizar.setEnabled(false);
            btRemover.setEnabled(false);

            tfPremio.setEditable(false);
            btAdc.setEnabled(false);
            btAdcDist.setEnabled(false);
            btLimparDist.setEnabled(false);
            
            itMenuVisualizar.setEnabled(false);
        
        }
    }
    
    public Equipe validaForm(){
        equipe = new Equipe();
        
        try{
            
            equipe.setNomeClube(tfNomeClube.getText());

            equipe.setPais(tfPais.getText());
            equipe.setEstado(tfEstado.getText());
            equipe.setEsporte(tfEsporte.getText());
            equipe.setPatrimonio(Double.parseDouble(tfPatrimonio.getText()));
            equipe.setDataCriacao(tftDataCriacao.getText());
            
            return equipe;
        }
        catch(StringVaziaException sve){
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "ERRO de Entrada", 0);
        }
        catch(StringGrdException sge){
            JOptionPane.showMessageDialog(null, "O valor de entrada deve conter menos que 25 letras!", "Entrada Inválida", 0);
        }
        catch(ValPeqException vpe){
            JOptionPane.showMessageDialog(null, "O Valor deve ser maior que 0!", "ERRO de Entrada", 0);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Valor com formato inválido!", "ERRO de Entrada", 0);
        }
        
        return null;
    }//fim validaForm
    
    public void cadastrarEquipe(){
        equipe = validaForm();
        
        if(equipe != null){
            equipe = bdEquipe.cadEquipe(equipe);
            
            if(equipe != null){
                JOptionPane.showMessageDialog(null, "Equipe cadastrada com sucesso!", "Cadastro de Equipe", 1);
                limparForm();
            }
            else{
                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar equipe.", "Cadastro de Equipe", 0);
            }
        }
    }//fim cadastrar
    
    public void consultarEquipe(){
        equipe = new Equipe();
        
        try{
            equipe.setNomeClube(tfNomeClube.getText());
            
            equipe = bdEquipe.consEquipe(equipe);
            
            if(equipe != null){
                
                tfNomeClube.setText(equipe.getNomeClube());
                tfPais.setText(equipe.getPais());
                tfEstado.setText(equipe.getEstado());
                tfEsporte.setText(equipe.getEsporte());
                tfPatrimonio.setText(String.format("%.2f", equipe.getPatrimonio()));
                tftDataCriacao.setText(equipe.getDataCriacao());
                lbNumContratados.setText(Integer.toString(bdMemEquipe.getNumMembros() + bdFunc.getNumFuncionarios()));
                JOptionPane.showMessageDialog(null, "Confirme os dados cadastrados.", "Consulta de Equipe", 1);
                limparForm();
                verificaEquipe();
            }
        }
        catch(StringVaziaException sve){
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "ERRO de Entrada", 0);
        }
        catch(StringGrdException sge){
            JOptionPane.showMessageDialog(null, "Valor de entrada deve conter menos que 25 letras!", "ERRO de Entrada", 0);
        }
        
        

    }//fim consultar
    
    public void atualizarEquipe(){
        equipe = validaForm();
        
        if(equipe != null){
            equipe = bdEquipe.attEquipe(equipe);
            
            if(equipe != null){
                JOptionPane.showMessageDialog(null, "Equipe atualizada com sucesso!", "Atualização de Equipe", 1);
                limparForm();
            }
            else{
                JOptionPane.showMessageDialog(null, "Não foi possível atualizar equipe.", "Atualização de Equipe", 0);
            }
        }
    }//fim atualizar
    
    public void removerEquipe(){
        equipe = new Equipe();
        
        try{
            
            equipe.setNomeClube(tfNomeClube.getText());
            equipe = bdEquipe.consEquipe(equipe);
            if(equipe != null){
                
                equipe = bdEquipe.delEquipe(equipe);
                if(equipe != null){
                    JOptionPane.showMessageDialog(null, "Equipe removida com sucesso!", "Remoção de Equipe", 1);
                    limparForm();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Não foi possível remover equipe.", "Remoção de Equipe", 0);
                }
            }
            
        }
        
        catch(StringVaziaException sve){}
        catch(StringGrdException sge){}
        
    }//fim remover
    
    public void adcionarPremio(){
        bdEquipe.somaPatrimonio(Double.parseDouble(tfPremio.getText()));
        JOptionPane.showMessageDialog(null, "Prêmio cadastrado com sucesso!", "Adição de Prêmio", 1);
    }//fim adcionarPremio
    
    public void adcionarDistribuirPremio(){
        double premio = 0;
        premio = Double.parseDouble(tfPremio.getText());
        bdMemEquipe.distPremio(premio *= 0.30);
        bdEquipe.somaPatrimonio(premio*=0.70);
        JOptionPane.showMessageDialog(null, "Prêmio cadastrado com sucesso!", "Adição de Prêmio", 1);
        JOptionPane.showMessageDialog(null, "Prêmio distribuído com sucesso!", "Distribuição de Prêmio", 1);
    }//fim adcioanrDistribuir
    
    public void limparDistribuicao(){
        bdMemEquipe.limparDist();
        JOptionPane.showMessageDialog(null, "Distribuição de prêmio removida com sucesso!", "Remover Distribuição", 1);
    }
    
    public void limparBD(){
        int x = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja limpar banco de dados? (Ação Irreversível)", "Limpeza BD", JOptionPane.YES_NO_CANCEL_OPTION, 2);
        
        if(x == 0){
            bdMemEquipe.limparBD();
            bdFunc.limparBD();
            BDAgenda.limpaAgenda();
            JOptionPane.showMessageDialog(null, "Banco de dados limpo com sucesso!", "Limpeza BD", 1);
        }

        
    }//fim limparBD
    
    public void limparForm(){
        
        tfNomeClube.setText("");
        tfPais.setText("");
        tfEstado.setText("");
        tfEsporte.setText("");
        tfPatrimonio.setText("");
        tftDataCriacao.setText("");
        tfPremio.setText("");
        lbNumContratados.setText("0");
        tfNomeClube.requestFocus();
        
    }//fim limparForm
    
    public void sair(){
        int x = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_CANCEL_OPTION);
        
        if(x == 0){
            dispose();
        }
    }//fim sair
    
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
            java.util.logging.Logger.getLogger(FormEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEquipe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdc;
    private javax.swing.JButton btAdcDist;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btLimparBd;
    private javax.swing.JButton btLimparDist;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSair;
    private javax.swing.JMenuItem itMenuSair;
    private javax.swing.JMenuItem itMenuSobre;
    private javax.swing.JMenuItem itMenuVisualizar;
    private javax.swing.JLabel lbCadastro;
    private javax.swing.JLabel lbClube;
    private javax.swing.JLabel lbDataCriacao;
    private javax.swing.JLabel lbEsporte;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbNC;
    private javax.swing.JLabel lbNumContratados;
    private javax.swing.JLabel lbPais;
    private javax.swing.JLabel lbPatrimonio;
    private javax.swing.JLabel lbPremio;
    private javax.swing.JMenuBar mBar;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuEquipe;
    private javax.swing.JTextField tfEsporte;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfNomeClube;
    private javax.swing.JTextField tfPais;
    private javax.swing.JTextField tfPatrimonio;
    private javax.swing.JTextField tfPremio;
    private javax.swing.JFormattedTextField tftDataCriacao;
    // End of variables declaration//GEN-END:variables
}
