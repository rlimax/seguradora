package VIEW;

import CONTROL.Hora;
import java.awt.Color;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    //Variável de usuário para a barra
    private String usuario = "Não identificado";
    //Variáveis de tela aberta/fechada - setando como fechadas
    private static boolean telaC = false;   //Tela Cliente
    private static boolean telaA = false;   //Tela Automóvel
    private static boolean telaO = false;   //Tela Ocorrência
    //Marca tela do cliente como aberta ou fechada
    public void setTelaCliente(boolean t){
        this.telaC = t;
    }    
    //Marca tela do automovel como aberta ou fechada
    public void setTelaAuto(boolean t){
        this.telaA = t;
    }    
    //Marca tela de ocorrência como aberta ou fechada
    public void setTelaOcorrencia(boolean t){
        this.telaO = t;
    }
    //Pega o usuário da sessão atual
    public void setUsuario(String u){
        this.usuario = u;
    }
    //Mostra o usuário da sessão atual
    public String getUsuario(){
        return this.usuario;
    }
    public Principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        lblHora = new javax.swing.JLabel();
        jmbPrincipal = new javax.swing.JMenuBar();
        mnuCliente = new javax.swing.JMenu();
        imnuCliente = new javax.swing.JMenuItem();
        mnuAutomoveis = new javax.swing.JMenu();
        imnuAuto = new javax.swing.JMenuItem();
        mnuOcorrencias = new javax.swing.JMenu();
        imnuOcorrencias = new javax.swing.JMenuItem();
        mnuRelatorios = new javax.swing.JMenu();
        mnuSistema = new javax.swing.JMenu();
        imnuTema = new javax.swing.JMenuItem();
        imnuAjuda = new javax.swing.JMenuItem();
        imnuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );

        lblHora.setBackground(new java.awt.Color(51, 153, 0));
        lblHora.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHora.setToolTipText("");
        lblHora.setFocusable(false);
        lblHora.setMaximumSize(new java.awt.Dimension(122, 25));
        lblHora.setMinimumSize(new java.awt.Dimension(122, 25));
        lblHora.setOpaque(true);
        lblHora.setPreferredSize(new java.awt.Dimension(100, 25));
        lblHora.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jmbPrincipal.setMinimumSize(new java.awt.Dimension(900, 700));

        mnuCliente.setText("Clientes");
        mnuCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuCliente.setMargin(new java.awt.Insets(0, 20, 0, 0));

        imnuCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        imnuCliente.setText("Perfil");
        imnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnuClienteActionPerformed(evt);
            }
        });
        mnuCliente.add(imnuCliente);

        jmbPrincipal.add(mnuCliente);

        mnuAutomoveis.setText("Automóveis");
        mnuAutomoveis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuAutomoveis.setMargin(new java.awt.Insets(0, 10, 0, 0));

        imnuAuto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        imnuAuto.setText("Cadastro");
        imnuAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnuAutoActionPerformed(evt);
            }
        });
        mnuAutomoveis.add(imnuAuto);

        jmbPrincipal.add(mnuAutomoveis);

        mnuOcorrencias.setText("Ocorrências");
        mnuOcorrencias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuOcorrencias.setMargin(new java.awt.Insets(0, 10, 0, 0));

        imnuOcorrencias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        imnuOcorrencias.setText("Cadastro");
        imnuOcorrencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnuOcorrenciasActionPerformed(evt);
            }
        });
        mnuOcorrencias.add(imnuOcorrencias);

        jmbPrincipal.add(mnuOcorrencias);

        mnuRelatorios.setText("Relatórios");
        mnuRelatorios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuRelatorios.setMargin(new java.awt.Insets(0, 10, 0, 0));
        jmbPrincipal.add(mnuRelatorios);

        mnuSistema.setText("Sistema");
        mnuSistema.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuSistema.setMargin(new java.awt.Insets(0, 10, 0, 0));

        imnuTema.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        imnuTema.setText("Tema");
        imnuTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnuTemaActionPerformed(evt);
            }
        });
        mnuSistema.add(imnuTema);

        imnuAjuda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        imnuAjuda.setText("Ajuda");
        imnuAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnuAjudaActionPerformed(evt);
            }
        });
        mnuSistema.add(imnuAjuda);

        imnuSobre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        imnuSobre.setText("Sobre");
        mnuSistema.add(imnuSobre);

        jmbPrincipal.add(mnuSistema);

        setJMenuBar(jmbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdpPrincipal)
                    .addComponent(lblHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdpPrincipal)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void imnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnuClienteActionPerformed
        //Verifica se a tela esta aberta ou fechada
        if(telaC){
            JOptionPane.showMessageDialog(null, "Janela de CLIENTE ja aberta.");
        //Verifica se tem usuário de sessão
        }else if(usuario.equals("Não identificado")){
            JOptionPane.showMessageDialog(null, "Usuário desconectado.");            
        //Carrega a tela do cliente
        }else{
            JInternalFrame carregar;
            carregar = new TelaCliente();
            //Verifica se janela principal está maximizada
            if(this.getExtendedState()!=MAXIMIZED_BOTH){
                //Ajusta tamanho e localização à esquerda da tela cliente
                carregar.setBounds(jdpPrincipal.getSize().width/2-310, 10, carregar.getSize().width, carregar.getSize().height);            
            }else{
                //Ajusta tamanho e localização centralizada da tela cliente
                carregar.setBounds(0, 0, carregar.getSize().width, carregar.getSize().height+300);            
            }
            jdpPrincipal.add(carregar); //Carrega tela cliente
            carregar.setVisible(true);  //Mostra tela cliente
            telaC = true;               //Marca tela cliente como aberta
        }
    }//GEN-LAST:event_imnuClienteActionPerformed
    private void imnuAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnuAutoActionPerformed
        //Verifica se a tela automóvel esta aberta ou fechada
        if(telaA){
            JOptionPane.showMessageDialog(null, "Janela de AUTOMÓVEL ja aberta.");
        //Verifica se tem usuário de sessão
        }else if(usuario.equals("Não identificado")){
            JOptionPane.showMessageDialog(null, "Usuário desconectado.");            
        //Carrega a tela do automóvel
        }else{
            JInternalFrame carregar;
            carregar = new TelaAuto();
            //Verifica se janela principal está maximizada
            if(this.getExtendedState()!=MAXIMIZED_BOTH){
                //Ajusta tamanho e localização centralizada da tela automóvel
                carregar.setBounds(jdpPrincipal.getSize().width/2-295, 10, carregar.getSize().width, carregar.getSize().height);            
            }else{
                //Ajusta tamanho e localização centralizada da tela automóvel
                carregar.setBounds(650, 0, carregar.getSize().width, carregar.getSize().height+300);            
            }
            jdpPrincipal.add(carregar); //Carrega tela automóvel
            carregar.setVisible(true);  //Mostra tela automóvel
            telaA = true;               //Marca tela automóvel como aberta
        }
    }//GEN-LAST:event_imnuAutoActionPerformed
    private void imnuOcorrenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnuOcorrenciasActionPerformed
        //Verifica se a tela ocorrência esta aberta ou fechada
        if(telaO){
            JOptionPane.showMessageDialog(null, "Janela de OCORRÊNCIA ja aberta.");
        //Verifica se tem usuário de sessão
        }else if(usuario.equals("Não identificado")){
            JOptionPane.showMessageDialog(null, "Usuário desconectado.");
        //Carrega a tela de ocorrência
        }else{
            JInternalFrame carregar;
            carregar = new TelaOcorrencia();
            //Verifica se janela principal está maximizada
            if(this.getExtendedState()!=MAXIMIZED_BOTH){
                //Ajusta tamanho e localização centralizada da tela ocorrência
                carregar.setBounds(jdpPrincipal.getSize().width/2-310, 10, carregar.getSize().width, carregar.getSize().height);            
            }else{
                //Ajusta tamanho e localização à direita da tela ocorrência
                carregar.setBounds(1265, 0, carregar.getSize().width, carregar.getSize().height+300);            
            }
            
            jdpPrincipal.add(carregar); //Carrega tela ocorrência
            carregar.setVisible(true);  //Mostra tela ocorrência
            telaO = true;               //Marca tela ocorrência como aberta
        }
    }//GEN-LAST:event_imnuOcorrenciasActionPerformed
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Inicializa as threads cores e contador
        start();
        
        //Habilita e desabilita menus de acordo com usuário logado
        //if(this.usuario.equals("batman")){
        //    this.mnuAutomoveis.setEnabled(false);
        //    this.mnuAutomoveis.setVisible(false);
        //    this.mnuOcorrencias.setEnabled(false);
        //}
        
        //Pergunta se o usuário quer iniciar no modo tela cheia
        int x = JOptionPane.showConfirmDialog(null, "Deseja iniciar em tela cheia?");
        if(x==0){
            this.setExtendedState(MAXIMIZED_BOTH);
        }

        

    }//GEN-LAST:event_formWindowOpened
    private void imnuTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnuTemaActionPerformed
        //Abre menu de escolha de temas
        new Temas().setVisible(true);
    }//GEN-LAST:event_imnuTemaActionPerformed
    private void imnuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnuAjudaActionPerformed
        try {
            ajuda();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_imnuAjudaActionPerformed
    public void start(){
        //Thread de controle de cores da barra
        new Thread(){                
            int bcor = 100;     //Taxa de cor inicial - azul
            int gcor = 150;     //Taxa de cor inicial - verde
            int controle = 1;   //Variável de controle azul
            int rcontrole = -1; //Variável de controle do verde
            public void run(){
                while(true){
                    Color cor = new Color(0,gcor,bcor);
                    if(bcor==160){
                        controle = -1;
                    }
                    if(bcor==100){
                        controle = 1;
                    }
                    if(gcor==150){
                        rcontrole = -1;
                    }
                    if(gcor==80){
                        rcontrole = 1;
                    }
                    bcor+=controle;
                    gcor+=rcontrole;
                    //System.out.println(cor);
                    lblHora.setBackground(cor);
                    try{
                        sleep(100);
                    }catch(Exception e){
                        System.out.println("Erro thread cores");
                    }
                }    
            }
        }.start();
        //Thread do contador da barra - (Futuro controle de tempo de sessão)
        new Thread(){
            Hora h = new Hora();
            int c = 0;
            public void run(){
                while( c<3600 ){
                    try {
                        //Define nome do usuário e tempo de sessão na barra
                        lblHora.setText("Usuário: "+usuario.toUpperCase()+" |  Sessão: "+h.atualizaHora(1)+"   ");
                        if(c==30){
                            //lblHora.setBackground(Color.RED);
                            //System.out.println(m.getUser());
                            //JOptionPane.showMessageDialog(null, "Tempo de sessão expirou.");
                            //usuario = "Não identificado";
                            
                        }
                        //System.out.println((1==Integer.parseInt(h.atualizaHora(0).substring(4,5))?true:false));
                        c++;
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Hora.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });

    }
    public void ajuda() throws IOException{
        //Forma 1
        //String chmFile = "cmd.exe /c c:/Relatorios/admin.chm";
        //Runtime run = Runtime.getRuntime();
        //System.out.println("Runtime.");
        //try {
        //    run.exec(chmFile);
        //}catch(IOException e){
        //    System.out.println(e);
        //}
        
        //Forma 2        
        //String url = "c:/Relatorios/Admin.chm";
        //List<String> commands = new ArrayList<>();                
        //commands.add("cmd.exe");
        //commands.add("/C");
        //commands.add(url);
        //System.out.println("ProcessBuilder.");
        //ProcessBuilder pb = new ProcessBuilder(commands);
        //pb.start();
        
        //Forma 3

        String one = "cmd.exe";
        String two = "/C";
        String three = "Admin.chm";        
        new ProcessBuilder(one, two, three).start();

        
        //String url3 = "c:/Relatorios/teste.bat";
        //String one1 = "cmd.exe";
        //String two2 = "/C";
        //new ProcessBuilder(one, two, url3).start();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem imnuAjuda;
    private javax.swing.JMenuItem imnuAuto;
    private javax.swing.JMenuItem imnuCliente;
    private javax.swing.JMenuItem imnuOcorrencias;
    private javax.swing.JMenuItem imnuSobre;
    private javax.swing.JMenuItem imnuTema;
    private javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenuBar jmbPrincipal;
    private javax.swing.JLabel lblHora;
    private javax.swing.JMenu mnuAutomoveis;
    private javax.swing.JMenu mnuCliente;
    private javax.swing.JMenu mnuOcorrencias;
    private javax.swing.JMenu mnuRelatorios;
    private javax.swing.JMenu mnuSistema;
    // End of variables declaration//GEN-END:variables
}
