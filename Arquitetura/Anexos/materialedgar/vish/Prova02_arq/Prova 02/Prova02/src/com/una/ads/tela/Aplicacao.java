/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.ads.tela;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author edgard.cardoso
 */
// Esta classe deverá implementar a interface Observador.
// Implemente adequadaemnte nesta classe os métodos do contrado da interface Observador
public class Aplicacao extends JFrame {

    // Declaracao de variaveis da tela. Não mexa nelas
    private javax.swing.JButton jButtonExecutar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButtonDB2;
    private javax.swing.JRadioButton jRadioButtonMySQL;
    private javax.swing.JRadioButton jRadioButtonOracle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaComando;
    private javax.swing.JPanel mainPanel;
    // Fim da declaracao das variaveis  
    

   // Construtor. Não precisa modificá-lo
    public Aplicacao() {
        super("SQL Explorer");
        initComponents();
        registrarObservados();
    }
    
    // Neste método você deverá implementar o código para registrar todos os 
    // observados, no caso o Email e o SMS.
    // Para isso você deverá criar os objetos Email e SMS e registra-los por meio
    // da funcao "registrar(Observador obs)" implementada a partir do contrato da 
    // interface Observador
    private void registrarObservados(){
        
    }

    // Metodo que é executado quando o botao é apertado.
    // Implemente a chamada correta do Facade de acordo com os comentários do metodo
    private void jButtonExecutarActionPerformed(java.awt.event.ActionEvent evt) {

        // Crie aqui um objeto do tipo Facade. Exemplo
        // Facade facade = new Facade();
        
        if (jRadioButtonMySQL.isSelected()) {
            // Chame o comando Façade apropriado 
            // Passe para o facede o comando sql com o código -> jTextAreaComando.getText();
        } else if (jRadioButtonOracle.isSelected()) {
            // Chame o comando Façade apropriado  
            // Passe para o facade o comando sql com o código -> jTextAreaComando.getText();
        } else if (jRadioButtonDB2.isSelected()) {
            // Chame o comando Façade apropriado  
            // Passe para o facade o comando sql com o código -> jTextAreaComando.getText();   
        }
        
        // Se o comando sql contiver a palavra "drop". Notifique o DBA por meio do 
        // padrão observer. Para isso, primeiramente chame o método "setComandoSQl(String comando)"
        // em seguida chame o método "notificarObservados()" implementados de acordo
        // com o padrão observer apresentado no diagrama desta prova.
        if (jTextAreaComando.getText().toLowerCase().contains("drop")){
            
        }
    }

    // Metodo para inicializar os componentes na tela. 
    // Nao mexa em nada aqui. 
    // Não perca seu precioso tempo tentando entendê-lo
    private void initComponents() {

        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaComando = new javax.swing.JTextArea();
        jRadioButtonMySQL = new javax.swing.JRadioButton();
        jRadioButtonOracle = new javax.swing.JRadioButton();
        jRadioButtonDB2 = new javax.swing.JRadioButton();
        jButtonExecutar = new javax.swing.JButton();

        mainPanel.setName("mainPanel"); 


        jLabel1.setText("Digite o comando SQL"); 
        jLabel1.setName("jLabel1"); 

        jScrollPane1.setName("jScrollPane1"); 

        jTextAreaComando.setColumns(20);
        jTextAreaComando.setRows(5);
        jTextAreaComando.setName("jTextAreaComando"); 
        jScrollPane1.setViewportView(jTextAreaComando);

        jRadioButtonMySQL.setSelected(true);
        jRadioButtonMySQL.setText("MySql"); 
        jRadioButtonMySQL.setName("jrbMySQL"); 

        jRadioButtonOracle.setText("Oracle"); 
        jRadioButtonOracle.setName("jrbOracle"); 

        jRadioButtonDB2.setText("DB2"); 
        jRadioButtonDB2.setName("jrbDB2"); 

        jButtonExecutar.setText("Executar"); 
        jButtonExecutar.setName("jbtnExecutar"); 
        jButtonExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExecutarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout mainPanelLayout = new org.jdesktop.layout.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(mainPanelLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .add(mainPanelLayout.createSequentialGroup()
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(mainPanelLayout.createSequentialGroup()
                .add(jRadioButtonMySQL)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jRadioButtonOracle)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButtonDB2))
                .add(jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 65, Short.MAX_VALUE)
                .add(jButtonExecutar)))
                .addContainerGap()));
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(mainPanelLayout.createSequentialGroup()
                .add(29, 29, 29)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 165, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jRadioButtonMySQL)
                .add(jRadioButtonOracle)
                .add(jRadioButtonDB2)
                .add(jButtonExecutar))
                .addContainerGap(44, Short.MAX_VALUE)));

        getContentPane().add(mainPanel);
    }  

    // Aqui é a chamada principal do programa.
    // Não é necessário fazer alteracao
    public static void main(String[] args) {
        final Aplicacao aplicacao = new Aplicacao();
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                aplicacao.setVisible(true);
            }
        });

    }
}
