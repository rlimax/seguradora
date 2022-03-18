package VIEW;

import DAL.ModuloConexao;
import MODEL.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class TelaCliente extends javax.swing.JInternalFrame {
    Cliente cliente = new Cliente();
    public TelaCliente() {
            initComponents();
            txtCodigo.setText(cliente.buscacod());
            carregaTblCliente();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCliCod = new javax.swing.JLabel();
        lblCliNome = new javax.swing.JLabel();
        lblCliRg = new javax.swing.JLabel();
        lblCliCpf = new javax.swing.JLabel();
        lblCliTel = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtRg = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        btnCliAdd = new javax.swing.JButton();
        btnCliPesq = new javax.swing.JButton();
        btnCliEdit = new javax.swing.JButton();
        btnCliExc = new javax.swing.JButton();
        pnlEndereco = new javax.swing.JPanel();
        lblCliLogra = new javax.swing.JLabel();
        lblCliComplemen = new javax.swing.JLabel();
        lblCliBairro = new javax.swing.JLabel();
        txtLogra = new javax.swing.JTextField();
        lblCliNum = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        lblCliCep = new javax.swing.JLabel();
        lblCliCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblCliUf = new javax.swing.JLabel();
        cbbUf = new javax.swing.JComboBox<>();
        txtCep = new javax.swing.JFormattedTextField();
        btnCliImprim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnGeraDados = new javax.swing.JButton();
        btnLimpaCliente = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cliente");
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

        lblCliCod.setText("CÓDIGO");

        lblCliNome.setText("NOME");

        lblCliRg.setText("RG");

        lblCliCpf.setText("CPF");

        lblCliTel.setText("TELEFONE");

        txtCodigo.setNextFocusableComponent(txtNome);

        txtNome.setNextFocusableComponent(txtRg);
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });

        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRg.setNextFocusableComponent(txtCpf);

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setText("");
        txtCpf.setNextFocusableComponent(txtTelefone);

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setText("");
        txtTelefone.setNextFocusableComponent(cbbUf);

        btnCliAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/userAdd.png"))); // NOI18N
        btnCliAdd.setMaximumSize(new java.awt.Dimension(80, 80));
        btnCliAdd.setMinimumSize(new java.awt.Dimension(80, 80));
        btnCliAdd.setNextFocusableComponent(btnCliPesq);
        btnCliAdd.setPreferredSize(new java.awt.Dimension(80, 80));
        btnCliAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliAddActionPerformed(evt);
            }
        });

        btnCliPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/userSearch.png"))); // NOI18N
        btnCliPesq.setMaximumSize(new java.awt.Dimension(80, 80));
        btnCliPesq.setMinimumSize(new java.awt.Dimension(80, 80));
        btnCliPesq.setNextFocusableComponent(btnCliEdit);
        btnCliPesq.setPreferredSize(new java.awt.Dimension(80, 80));
        btnCliPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliPesqActionPerformed(evt);
            }
        });

        btnCliEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/userEdit.png"))); // NOI18N
        btnCliEdit.setMaximumSize(new java.awt.Dimension(80, 80));
        btnCliEdit.setMinimumSize(new java.awt.Dimension(80, 80));
        btnCliEdit.setNextFocusableComponent(btnCliExc);
        btnCliEdit.setPreferredSize(new java.awt.Dimension(80, 80));
        btnCliEdit.setRequestFocusEnabled(false);
        btnCliEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliEditActionPerformed(evt);
            }
        });

        btnCliExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/userDel.png"))); // NOI18N
        btnCliExc.setMaximumSize(new java.awt.Dimension(80, 80));
        btnCliExc.setMinimumSize(new java.awt.Dimension(80, 80));
        btnCliExc.setNextFocusableComponent(btnCliImprim);
        btnCliExc.setPreferredSize(new java.awt.Dimension(80, 80));
        btnCliExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliExcActionPerformed(evt);
            }
        });

        pnlEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("ENDEREÇO"));
        pnlEndereco.setMaximumSize(new java.awt.Dimension(574, 188));

        lblCliLogra.setText("LOGRADOURO");

        lblCliComplemen.setText("COMPLEMENTO");

        lblCliBairro.setText("BAIRRO");

        lblCliNum.setText("NÚMERO");

        txtNumero.setNextFocusableComponent(txtComplemento);

        txtComplemento.setNextFocusableComponent(txtBairro);

        txtBairro.setNextFocusableComponent(btnCliAdd);

        lblCliCep.setText("CEP");

        lblCliCidade.setText("CIDADE");

        txtCidade.setNextFocusableComponent(txtCep);

        lblCliUf.setText("UF");

        cbbUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PR", "PB", "PA", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SE", "SP", "TO" }));
        cbbUf.setNextFocusableComponent(txtCidade);

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setNextFocusableComponent(txtLogra);

        javax.swing.GroupLayout pnlEnderecoLayout = new javax.swing.GroupLayout(pnlEndereco);
        pnlEndereco.setLayout(pnlEnderecoLayout);
        pnlEnderecoLayout.setHorizontalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoLayout.createSequentialGroup()
                                .addComponent(lblCliLogra)
                                .addGap(20, 20, 20))
                            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                                .addComponent(lblCliUf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))
                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                                .addGap(376, 376, 376)
                                .addComponent(txtNumero))
                            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                                .addComponent(lblCliCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCliCep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCep, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))))
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addComponent(lblCliComplemen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                                .addComponent(txtLogra, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCliNum)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                                .addComponent(txtComplemento)
                                .addGap(14, 14, 14)
                                .addComponent(lblCliBairro)
                                .addGap(18, 18, 18)
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pnlEnderecoLayout.setVerticalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliUf)
                    .addComponent(cbbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliCidade)
                    .addComponent(lblCliCep)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliLogra)
                    .addComponent(txtLogra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliNum)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliComplemen)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        btnCliImprim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/userPrint.png"))); // NOI18N
        btnCliImprim.setMaximumSize(new java.awt.Dimension(80, 80));
        btnCliImprim.setMinimumSize(new java.awt.Dimension(80, 80));
        btnCliImprim.setNextFocusableComponent(btnGeraDados);
        btnCliImprim.setPreferredSize(new java.awt.Dimension(80, 80));
        btnCliImprim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliImprimActionPerformed(evt);
            }
        });

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCliente.setShowHorizontalLines(false);
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        btnGeraDados.setText("Gera dados");
        btnGeraDados.setMaximumSize(new java.awt.Dimension(102, 25));
        btnGeraDados.setMinimumSize(new java.awt.Dimension(102, 25));
        btnGeraDados.setNextFocusableComponent(txtCodigo);
        btnGeraDados.setPreferredSize(new java.awt.Dimension(102, 25));
        btnGeraDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeraDadosActionPerformed(evt);
            }
        });

        btnLimpaCliente.setText("Limpar");
        btnLimpaCliente.setMaximumSize(new java.awt.Dimension(102, 25));
        btnLimpaCliente.setMinimumSize(new java.awt.Dimension(102, 25));
        btnLimpaCliente.setNextFocusableComponent(txtCodigo);
        btnLimpaCliente.setPreferredSize(new java.awt.Dimension(102, 25));
        btnLimpaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblCliCod))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnCliAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCliPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCliEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCliExc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCliImprim, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCliTel)
                            .addComponent(lblCliRg)
                            .addComponent(lblCliNome))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGeraDados, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addComponent(lblCliCpf)
                                .addGap(22, 22, 22)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliCod)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeraDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliRg)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliTel)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCliAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCliPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCliEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCliExc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCliImprim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        setBounds(0, 0, 630, 620);
    }// </editor-fold>//GEN-END:initComponents
    private void btnCliAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliAddActionPerformed
            cliente.cadastrar(txtCodigo.getText(), txtNome.getText(), txtRg.getText(), txtCpf.getText(), txtTelefone.getText(), txtBairro.getText(), txtCep.getText(), txtLogra.getText(), txtCidade.getText(), cbbUf.getSelectedItem().toString(), txtComplemento.getText(), txtNumero.getText());
            acoes();
    }//GEN-LAST:event_btnCliAddActionPerformed
    private void btnCliPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliPesqActionPerformed
        int bsc = Integer.parseInt(cliente.buscacod());    //Busca proximo codigo CHAVE para BD
        int txt = Integer.parseInt(txtCodigo.getText());   //Busca valor do campo de entrada
        
        if(txtCodigo.getText().equals(bsc)||(txt>bsc)){
            JOptionPane.showMessageDialog(null, "Usuário não cadastrado.");
        }else{
            cliente.consultarCod(txtCodigo.getText());
            txtCodigo.setText(cliente.getCodigo());
            txtNome.setText(cliente.getNome());
            txtRg.setText(cliente.getRg());
            txtCpf.setText(cliente.getCpf());
            txtTelefone.setText(cliente.getTelefone());
            txtLogra.setText(cliente.getLogradouro());
            txtNumero.setText(cliente.getNumero());
            txtComplemento.setText(cliente.getComplemento());
            txtBairro.setText(cliente.getBairro());
            txtCep.setText(cliente.getCep());
            txtCidade.setText(cliente.getCidade());
            cbbUf.setSelectedItem(cliente.getUf());
        }
    }//GEN-LAST:event_btnCliPesqActionPerformed
    private void btnCliEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliEditActionPerformed
        cliente.editar(txtCodigo.getText(), txtNome.getText(), txtRg.getText(), txtCpf.getText(), txtTelefone.getText(), txtBairro.getText(), txtCep.getText(), txtLogra.getText(), txtCidade.getText(), cbbUf.getSelectedItem().toString(), txtComplemento.getText(), txtNumero.getText());
        acoes();
    }//GEN-LAST:event_btnCliEditActionPerformed
    private void btnCliExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliExcActionPerformed
        
        cliente.excluir(txtCodigo.getText());
        acoes();
        
    }//GEN-LAST:event_btnCliExcActionPerformed
    private void btnCliImprimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliImprimActionPerformed
        imprimir();
    }//GEN-LAST:event_btnCliImprimActionPerformed
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        //System.out.println(this.getClass());
        Principal p = new Principal();
        p.setTelaCliente(false);
    }//GEN-LAST:event_formInternalFrameClosed
    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        carregaTblCliente();
    }//GEN-LAST:event_txtNomeKeyReleased
    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        consultaCliente();
    }//GEN-LAST:event_tblClienteMouseClicked
    private void btnGeraDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeraDadosActionPerformed

        String[] nome = {"Andréia", "Alisson", "Denise", "Jussara", "Juca", "Beatriz", "Bianca", "Michele", "Claudia", "Cibele", "Jandira", "Juarez da Cunha","Alisson"};
        String[] cidade = {"Guará", "Ceilândia", "Gama", "Taguatinga", "Estrutural", "Cruzeiro", "Riacho Fundo", "Recanto das emas", "Águas Claras"};            
        Random gerador = new Random();
        String cod_cliente = cliente.buscacod();
        String var = "";
        while(var.length()<41){
            var = var + Integer.toString(gerador.nextInt(9));
        }
        txtCodigo.setText(cod_cliente);
        txtNome.setText(nome[gerador.nextInt(nome.length)]);
        txtRg.setText(var.substring(0,9));
        txtCpf.setText(var.substring(10,21));
        txtTelefone.setText("619"+var.substring(22, 30));
        txtBairro.setText(cidade[gerador.nextInt(cidade.length)]);
        txtCep.setText("7"+var.substring(31, 38));    
        txtLogra.setText((txtBairro.getText().equals("Taguatinga")?"QNH":"Outros"));
        txtCidade.setText("Brasilia");
        cbbUf.setSelectedItem("DF");
        txtComplemento.setText((txtBairro.getText().equals("Taguatinga")?"Bloco A":"Outros"));
        txtNumero.setText(var.substring(38, 40));
    }//GEN-LAST:event_btnGeraDadosActionPerformed
    private void btnLimpaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaClienteActionPerformed
        acoes();
    }//GEN-LAST:event_btnLimpaClienteActionPerformed
    private void limpaTela(){
        txtCodigo.setText(cliente.buscacod());
        txtNome.setText("");
        txtRg.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtBairro.setText("");
        txtCep.setText("");
        txtLogra.setText("");
        txtCidade.setText("");
        cbbUf.setSelectedIndex(1);
        txtComplemento.setText("");
        txtNumero.setText("");

    }
    private void imprimir(){
        int opcao = JOptionPane.showConfirmDialog(null, "Confirma impressão?","Relatório Cliente", JOptionPane.YES_NO_OPTION);
        String caminho = "./relatorios/relCliente.jasper";
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
    private void carregaTblCliente(){
            ResultSet rs = cliente.pesquisarCliente(txtNome.getText());
            tblCliente.setModel(DbUtils.resultSetToTableModel(rs));
            tblCliente.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblCliente.getColumnModel().getColumn(2).setPreferredWidth(10);
            
            try {
                cliente.c_cliente.close();
            } catch (SQLException ex) {
                Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    private void consultaCliente() {
        int linha = tblCliente.getSelectedRow();
        if(linha>=0){
            cliente.consultarCod(tblCliente.getModel().getValueAt(linha, 0).toString());
            
            txtCodigo.setText(cliente.getCodigo());
            txtNome.setText(cliente.getNome());
            txtRg.setText(cliente.getRg());
            txtCpf.setText(cliente.getCpf());
            txtTelefone.setText(cliente.getTelefone());
            txtLogra.setText(cliente.getLogradouro());
            txtNumero.setText(cliente.getNumero());
            txtComplemento.setText(cliente.getComplemento());
            txtBairro.setText(cliente.getBairro());
                                            //System.out.println(cliente.getCep());
            txtCep.setText(cliente.getCep());
            txtCidade.setText(cliente.getCidade());
            cbbUf.setSelectedItem(cliente.getUf());
            
        }
    }
    private void acoes(){
        limpaTela();               
        carregaTblCliente();    
    }
    private String mascaraCpf(String cpf){
        return cpf.substring(0, 3)+"."+cpf.substring(3, 6)+"."+cpf.substring(6, 9)+"-"+cpf.substring(9, 11);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliAdd;
    private javax.swing.JButton btnCliEdit;
    private javax.swing.JButton btnCliExc;
    private javax.swing.JButton btnCliImprim;
    private javax.swing.JButton btnCliPesq;
    private javax.swing.JButton btnGeraDados;
    private javax.swing.JButton btnLimpaCliente;
    private javax.swing.JComboBox<String> cbbUf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliBairro;
    private javax.swing.JLabel lblCliCep;
    private javax.swing.JLabel lblCliCidade;
    private javax.swing.JLabel lblCliCod;
    private javax.swing.JLabel lblCliComplemen;
    private javax.swing.JLabel lblCliCpf;
    private javax.swing.JLabel lblCliLogra;
    private javax.swing.JLabel lblCliNome;
    private javax.swing.JLabel lblCliNum;
    private javax.swing.JLabel lblCliRg;
    private javax.swing.JLabel lblCliTel;
    private javax.swing.JLabel lblCliUf;
    private javax.swing.JPanel pnlEndereco;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtLogra;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

}