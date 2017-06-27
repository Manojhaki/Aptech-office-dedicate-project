
 package tech;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        this.setLocationByPlatform(true);
     
        this.setSize(1040,550);
   
    }
PreparedStatement p;
ResultSet r;
connect cn=new connect();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(user);
        user.setBounds(240, 130, 226, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/password_icon.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 200, 74, 73);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Login.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 110, 83, 62);

        login.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        login.setText("LogIn");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(50, 290, 190, 40);
        getContentPane().add(password);
        password.setBounds(240, 220, 220, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/login.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1020, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
    try
    {
         p=(PreparedStatement) cn.c.prepareStatement("select * from login where user=? and password=?");
         p.setString(1,user.getText());
          char ch[]= password.getPassword();
                
                String pass=new String(ch);
                
                p.setString(2,pass);// second password goto txtpass
                
                r=p.executeQuery();
                  if(r.next())
                  {
                       main m= new main();
                       m.setVisible(true);
                       this.setVisible(false);
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(null,"Incorrect UserName or Password");
                  }
        
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_loginActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
