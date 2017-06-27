package tech;
 

import tech.add;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class main extends javax.swing.JFrame {
 placeholder p;
 PreparedStatement p1 ,p2 ,p3;
 ResultSet  r,r3 ;
connect cn=new connect();
    public main() {
        initComponents();
        p=new placeholder();
        holder();
        fill();
         // this.setLocationByPlatform(true);
     
        this.setSize(1400,1000);
        
    }
private void holder()
{
        p.show(input, p.s, 0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        course = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Courses Of Study :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(34, 573, 125, 26);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Date of Join :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(34, 541, 82, 26);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/update_icon.png"))); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(980, 200, 306, 140);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/delete_icon.png"))); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(976, 540, 310, 143);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/help_icon.png"))); // NOI18N
        jButton2.setText("Help");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(980, 360, 310, 156);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Address :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(34, 476, 58, 27);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID ", "Name", "Course"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setOpaque(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(34, 106, 820, 159);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Contact :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(34, 509, 56, 26);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("WELCOME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(21, 11, 105, 39);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ID :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(34, 367, 41, 27);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Gender :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(34, 438, 58, 27);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/add_icon.png"))); // NOI18N
        jButton1.setText("Add New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(980, 20, 306, 150);

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel3.setText("Student's Information");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(375, 278, 193, 42);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(34, 400, 56, 27);

        input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputMouseClicked(evt);
            }
        });
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputFocusLost(evt);
            }
        });
        input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputKeyReleased(evt);
            }
        });
        getContentPane().add(input);
        input.setBounds(34, 61, 820, 34);
        getContentPane().add(id);
        id.setBounds(79, 372, 89, 26);
        getContentPane().add(name);
        name.setBounds(94, 405, 221, 26);
        getContentPane().add(address);
        address.setBounds(96, 481, 219, 26);
        getContentPane().add(contact);
        contact.setBounds(96, 514, 157, 26);
        getContentPane().add(gender);
        gender.setBounds(96, 443, 104, 26);

        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });
        getContentPane().add(course);
        course.setBounds(163, 578, 369, 26);

        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        getContentPane().add(date);
        date.setBounds(120, 546, 162, 26);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/main.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, -10, 1390, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed

    }//GEN-LAST:event_inputActionPerformed

    private void inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputMouseClicked
        p.click(input, p.s);
    }//GEN-LAST:event_inputMouseClicked

    private void inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputFocusLost
  p.show(input, p.s, 0);          
    }//GEN-LAST:event_inputFocusLost

    private void inputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputKeyReleased
        try
        {
            p1=  (PreparedStatement) cn.c.prepareStatement("select id,name,sub from student_info where name like '%" + input.getText() + "%'");
            r = p1.executeQuery(); 
            table.setModel(DbUtils.resultSetToTableModel(r));   
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_inputKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        add a=new add();
         this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        update b=new update();
         this.setVisible(false);
        b.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        try
        {
            int row = table.getSelectedRow();
            String Table = (table.getModel().getValueAt(row,0).toString());
             p3=(PreparedStatement) cn.c.prepareStatement("select * from student_info where id='"+Table+ "'");    
             r3=p3.executeQuery();
             if(r3.next())
             {
                 String add1=r3.getString("id");
                 id.setText(add1);
                  String add2=r3.getString("name");
                   name.setText(add2);
                   String add3=r3.getString("gender");
                    gender.setText(add3);
                    String add4=r3.getString("address");
                     address.setText(add4);
                    String add5=r3.getString("contact");
                     contact.setText(add5);
                     String add6=r3.getString("date");
                      date.setText(add6);
                      String add7=r3.getString("sub");
                       course.setText(add7);
             }
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
    }//GEN-LAST:event_tableMouseClicked

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     delete d= new delete();
      this.setVisible(false);
     d.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      help p=new help();
      this.setVisible(false);
      p.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
private void fill()

{
    try
    {
         p2=  (PreparedStatement) cn.c.prepareStatement("select id,name,sub from student_info");
           r = p2.executeQuery(); 
            table.setModel(DbUtils.resultSetToTableModel(r));
    }
    catch(Exception e)
    {JOptionPane.showMessageDialog(null,e);
   
}
}
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new main().setVisible(true);
            
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField course;
    private javax.swing.JTextField date;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField id;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
