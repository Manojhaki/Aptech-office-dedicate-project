
 

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class delete extends javax.swing.JFrame {

    public delete() {
        initComponents();
         this.setLocationByPlatform(true);
     
        this.setSize(400,300);
    }
connect cn=new connect();
PreparedStatement p;
ResultSet  r ;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        o = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        o.setFont(new java.awt.Font("Tahoma", 1, 18));
        o.setForeground(new java.awt.Color(255, 255, 255));
        o.setText("ID  :");
        getContentPane().add(o);
        o.setBounds(10, 120, 60, 30);
        getContentPane().add(input);
        input.setBounds(80, 130, 249, 20);

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(150, 170, 100, 23);

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 40, 130, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\java\\tech\\src\\1280x960_find_your_icon.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       try
       {
           p=(PreparedStatement) cn.c.prepareStatement("delete from student_info where id=?");
           p.setString(1,input.getText());
           int i = p.executeUpdate();
           if(i==1)
           {
                JOptionPane.showMessageDialog(rootPane, "Data was Successfully Deleted");
           }
           else
           {
                JOptionPane.showMessageDialog(rootPane, "Data was not Found");
           }
         
          
           main m= new main();
    m.setVisible(true);
    this.setVisible(false);
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(rootPane, e);
       }
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  main m= new main();
    m.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new delete().setVisible(true);
               new delete().setLocation(900,900);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel o;
    // End of variables declaration//GEN-END:variables
}
