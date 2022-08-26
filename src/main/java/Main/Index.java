
package Main;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



/**
 *
 * @author Astro
 */
public class Index extends javax.swing.JFrame {
        private String Cadenanumeros="";
        private Double numero1,numero2,result;
        private String operacionARealizar=""; 
        private Boolean activado=true;
        private Boolean puntoDecimal =true;

    public Index() {
        
        setLocationRelativeTo(null);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        operacion = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        raiz = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        sumar = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        restar = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        masMenos = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        Resultado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        calculadoraB = new javax.swing.JMenuItem();
        calculadoraDivisas = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        operacion.setFont(new java.awt.Font("Oswald", 1, 18)); // NOI18N
        operacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(operacion, gridBagConstraints);

        Limpiar.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        Limpiar.setText("C");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(Limpiar, gridBagConstraints);

        raiz.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        raiz.setText("√");
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(raiz, gridBagConstraints);

        dividir.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        dividir.setText("/");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(dividir, gridBagConstraints);

        num7.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(num7, gridBagConstraints);

        num8.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(num8, gridBagConstraints);

        Eliminar.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        Eliminar.setText("Delete");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(Eliminar, gridBagConstraints);

        num4.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(num4, gridBagConstraints);

        num5.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(num5, gridBagConstraints);

        num6.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(num6, gridBagConstraints);

        num9.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(num9, gridBagConstraints);

        multiplicar.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        multiplicar.setText("X");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(multiplicar, gridBagConstraints);

        sumar.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        sumar.setText("+");
        sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(sumar, gridBagConstraints);

        num2.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(num2, gridBagConstraints);

        restar.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        restar.setText("-");
        restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(restar, gridBagConstraints);

        igual.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        igual.setText("=");
        igual.setToolTipText("");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(igual, gridBagConstraints);

        punto.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(punto, gridBagConstraints);

        num1.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(num1, gridBagConstraints);

        num3.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(num3, gridBagConstraints);

        masMenos.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        masMenos.setText("±");
        masMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masMenosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(masMenos, gridBagConstraints);

        num0.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(num0, gridBagConstraints);

        Resultado.setFont(new java.awt.Font("Oswald", 1, 36)); // NOI18N
        Resultado.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel3.add(Resultado, gridBagConstraints);

        Menu.setText("Opciones");

        calculadoraB.setText("Calculadora");
        calculadoraB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculadoraBActionPerformed(evt);
            }
        });
        Menu.add(calculadoraB);

        calculadoraDivisas.setText("Divisas");
        calculadoraDivisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculadoraDivisasActionPerformed(evt);
            }
        });
        Menu.add(calculadoraDivisas);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Menu.add(Salir);

        jMenuBar1.add(Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Resultado.setText("0");
        operacion.setText("");
        Cadenanumeros = "";
        numero1=null;
        numero2=null;
        result=null;
        operacionARealizar="";
        activado=true;
        puntoDecimal=true;
        
    }

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       System.exit(0);
    }

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
if(Resultado.getText()=="0"){
    Cadenanumeros = "1";
}else{
    Cadenanumeros +="1";
}
       Resultado.setText(Cadenanumeros);
       activado=true;
       puntoDecimal=true;
    }//GEN-LAST:event_num1ActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
if(Resultado.getText()=="0"){
    Cadenanumeros = "2";
}else{
    Cadenanumeros +="2";
}            activado=true;
             Resultado.setText(Cadenanumeros);
              puntoDecimal=true;
    }

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
if(Resultado.getText()=="0"){
    Cadenanumeros = "3";
}else{
    Cadenanumeros +="3";
}        activado=true;
          Resultado.setText(Cadenanumeros);
            puntoDecimal=true;
    }

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
if(Resultado.getText()=="0"){
    Cadenanumeros = "4";
}else{
    Cadenanumeros +="4";
}        activado=true;  
        Resultado.setText(Cadenanumeros);  
           puntoDecimal=true;
    }//GEN-LAST:event_num4ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
if(Resultado.getText()=="0"){
    Cadenanumeros = "5";
}else{
    Cadenanumeros +="5";
}        activado=true;
        Resultado.setText(Cadenanumeros);
          puntoDecimal=true;
    }

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
if(Resultado.getText()=="0"){
    Cadenanumeros = "6";
}else{
    Cadenanumeros +="6";
}        activado=true;
        Resultado.setText(Cadenanumeros);
         puntoDecimal=true;
    }//GEN-LAST:event_num6ActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
if(Resultado.getText()=="0"){
    Cadenanumeros = "7";
}else{
    Cadenanumeros +="7";
}
        Resultado.setText(Cadenanumeros);
        activado=true;
         puntoDecimal=true;
 
    }

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
if(Resultado.getText()=="0"){
    Cadenanumeros = "8";
}else{
    Cadenanumeros +="8";
}            activado=true;
            Resultado.setText(Cadenanumeros);
           puntoDecimal=true;

     }//GEN-LAST:event_num8ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
