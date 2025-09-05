// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormJog extends javax.swing.JFrame {
    private static FormJog formJogUnic;
    private static BDMemEquipe bdMemEquipe;
    private Jogador jogador;
    
    private FormJog() {
        initComponents();
        bdMemEquipe = BDMemEquipe.getInstancia();
    }
    
    //Singleton
    public static FormJog getInstancia(){
        if(formJogUnic == null){
            formJogUnic = new FormJog();
            return formJogUnic;
        }
        return formJogUnic;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabJog = new javax.swing.JTable();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        lbTipo = new javax.swing.JLabel();
        lbPosicao = new javax.swing.JLabel();
        lgGenero = new javax.swing.JLabel();
        lbNumCamisa = new javax.swing.JLabel();
        rbTitular = new javax.swing.JRadioButton();
        rbReserva = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        tfPosicao = new javax.swing.JTextField();
        spNumCamisa = new javax.swing.JSpinner();
        mBar = new javax.swing.JMenuBar();
        menuJogador = new javax.swing.JMenu();
        itMenuVisualizar = new javax.swing.JMenuItem();
        itMenuSair = new javax.swing.JMenuItem();
        itMenuAjuda = new javax.swing.JMenu();
        itMenuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário de Jogadores");

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

        tabJog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "NOME", "POSIÇÃO", "GÊNERO", "NUM_CAMISA", "SALÁRIO", "SAL_EXTRA"
            }
        ));
        tabJog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabJogMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabJog);

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

        btConsultar.setText("Consultar por CPF");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar por CPF");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btRemover.setText("Remover por CPF");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        lbTipo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTipo.setText("TIPO:");

        lbPosicao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPosicao.setText("POSIÇÃO:");

        lgGenero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lgGenero.setText("GÊNERO:");

        lbNumCamisa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbNumCamisa.setText("NÚMERO DA CAMISA:");

        rbTitular.setSelected(true);
        rbTitular.setText("Titular");
        rbTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTitularActionPerformed(evt);
            }
        });

        rbReserva.setText("Reserva");
        rbReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbReservaActionPerformed(evt);
            }
        });

        rbMasculino.setSelected(true);
        rbMasculino.setText("Masculino");
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });

        rbFeminino.setText("Feminino");
        rbFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemininoActionPerformed(evt);
            }
        });

        spNumCamisa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        menuJogador.setText("Jogador");

        itMenuVisualizar.setMnemonic('V');
        itMenuVisualizar.setText("Visualizar");
        itMenuVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuVisualizarActionPerformed(evt);
            }
        });
        menuJogador.add(itMenuVisualizar);

        itMenuSair.setMnemonic('S');
        itMenuSair.setText("Sair");
        itMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuSairActionPerformed(evt);
            }
        });
        menuJogador.add(itMenuSair);

        mBar.add(menuJogador);

        itMenuAjuda.setText("Ajuda");

        itMenuSobre.setText("Sobre...");
        itMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMenuSobreActionPerformed(evt);
            }
        });
        itMenuAjuda.add(itMenuSobre);

        mBar.add(itMenuAjuda);

        setJMenuBar(mBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 404, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSair)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbTipo)
                                    .addComponent(lbPosicao))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(rbTitular)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbReserva))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbNumCamisa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spNumCamisa))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lgGenero)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbMasculino)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbFeminino)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbSalario)
                                    .addComponent(lbSetor)
                                    .addComponent(lbIdade)
                                    .addComponent(lbNome)
                                    .addComponent(lbCpf)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbCargo)
                                        .addGap(13, 13, 13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfSetor, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfCargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbDataContrat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftfDataContrat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
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
                    .addComponent(lbTipo)
                    .addComponent(rbTitular)
                    .addComponent(rbReserva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPosicao)
                    .addComponent(tfPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lgGenero)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumCamisa)
                    .addComponent(spNumCamisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btConsultar)
                    .addComponent(btAtualizar)
                    .addComponent(btRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabJogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabJogMouseClicked
        selecionarTab();
    }//GEN-LAST:event_tabJogMouseClicked

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

    private void rbTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTitularActionPerformed
        rbReserva.setSelected(false);
    }//GEN-LAST:event_rbTitularActionPerformed

    private void rbReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbReservaActionPerformed
        rbTitular.setSelected(false);
    }//GEN-LAST:event_rbReservaActionPerformed

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        rbFeminino.setSelected(false);
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void rbFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemininoActionPerformed
        rbMasculino.setSelected(false);
    }//GEN-LAST:event_rbFemininoActionPerformed

    private void itMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuSobreActionPerformed
        JOptionPane.showMessageDialog(null, "Os Jogadores armazenados no Banco de Dados podem ser gerenciados"
                + "\na partir do Formulário. Você pode utilizar as opções de gestão no formulário\n"
                + "e através do menu de opções", "Sobre", 1);
    }//GEN-LAST:event_itMenuSobreActionPerformed

    private void itMenuVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuVisualizarActionPerformed
        consultar();
    }//GEN-LAST:event_itMenuVisualizarActionPerformed

    private void itMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMenuSairActionPerformed
        sair();
    }//GEN-LAST:event_itMenuSairActionPerformed

    public Jogador validaForm(){
        jogador = new Jogador();
        
        try{
            jogador.setCpf(Integer.parseInt(tfCpf.getText().trim()));
            jogador.setNome(tfNome.getText());
            jogador.setIdade(Integer.parseInt((ftfIdade.getText().trim())));
            jogador.setSetor(tfSetor.getText());
            jogador.setCargo(tfCargo.getText());
            jogador.setSalario(Double.parseDouble(tfSalario.getText().trim()));
            String dataCont[] = ftfDataContrat.getText().split("/");
            jogador.setDataContrat(
                    String.format("%02d", Integer.parseInt(dataCont[0].trim()))+"/"
                    +String.format("%02d", Integer.parseInt(dataCont[1].trim()))+"/"
                    +String.format("%04d", Integer.parseInt(dataCont[2].trim())));
            if(rbTitular.isSelected()){
                jogador.setTipo("Titular");
            }
            else{
                jogador.setTipo("Reserva");
            }
            jogador.setPos(tfPosicao.getText());
            if(rbMasculino.isSelected()){
                jogador.setGenero("Masculino");
            }
            else{
                jogador.setGenero("Feminino");
            }
            jogador.setNumCamisa(Integer.parseInt(spNumCamisa.getValue().toString()));
            return jogador;
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
        catch(NumCamisaGrdException ncge){
            JOptionPane.showMessageDialog(null, "O Número da Camisa deve ser menor que 100!", "Entrada Inválida", 0);
        }
        catch(NumCamisaPeqException ncge){
            JOptionPane.showMessageDialog(null, "O Número da Camisa deve ser um valor positivo!", "Entrada Inválida", 0);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O Valor de Entrada deve ser um inteiro!", "ERRO de Entrada", 0);
        }
        return null;
    }//fim defineFunc
    
    public void cadastrar(){
        jogador = validaForm();
        
        if(jogador != null){
            jogador = bdMemEquipe.cadMemCpf(jogador);
            if(jogador != null){
                JOptionPane.showMessageDialog(null, "Jogador cadastrado com sucesso!", "Cadastro de Jogador", 1);
                limparForm();
            }
            else{
                JOptionPane.showMessageDialog(null, "CPF de Jogador já cadastrado.", "ERRO de Cadastro", 0);
            }
        }
    }//fim cadastrar
    
    public void atualizar(){
        jogador = validaForm();
        if(jogador != null){
            try{
                jogador.setCpf(Integer.parseInt(tfCpf.getText()));
                jogador = bdMemEquipe.attMemCpf(jogador);
                if(jogador != null){
                    JOptionPane.showMessageDialog(null, "Jogador atualizado com sucesso!", "Atualização de Jogador", 1);
                    limparForm();
                }
                else{
                    JOptionPane.showMessageDialog(null, "CPF de Jogador Inexistente!", "ERRO de Atualização", 0);
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

        }

    }//fim atualizar
        
    public void remover(){
        jogador = new Jogador();
        try{
            jogador.setCpf(Integer.parseInt(tfCpf.getText()));
            
            jogador = bdMemEquipe.delMemCpf(jogador);
            if(jogador != null){
                JOptionPane.showMessageDialog(null, "Jogador removido com sucesso!", "Remoção de Jogador", 1);
                limparForm();
            }
            else{
                JOptionPane.showMessageDialog(null, "CPF de Jogador Inexistente!", "ERRO de Remoção", 0);
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
        jogador = new Jogador();
        try{
            jogador.setCpf(Integer.parseInt(tfCpf.getText()));
            
            jogador = bdMemEquipe.consMemCpf(jogador);
            
            if(jogador != null){
                tfCpf.setText(Integer.toString(jogador.getCpf()));
                tfNome.setText(jogador.getNome());
                ftfIdade.setText(Integer.toString(jogador.getIdade()));
                tfSetor.setText(jogador.getSetor());
                tfCargo.setText(jogador.getCargo());
                tfSalario.setText(Double.toString(jogador.getSalario()));
                ftfDataContrat.setText(jogador.getDataContrat());
                if(jogador.getTipo().equals("Titular")){
                    rbTitular.setSelected(true);
                    rbReserva.setSelected(false);
                }
                else{
                    rbTitular.setSelected(false);
                    rbReserva.setSelected(true);
                }
                tfPosicao.setText(jogador.getPos());
                if(jogador.getGenero().equals("Masculino")){
                    rbMasculino.setSelected(true);
                    rbFeminino.setSelected(false);
                }
                else{
                    rbMasculino.setSelected(false);
                    rbFeminino.setSelected(true);
                }
                spNumCamisa.setValue(jogador.getNumCamisa());
                tfCpf.requestFocus();
                JOptionPane.showMessageDialog(null, "Verifique os dados da consulta.", "Consulta de Funcionário", 1);
                limparForm();
            }
            else{
                JOptionPane.showMessageDialog(null, "CPF de Jogador Inexistente!", "ERRO de Consulta", 0);        }
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
    
    public void limparForm(){
        tfNome.setText("");
        ftfIdade.setText("");
        tfCpf.setText("");
        tfSetor.setText("");
        tfCargo.setText("");
        tfSalario.setText("");
        ftfDataContrat.setText("");
        rbTitular.setSelected(true);
        rbReserva.setSelected(false);
        tfPosicao.setText("");
        rbMasculino.setSelected(true);
        rbFeminino.setSelected(false);
        spNumCamisa.setValue(0);
        tfCpf.requestFocus();
    }
    
    public void selecionarTab(){
        DefaultTableModel modelo = (DefaultTableModel) tabJog.getModel();
        tfCpf.setText(modelo.getValueAt(tabJog.getSelectedRow(), 0).toString());
    }
    
    public void atualizarTab(){
        DefaultTableModel modelo = (DefaultTableModel) tabJog.getModel();
        
        int posLin = 0;
        modelo.setRowCount(posLin);
        
        for(Jogador j: bdMemEquipe.getBdJog()){
            modelo.insertRow(posLin, new Object[]{
                j.getCpf(),
                j.getNome(),
                j.getPos(),
                j.getGenero(),
                j.getNumCamisa(),
                j.getSalario(),
                j.getSalExtra()
            });
        }

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
            java.util.logging.Logger.getLogger(FormJog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormJog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormJog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormJog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormJog().setVisible(true);
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
    private javax.swing.JMenu itMenuAjuda;
    private javax.swing.JMenuItem itMenuSair;
    private javax.swing.JMenuItem itMenuSobre;
    private javax.swing.JMenuItem itMenuVisualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbDataContrat;
    private javax.swing.JLabel lbIdade;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumCamisa;
    private javax.swing.JLabel lbPosicao;
    private javax.swing.JLabel lbSalario;
    private javax.swing.JLabel lbSetor;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lgGenero;
    private javax.swing.JMenuBar mBar;
    private javax.swing.JMenu menuJogador;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbReserva;
    private javax.swing.JRadioButton rbTitular;
    private javax.swing.JSpinner spNumCamisa;
    private javax.swing.JTable tabJog;
    private javax.swing.JTextField tfCargo;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPosicao;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfSetor;
    // End of variables declaration//GEN-END:variables
}
