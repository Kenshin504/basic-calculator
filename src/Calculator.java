
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;

public class Calculator extends javax.swing.JFrame {
    
    public Calculator() {
        initComponents();
        
        groupButtons.setOpaque(false);
        
    }
    
    private boolean isOperator(char c) {
    return c == '+' || c == '-' || c == 'x' || c == '/';
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        groupButtons = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonDot = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonDiv = new javax.swing.JButton();
        jButtonMul = new javax.swing.JButton();
        jButtonSub = new javax.swing.JButton();
        jButtonEqual = new javax.swing.JButton();
        jButtonAdd1 = new javax.swing.JButton();
        textField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 400, 530));
        setMaximumSize(new java.awt.Dimension(400, 530));
        setMinimumSize(new java.awt.Dimension(400, 530));
        setPreferredSize(new java.awt.Dimension(400, 530));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 530));

        kGradientPanel1.setkEndColor(new java.awt.Color(21, 21, 21));
        kGradientPanel1.setkGradientFocus(90);
        kGradientPanel1.setkStartColor(new java.awt.Color(59, 59, 58));

        groupButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        groupButtons.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, 60));

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        groupButtons.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 90, 60));

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        groupButtons.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 90, 60));

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        groupButtons.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 90, 60));

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        groupButtons.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 60));

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        groupButtons.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 90, 60));

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        groupButtons.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, 60));

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        groupButtons.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 90, 60));

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        groupButtons.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 90, 60));

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        groupButtons.add(jButton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 180, 60));

        jButtonDot.setText(".");
        groupButtons.add(jButtonDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 90, 60));

        jButtonClear.setBackground(new java.awt.Color(255, 111, 0));
        jButtonClear.setText("C");
        jButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        groupButtons.add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 60));

        jButtonDiv.setBackground(new java.awt.Color(0, 150, 136));
        jButtonDiv.setText("/");
        jButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivActionPerformed(evt);
            }
        });
        groupButtons.add(jButtonDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 90, 60));

        jButtonMul.setBackground(new java.awt.Color(0, 150, 136));
        jButtonMul.setText("X");
        jButtonMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMulActionPerformed(evt);
            }
        });
        groupButtons.add(jButtonMul, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 90, 60));

        jButtonSub.setBackground(new java.awt.Color(0, 150, 136));
        jButtonSub.setText("-");
        jButtonSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubActionPerformed(evt);
            }
        });
        groupButtons.add(jButtonSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 90, 60));

        jButtonEqual.setBackground(new java.awt.Color(255, 102, 0));
        jButtonEqual.setText("=");
        groupButtons.add(jButtonEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 90, 120));

        jButtonAdd1.setBackground(new java.awt.Color(0, 150, 136));
        jButtonAdd1.setText("+");
        jButtonAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdd1ActionPerformed(evt);
            }
        });
        groupButtons.add(jButtonAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 90, 60));

        textField.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        textField.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(groupButtons, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 137, Short.MAX_VALUE)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(groupButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        textField.setText(textField.getText() + "0");
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        textField.setText(textField.getText() + "1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        textField.setText(textField.getText() + "2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        textField.setText(textField.getText() + "3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        textField.setText(textField.getText() + "4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        textField.setText(textField.getText() + "5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       textField.setText(textField.getText() + "6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        textField.setText(textField.getText() + "7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        textField.setText(textField.getText() + "8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        textField.setText(textField.getText() + "9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        textField.setText("");
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdd1ActionPerformed
        String text = textField.getText();
        if (!text.isEmpty() && !isOperator(text.charAt(text.length() - 1))) {
            textField.setText(text + "+");
        }
    }//GEN-LAST:event_jButtonAdd1ActionPerformed

    private void jButtonSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubActionPerformed
        String text = textField.getText();
        
        if (text.isEmpty() || !isOperator(text.charAt(text.length() - 1))) {
            textField.setText(text + "-");
        } else if (!text.isEmpty() && !isOperator(text.charAt(text.length() - 1))) {
            textField.setText(text + "-");
        }
    }//GEN-LAST:event_jButtonSubActionPerformed

    private void jButtonMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMulActionPerformed
        String text = textField.getText();
        if (!text.isEmpty() && !isOperator(text.charAt(text.length() - 1))) {
            textField.setText(text + "x");
        }
    }//GEN-LAST:event_jButtonMulActionPerformed

    private void jButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivActionPerformed
        String text = textField.getText();
        if (!text.isEmpty() && !isOperator(text.charAt(text.length() - 1))) {
            textField.setText(text + "/");
        }
    }//GEN-LAST:event_jButtonDivActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
            UIManager.put("Button.foreground", Color.WHITE);
            UIManager.put("Label.foreground", Color.WHITE);
            UIManager.put("Button.font", new Font("Open Sans", Font.BOLD, 18));
            UIManager.put("Label.font", new Font("Open Sans", Font.BOLD, 40));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel groupButtons;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAdd1;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDiv;
    private javax.swing.JButton jButtonDot;
    private javax.swing.JButton jButtonEqual;
    private javax.swing.JButton jButtonMul;
    private javax.swing.JButton jButtonSub;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel textField;
    // End of variables declaration//GEN-END:variables
}
