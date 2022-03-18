package VIEW;

import MODEL.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;


public class SelecionaProp extends javax.swing.JDialog {
    Cliente cliente = new Cliente();
    private String codProp;
    private String nomeProp;
    public String getCodProp(){return codProp;}
    public String getNomeProp(){return nomeProp;}
    public SelecionaProp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargaTblProp();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloSelectProp = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProp = new javax.swing.JTable();
        lblNomeProp = new javax.swing.JLabel();
        txtNomeProp = new javax.swing.JTextField();
        btnSelecProp = new javax.swing.JButton();
        btnCancelSelecProp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTituloSelectProp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloSelectProp.setText("SELECIONE O PROPRIETÁRIO DO VEÍCULO");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblProp.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPropMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProp);

        lblNomeProp.setText("NOME:");

        btnSelecProp.setText("Confirmar");
        btnSelecProp.setMaximumSize(new java.awt.Dimension(90, 25));
        btnSelecProp.setMinimumSize(new java.awt.Dimension(90, 25));
        btnSelecProp.setPreferredSize(new java.awt.Dimension(90, 25));
        btnSelecProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecPropActionPerformed(evt);
            }
        });

        btnCancelSelecProp.setText("Cancelar");
        btnCancelSelecProp.setMaximumSize(new java.awt.Dimension(90, 25));
        btnCancelSelecProp.setMinimumSize(new java.awt.Dimension(90, 25));
        btnCancelSelecProp.setPreferredSize(new java.awt.Dimension(90, 25));
        btnCancelSelecProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSelecPropActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomeProp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeProp)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(btnSelecProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnCancelSelecProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProp)
                    .addComponent(txtNomeProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelSelecProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnSelecPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecPropActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_btnSelecPropActionPerformed

    private void btnCancelSelecPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSelecPropActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelSelecPropActionPerformed

    private void tblPropMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPropMouseClicked
        consultaTblProp();
    }//GEN-LAST:event_tblPropMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SelecionaProp dialog = new SelecionaProp(new javax.swing.JFrame(), true);
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
    private void cargaTblProp(){
        ResultSet rs = cliente.pesquisarCliente(txtNomeProp.getText());
        tblProp.setModel(DbUtils.resultSetToTableModel(rs));
        tblProp.getColumnModel().getColumn(0).setPreferredWidth(10);
        tblProp.getColumnModel().getColumn(2).setPreferredWidth(10);

        try {
            cliente.c_cliente.close();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void consultaTblProp(){
        int item = tblProp.getSelectedRow();
        txtNomeProp.setText(tblProp.getModel().getValueAt(item, 1).toString());
        codProp = tblProp.getModel().getValueAt(item, 0).toString();
        nomeProp = tblProp.getModel().getValueAt(item, 1).toString();        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelSelecProp;
    private javax.swing.JButton btnSelecProp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomeProp;
    private javax.swing.JLabel lblTituloSelectProp;
    private javax.swing.JTable tblProp;
    private javax.swing.JTextField txtNomeProp;
    // End of variables declaration//GEN-END:variables
}
