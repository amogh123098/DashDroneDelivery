/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class LOGIN_EMPLOYEE extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN_EMPLOYEE
     */
    public LOGIN_EMPLOYEE() {
        initComponents();
        jLabel5.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLogo1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Arabic Typesetting", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("USERNAME");
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(130, 170, 130, 24);

        jLabel3.setFont(new java.awt.Font("Arabic Typesetting", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("PASSWORD");
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(130, 210, 130, 24);

        jLogo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ddd/DDD_logo(Low).png"))); // NOI18N
        jLayeredPane1.add(jLogo1);
        jLogo1.setBounds(60, 40, 102, 52);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1);
        jButton1.setBounds(150, 280, 110, 30);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton2);
        jButton2.setBounds(290, 280, 110, 30);
        jLayeredPane1.add(jTextField1);
        jTextField1.setBounds(270, 170, 150, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arabic Typesetting", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText(" LOGIN HERE");
        jLabel4.setOpaque(true);
        jLayeredPane1.add(jLabel4);
        jLabel4.setBounds(190, 100, 170, 20);
        jLayeredPane1.add(jPasswordField1);
        jPasswordField1.setBounds(270, 210, 150, 30);
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(40, 20, 0, 360);

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Login Failed! Check your Username and Password.");
        jLayeredPane1.add(jLabel5);
        jLabel5.setBounds(120, 130, 300, 14);

        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setText("SINGUP");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton3);
        jButton3.setBounds(280, 340, 90, 23);

        jLabel6.setText("If you havent already, then");
        jLayeredPane1.add(jLabel6);
        jLabel6.setBounds(140, 350, 150, 14);

        jLabel7.setText("here");
        jLayeredPane1.add(jLabel7);
        jLabel7.setBounds(380, 350, 40, 14);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ddd/LOGIN.jpg"))); // NOI18N
        jLayeredPane1.add(jLabel8);
        jLabel8.setBounds(0, 0, 540, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                int chance = 3;
               
        if (jTextField1.getText().isEmpty()){
        jLabel5.setText("Please enter a valid username."); jLabel5.setVisible(true);}
        else if (security(jTextField1.getText())){
        jLabel5.setText("Please use valid characters."); jLabel5.setVisible(true);}
        else if (jPasswordField1.getText().isEmpty()){
        jLabel5.setText("Please enter a valid password."); jLabel5.setVisible(true);}
        else
        try
        {
            Class.forName("java.sql.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost/DDD","root","");
            Statement stmt = con.createStatement();
            //while(chance == 3)
            {
                String username = jTextField1.getText();
                String a="Select employee_password, employee_id from  employees where employee_username = '"+ username+"';";
                ResultSet rs=stmt.executeQuery(a);
                if (rs.next() == false)
                { 
                    jTextField1.setText("");
                    jPasswordField1.setText("");
                    jLabel5.setText("Login Failed! Check your Username and Password.");
                    jLabel5.setVisible(true);
                } 
                else 
                { 
                    if(rs.getString("employee_password").equals(jPasswordField1.getText()))
                    {
                        int id = rs.getInt("employee_id");
                        this.dispose();
                       new DASHBOARD_EMPLOYEE(id).setVisible(true);
                        //break;
                    } 
                    else 
                    {
                     jTextField1.setText("");
                     jPasswordField1.setText("");
                     jLabel5.setText("Login Failed! Check your Username and Password.");
                     jLabel5.setVisible(true);
                    }
                }
   
            }
        }
       catch (Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());   
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new STARTS().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new SIGNUP_EMPLOYEE().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN_EMPLOYEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN_EMPLOYEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN_EMPLOYEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN_EMPLOYEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_EMPLOYEE().setVisible(true);
            }
        });
    }

   public static boolean security(String username)
   {
       int a = username.indexOf(";");
       if (a >=0 )
       {
        return true;
       }
       else {return false;}
   }  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel jLogo1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}


