/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inf;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        unamebox.setText("Username");
         addplaceholderStyle(unamebox);

    pwordbox.setText     ("Password");
    pwordbox.setEchoChar('\u0000'); // show text
    addplaceholderStyle(pwordbox);
    }

    public void addplaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }
    
    
       public void removeplaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN|Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.black);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        unamebox = new javax.swing.JTextField();
        loginbtn = new javax.swing.JButton();
        pwordbox = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unamebox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        unamebox.setForeground(new java.awt.Color(153, 153, 153));
        unamebox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                unameboxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                unameboxFocusLost(evt);
            }
        });
        unamebox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                unameboxMouseExited(evt);
            }
        });
        unamebox.addActionListener(this::unameboxActionPerformed);
        getContentPane().add(unamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 260, 40));

        loginbtn.setBackground(new java.awt.Color(0, 153, 204));
        loginbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("Login");
        loginbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), java.awt.Color.blue, null, new java.awt.Color(204, 204, 255)));
        loginbtn.addActionListener(this::loginbtnActionPerformed);
        getContentPane().add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 130, 40));

        pwordbox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pwordbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwordboxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwordboxFocusLost(evt);
            }
        });
        getContentPane().add(pwordbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 260, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inf/Gemini_Gene5.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1060, 460));

        setSize(new java.awt.Dimension(1061, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void unameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameboxActionPerformed

    private void unameboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unameboxFocusGained

                                       
    if(unamebox.getText().equals("Username")){
        unamebox.setText("");
        removeplaceholderStyle(unamebox);
    
}

    }//GEN-LAST:event_unameboxFocusGained

    private void unameboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unameboxFocusLost
     if(unamebox.getText().trim().isEmpty()){
        addplaceholderStyle(unamebox);
        unamebox.setText("Username");
    }
    }//GEN-LAST:event_unameboxFocusLost

    private void unameboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unameboxMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_unameboxMouseExited

    private void pwordboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwordboxFocusGained
         if(String.valueOf(pwordbox.getPassword()).equals("Password")){
        pwordbox.setText("");
        pwordbox.setEchoChar('*');
        removeplaceholderStyle(pwordbox);
    }
    }//GEN-LAST:event_pwordboxFocusGained

    private void pwordboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwordboxFocusLost
       if(String.valueOf(pwordbox.getPassword()).isEmpty()){
        addplaceholderStyle(pwordbox);
        pwordbox.setText("Password");
        pwordbox.setEchoChar('\u0000'); // show placeholder
    }
    }//GEN-LAST:event_pwordboxFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
         this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        String uname;
        String pword;
        
        uname = unamebox.getText();
        pword = pwordbox.getText();
        
        if(uname.equals("sujan") && pword.equals("123")){
            Mainframe m1 = new Mainframe();
            m1.setVisible(true);
            this.dispose();
            
        }else{
            JOptionPane.showMessageDialog(null,"Username  or Password Incorrect");
        }
        
    }//GEN-LAST:event_loginbtnActionPerformed
  
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField pwordbox;
    private javax.swing.JTextField unamebox;
    // End of variables declaration//GEN-END:variables
}
