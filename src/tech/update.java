
 

import com.mysql.jdbc.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class update extends javax.swing.JFrame {
public String gender,s;
    public update() {
        initComponents();
          fillmaincourse();
          this.setLocationByPlatform(true);
     
        this.setSize(1000,550);
    }
PreparedStatement p , p1 ,p2 ,p3 ,pa;
ResultSet  r , r1 ,r2 ,r3,ra;
connect cn=new connect();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        contact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        maincourse = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        sub = new javax.swing.JComboBox();
        Update = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText("Update Student's Info ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(356, 11, 229, 39);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel5.setText("ID :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(11, 69, 42, 27);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel7.setText("Address :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(11, 178, 67, 27);
        getContentPane().add(id);
        id.setBounds(71, 74, 114, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel8.setText("Contact :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(11, 211, 67, 26);
        getContentPane().add(address);
        address.setBounds(88, 183, 265, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel4.setText("Name :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(11, 102, 56, 27);
        getContentPane().add(name);
        name.setBounds(71, 107, 226, 20);

        buttonGroup1.add(male);
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        getContentPane().add(male);
        male.setBounds(165, 144, 70, 23);
        getContentPane().add(contact);
        contact.setBounds(92, 216, 143, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel6.setText("Gender :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(11, 140, 56, 27);

        buttonGroup1.add(female);
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        getContentPane().add(female);
        female.setBounds(88, 144, 70, 23);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel9.setText("Date of Join :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(11, 243, 82, 26);

        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateMouseClicked(evt);
            }
        });
        getContentPane().add(date);
        date.setBounds(97, 248, 143, 20);

        maincourse.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                maincourseItemStateChanged(evt);
            }
        });
        maincourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maincourseActionPerformed(evt);
            }
        });
        getContentPane().add(maincourse);
        maincourse.setBounds(141, 285, 224, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel12.setText("Courses Of Study :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 280, 127, 26);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Main Course", "Sub Course", "Fees"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 324, 513, 180);

        sub.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                subItemStateChanged(evt);
            }
        });
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        getContentPane().add(sub);
        sub.setBounds(383, 285, 202, 20);

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update);
        Update.setBounds(550, 340, 203, 23);

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(195, 73, 90, 23);

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(840, 60, 130, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\java\\tech\\src\\i_love_music_2-wallpaper-2560x1600.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1140, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
gender= "male";
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
gender="Female";
    }//GEN-LAST:event_femaleActionPerformed

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked
 java.util.Date dt = new java.util.Date();         java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");         String ct = sdf.format(dt);         date.setText(ct);      // TODO add your handling code here:
    }//GEN-LAST:event_dateMouseClicked

    private void maincourseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_maincourseItemStateChanged

         try {              s = (String) maincourse.getSelectedItem();             p2 = (PreparedStatement) cn.c.prepareStatement("select * from course where main=?");             p2.setString(1, s);             r2 = p2.executeQuery();             sub.removeAllItems();             while (r2.next()) {                 String hen = r2.getString("sub");                 sub.addItem(hen);             }         } catch (Exception e) {             JOptionPane.showMessageDialog(rootPane, e);         }      }//GEN-LAST:event_maincourseItemStateChanged

    private void maincourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maincourseActionPerformed

    }//GEN-LAST:event_maincourseActionPerformed

    private void subItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_subItemStateChanged

        try {             s = (String) sub.getSelectedItem();             p3 = (PreparedStatement) cn.c.prepareStatement("select * from course where sub=?");             p3.setString(1, s);             r3 = p3.executeQuery();             table.setModel(DbUtils.resultSetToTableModel(r3));           } catch (Exception e) {             JOptionPane.showMessageDialog(null, e);         }     }//GEN-LAST:event_subItemStateChanged

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed

    }//GEN-LAST:event_subActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        try
{
   
    p=(PreparedStatement) cn.c.prepareStatement("update student_info set name=?,gender=?,address=?,contact=?,date=?,main=?,sub=?,fee=? where id=?");
   
    p.setString(1,name.getText());
    p.setString(2,gender);
    p.setString(3,address.getText());
    p.setString(4,contact.getText());
    p.setString(5,date.getText());
    p.setString(6,table.getValueAt(0,0).toString());
    p.setString(7,table.getValueAt(0,1).toString());
    p.setString(8,table.getValueAt(0,2).toString());
    p.setString(9,id.getText());
     
    
    p.executeUpdate();
    JOptionPane.showMessageDialog(null, "The Student's Info was Sussefully Updated");
     main m= new main();
    m.setVisible(true);
    this.setVisible(false);
    
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null, e);
}   
    }//GEN-LAST:event_UpdateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
      try
      { 
           pa=  (PreparedStatement) cn.c.prepareStatement("select * from student_info where id=?" );
           pa.setString(1, id.getText());    
           ra=pa.executeQuery();
           if(ra.next())
           {
          String a = ra.getString("name");
          name.setText(a);
          String a1 = ra.getString("gender");
           if(a1.equals("Male"))
           {
               male.setSelected(true);
           }
           else
           {
               female.setSelected(true);
           }
           String a2 = ra.getString("address");
             address.setText(a2);
             String a3 = ra.getString("contact");
              contact.setText(a3);
              Date a4=ra.getDate("date");
              date.setText(a4.toString());
                String a5 = ra.getString("main");
                maincourse.setSelectedItem(a5);
               
                String a6 = ra.getString("sub");
                sub.setSelectedItem(a6);
                
           }
           
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null,e);
      }
    }//GEN-LAST:event_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        main m= new main();
    m.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
private void fillmaincourse()
{
    try
    {
        p1=  (PreparedStatement) cn.c.prepareStatement("select distinct main from course");  
           r1= p1.executeQuery();
            while(r1.next())
            {
              String name = r1.getString("main");  
              maincourse.addItem(name);
            }      
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(rootPane, e);
    }
}

  
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
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new update().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JTextField address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField date;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox maincourse;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JButton search;
    private javax.swing.JComboBox sub;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
