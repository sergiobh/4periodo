package exercicio06;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.sun.java.swing.plaf.windows.*;



public class LivroCaixa extends JFrame {

    public static final String newline = "\n";
    public static final String VALIDATE_SAVE = "Validar & Salvar";
    public static final String EXIT = "Sair";
    private JTextField txtData, txtConta;
    private JTextField txtHistorico, txtDebito, txtCredito;
    private JLabel lblData;
    private JLabel lblConta, lblHistorico;
    private JLabel lblCredito, lblDebito ;
    private JLabel lblResult, lblResultValue;

    public LivroCaixa() {
        super(" Facade Pattern - Livro contábil ");



        txtData = new JTextField(20);
        txtConta = new JTextField(20);
        txtHistorico = new JTextField(20);
        txtCredito = new JTextField(20);
        txtDebito = new JTextField(20);



        lblData = new JLabel("Data:");
        lblConta = new JLabel("Conta:");
        lblHistorico = new JLabel("Histórico:");
        lblCredito = new JLabel("Crédito:");
        lblDebito = new JLabel("Débito:");

        lblResult = new JLabel("Resultado:");
        lblResultValue =
                new JLabel(" Clique no botão validar e salvar");


        //Create the open button
        JButton validateSaveButton =
                new JButton(LivroCaixa.VALIDATE_SAVE);
        validateSaveButton.setMnemonic(KeyEvent.VK_V);
        JButton exitButton = new JButton(LivroCaixa.EXIT);
        exitButton.setMnemonic(KeyEvent.VK_X);
        ButtonHandler objButtonHandler = new ButtonHandler(this);


        validateSaveButton.addActionListener(objButtonHandler);
        exitButton.addActionListener(new ButtonHandler());

        //For layout purposes, put the buttons in a separate panel
        JPanel buttonPanel = new JPanel();

        //****************************************************
        GridBagLayout gridbag = new GridBagLayout();
        buttonPanel.setLayout(gridbag);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;

        buttonPanel.add(lblData);
        buttonPanel.add(lblConta);
        buttonPanel.add(txtData);
        buttonPanel.add(lblHistorico);
        buttonPanel.add(txtConta);
        buttonPanel.add(lblCredito);
        buttonPanel.add(txtHistorico);
        buttonPanel.add(lblDebito);
        buttonPanel.add(txtDebito);
        buttonPanel.add(txtCredito);
        buttonPanel.add(lblResult);
        buttonPanel.add(lblResultValue);

        buttonPanel.add(validateSaveButton);
        buttonPanel.add(exitButton);

        gbc.insets.top = 5;
        gbc.insets.bottom = 5;
        gbc.insets.left = 5;
        gbc.insets.right = 5;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gridbag.setConstraints(lblData, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gridbag.setConstraints(txtData, gbc);
        
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gridbag.setConstraints(lblConta, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gridbag.setConstraints(txtConta, gbc);
        
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gridbag.setConstraints(lblHistorico, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gridbag.setConstraints(txtHistorico, gbc);
        
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gridbag.setConstraints(lblDebito, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gridbag.setConstraints(txtDebito, gbc);
        
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        gridbag.setConstraints(lblCredito, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gridbag.setConstraints(txtCredito, gbc);


        gbc.gridx = 0;
        gbc.gridy = 5;
        gridbag.setConstraints(lblResult, gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        gridbag.setConstraints(lblResultValue, gbc);

        gbc.insets.left = 2;
        gbc.insets.right = 2;
        gbc.insets.top = 40;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 10;
        gridbag.setConstraints(validateSaveButton, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 10;
        gridbag.setConstraints(exitButton, gbc);

        //****************************************************

        //Add the buttons and the log to the frame
        Container contentPane = getContentPane();

        contentPane.add(buttonPanel, BorderLayout.CENTER);
        try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
            SwingUtilities.updateComponentTreeUI(
                    LivroCaixa.this);
        } catch (Exception ex) {
            System.out.println(ex);
        }


    }

    public String getDate() {
        return txtData.getText();
    }

    public String getConta() {
        return txtConta.getText();
    }

    public String getHistorico() {
        return txtHistorico.getText();
    }

    public String getDebito() {
        return txtDebito.getText();
    }

    public String getCredito() {
        return txtCredito.getText();
    }

    public void setResultDisplay(String msg) {
        lblResultValue.setText(msg);
    }

    public static void main(String[] args) {
        JFrame frame = new LivroCaixa();

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //frame.pack();
        frame.setSize(500, 450);
        frame.setVisible(true);
    }
} // End of class AccountManager

class ButtonHandler implements ActionListener {

    LivroCaixa objAccountManager;

    @Override
    public void actionPerformed(ActionEvent e) {
        String validateCheckResult = null;

        if (e.getActionCommand().equals(LivroCaixa.EXIT)) {
            System.exit(1);
        }
        if (e.getActionCommand().equals(
                LivroCaixa.VALIDATE_SAVE)) {
            //get input values
            String data = objAccountManager.getDate();
            String conta = objAccountManager.getConta();
            String historico = objAccountManager.getHistorico();
            String debito = objAccountManager.getDebito();
            String credito = objAccountManager.getCredito();


            // Create a facade instance
            GestorDeCaixa facade = new GestorDeCaixa();
            facade.setData(data);
            facade.setConta(conta);
            facade.setHistorico(historico);
            facade.setDebito(debito);
            facade.setCredito(credito);

            //Client is not required to access subsystem components.
            boolean result = facade.saveCustomerData();

            if (result) {
                validateCheckResult =
                        " dados validados: Registro salvo com sucesso ";

            } else {
                validateCheckResult =
                        " daos invalidados: Não foi possível salvar os registros ";

            }

            objAccountManager.setResultDisplay(
                    validateCheckResult);
        }
    }

    public ButtonHandler() {
    }

    public ButtonHandler(LivroCaixa inobjAccountManager) {
        objAccountManager = inobjAccountManager;
    }
} // End of class ButtonHandler

