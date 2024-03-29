/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Falcon.Calculator;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Falcon -> Achintha,Pubudu,Nethmi,Rajitha,Mano(Team Falcon)
 */
public class UnitConverter extends javax.swing.JFrame {

    
    NumBase numbase =new NumBase();
    UnitConverter converter;
    
    /**
     * Creates new form UnitConverter
     */
    public UnitConverter() {
        
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
        jTextFieldDecimalNumber = new javax.swing.JTextField();
        jTextFieldBinaryNumber = new javax.swing.JTextField();
        jTextFieldOcalNumber = new javax.swing.JTextField();
        jTextFieldHexaDecimalNumber = new javax.swing.JTextField();
        jButtonConvert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("WiCaDi Unit Converter");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldDecimalNumber.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldDecimalNumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jTextFieldDecimalNumber.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldDecimalNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDecimalNumber.setToolTipText("Input the Desired Number to Conver");
        jTextFieldDecimalNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDecimalNumberActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldDecimalNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 300, 72));

        jTextFieldBinaryNumber.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldBinaryNumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jTextFieldBinaryNumber.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldBinaryNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldBinaryNumber.setToolTipText("Input the Desired Number to Conver");
        jTextFieldBinaryNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBinaryNumberActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldBinaryNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 300, 72));

        jTextFieldOcalNumber.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldOcalNumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jTextFieldOcalNumber.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldOcalNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldOcalNumber.setToolTipText("Input the Desired Number to Conver");
        jTextFieldOcalNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOcalNumberActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldOcalNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 300, 72));

        jTextFieldHexaDecimalNumber.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldHexaDecimalNumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jTextFieldHexaDecimalNumber.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldHexaDecimalNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldHexaDecimalNumber.setToolTipText("Input the Desired Number to Conver");
        jTextFieldHexaDecimalNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHexaDecimalNumberActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldHexaDecimalNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 300, 72));

        jButtonConvert.setBackground(new java.awt.Color(255, 153, 51));
        jButtonConvert.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButtonConvert.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConvert.setText("Convert");
        jButtonConvert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonConvert, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 120, 50));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Decimal Number :- ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Binary Number :- ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Octal Number :- ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hex Number :- ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    
    void clear_display() {
		jTextFieldBinaryNumber.setText("");
		jTextFieldDecimalNumber.setText("");
		jTextFieldHexaDecimalNumber.setText("");
		jTextFieldOcalNumber.setText("");
	}
    void update_display() {
		clear_display();
		jTextFieldDecimalNumber.setText(numbase.getDec());
		jTextFieldOcalNumber.setText(numbase.getOct());
		jTextFieldBinaryNumber.setText(numbase.getBin());
		jTextFieldHexaDecimalNumber.setText(numbase.getHex());
	}
    
    private void jButtonConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertActionPerformed
        // TODO add your handling code here:
        
        String DecimalNumber=jTextFieldDecimalNumber.getText();
        String BinaryNumber=jTextFieldDecimalNumber.getText();
        String OctalNumber=jTextFieldOcalNumber.getText();
        String HexaNumber=jTextFieldHexaDecimalNumber.getText();
        
                                if(DecimalNumber.length()>0) {
					numbase.setDec(DecimalNumber);
					update_display();
				}
				else if(BinaryNumber.length()>0) {
					numbase.setBin(BinaryNumber);
					update_display();
				}
				else if(HexaNumber.length()>0) {
					numbase.setHex(HexaNumber);
					update_display();
				}
				else if(OctalNumber.length()>0) {
					numbase.setOct(OctalNumber);
					update_display();
				}
				else {
					clear_display();
				}
        
        
    }//GEN-LAST:event_jButtonConvertActionPerformed

    private void jTextFieldDecimalNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDecimalNumberActionPerformed
        // TODO add your handling code here:
        this.addFocusListener(new FocusAdapter(){
            public void focusGained(FocusEvent e) {
				clear_display();
			}
        });
        
    }//GEN-LAST:event_jTextFieldDecimalNumberActionPerformed

    private void jTextFieldBinaryNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBinaryNumberActionPerformed
        // TODO add your handling code here:
        this.addFocusListener(new FocusAdapter(){
            public void focusGained(FocusEvent e) {
				clear_display();
			}
        });
    }//GEN-LAST:event_jTextFieldBinaryNumberActionPerformed

    private void jTextFieldOcalNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOcalNumberActionPerformed
        // TODO add your handling code here:
        this.addFocusListener(new FocusAdapter(){
            public void focusGained(FocusEvent e) {
				clear_display();
			}
        });
    }//GEN-LAST:event_jTextFieldOcalNumberActionPerformed

    private void jTextFieldHexaDecimalNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHexaDecimalNumberActionPerformed
        // TODO add your handling code here:
        this.addFocusListener(new FocusAdapter(){
            public void focusGained(FocusEvent e) {
				clear_display();
			}
        });
    }//GEN-LAST:event_jTextFieldHexaDecimalNumberActionPerformed

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
            java.util.logging.Logger.getLogger(UnitConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnitConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnitConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnitConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnitConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConvert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBinaryNumber;
    private javax.swing.JTextField jTextFieldDecimalNumber;
    private javax.swing.JTextField jTextFieldHexaDecimalNumber;
    private javax.swing.JTextField jTextFieldOcalNumber;
    // End of variables declaration//GEN-END:variables
}
