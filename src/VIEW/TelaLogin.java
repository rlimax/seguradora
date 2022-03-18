
package VIEW;

import DAL.ModuloConexao;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {


    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public TelaLogin(){
        initComponents();
        getDisponibilidade();    
    }
    
    private void getDisponibilidade(){
        ModuloConexao conexao = new ModuloConexao();
        String acesso = conexao.conectividade();
        lblStatus.setOpaque(true);        
        //System.out.println(acesso);
        if(acesso.substring(23, 36).equals("Access denied")){
            lblStatus.setText("CONECTADO");
            lblStatus.setBackground(Color.green);
            lblStatusIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/yes.png")));
        }else{
            lblStatus.setText("DESCONECTADO");
            lblStatus.setBackground(Color.red);
            lblStatusIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/no.png")));
        }    
    }
    private void logar() {
        ModuloConexao conexao = new ModuloConexao();
        conexao.setUser(txtUsuario.getText());
        conexao.setPass(txtSenha.getText());
        Connection acesso = conexao.conector();

        String sql = "SELECT sysdate()";
        try {
            pst = acesso.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                Principal principal = new Principal();
                principal.setUsuario(txtUsuario.getText());
                principal.setVisible(true);
                TelaLogin.this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorreto(s).");
                txtUsuario.setText("");
                txtSenha.setText("");
            }
            
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorreto(s).");
                txtUsuario.setText("");
                txtSenha.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnAcesso = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        lblStatus = new javax.swing.JLabel();
        lblStatusIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 600));

        lblLogin.setText("LOGIN");

        lblSenha.setText("SENHA");

        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setMargin(new java.awt.Insets(2, 6, 2, 2));

        btnAcesso.setText("ACESSAR");
        btnAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessoActionPerformed(evt);
            }
        });

        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenha.setMargin(new java.awt.Insets(2, 6, 2, 2));

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("BANCO DE DADOS");

        lblStatusIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/yes.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogin)
                            .addComponent(lblSenha))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario)
                            .addComponent(txtSenha)))
                    .addComponent(btnAcesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(lblStatusIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(lblStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatusIcon)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessoActionPerformed
        logar();
    }//GEN-LAST:event_btnAcessoActionPerformed
  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcesso;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStatusIcon;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}