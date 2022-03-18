package VIEW;

import MODEL.Veiculo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;


public class SelecionaVeiculo extends javax.swing.JDialog {
    Veiculo veiculo = new Veiculo();
    private String codVeiculo;
    private String placaVeiculo;
    private String modeloVeiculo;
    public String getCodVeiculo(){return codVeiculo;}
    public String getPlacaVeiculo(){return placaVeiculo;}
    public String getModeloVeiculo(){return modeloVeiculo;}
    public SelecionaVeiculo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargaTblVeiculo();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloSelectProp = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSelecVeiculo = new javax.swing.JTable();
        lblCodVeiculo = new javax.swing.JLabel();
        txtCodigoVeiculo = new javax.swing.JTextField();
        btnSelecVeiculo = new javax.swing.JButton();
        btnCancelSelecVeiculo = new javax.swing.JButton();
        txtPlacaVeiculo = new javax.swing.JTextField();
        lblPlacaVeiculo = new javax.swing.JLabel();
        txtModeloVeiculo = new javax.swing.JTextField();
        lblModeloVeiculo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTituloSelectProp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloSelectProp.setText("SELECIONE O VEÍCULO ENVOLVIDO NO SINISTRO");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblSelecVeiculo.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSelecVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSelecVeiculoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSelecVeiculo);

        lblCodVeiculo.setText("CODIGO");

        btnSelecVeiculo.setText("Confirmar");
        btnSelecVeiculo.setMaximumSize(new java.awt.Dimension(90, 25));
        btnSelecVeiculo.setMinimumSize(new java.awt.Dimension(90, 25));
        btnSelecVeiculo.setPreferredSize(new java.awt.Dimension(90, 25));
        btnSelecVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecVeiculoActionPerformed(evt);
            }
        });

        btnCancelSelecVeiculo.setText("Cancelar");
        btnCancelSelecVeiculo.setMaximumSize(new java.awt.Dimension(90, 25));
        btnCancelSelecVeiculo.setMinimumSize(new java.awt.Dimension(90, 25));
        btnCancelSelecVeiculo.setPreferredSize(new java.awt.Dimension(90, 25));
        btnCancelSelecVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSelecVeiculoActionPerformed(evt);
            }
        });

        lblPlacaVeiculo.setText("PLACA");

        lblModeloVeiculo.setText("MODELO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(txtCodigoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(txtModeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btnSelecVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnCancelSelecVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblCodVeiculo)
                .addGap(89, 89, 89)
                .addComponent(lblPlacaVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblModeloVeiculo)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelSelecVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTituloSelectProp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTituloSelectProp, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecVeiculoActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_btnSelecVeiculoActionPerformed

    private void btnCancelSelecVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSelecVeiculoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelSelecVeiculoActionPerformed

    private void tblSelecVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSelecVeiculoMouseClicked
        consultaTblVeiculo();
    }//GEN-LAST:event_tblSelecVeiculoMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SelecionaVeiculo dialog = new SelecionaVeiculo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    private void cargaTblVeiculo(){
        //ResultSet rs = cliente.pesquisarCliente(txtCodigoVeiculo.getText());
        ResultSet rs = veiculo.listarAuto();
        tblSelecVeiculo.setModel(DbUtils.resultSetToTableModel(rs));
        

        try {
            veiculo.c_veiculo.close();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void consultaTblVeiculo(){
        int item = tblSelecVeiculo.getSelectedRow();
        txtCodigoVeiculo.setText(tblSelecVeiculo.getModel().getValueAt(item, 0).toString());
        txtPlacaVeiculo.setText(tblSelecVeiculo.getModel().getValueAt(item, 1).toString());
        txtModeloVeiculo.setText(tblSelecVeiculo.getModel().getValueAt(item, 2).toString());
        codVeiculo = tblSelecVeiculo.getModel().getValueAt(item, 0).toString();
        placaVeiculo = tblSelecVeiculo.getModel().getValueAt(item, 1).toString();        
        modeloVeiculo = tblSelecVeiculo.getModel().getValueAt(item, 2).toString();            
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelSelecVeiculo;
    private javax.swing.JButton btnSelecVeiculo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodVeiculo;
    private javax.swing.JLabel lblModeloVeiculo;
    private javax.swing.JLabel lblPlacaVeiculo;
    private javax.swing.JLabel lblTituloSelectProp;
    private javax.swing.JTable tblSelecVeiculo;
    private javax.swing.JTextField txtCodigoVeiculo;
    private javax.swing.JTextField txtModeloVeiculo;
    private javax.swing.JTextField txtPlacaVeiculo;
    // End of variables declaration//GEN-END:variables
}