if(Resultado.getText()=="0"){
    Cadenanumeros = "9";
}else{
    Cadenanumeros +="9";
}        activado=true;
            Resultado.setText(Cadenanumeros);
            puntoDecimal=true;
    }

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
     if(Cadenanumeros != ""){
         if(Resultado.getText()=="0"){
             Cadenanumeros = "0";
        }else{
            Cadenanumeros +="0";
        }
        
         Resultado.setText(Cadenanumeros);
     }
    }

    private void sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarActionPerformed
if(activado==true){
        numero1 = Double.parseDouble(Cadenanumeros);
       operacion.setText(Cadenanumeros+" +");
       operacionARealizar = "suma";
       Cadenanumeros ="";
       Resultado.setText(Cadenanumeros);
       activado = false;
}

    }

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        numero2 = Double.parseDouble(Cadenanumeros);
        operacion.setText("");
        if(operacionARealizar == "suma"){
            result = numero1 + numero2;
            operacionARealizar = "";
            puntoDecimal=false;
        }else if (operacionARealizar == "resta") {
                operacionARealizar = "";
            result = numero1 - numero2;
            puntoDecimal=false;
        }else if (operacionARealizar == "por") {
                operacionARealizar = "";
            result = numero1 * numero2;
            puntoDecimal=false;
        }else if (operacionARealizar == "dividir") {
                operacionARealizar = "";
            result = numero1 / numero2;
            puntoDecimal=false;
        }
        Cadenanumeros = String.valueOf(result);
        Resultado.setText(String.format("%.2f", result));
    }//GEN-LAST:event_igualActionPerformed

    private void restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarActionPerformed
if(activado==true){
        numero1 = Double.parseDouble(Cadenanumeros);
       operacion.setText(Cadenanumeros+" -");
       operacionARealizar = "resta";
       Cadenanumeros ="";
       Resultado.setText(Cadenanumeros);
       activado = false;
    }//GEN-LAST:event_restarActionPerformed
   }
    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
     if(activado==true){
        numero1 = Double.parseDouble(Cadenanumeros);
       operacion.setText(Cadenanumeros+" *");
       operacionARealizar = "por";
       Cadenanumeros ="";
       Resultado.setText(Cadenanumeros);
       activado = false;
    } 
     
    }//GEN-LAST:event_multiplicarActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
    
if(activado==true){
        numero1 = Double.parseDouble(Cadenanumeros);
       operacion.setText(Cadenanumeros+" /");
       operacionARealizar = "dividir";
       Cadenanumeros ="";
       Resultado.setText(Cadenanumeros);
       activado = false;
    }
    }//GEN-LAST:event_dividirActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
if(activado==true){
        numero1 = Double.parseDouble(Cadenanumeros);
       operacion.setText("Sqrt ("+Cadenanumeros+")");
       result=Math.sqrt(numero1);
       Resultado.setText(String.format("%.2f", result));
       Cadenanumeros=String.valueOf(result);
    }
    }//GEN-LAST:event_raizActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
      if(puntoDecimal==true){
          if(Cadenanumeros==""){
           Cadenanumeros+="0.";
       
       }else{
        Cadenanumeros += ".";
        Resultado.setText(Cadenanumeros);
       }
          puntoDecimal=false;
      }
    }//GEN-LAST:event_puntoActionPerformed

    private void masMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masMenosActionPerformed
        if(Cadenanumeros.charAt(0)!='-'){
            Cadenanumeros="-"+Cadenanumeros;
        }else{
            Cadenanumeros = Cadenanumeros.substring(1,Cadenanumeros.length());
            
        }
        Resultado.setText(Cadenanumeros);
    }//GEN-LAST:event_masMenosActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
     int tamano = Cadenanumeros.length();
     if(tamano>0){
         if(tamano==1){
             Cadenanumeros="0";
         }else{
            Cadenanumeros = Cadenanumeros.substring(0,Cadenanumeros.length()-1); 
         }
         
         Resultado.setText(Cadenanumeros);
     }
    }//GEN-LAST:event_EliminarActionPerformed

    private void calculadoraDivisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculadoraDivisasActionPerformed
      Divisas Divi1 = new Divisas();
      Divi1.setVisible(true);
      dispose();
    }//GEN-LAST:event_calculadoraDivisasActionPerformed

    private void calculadoraBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculadoraBActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_calculadoraBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
                
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.basic.BasicLookAndFeel");
        } catch (ClassNotFoundException ex) {
           // Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
           // Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JMenu Menu;
    private javax.swing.JLabel Resultado;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem calculadoraB;
    private javax.swing.JMenuItem calculadoraDivisas;
    private javax.swing.JButton dividir;
    private javax.swing.JButton igual;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton masMenos;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JLabel operacion;
    private javax.swing.JButton punto;
    private javax.swing.JButton raiz;
    private javax.swing.JButton restar;
    private javax.swing.JButton sumar;
    // End of variables declaration//GEN-END:variables
}
