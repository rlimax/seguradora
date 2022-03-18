package VIEW;

import DAL.ModuloConexao;
import MODEL.Ocorrencia;
import java.sql.*;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class TelaOcorrencia extends javax.swing.JInternalFrame {
    public TelaOcorrencia() {
        initComponents();
        buscaCodOco();
        carregaTblOco();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnOcoAdd = new javax.swing.JButton();
        btnOcoPesq = new javax.swing.JButton();
        btnOcoEdit = new javax.swing.JButton();
        btnOcoExc = new javax.swing.JButton();
        btnOcoImprim = new javax.swing.JButton();
        lblOcoCod = new javax.swing.JLabel();
        lblOcoData = new javax.swing.JLabel();
        lblOcoLocal = new javax.swing.JLabel();
        txtCodOcorr = new javax.swing.JTextField();
        txtOcoLocal = new javax.swing.JTextField();
        txtfOcoData = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtDesc = new javax.swing.JTextArea();
        lblStatusDesc = new javax.swing.JLabel();
        btnGeraDados = new javax.swing.JButton();
        btnLimpaDados = new javax.swing.JButton();
        btnVeiculo = new javax.swing.JButton();
        lblVeiculo = new javax.swing.JLabel();
        txtCodVeiculo = new javax.swing.JTextField();
        txtModeloVeiculo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblOco = new javax.swing.JTable();
        txtPlacaVeiculo = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setClosable(true);
        setTitle("Ocorrência");
        setFrameIcon(null);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setNormalBounds(new java.awt.Rectangle(0, 0, 150, 0));
        setPreferredSize(new java.awt.Dimension(630, 610));
        setRequestFocusEnabled(false);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        btnOcoAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/ocoAdd.png"))); // NOI18N
        btnOcoAdd.setMaximumSize(new java.awt.Dimension(80, 80));
        btnOcoAdd.setMinimumSize(new java.awt.Dimension(80, 80));
        btnOcoAdd.setPreferredSize(new java.awt.Dimension(80, 80));
        btnOcoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcoAddActionPerformed(evt);
            }
        });

        btnOcoPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/ocoSearch.png"))); // NOI18N
        btnOcoPesq.setMaximumSize(new java.awt.Dimension(80, 80));
        btnOcoPesq.setMinimumSize(new java.awt.Dimension(80, 80));
        btnOcoPesq.setPreferredSize(new java.awt.Dimension(80, 80));
        btnOcoPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcoPesqActionPerformed(evt);
            }
        });

        btnOcoEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/ocoEdit.png"))); // NOI18N
        btnOcoEdit.setMaximumSize(new java.awt.Dimension(80, 80));
        btnOcoEdit.setMinimumSize(new java.awt.Dimension(80, 80));
        btnOcoEdit.setPreferredSize(new java.awt.Dimension(80, 80));
        btnOcoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcoEditActionPerformed(evt);
            }
        });

        btnOcoExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/ocoDel.png"))); // NOI18N
        btnOcoExc.setMaximumSize(new java.awt.Dimension(80, 80));
        btnOcoExc.setMinimumSize(new java.awt.Dimension(80, 80));
        btnOcoExc.setPreferredSize(new java.awt.Dimension(80, 80));
        btnOcoExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcoExcActionPerformed(evt);
            }
        });

        btnOcoImprim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/ocoPrint.png"))); // NOI18N
        btnOcoImprim.setMaximumSize(new java.awt.Dimension(80, 80));
        btnOcoImprim.setMinimumSize(new java.awt.Dimension(80, 80));
        btnOcoImprim.setPreferredSize(new java.awt.Dimension(80, 80));
        btnOcoImprim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcoImprimActionPerformed(evt);
            }
        });

        lblOcoCod.setText("CÓDIGO");

        lblOcoData.setText("DATA");

        lblOcoLocal.setText("LOCAL");

        txtOcoLocal.setColumns(30);
        txtOcoLocal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOcoLocalKeyReleased(evt);
            }
        });

        txtfOcoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIÇÃO"));

        jtxtDesc.setColumns(20);
        jtxtDesc.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jtxtDesc.setLineWrap(true);
        jtxtDesc.setRows(5);
        jtxtDesc.setWrapStyleWord(true);
        jtxtDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtDescKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtxtDesc);

        lblStatusDesc.setText("250 caracteres restantes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStatusDesc)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblStatusDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnGeraDados.setText("Gerar dados");
        btnGeraDados.setMaximumSize(new java.awt.Dimension(102, 25));
        btnGeraDados.setMinimumSize(new java.awt.Dimension(102, 25));
        btnGeraDados.setPreferredSize(new java.awt.Dimension(102, 25));
        btnGeraDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeraDadosActionPerformed(evt);
            }
        });

        btnLimpaDados.setText("Limpar");
        btnLimpaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaDadosActionPerformed(evt);
            }
        });

        btnVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/car0.png"))); // NOI18N
        btnVeiculo.setMaximumSize(new java.awt.Dimension(39, 39));
        btnVeiculo.setMinimumSize(new java.awt.Dimension(39, 39));
        btnVeiculo.setPreferredSize(new java.awt.Dimension(38, 37));
        btnVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeiculoActionPerformed(evt);
            }
        });

        lblVeiculo.setText("VEÍCULO");

        txtCodVeiculo.setEnabled(false);

        txtModeloVeiculo.setEnabled(false);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(452, 100));

        tblOco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblOco.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblOco.setShowHorizontalLines(false);
        tblOco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOcoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblOco);

        txtPlacaVeiculo.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOcoLocal)
                            .addComponent(lblOcoData)
                            .addComponent(lblOcoCod))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCodOcorr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfOcoData, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(198, 198, 198)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimpaDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGeraDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtOcoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblVeiculo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCodVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtModeloVeiculo))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnOcoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOcoPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOcoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOcoExc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOcoImprim, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOcoCod)
                    .addComponent(txtCodOcorr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeraDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOcoData)
                    .addComponent(btnLimpaDados)
                    .addComponent(txtfOcoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOcoLocal)
                    .addComponent(txtOcoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVeiculo)
                            .addComponent(txtCodVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnOcoAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOcoPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOcoEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOcoExc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnOcoImprim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        getAccessibleContext().setAccessibleName("Tela Ocorrência");

        setSize(new java.awt.Dimension(630, 620));
    }// </editor-fold>//GEN-END:initComponents
    private void btnOcoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcoAddActionPerformed
        cadastrar();
    }//GEN-LAST:event_btnOcoAddActionPerformed
    private void btnOcoPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcoPesqActionPerformed
        consultar();
    }//GEN-LAST:event_btnOcoPesqActionPerformed
    private void btnOcoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcoEditActionPerformed
        editar();
    }//GEN-LAST:event_btnOcoEditActionPerformed
    private void btnOcoExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcoExcActionPerformed
        excluir();
    }//GEN-LAST:event_btnOcoExcActionPerformed
    private void btnOcoImprimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcoImprimActionPerformed
        imprimir();
    }//GEN-LAST:event_btnOcoImprimActionPerformed
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        Principal p = new Principal();
        p.setTelaOcorrencia(false);
    }//GEN-LAST:event_formInternalFrameClosed
    private void jtxtDescKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDescKeyReleased
        contaCaracter();
    }//GEN-LAST:event_jtxtDescKeyReleased
    private void btnGeraDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeraDadosActionPerformed
        geraDados();
        contaCaracter();
    }//GEN-LAST:event_btnGeraDadosActionPerformed
    private void txtOcoLocalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOcoLocalKeyReleased
        contaCaracter();
    }//GEN-LAST:event_txtOcoLocalKeyReleased
    private void btnLimpaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaDadosActionPerformed
        limpa();
    }//GEN-LAST:event_btnLimpaDadosActionPerformed
    private void tblOcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOcoMouseClicked
        consultaTblOco();
        contaCaracter();
    }//GEN-LAST:event_tblOcoMouseClicked
    private void btnVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeiculoActionPerformed
        SelecionaVeiculo selVeiculo = new SelecionaVeiculo(null, true);
        selVeiculo.setVisible(true);
        txtCodVeiculo.setText(selVeiculo.getCodVeiculo());
        txtPlacaVeiculo.setText(selVeiculo.getPlacaVeiculo());
        txtModeloVeiculo.setText(selVeiculo.getModeloVeiculo());
        
    }//GEN-LAST:event_btnVeiculoActionPerformed
    //Método que faz a contagem de caracteres restantes no campo descrição
    private void contaCaracter(){
        int tamanho = jtxtDesc.getText().length();
        lblStatusDesc.setText(250 - tamanho+" caracteres restantes");
        if(jtxtDesc.getText().length()>250){
            jtxtDesc.setText(jtxtDesc.getText().substring(0, 250));
            lblStatusDesc.setText(251 - tamanho+" caracteres restantes");
        }
        if(txtOcoLocal.getText().length()>30){
            txtOcoLocal.setText(txtOcoLocal.getText().substring(0, 30));
        }
        tamanho = jtxtDesc.getText().length();
        if(tamanho==250){
            lblStatusDesc.setText("0 caracteres restantes");
        }
    }
    //Método que faz o cadastro - Chamada para classe Ocorrencia
    private void cadastrar() {
        Ocorrencia ocorrencia = new Ocorrencia();
        ocorrencia.cadastrar(txtCodOcorr.getText(), txtfOcoData.getText(), txtOcoLocal.getText(), jtxtDesc.getText(), txtCodVeiculo.getText());
        limpa();
    }
    //Método que chama consulta - Chamada para classe Ocorrencia
    private void consultar() {
        Ocorrencia ocorrencia = new Ocorrencia();
        int cod = Integer.parseInt(ocorrencia.buscaCod());
        int codEntrada = Integer.parseInt(txtCodOcorr.getText());
        
        if(codEntrada>=cod){
            JOptionPane.showMessageDialog(null, "Ocorrência não cadastrada.");
        }else{
            ocorrencia.consultar(txtCodOcorr.getText());
            txtOcoLocal.setText(ocorrencia.getLocal());
            txtfOcoData.setText(ocorrencia.getData());
            jtxtDesc.setText(ocorrencia.getDescricao());
        }
    }
    //Método que edita o registro - Chamada para classe Ocorrencia
    private void editar() {
        Ocorrencia ocorrencia = new Ocorrencia();
        ocorrencia.editar(txtCodOcorr.getText(), txtfOcoData.getText(), txtOcoLocal.getText(), jtxtDesc.getText(), txtCodVeiculo.getText());
        limpa();
    }
    //Método que exclui o registro - Chamada para classe Ocorrencia
    private void excluir() {
        Ocorrencia ocorrencia = new Ocorrencia();
        int cod = Integer.parseInt(ocorrencia.buscaCod());
        int codEntrada = Integer.parseInt(txtCodOcorr.getText());
        if(codEntrada<cod){
            int option = JOptionPane.showConfirmDialog(null, "Confirma a exclusão da ocorrência "+txtCodOcorr.getText()+" ?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION){
                ocorrencia.excluir(txtCodOcorr.getText());
                limpa();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ocorrência não cadastrada.");
        }

    }
    //Método que chama o relatório
    private void imprimir() {
        int opcao = JOptionPane.showConfirmDialog(null, "Confirma impressão?","Relatório Ocorrência", JOptionPane.YES_NO_OPTION);
        String caminho = "./relatorios/relOcorrencias.jasper";
        if(opcao==JOptionPane.YES_OPTION){
            try{
                Connection c = new ModuloConexao().conector();
                System.out.print(c);
                JasperPrint print = JasperFillManager.fillReport(caminho, null, c);
                JasperViewer.viewReport(print, false);
                c.close();
            }catch(JRException e){
                JOptionPane.showMessageDialog(null, e);
            }catch(SQLException e2){
                JOptionPane.showMessageDialog(null, e2);
            }
        }
    }
    //Método que busca proximo código de inserção (pk)
    private void buscaCodOco(){
        Ocorrencia ocorrencia = new Ocorrencia();
        txtCodOcorr.setText(ocorrencia.buscaCod());
    }
    //Método que limpa a tela
    private void limpa(){
        buscaCodOco();
        txtfOcoData.setText("");
        txtOcoLocal.setText("");
        jtxtDesc.setText("");
        txtCodVeiculo.setText("");
        txtPlacaVeiculo.setText("");
        txtModeloVeiculo.setText("");
        contaCaracter();
        carregaTblOco();
    }
    //Método que gera dados aleatórios
    private void geraDados(){
        String[] descricao = {"Batida em poste sem vítima.", 
                              "Batida em poste com duas vítimas.", 
                              "Batida entre carros sem vítimas.",
                              "Batida entre carros com duas vítimas.", 
                              "Batida entre carros com uma vítima.", 
                              "Capotamento.",
                              "Atropelamento.",
                              "Batida em muro sem vítimas.",
                              "Batida em parada de ônibus sem vítimas.",
                              "Derrapagem."};
        String[] local = {"Via EPTG Km 9",
                          "Via Estrutural Km 5",
                          "Via EPNB Km 11",
                          "BR 070 Km 51",
                          "BR 060 Km 104",
                          "Pistão Sul - Taguatinga",
                          "Entre quadras 201/401 - Samambaia sul",
                          "Eixo monumental - próximo torre de TV"};
        
        Calendar c = Calendar.getInstance();
        String dia = null;
        String mes = null;
        String ano = null;
        Random r = new Random();
        
        if(c.get(Calendar.DAY_OF_MONTH)<10){dia = "0"+Integer.toString(c.get(Calendar.DAY_OF_MONTH));}else{dia = Integer.toString(c.get(Calendar.DAY_OF_MONTH));}
        if(c.get(Calendar.MONTH)<10){mes = "0"+Integer.toString(c.get(Calendar.MONTH)+1);}else{mes = Integer.toString(c.get(Calendar.MONTH)+1);}
        if(c.get(Calendar.YEAR)<10){ano = "0"+Integer.toString(c.get(Calendar.YEAR));}else{ano = Integer.toString(c.get(Calendar.YEAR));}
        //return dia+"/"+mes+"/"+ano;
        buscaCodOco();
        txtOcoLocal.setText(local[r.nextInt(local.length)]);
        txtfOcoData.setText(dia+"/"+mes+"/"+ano);
        jtxtDesc.setText(descricao[r.nextInt(descricao.length)]);
    }
    //Método que carrega a tabela de ocorrências
    private void carregaTblOco(){
        Ocorrencia ocorrencia = new Ocorrencia();
        ResultSet rs = ocorrencia.pesquisarOco();
        tblOco.setModel(DbUtils.resultSetToTableModel(rs));
        tblOco.getColumnModel().getColumn(0).setPreferredWidth(65);
        tblOco.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblOco.getColumnModel().getColumn(2).setPreferredWidth(360);
        
        try{
            ocorrencia.c_ocorrencia.close();
        }catch(SQLException e){
            System.out.println("Erro carrega tabela. \n"+e);
        }
    }
    //Método que Seleciona o registro na tabela e carrega os campos
    private void consultaTblOco(){
        int linha = tblOco.getSelectedRow();
        if(linha>=0){
            Ocorrencia ocorrencia = new Ocorrencia();
            ocorrencia.consultar(tblOco.getModel().getValueAt(linha, 0).toString());
            
            txtCodOcorr.setText(ocorrencia.getCodigo());
            txtfOcoData.setText(ocorrencia.getData());
            txtOcoLocal.setText(ocorrencia.getLocal());
            jtxtDesc.setText(ocorrencia.getDescricao());
            txtCodVeiculo.setText(ocorrencia.getCodEnv());
            txtPlacaVeiculo.setText(ocorrencia.getPlacaEnv());
            txtModeloVeiculo.setText(ocorrencia.getModeloEnv());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeraDados;
    private javax.swing.JButton btnLimpaDados;
    private javax.swing.JButton btnOcoAdd;
    private javax.swing.JButton btnOcoEdit;
    private javax.swing.JButton btnOcoExc;
    private javax.swing.JButton btnOcoImprim;
    private javax.swing.JButton btnOcoPesq;
    private javax.swing.JButton btnVeiculo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jtxtDesc;
    private javax.swing.JLabel lblOcoCod;
    private javax.swing.JLabel lblOcoData;
    private javax.swing.JLabel lblOcoLocal;
    private javax.swing.JLabel lblStatusDesc;
    private javax.swing.JLabel lblVeiculo;
    private javax.swing.JTable tblOco;
    private javax.swing.JTextField txtCodOcorr;
    private javax.swing.JTextField txtCodVeiculo;
    private javax.swing.JTextField txtModeloVeiculo;
    private javax.swing.JTextField txtOcoLocal;
    private javax.swing.JTextField txtPlacaVeiculo;
    private javax.swing.JFormattedTextField txtfOcoData;
    // End of variables declaration//GEN-END:variables

}
