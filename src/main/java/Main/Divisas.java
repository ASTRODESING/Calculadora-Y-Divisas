
package Main;

public class Divisas extends javax.swing.JFrame {
private String divisa1T="";
private double result;


    /**
     * Creates new form Divisas
     */
    public Divisas() {
        this.setLocationRelativeTo(null);
        initComponents();
 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        simboloDivisa1 = new javax.swing.JLabel();
        textoDivisa1 = new javax.swing.JLabel();
        comboMoneda1 = new javax.swing.JComboBox<>();
        simboloDivisa2 = new javax.swing.JLabel();
        textoDivisa2 = new javax.swing.JLabel();
        comboMoneda2 = new javax.swing.JComboBox<>();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        calculadoraB = new javax.swing.JMenuItem();
        divisas = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        simboloDivisa1.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        simboloDivisa1.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(simboloDivisa1, gridBagConstraints);

        textoDivisa1.setBackground(new java.awt.Color(153, 153, 153));
        textoDivisa1.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        textoDivisa1.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(textoDivisa1, gridBagConstraints);

        comboMoneda1.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        comboMoneda1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolar Estado Unidense", "Euro", "Bolivar" }));
        comboMoneda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMoneda1ActionPerformed(evt);
            }
        });
        comboMoneda1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                comboMoneda1PropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(comboMoneda1, gridBagConstraints);

        simboloDivisa2.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        simboloDivisa2.setText("Bs.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(simboloDivisa2, gridBagConstraints);

        textoDivisa2.setBackground(new java.awt.Color(153, 153, 153));
        textoDivisa2.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        textoDivisa2.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(textoDivisa2, gridBagConstraints);

        comboMoneda2.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        comboMoneda2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bolivar", "Dolar Estado Unidense", "Euro" }));
        comboMoneda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMoneda2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(comboMoneda2, gridBagConstraints);

        btn7.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
        jPanel1.add(btn7, gridBagConstraints);

        btn8.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
        jPanel1.add(btn8, gridBagConstraints);

        btn9.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
        jPanel1.add(btn9, gridBagConstraints);

        btn4.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(btn4, gridBagConstraints);

        btn5.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(btn5, gridBagConstraints);

        btn6.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(btn6, gridBagConstraints);

        btn1.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(btn1, gridBagConstraints);

        btn2.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(btn2, gridBagConstraints);

        btn3.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(btn3, gridBagConstraints);

        btn0.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(btn0, gridBagConstraints);

        btnEliminar.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        btnEliminar.setText("Delete");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(btnEliminar, gridBagConstraints);

        jMenu1.setText("Opciones");

        calculadoraB.setText("Calculadora");
        calculadoraB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculadoraBActionPerformed(evt);
            }
        });
        jMenu1.add(calculadoraB);

        divisas.setText("Divisas");
        divisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisasActionPerformed(evt);
            }
        });
        jMenu1.add(divisas);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu1.add(salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculadoraBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculadoraBActionPerformed
     Index calculadoraBase = new Index();
     calculadoraBase.setVisible(true);
     dispose();
    }//GEN-LAST:event_calculadoraBActionPerformed
    private void conversionMoneda(){
        if(comboMoneda1.getSelectedItem()=="Dolar Estado Unidense" && comboMoneda2.getSelectedItem()=="Bolivar"){
            result = Double.parseDouble(divisa1T) * 9.31;
            textoDivisa2.setText(String.format("%.2f",result));
        }
        if(comboMoneda1.getSelectedItem()=="Dolar Estado Unidense" && comboMoneda2.getSelectedItem()=="Euro"){
            result = Double.parseDouble(divisa1T) * 0.9;
            textoDivisa2.setText(String.format("%.2f",result));
        }
        if(comboMoneda1.getSelectedItem()=="Dolar Estado Unidense" && comboMoneda2.getSelectedItem()=="Dolar Estado Unidense"){
            result = Double.parseDouble(divisa1T);
            textoDivisa2.setText(String.format("%.2f",result));
        }
        if(comboMoneda1.getSelectedItem()=="Bolivar" && comboMoneda2.getSelectedItem()=="Bolivar"){
            result = Double.parseDouble(divisa1T);
            textoDivisa2.setText(String.format("%.2f",result));
        }
        if(comboMoneda1.getSelectedItem()=="Bolivar" && comboMoneda2.getSelectedItem()=="Dolar Estado Unidense"){
            result = Double.parseDouble(divisa1T) * 0.10;
            textoDivisa2.setText(String.format("%.2f",result));
        }
            if(comboMoneda1.getSelectedItem()=="Bolivar" && comboMoneda2.getSelectedItem()=="Euro"){
            result = Double.parseDouble(divisa1T) * 0.09;
            textoDivisa2.setText(String.format("%.2f",result));
        }
        if(comboMoneda1.getSelectedItem()=="Euro" && comboMoneda2.getSelectedItem()=="Euro"){
            result = Double.parseDouble(divisa1T);
            textoDivisa2.setText(String.format("%.2f",result));
        }
        if(comboMoneda1.getSelectedItem()=="Euro" && comboMoneda2.getSelectedItem()=="Dolar Estado Unidense"){
            result = Double.parseDouble(divisa1T) * 0.9; 
            textoDivisa2.setText(String.format("%.2f",result));
        }
        if(comboMoneda1.getSelectedItem()=="Euro" && comboMoneda2.getSelectedItem()=="Bolivar"){
            result = Double.parseDouble(divisa1T) * 10; 
            textoDivisa2.setText(String.format("%.2f",result));
        }
      
      
    }
    private void divisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_divisasActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
    System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void comboMoneda1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_comboMoneda1PropertyChange

    }//GEN-LAST:event_comboMoneda1PropertyChange

    private void comboMoneda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMoneda1ActionPerformed
         conversionMoneda();
        if(comboMoneda1.getSelectedItem()=="Dolar Estado Unidense") {
           simboloDivisa1.setText("$");
       }else if(comboMoneda1.getSelectedItem()=="Euro"){
           simboloDivisa1.setText("€");
       }else if(comboMoneda1.getSelectedItem()=="Bolivar"){
            simboloDivisa1.setText("Bs.");
       }
    }//GEN-LAST:event_comboMoneda1ActionPerformed

    private void comboMoneda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMoneda2ActionPerformed
         conversionMoneda();
        if(comboMoneda2.getSelectedItem()=="Dolar Estado Unidense") {
           simboloDivisa2.setText("$");
       }else if(comboMoneda2.getSelectedItem()=="Euro"){
           simboloDivisa2.setText("€");
       }else if(comboMoneda2.getSelectedItem()=="Bolivar"){
            simboloDivisa2.setText("Bs.");
       } 
        
    }//GEN-LAST:event_comboMoneda2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if(divisa1T=="0"){
            divisa1T="1";
        }else{
            divisa1T +="1";
        }
        textoDivisa1.setText(divisa1T);
        conversionMoneda();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if(divisa1T=="0"){
            divisa1T="2";
        }else{
            divisa1T +="2";
        }
        textoDivisa1.setText(divisa1T);
        conversionMoneda();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(divisa1T=="0"){
            divisa1T="3";
        }else{
            divisa1T +="3";
        }
        textoDivisa1.setText(divisa1T);
        conversionMoneda();       
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(divisa1T=="0"){
            divisa1T="4";
        }else{
            divisa1T +="4";
        }
        textoDivisa1.setText(divisa1T);
        conversionMoneda();        
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if(divisa1T=="0"){
            divisa1T="5";
        }else{
            divisa1T +="5";
        }
        textoDivisa1.setText(divisa1T);
        conversionMoneda();     
    }//GEN-LAST:event_btn5ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
     int tamano = divisa1T.length();
     if(tamano>0){
         if(tamano==1){
             divisa1T="0";
         }else{
            divisa1T = divisa1T.substring(0,divisa1T.length()-1); 
         }
         
        textoDivisa1.setText(divisa1T);
        conversionMoneda();
     } 
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if(divisa1T=="0"){
            divisa1T="6";
        }else{
            divisa1T +="6";
        }
        textoDivisa1.setText(divisa1T);
        conversionMoneda();  
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if(divisa1T=="0"){
            divisa1T="7";
        }else{
            divisa1T +="7";
        }
        textoDivisa1.setText(divisa1T);
        conversionMoneda();   
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if(divisa1T=="0"){
            divisa1T="8";
        }else{
            divisa1T +="8";
        }
        textoDivisa1.setText(divisa1T);
        conversionMoneda();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if(divisa1T=="0"){
            divisa1T="9";
        }else{
            divisa1T +="9";
        }
        textoDivisa1.setText(divisa1T);
        conversionMoneda();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if(divisa1T=="0"){
            divisa1T="0";
        }else{
            divisa1T +="0";
        }
        textoDivisa1.setText(divisa1T);
        conversionMoneda();     
    }//GEN-LAST:event_btn0ActionPerformed

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
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Divisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JMenuItem calculadoraB;
    private javax.swing.JComboBox<String> comboMoneda1;
    private javax.swing.JComboBox<String> comboMoneda2;
    private javax.swing.JMenuItem divisas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem salir;
    private javax.swing.JLabel simboloDivisa1;
    private javax.swing.JLabel simboloDivisa2;
    private javax.swing.JLabel textoDivisa1;
    private javax.swing.JLabel textoDivisa2;
    // End of variables declaration//GEN-END:variables
}
