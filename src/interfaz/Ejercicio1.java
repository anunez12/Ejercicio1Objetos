/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Fraccionario;
import clases.Indeterminacion;
import javax.swing.JOptionPane;

/**
 *
 * @author SP
 */
public class Ejercicio1 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio1
     */
    public Ejercicio1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumeradorUno = new javax.swing.JTextField();
        txtDenominadorUno = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtNumeradorDos = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtDenominadorDos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumeradorTres = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtDenominadorTres = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        cmbOperacionesBasicas = new javax.swing.JComboBox();
        txtNumeroEntero = new javax.swing.JTextField();
        txtNumeradorCuatro = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtDenominadorCuatro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel1.setText("Ejercicio1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 90, -1));

        txtNumeradorUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeradorUnoKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeradorUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 40, 30));

        txtDenominadorUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDenominadorUnoActionPerformed(evt);
            }
        });
        txtDenominadorUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominadorUnoKeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominadorUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 40, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, 60, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 10));

        txtNumeradorDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeradorDosKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeradorDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 30, 40, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 60, -1));

        txtDenominadorDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominadorDosKeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominadorDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 90, 40, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        txtNumeradorTres.setEditable(false);
        txtNumeradorTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeradorTresActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumeradorTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 40, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 72, 40, 0));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 40, -1));

        txtDenominadorTres.setEditable(false);
        jPanel1.add(txtDenominadorTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 40, 30));

        cmdCalcular.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        cmdCalcular.setForeground(new java.awt.Color(153, 0, 51));
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, 30));

        cmdBorrar.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 100, 30));

        cmbOperacionesBasicas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sumar ", "Restar ", "Multiplicar ", "Dividir" }));
        jPanel1.add(cmbOperacionesBasicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        txtNumeroEntero.setEditable(false);
        jPanel1.add(txtNumeroEntero, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 50, 30));

        txtNumeradorCuatro.setEditable(false);
        txtNumeradorCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeradorCuatroActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumeradorCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 60, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 60, -1));

        txtDenominadorCuatro.setEditable(false);
        jPanel1.add(txtDenominadorCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 90, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(717, 230));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDenominadorUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDenominadorUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDenominadorUnoActionPerformed

    private void txtNumeradorTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeradorTresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeradorTresActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        int operacion,numuno,numdos,numtres,deuno,dedos,detres;Fraccionario f1,f2,f3=null; 
        if(txtNumeradorUno.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"Se requiere llenar los campos obligatorios","Error",JOptionPane.ERROR_MESSAGE); 
        }else if(txtDenominadorUno.getText().trim().isEmpty()){ 
            JOptionPane.showMessageDialog(this,"Se requiere llenar los campos obligatorios","Error",JOptionPane.ERROR_MESSAGE);
        }else if(txtNumeradorDos.getText().trim().isEmpty()){ 
            JOptionPane.showMessageDialog(this,"Se requiere llenar los campos obligatorios","Error",JOptionPane.ERROR_MESSAGE);
        }else if(txtDenominadorDos.getText().trim().isEmpty()){ 
            JOptionPane.showMessageDialog(this,"Se requiere llenar los campos obligatorios");
        }else{ 
            JOptionPane.showMessageDialog(this,"Campos requeridos agregados satisfactoriamente");
            operacion=cmbOperacionesBasicas.getSelectedIndex(); 
            numuno=Integer.parseInt(txtNumeradorUno.getText()); 
            numdos=Integer.parseInt(txtNumeradorDos.getText()); 
            deuno=Integer.parseInt(txtDenominadorUno.getText()); 
            dedos=Integer.parseInt(txtDenominadorDos.getText()); 
            try{ 
             f1= new Fraccionario(numuno,deuno); 
             f2= new Fraccionario(numdos, dedos); 
             switch(operacion){ 
                 case 0: 
                  f3=f1.Suma(f2); 
                  break; 
                 case 1: 
                  f3=f1.Resta(f2); 
                  break; 
                 case 2: 
                  f3=f1.Multiplicacion(f2); 
                  break; 
                 case 3: 
                  f3=f1.Division(f2);
             } 
             if(f3.getNumerador()<0 && f3.getDenominador()<0){ 
               numtres=f3.getNumerador() * -1; 
               detres=f3.getDenominador() * -1;
             }else{ 
                numtres=f3.getNumerador(); 
                detres=f3.getDenominador();
             } 
             txtNumeradorTres.setText(""+numtres); 
             txtDenominadorTres.setText(""+detres); 
             if(numtres<detres){ 
              JOptionPane.showMessageDialog(this,"No se puede convertir de una fraccion a numero mixto porque el numerador debe ser mayor al denominador","Error",JOptionPane.ERROR_MESSAGE); 
              txtNumeroEntero.setText(""); 
              txtNumeradorCuatro.setText(""); 
              txtDenominadorCuatro.setText("");
             }else{ 
               txtNumeroEntero.setText(""+numtres/detres); 
               txtNumeradorCuatro.setText(""+numtres%detres); 
               txtDenominadorCuatro.setText(""+detres);
             } 
             txtNumeradorTres.setText(""+f3.getNumerador()); 
             txtDenominadorTres.setText(""+f3.getDenominador());
            }catch(Indeterminacion e){ 
              JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }catch(NumberFormatException e){ 
               JOptionPane.showMessageDialog(null,"En el sistema se hallo un error llenelo de nuevo y compreuebe","Error",JOptionPane.ERROR_MESSAGE);
               
            }
        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void txtNumeradorCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeradorCuatroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeradorCuatroActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
       txtNumeradorUno.setText("");
        txtNumeradorDos.setText("");
        txtDenominadorUno.setText("");
        txtDenominadorDos.setText("");
        txtNumeradorTres.setText("");
        txtDenominadorTres.setText("");
        txtNumeradorCuatro.setText("");
        txtDenominadorCuatro.setText("");
        txtNumeroEntero.setText("");
        txtNumeradorUno.requestFocusInWindow();
        cmbOperacionesBasicas.setSelectedIndex(0); 
        
        
        
        
        
        
        
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtNumeradorUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeradorUnoKeyTyped
       char c=evt.getKeyChar(); 
       if(!Character.isDigit(c)){ 
         getToolkit(); 
         evt.consume();
       }
    }//GEN-LAST:event_txtNumeradorUnoKeyTyped

    private void txtDenominadorUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominadorUnoKeyTyped
       char c=evt.getKeyChar(); 
       if(!Character.isDigit(c)){ 
         getToolkit(); 
         evt.consume(); 
       }
    }//GEN-LAST:event_txtDenominadorUnoKeyTyped

    private void txtNumeradorDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeradorDosKeyTyped
      char c=evt.getKeyChar(); 
      if(!Character.isDigit(c)){ 
        getToolkit(); 
        evt.consume();
      }
    }//GEN-LAST:event_txtNumeradorDosKeyTyped

    private void txtDenominadorDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominadorDosKeyTyped
      char c=evt.getKeyChar(); 
      if(!Character.isDigit(c)){ 
       getToolkit(); 
       evt.consume();
      }
    }//GEN-LAST:event_txtDenominadorDosKeyTyped

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
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperacionesBasicas;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField txtDenominadorCuatro;
    private javax.swing.JTextField txtDenominadorDos;
    private javax.swing.JTextField txtDenominadorTres;
    private javax.swing.JTextField txtDenominadorUno;
    private javax.swing.JTextField txtNumeradorCuatro;
    private javax.swing.JTextField txtNumeradorDos;
    private javax.swing.JTextField txtNumeradorTres;
    private javax.swing.JTextField txtNumeradorUno;
    private javax.swing.JTextField txtNumeroEntero;
    // End of variables declaration//GEN-END:variables
}
