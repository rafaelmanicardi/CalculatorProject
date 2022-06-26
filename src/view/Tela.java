import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import javafx.scene.control.Control;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author rafam
 */
public class Tela extends javax.swing.JFrame {
    private Controller calculadoraController;

    private EnumOperacao ultimaOperacao;

    /**
     * Creates new form TelaPrincipal
     */
    public Tela() {
        initComponents();
        calculadoraController = new Controller();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfValor = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnAC = new javax.swing.JButton();
        btnMaisMenos = new javax.swing.JButton();
        btnPorcentagem = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btn7value = new javax.swing.JButton();
        btn8value = new javax.swing.JButton();
        btn9value = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btn4value = new javax.swing.JButton();
        btn5value = new javax.swing.JButton();
        btn6value = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btn1value = new javax.swing.JButton();
        btn2value = new javax.swing.JButton();
        btn3value = new javax.swing.JButton();
        btnAdicao = new javax.swing.JButton();
        btn0value = new javax.swing.JButton();
        btnVirgula = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(440, 560));

        tfValor.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        tfValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfValor.setText("0,00");

        jPanel1.setLayout(new java.awt.GridLayout(5, 4));

        btnAC.setText("AC");
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });
        jPanel1.add(btnAC);

        btnMaisMenos.setText("+/-");
        btnMaisMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisMenosActionPerformed(evt);
            }
        });
        jPanel1.add(btnMaisMenos);

        btnPorcentagem.setText("%");
        btnPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentagemActionPerformed(evt);
            }
        });
        jPanel1.add(btnPorcentagem);

        btnDivisao.setText("/");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });
        jPanel1.add(btnDivisao);

        btn7value.setText("7");
        btn7value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7valueActionPerformed(evt);
            }
        });
        jPanel1.add(btn7value);

        btn8value.setText("8");
        btn8value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8valueActionPerformed(evt);
            }
        });
        jPanel1.add(btn8value);

        btn9value.setText("9");
        btn9value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9valueActionPerformed(evt);
            }
        });
        jPanel1.add(btn9value);

        btnMultiplicacao.setText("*");
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });
        jPanel1.add(btnMultiplicacao);

        btn4value.setText("4");
        btn4value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4valueActionPerformed(evt);
            }
        });
        jPanel1.add(btn4value);

        btn5value.setText("5");
        btn5value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5valueActionPerformed(evt);
            }
        });
        jPanel1.add(btn5value);

        btn6value.setText("6");
        btn6value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6valueActionPerformed(evt);
            }
        });
        jPanel1.add(btn6value);

        btnSubtracao.setText("-");
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubtracao);

        btn1value.setText("1");
        btn1value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1valueActionPerformed(evt);
            }
        });
        jPanel1.add(btn1value);

        btn2value.setText("2");
        btn2value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2valueActionPerformed(evt);
            }
        });
        jPanel1.add(btn2value);

        btn3value.setText("3");
        btn3value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3valueActionPerformed(evt);
            }
        });
        jPanel1.add(btn3value);

        btnAdicao.setText("+");
        btnAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicaoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdicao);

        btn0value.setText("0");
        btn0value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0valueActionPerformed(evt);
            }
        });
        jPanel1.add(btn0value);

        btnVirgula.setText(",");
        btnVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVirgulaActionPerformed(evt);
            }
        });
        jPanel1.add(btnVirgula);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        jPanel1.add(btnFechar);

        btnResultado.setText("=");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfValor)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1valueActionPerformed(java.awt.event.ActionEvent evt) {
        digita("1");
    }

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);

    }

    private void btn7valueActionPerformed(java.awt.event.ActionEvent evt) {
        digita("7");
        
    }

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {
        calculadoraController.realizaOperacao(ultimaOperacao, stringToDouble(tfValor.getText()));
        tfValor.setText(DoubleToString(calculadoraController.getTotal()));

    }

    private void btnMaisMenosActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void btn0valueActionPerformed(java.awt.event.ActionEvent evt) {
        digita("0");

    }

    private void btnVirgulaActionPerformed(java.awt.event.ActionEvent evt) {
        digita(",");
    
    }

    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {
        limpa();
        calculadoraController.zerar();
        
    }

    private void btnPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {
      
    }

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {
        calculadoraController.realizaOperacao(EnumOperacao.DIVISAO, stringToDouble(tfValor.getText()));
        ultimaOperacao = EnumOperacao.DIVISAO;
        limpa();
    }


    private String DoubleToString(Double numero){
        if (numero != null){
            DecimalFormat formato = new DecimalFormat("##,###,###,##0.00", new DecimalFormatSymbols(new Locale("pt","BR")));
            formato.setParseBigDecimal(true);
            return formato.format(numero);
        }
        return "";

    }

    private Double stringToDouble(String numero){
        NumberFormat nf = NumberFormat.getInstance();
        Double dv = null;
        try {
            dv = nf.parse(numero).doubleValue();
        } catch(ParseException ex){

        }
        return dv;
    }

    private void btn8valueActionPerformed(java.awt.event.ActionEvent evt) {
        digita("8");
        
    }

    private void btn9valueActionPerformed(java.awt.event.ActionEvent evt) {
        digita("9");
      
    }

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {
        calculadoraController.realizaOperacao(EnumOperacao.MULTIPLICACAO, stringToDouble(tfValor.getText()));
        ultimaOperacao = EnumOperacao.MULTIPLICACAO;
        limpa();
        
    }

    private void btn4valueActionPerformed(java.awt.event.ActionEvent evt) {
        digita("4");
    }    

    private void btn5valueActionPerformed(java.awt.event.ActionEvent evt) {
        digita("5");
    
    }
    private void btn6valueActionPerformed(java.awt.event.ActionEvent evt) {
        digita("6");
        
    }

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {
        calculadoraController.realizaOperacao(EnumOperacao.SUBTRACAO, stringToDouble(tfValor.getText()));
        ultimaOperacao = EnumOperacao.SUBTRACAO;
        limpa();
        
    }

    private void btn2valueActionPerformed(java.awt.event.ActionEvent evt) {
        digita("2");
    }

    private void btn3valueActionPerformed(java.awt.event.ActionEvent evt) {
        digita("3");
    }

    private void btnAdicaoActionPerformed(java.awt.event.ActionEvent evt) {
        calculadoraController.realizaOperacao(EnumOperacao.SOMA, stringToDouble(tfValor.getText()));
        ultimaOperacao = EnumOperacao.SOMA;
        limpa();
        
    }

    private void digita(String caractere){
        if(tfValor.getText().equals("0,00")){
            tfValor.setText(caractere);
        }else{
            if(caractere.equals(",") && tfValor.getText().contains(",")){
        }   else {
            tfValor.setText(tfValor.getText().concat(caractere));
        }
    }
}    
    private void limpa(){
        tfValor.setText("0,00");

    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0value;
    private javax.swing.JButton btn1value;
    private javax.swing.JButton btn2value;
    private javax.swing.JButton btn3value;
    private javax.swing.JButton btn4value;
    private javax.swing.JButton btn5value;
    private javax.swing.JButton btn6value;
    private javax.swing.JButton btn7value;
    private javax.swing.JButton btn8value;
    private javax.swing.JButton btn9value;
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnAdicao;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnMaisMenos;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnVirgula;
    private javax.swing.JButton btnPorcentagem;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
