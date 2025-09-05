// Nome: Abhimael Sidney Setni Rogatti RA: 2618001

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormTec extends javax.swing.JFrame {

    private static FormTec formTecUnic;
    private static BDMemEquipe bdMemEquipe;
    private Tecnico tecnico;
    
    private FormTec() {
        initComponents();
        bdMemEquipe = BDMemEquipe.getInstancia();
    }

    //Singleton
    public static FormTec getInstancia(){
        if(formTecUnic == null){
            formTecUnic = new FormTec();
            return formTecUnic;
        }
        return formTecUnic;
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
        spIdade = new javax.swing.JSpinner();
        tfNome = new javax.swing.JTextField();
        tfSetor = new javax.swing.JTextField();
        tfCargo = new javax.swing.JTextField();
        tfSalario = new javax.swing.JTextField();
        ftfDataContrat = new javax.swing.JFormattedTextField();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        spCertificados = new javax.swing.JScrollPane();
        tabCertificados = new javax.swing.JTable();
        spPremios = new javax.swing.JScrollPane();
        tabPremios = new javax.swing.JTable();
        btCadastrar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        lbCadastro = new javax.swing.JLabel();
        lbSE = new javax.swing.JLabel();
        lbSalExtra = new javax.swing.JLabel();
        mBar = new javax.swing.JMenuBar();
        menuTecnico = new javax.swing.JMenu();
        itMenuVisualizar = new javax.swing.JMenuItem();
        subMenuCertificados = new javax.swing.JMenu();
        itMenuCadastrarCertificado = new javax.swing.JMenuItem();
        itMenuRemoverCertificado = new javax.swing.JMenuItem();
        itMenuLimparCertificado = new javax.swing.JMenuItem();
        subMenuPremios = new javax.swing.JMenu();
        itMenuCadastrarPremio = new javax.swing.JMenuItem();
        itMenuRemoverPremio = new javax.swing.JMenuItem();
        itMenuLimparPremio = new javax.swing.JMenuItem();
        itMenuSair = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itMenuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário de Técnico");

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

        spIdade.setModel(new javax.swing.SpinnerNumberModel(18, 18, 999, 1));

        try {
            ftfDataContrat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfDataContrat.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

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

        tabCertificados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Certificados"
            }
        ));
        spCertificados.setViewportView(tabCertificados);
        if (tabCertificados.getColumnModel().getColumnCount() > 0) {
            tabCertificados.getColumnModel().getColumn(0).setHeaderValue("Certificados");
        }

        tabPremios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Premios"
            }
        ));
        spPremios.setViewportView(tabPremios);

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar por CPF");
        btConsultar.setEnabled(false);
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar por CPF");
        btAtualizar.setEnabled(false);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btRemover.setText("Remover por CPF");
        btRemover.setEnabled(false);
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        lbCadastro.setForeground(new java.awt.Color(255, 0, 0));

        lbSE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbSE.setText("SALÁRIO EXTRA:");

        lbSalExtra.setText("0");

        menuTecnico.setText("Tecnico");

        itMenuVisualizar.setMnemonic('V');
        itMenuVisualizar.setText("Visualizar...");
        itMenuVisualizar.setEnabled(false);
        itMenuVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuVisualizarActionPerformed(evt);
            }
        });
        menuTecnico.add(itMenuVisualizar);

        subMenuCertificados.setMnemonic('C');
        subMenuCertificados.setText("Certificados");
        subMenuCertificados.setEnabled(false);

        itMenuCadastrarCertificado.setMnemonic('C');
        itMenuCadastrarCertificado.setText("Cadastrar...");
        itMenuCadastrarCertificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuCadastrarCertificadoActionPerformed(evt);
            }
        });
        subMenuCertificados.add(itMenuCadastrarCertificado);

        itMenuRemoverCertificado.setMnemonic('R');
        itMenuRemoverCertificado.setText("Remover...");
        itMenuRemoverCertificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuRemoverCertificadoActionPerformed(evt);
            }
        });
        subMenuCertificados.add(itMenuRemoverCertificado);

        itMenuLimparCertificado.setMnemonic('L');
        itMenuLimparCertificado.setText("Limpar...");
        itMenuLimparCertificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuLimparCertificadoActionPerformed(evt);
            }
        });
        subMenuCertificados.add(itMenuLimparCertificado);

        menuTecnico.add(subMenuCertificados);

        subMenuPremios.setMnemonic('P');
        subMenuPremios.setText("Premios");
        subMenuPremios.setEnabled(false);

        itMenuCadastrarPremio.setMnemonic('C');
        itMenuCadastrarPremio.setText("Cadastrar...");
        itMenuCadastrarPremio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuCadastrarPremioActionPerformed(evt);
            }
        });
        subMenuPremios.add(itMenuCadastrarPremio);

        itMenuRemoverPremio.setMnemonic('R');
        itMenuRemoverPremio.setText("Remover...");
        itMenuRemoverPremio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuRemoverPremioActionPerformed(evt);
            }
        });
        subMenuPremios.add(itMenuRemoverPremio);

        itMenuLimparPremio.setMnemonic('L');
        itMenuLimparPremio.setText("Limpar...");
        itMenuLimparPremio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuLimparPremioActionPerformed(evt);
            }
        });
        subMenuPremios.add(itMenuLimparPremio);

        menuTecnico.add(subMenuPremios);

        itMenuSair.setMnemonic('S');
        itMenuSair.setText("Sair");
        itMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuSairActionPerformed(evt);
            }
        });
        menuTecnico.add(itMenuSair);

        mBar.add(menuTecnico);

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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbSalario)
                                    .addComponent(lbSetor)
                                    .addComponent(lbIdade)
                                    .addComponent(lbCargo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfSetor, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfCargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(spIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbNome)
                                    .addComponent(lbCpf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbCadastro))
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spCertificados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spPremios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDataContrat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfDataContrat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btRemover))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbSE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbSalExtra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btSair)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCpf)
                            .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCadastro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNome)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbIdade)
                            .addComponent(spIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spCertificados, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSetor))
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
                            .addComponent(ftfDataContrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(spPremios, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRemover)
                    .addComponent(btConsultar)
                    .addComponent(btAtualizar)
                    .addComponent(btCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar)
                    .addComponent(lbSE)
                    .addComponent(lbSalExtra))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itMenuVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuVisualizarActionPerformed
        consultarTec();
        atualizarTab();
    }//GEN-LAST:event_itMenuVisualizarActionPerformed

    private void itMenuCadastrarCertificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuCadastrarCertificadoActionPerformed
        cadastrarCertificado();
        atualizarTab();
    }//GEN-LAST:event_itMenuCadastrarCertificadoActionPerformed

    private void itMenuRemoverCertificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuRemoverCertificadoActionPerformed
        removerCertificado();
        atualizarTab();
    }//GEN-LAST:event_itMenuRemoverCertificadoActionPerformed

    private void itMenuLimparCertificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuLimparCertificadoActionPerformed
        limparCertificados();
        atualizarTab();
    }//GEN-LAST:event_itMenuLimparCertificadoActionPerformed

    private void itMenuLimparPremioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuLimparPremioActionPerformed
        limparPremios();
        atualizarTab();
    }//GEN-LAST:event_itMenuLimparPremioActionPerformed

    private void itMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuSairActionPerformed
        sair();
    }//GEN-LAST:event_itMenuSairActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparForm();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrarTec();
        verificaTec();
        atualizarTab();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultarTec();
        verificaTec();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        atualizarTec();
        verificaTec();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        removerTec();
        verificaTec();
        atualizarTab();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void itMenuCadastrarPremioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuCadastrarPremioActionPerformed
        cadastrarPremio();
        atualizarTab();
    }//GEN-LAST:event_itMenuCadastrarPremioActionPerformed

    private void itMenuRemoverPremioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuRemoverPremioActionPerformed
        removerPremio();
        atualizarTab();
    }//GEN-LAST:event_itMenuRemoverPremioActionPerformed

    private void itMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuSobreActionPerformed
        JOptionPane.showMessageDialog(null, "O Banco de Dados de Equipe só pode conter um único Técnico"
                + "\n que pode ser gerenciado a partir do Formulário. Você pode utilizar as\n opções de gestão"
                + " no formulário e através do menu de opções. ", "Sobre", 1);
    }//GEN-LAST:event_itMenuSobreActionPerformed

    public void verificaTec(){
        if(bdMemEquipe.getBdTec().getCpf() != 0){
            
            lbCadastro.setText("Já Cadastrado");
            
            String cpf = Integer.toString(bdMemEquipe.getBdTec().getCpf());
            tfCpf.setText(cpf);
            tfCpf.setEditable(false);
            
            btConsultar.setEnabled(true);
            btAtualizar.setEnabled(true);
            btRemover.setEnabled(true);
            
            itMenuVisualizar.setEnabled(true);
            subMenuCertificados.setEnabled(true);
            subMenuPremios.setEnabled(true);
            
        }
        
        else{
            
            lbCadastro.setText("");
            
            tfCpf.setEditable(true);
            
            btConsultar.setEnabled(false);
            btAtualizar.setEnabled(false);
            btRemover.setEnabled(false);
            
            itMenuVisualizar.setEnabled(false);
            subMenuCertificados.setEnabled(false);
            subMenuPremios.setEnabled(false);
            
        }
    }//fim verificaTec
    
    
    
    public Tecnico validaForm(){
        tecnico = new Tecnico();
        
        try{
            tecnico.setCpf(Integer.parseInt(tfCpf.getText().trim()));
            tecnico.setNome(tfNome.getText());
            tecnico.setIdade(Integer.parseInt((spIdade.getValue()).toString()));
            tecnico.setSetor(tfSetor.getText());
            tecnico.setCargo(tfCargo.getText());
            tecnico.setSalario(Double.parseDouble(tfSalario.getText().trim()));
            String dataCont[] = ftfDataContrat.getText().split("/");
            tecnico.setDataContrat(
                    String.format("%02d", Integer.parseInt(dataCont[0].trim()))+"/"
                    +String.format("%02d", Integer.parseInt(dataCont[1].trim()))+"/"
                    +String.format("%04d", Integer.parseInt(dataCont[2].trim())));
            return tecnico;
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
    }//fim validaForm
    
    public void cadastrarTec(){
        tecnico = validaForm();
        
        if(tecnico != null){
            tecnico = bdMemEquipe.cadMemCpf(tecnico);
            if(tecnico != null){
                JOptionPane.showMessageDialog(null, "Técnico cadastrado com sucesso!", "Cadastro de Técnico", 1);
                limparForm();
            }
            else{
                JOptionPane.showMessageDialog(null, "CPF de Técnico já cadastrado.", "ERRO de Cadastro", 0);
            }
        }
    }//fim cadastrar
    
    public void cadastrarCertificado(){
        String certificado;
        
        try{
            certificado = JOptionPane.showInputDialog(null, "Informe o certificado:", "Cadastro de Certificado", 1);
            certificado = bdMemEquipe.cadCertificado(certificado);
            if(certificado != null){
                JOptionPane.showMessageDialog(null, "Certificado cadastrado com sucesso!", "Cadastro de Certificado", 1);
            }
            else{
                JOptionPane.showMessageDialog(null, "O Certificado já foi cadastrado.", "ERRO de Cadastro", 0);
            }
        }

        catch(StringVaziaException sve){
            JOptionPane.showMessageDialog(null, "O Campo não foi preenchido.", "Entrada Inválida", 0);
        }
        catch(StringGrdException sge){
            JOptionPane.showMessageDialog(null, "O Certificado deve conter menos que 25 letras!", "Entrada Inválida", 0);
        }
        
    }
    
    public void cadastrarPremio(){
        String premio;
        
        try{
            premio = JOptionPane.showInputDialog(null, "Informe o premio:", "Cadastro de Premio", 1);
            premio = bdMemEquipe.cadPremio(premio);
            if(premio != null){
                JOptionPane.showMessageDialog(null, "Premio cadastrado com sucesso!", "Cadastro de Premio", 1);
            }
            else{
                JOptionPane.showMessageDialog(null, "O Premio já foi cadastrado.", "ERRO de Cadastro", 0);
            }
        }
        
        catch(StringVaziaException sve){
            JOptionPane.showMessageDialog(null, "O Campo não foi preenchido.", "Entrada Inválida", 0);
        }
        catch(StringGrdException sge){
            JOptionPane.showMessageDialog(null, "O Premio deve conter menos que 25 letras!", "Entrada Inválida", 0);
        }

    }

    public void consultarTec(){
        tecnico = new Tecnico();
        try{
            tecnico.setCpf(Integer.parseInt(tfCpf.getText()));
            
            tecnico = bdMemEquipe.consMemCpf(tecnico);
            
            if(tecnico != null){
                
                tfCpf.setText(Integer.toString(tecnico.getCpf()));
                tfNome.setText(tecnico.getNome());
                spIdade.setValue(tecnico.getIdade());
                tfSetor.setText(tecnico.getSetor());
                tfCargo.setText(tecnico.getCargo());
                tfSalario.setText(Double.toString(tecnico.getSalario()));
                ftfDataContrat.setText(tecnico.getDataContrat());
                lbSalExtra.setText(Double.toString(tecnico.getSalExtra()));
                
                tfCpf.requestFocus();
                JOptionPane.showMessageDialog(null, "Verifique os dados da consulta.", "Consulta de Funcionário", 1);
                limparForm();
            }
            else{
                JOptionPane.showMessageDialog(null, "CPF de Técnico Inexistente!", "ERRO de Consulta", 0);        }
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
        
    }//fim consultar
    
    public void atualizarTec(){
        tecnico = validaForm();
        
        if(tecnico != null){
            try{
                
                tecnico = bdMemEquipe.attMemCpf(tecnico);
                if(tecnico != null){
                    JOptionPane.showMessageDialog(null, "Técnico atualizado com sucesso!", "Atualização de Técnico", 1);
                    limparForm();
                }
                else{
                    JOptionPane.showMessageDialog(null, "CPF de Técnico Inexistente!", "ERRO de Atualização", 0);
                }
            }

            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "O Valor de entrada deve ser um inteiro!", "ERRO de Entrada", 0);
            }

        }

    }//fim atualizar
    
    public void removerTec(){
        tecnico = new Tecnico();
        try{
            tecnico.setCpf(Integer.parseInt(tfCpf.getText()));
            
            tecnico = bdMemEquipe.delMemCpf(tecnico);
            if(tecnico != null){
                JOptionPane.showMessageDialog(null, "Técnico removido com sucesso!", "Remoção de Técnico", 1);
                limparForm();
            }
            else{
                JOptionPane.showMessageDialog(null, "CPF de Técnico Inexistente!", "ERRO de Remoção", 0);
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
    
    public void removerCertificado(){
        String certificado;
        
        certificado = JOptionPane.showInputDialog(null, "Informe o certificado a ser removido:", "Remoção de Certificado", 1);
        certificado = bdMemEquipe.delCertificado(certificado);
        if(certificado != null){
            JOptionPane.showMessageDialog(null, "Certificado removido com sucesso!", "Remoção de Certificado", 1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Certificado Inexistente.", "ERRO de Remoção", 0);
        }
    }
    
    public void removerPremio(){
        String premio;
        
        premio = JOptionPane.showInputDialog(null, "Informe o premio a ser removido:", "Remoção de Premio", 1);
        premio = bdMemEquipe.delPremio(premio);
        if(premio != null){
            JOptionPane.showMessageDialog(null, "Premio removido com sucesso!", "Remoção de Premio", 1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Premio Inexistente.", "ERRO de Remoção", 0);
        }
    }
    
    public void limparCertificados(){
        int x = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja apagar Certificados? (Ação Irreversível)", "Limpar Certificados", JOptionPane.YES_NO_CANCEL_OPTION, 2);
        
        if(x == 0){
            bdMemEquipe.limpaCertificados();
            JOptionPane.showMessageDialog(null, "Certificados foram apagados com sucesso!", "Limpar Certificados", 1);
        }
    }
    
    public void limparPremios(){
        int x = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja apagar Premios? (Ação Irreversível)", "Limpar Premios", JOptionPane.YES_NO_CANCEL_OPTION, 2);
        
        if(x == 0){
            bdMemEquipe.limpaPremios();
            JOptionPane.showMessageDialog(null, "Premios foram apagados com sucesso!", "Limpar Premios", 1);
        }
    }

    public void limparForm(){
        tfNome.setText("");
        spIdade.setValue(18);
        tfCpf.setText("");
        tfSetor.setText("");
        tfCargo.setText("");
        tfSalario.setText("");
        ftfDataContrat.setText("");
        lbSalExtra.setText("");
        tfCpf.requestFocus();
    }//fim limparForm

    public void atualizarTab(){
        DefaultTableModel modeloCert = (DefaultTableModel) tabCertificados.getModel();
        DefaultTableModel modeloPrem = (DefaultTableModel) tabPremios.getModel();
        
        int tamCert = 0,
                tamPrem = 0;

            tamCert = bdMemEquipe.getBdTec().getCertificados().size();
            tamPrem = bdMemEquipe.getBdTec().getPremios().size();

            modeloCert.setRowCount(tamCert);
            modeloPrem.setRowCount(tamPrem);

            for(int i = 0; i < tamCert; i++){
                modeloCert.setValueAt(bdMemEquipe.getBdTec().getCertificados().get(i), i, 0);
            }
            
            for(int i = 0; i < tamPrem; i++){
                modeloPrem.setValueAt(bdMemEquipe.getBdTec().getPremios().get(i), i, 0);
            }
            
    }
    
    public void sair(){
        int x = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_CANCEL_OPTION);
        
        if(x == 0){
            dispose();
        }
    }//fim sair

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
            java.util.logging.Logger.getLogger(FormTec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTec().setVisible(true);
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
    private javax.swing.JMenuItem itMenuCadastrarCertificado;
    private javax.swing.JMenuItem itMenuCadastrarPremio;
    private javax.swing.JMenuItem itMenuLimparCertificado;
    private javax.swing.JMenuItem itMenuLimparPremio;
    private javax.swing.JMenuItem itMenuRemoverCertificado;
    private javax.swing.JMenuItem itMenuRemoverPremio;
    private javax.swing.JMenuItem itMenuSair;
    private javax.swing.JMenuItem itMenuSobre;
    private javax.swing.JMenuItem itMenuVisualizar;
    private javax.swing.JLabel lbCadastro;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbDataContrat;
    private javax.swing.JLabel lbIdade;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSE;
    private javax.swing.JLabel lbSalExtra;
    private javax.swing.JLabel lbSalario;
    private javax.swing.JLabel lbSetor;
    private javax.swing.JMenuBar mBar;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuTecnico;
    private javax.swing.JScrollPane spCertificados;
    private javax.swing.JSpinner spIdade;
    private javax.swing.JScrollPane spPremios;
    private javax.swing.JMenu subMenuCertificados;
    private javax.swing.JMenu subMenuPremios;
    private javax.swing.JTable tabCertificados;
    private javax.swing.JTable tabPremios;
    private javax.swing.JTextField tfCargo;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfSetor;
    // End of variables declaration//GEN-END:variables
}
