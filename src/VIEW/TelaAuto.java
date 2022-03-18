package VIEW;


import DAL.ModuloConexao;
import MODEL.Veiculo;
import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class TelaAuto extends javax.swing.JInternalFrame {
    Veiculo veiculo = new Veiculo();
//    public static String codCliente;
//    public static String nomeCliente;
      String proprietario = null;    
    public TelaAuto() {
        initComponents();
        acoes();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAutoAdd = new javax.swing.JButton();
        btnAutoPesq = new javax.swing.JButton();
        btnAutoEdit = new javax.swing.JButton();
        btnAutoExc = new javax.swing.JButton();
        btnAutoImprim = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblCor = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        lblAno = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        txtRenavam = new javax.swing.JTextField();
        lblRenavam = new javax.swing.JLabel();
        lblAutoCod = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        txtAutoCodigo = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        btnGeraDadosVeiculo = new javax.swing.JButton();
        lblFabricante = new javax.swing.JLabel();
        txtFabricante = new javax.swing.JTextField();
        btnLimpaAuto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVeiculo = new javax.swing.JTable();
        lblProp = new javax.swing.JLabel();
        txtProp = new javax.swing.JTextField();
        btnProp = new javax.swing.JButton();
        txtCodProp = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Automóvel");
        setFrameIcon(null);
        setMinimumSize(new java.awt.Dimension(600, 600));
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

        btnAutoAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/carAdd.png"))); // NOI18N
        btnAutoAdd.setMaximumSize(new java.awt.Dimension(80, 80));
        btnAutoAdd.setMinimumSize(new java.awt.Dimension(80, 80));
        btnAutoAdd.setPreferredSize(new java.awt.Dimension(80, 80));
        btnAutoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoAddActionPerformed(evt);
            }
        });

        btnAutoPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/carSearch.png"))); // NOI18N
        btnAutoPesq.setMaximumSize(new java.awt.Dimension(80, 80));
        btnAutoPesq.setMinimumSize(new java.awt.Dimension(80, 80));
        btnAutoPesq.setPreferredSize(new java.awt.Dimension(80, 80));
        btnAutoPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoPesqActionPerformed(evt);
            }
        });

        btnAutoEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/carEdit.png"))); // NOI18N
        btnAutoEdit.setMaximumSize(new java.awt.Dimension(80, 80));
        btnAutoEdit.setMinimumSize(new java.awt.Dimension(80, 80));
        btnAutoEdit.setPreferredSize(new java.awt.Dimension(80, 80));
        btnAutoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoEditActionPerformed(evt);
            }
        });

        btnAutoExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/carDel.png"))); // NOI18N
        btnAutoExc.setMaximumSize(new java.awt.Dimension(80, 80));
        btnAutoExc.setMinimumSize(new java.awt.Dimension(80, 80));
        btnAutoExc.setPreferredSize(new java.awt.Dimension(80, 80));
        btnAutoExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoExcActionPerformed(evt);
            }
        });

        btnAutoImprim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/carPrint.png"))); // NOI18N
        btnAutoImprim.setMaximumSize(new java.awt.Dimension(80, 80));
        btnAutoImprim.setMinimumSize(new java.awt.Dimension(80, 80));
        btnAutoImprim.setPreferredSize(new java.awt.Dimension(80, 80));
        btnAutoImprim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoImprimActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DADOS DO VEÍCULO"));

        lblCor.setText("COR");

        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModeloKeyReleased(evt);
            }
        });

        lblModelo.setText("MODELO");

        lblAno.setText("ANO");

        lblRenavam.setText("RENAVAM");

        lblAutoCod.setText("CÓDIGO");

        lblPlaca.setText("PLACA");

        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlacaKeyReleased(evt);
            }
        });

        btnGeraDadosVeiculo.setText("Gera dados");
        btnGeraDadosVeiculo.setMaximumSize(new java.awt.Dimension(102, 25));
        btnGeraDadosVeiculo.setMinimumSize(new java.awt.Dimension(102, 25));
        btnGeraDadosVeiculo.setPreferredSize(new java.awt.Dimension(102, 25));
        btnGeraDadosVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeraDadosVeiculoActionPerformed(evt);
            }
        });

        lblFabricante.setText("FABRICANTE");

        btnLimpaAuto.setText("Limpar");
        btnLimpaAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaAutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAutoCod)
                    .addComponent(lblRenavam)
                    .addComponent(lblPlaca)
                    .addComponent(lblFabricante)
                    .addComponent(lblModelo))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRenavam)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtModelo)
                            .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblCor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAutoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLimpaAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGeraDadosVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutoCod)
                    .addComponent(txtAutoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeraDadosVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPlaca)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLimpaAuto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRenavam)
                    .addComponent(txtRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFabricante)
                    .addComponent(lblCor)
                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAno)
                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblModelo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblVeiculo.setModel(new javax.swing.table.DefaultTableModel(
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
        tblVeiculo.setShowHorizontalLines(false);
        tblVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVeiculoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVeiculo);

        lblProp.setText("PROPRIETÁRIO");

        txtProp.setEnabled(false);

        btnProp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/user0.png"))); // NOI18N
        btnProp.setMaximumSize(new java.awt.Dimension(39, 39));
        btnProp.setMinimumSize(new java.awt.Dimension(39, 39));
        btnProp.setPreferredSize(new java.awt.Dimension(39, 39));
        btnProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPropActionPerformed(evt);
            }
        });

        txtCodProp.setEnabled(false);
        txtCodProp.setPreferredSize(new java.awt.Dimension(70, 22));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnAutoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAutoPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAutoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAutoExc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAutoImprim, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProp)
                                .addGap(7, 7, 7)
                                .addComponent(txtCodProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProp)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblProp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCodProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAutoAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAutoPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAutoEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAutoExc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAutoImprim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        getAccessibleContext().setAccessibleName("Tela Automóvel");

        setBounds(0, 0, 600, 620);
    }// </editor-fold>//GEN-END:initComponents
    private void btnAutoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoAddActionPerformed

        if(!txtCodProp.getText().isEmpty()){
            proprietario = txtCodProp.getText();
        }
        veiculo.cadastrarVeiculo(txtAutoCodigo.getText(), txtPlaca.getText(), txtRenavam.getText(), txtFabricante.getText(), txtModelo.getText(), txtAno.getText(), txtCor.getText(), proprietario);
        acoes();

    }//GEN-LAST:event_btnAutoAddActionPerformed
    private void btnAutoPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoPesqActionPerformed
        int bcv = Integer.parseInt(veiculo.buscaCodVeiculo());
        int txt = Integer.parseInt(txtAutoCodigo.getText());
        
        if(bcv>txt){
            veiculo.consultarCodAuto(1, txtAutoCodigo.getText());        
            txtAutoCodigo.setText(veiculo.getCod());
            txtPlaca.setText(veiculo.getPlaca());
            txtRenavam.setText(veiculo.getRenavam());
            txtFabricante.setText(veiculo.getFabricante());
            txtModelo.setText(veiculo.getModelo());
            txtCor.setText(veiculo.getCor());
            txtAno.setText(veiculo.getAno());
            txtCodProp.setText(veiculo.getCodProp());
            txtProp.setText(veiculo.getProprietario());
        }else{
            JOptionPane.showMessageDialog(null, "Código não cadastrado.");
        }
    }//GEN-LAST:event_btnAutoPesqActionPerformed
    private void btnAutoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoEditActionPerformed
        String cod = txtAutoCodigo.getText();

        if(!txtCodProp.getText().isEmpty()){
            proprietario = txtCodProp.getText();
        }
        if(!cod.isEmpty()){
            veiculo.editarVeiculo(cod, txtPlaca.getText(), txtRenavam.getText(), txtFabricante.getText(), txtModelo.getText(), txtAno.getText(), txtCor.getText(), proprietario);
        }else{
            JOptionPane.showMessageDialog(null, "Código do veículo vazio.");
        }
        acoes();
    }//GEN-LAST:event_btnAutoEditActionPerformed
    private void btnAutoExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoExcActionPerformed
        String cod = txtAutoCodigo.getText();
        if(!cod.isEmpty()){
            veiculo.excluirVeiculo(cod);
        }else{
            JOptionPane.showMessageDialog(null, "Código do veículo não informado.");
        }
        acoes();
    }//GEN-LAST:event_btnAutoExcActionPerformed
    private void btnAutoImprimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoImprimActionPerformed
            imprimir();
    }//GEN-LAST:event_btnAutoImprimActionPerformed
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        Principal p = new Principal();
        p.setTelaAuto(false);
    }//GEN-LAST:event_formInternalFrameClosed
    private void btnPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPropActionPerformed
        SelecionaProp jdlProp = new SelecionaProp(null, true);
        jdlProp.setVisible(true);
        txtCodProp.setText(jdlProp.getCodProp());
        txtProp.setText(jdlProp.getNomeProp());
    }//GEN-LAST:event_btnPropActionPerformed
    private void btnGeraDadosVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeraDadosVeiculoActionPerformed
        Random gerador = new Random();
        String[] modelo = {"Onyx","Civic","Corolla","Fusca","Punto","Uno","Hilux","F250"};
        String[] ano = {"1990","1991","1993","1995","1997","2010","2011","2016","2017","2021","2014"};
        String[] cor = {"Vermelho","Preto", "Prata", "Branco", "Azul", "Verde"};
        String[] letras = {"A","B","C","D","E","F","O"};
        int c = 0;
        String placa = "";
        String var = "";
        while(c<3){
            placa = placa+letras[gerador.nextInt(letras.length)];
            c++;
        }
        while(var.length()<15){
            var = var + Integer.toString(gerador.nextInt(9));
        }
        txtAutoCodigo.setText(veiculo.buscaCodVeiculo());
        txtPlaca.setText(placa+var.substring(0, 4));
        txtRenavam.setText(var.substring(5, 15));
        txtFabricante.setText("Outros");
        txtModelo.setText(modelo[gerador.nextInt(modelo.length)]);
        txtAno.setText(ano[gerador.nextInt(ano.length)]);
        txtCor.setText(cor[gerador.nextInt(cor.length)]);
    }//GEN-LAST:event_btnGeraDadosVeiculoActionPerformed
    private void tblVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVeiculoMouseClicked
        consultaTblAuto();
    }//GEN-LAST:event_tblVeiculoMouseClicked
    private void txtPlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyReleased
        carregaTblAuto();
    }//GEN-LAST:event_txtPlacaKeyReleased
    private void txtModeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyReleased
        carregaTblAuto();
    }//GEN-LAST:event_txtModeloKeyReleased
    private void btnLimpaAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaAutoActionPerformed
        acoes();
    }//GEN-LAST:event_btnLimpaAutoActionPerformed
    private void imprimir() {
        int opcao = JOptionPane.showConfirmDialog(null, "Confirma?","Imprimir relatório", JOptionPane.YES_NO_OPTION);
        String caminho = "./relatorios/relAutomovel.jasper";
        if(opcao==JOptionPane.YES_OPTION){
            try{
                Connection c = new ModuloConexao().conector();        
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
    private void limpar(){
        txtAutoCodigo.setText(veiculo.buscaCodVeiculo());
        txtPlaca.setText("");
        txtRenavam.setText("");
        txtFabricante.setText("");
        txtModelo.setText("");
        txtAno.setText("");
        txtCor.setText("");
        txtCodProp.setText("");
        txtProp.setText("");
    }
    private void carregaTblAuto(){
        String placa = txtPlaca.getText();
        String modelo = txtModelo.getText();
        if(!placa.isEmpty()){
            ResultSet rs = veiculo.pesquisarAuto(1, placa);
            tblVeiculo.setModel(DbUtils.resultSetToTableModel(rs));
        }else{
            ResultSet rs = veiculo.pesquisarAuto(2, modelo);
            tblVeiculo.setModel(DbUtils.resultSetToTableModel(rs));
        }
        
        
        try {
            veiculo.c_veiculo.close();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void consultaTblAuto(){
        int linha = tblVeiculo.getSelectedRow();

        if(linha>=0){
            veiculo.consultarCodAuto(1,tblVeiculo.getModel().getValueAt(linha, 0).toString());
            
            txtAutoCodigo.setText(veiculo.getCod());
            txtPlaca.setText(veiculo.getPlaca());
            txtRenavam.setText(veiculo.getRenavam());
            txtFabricante.setText(veiculo.getFabricante());
            txtModelo.setText(veiculo.getModelo());
            txtCor.setText(veiculo.getCor());
            txtAno.setText(veiculo.getAno());
            txtCodProp.setText(veiculo.getCodProp());
            txtProp.setText(veiculo.getProprietario());
            
        }
    }
    private void acoes(){
        limpar();
        carregaTblAuto();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutoAdd;
    private javax.swing.JButton btnAutoEdit;
    private javax.swing.JButton btnAutoExc;
    private javax.swing.JButton btnAutoImprim;
    private javax.swing.JButton btnAutoPesq;
    private javax.swing.JButton btnGeraDadosVeiculo;
    private javax.swing.JButton btnLimpaAuto;
    private javax.swing.JButton btnProp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAutoCod;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblProp;
    private javax.swing.JLabel lblRenavam;
    private javax.swing.JTable tblVeiculo;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAutoCodigo;
    private javax.swing.JTextField txtCodProp;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtProp;
    private javax.swing.JTextField txtRenavam;
    // End of variables declaration//GEN-END:variables
}
