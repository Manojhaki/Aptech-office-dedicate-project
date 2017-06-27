package tech;

import com.mysql.jdbc.PreparedStatement;// a statement prepared to make a connection
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class add extends javax.swing.JFrame {
public String gender , s ,s1;
PreparedStatement p , p1 ,p2 ,p3;
ResultSet  r , r1 ,r2 ,r3;
connect cn=new connect();
    public add() {
        initComponents();
        fillmaincourse();
        // this.setLocationByPlatform(true);
     
        this.setSize(1000,530);
      // showdata();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
// Declaration of all the objects used in the program
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        contact = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        maincourse = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        sub = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        // addition of the onclose application
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        // Setting a proper boundry and font
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Register New Student's Info");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(404, 20, 229, 39);

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
        jScrollPane1.setBounds(32, 315, 652, 170);

        buttonGroup1.add(female);
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        getContentPane().add(female);
        female.setBounds(87, 140, 80, 23);

        buttonGroup1.add(male);
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        getContentPane().add(male);
        male.setBounds(200, 140, 80, 23);
        getContentPane().add(contact);
        contact.setBounds(91, 212, 143, 26);

        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateMouseClicked(evt);
            }
        });
        getContentPane().add(date);
        date.setBounds(102, 244, 143, 26);
        getContentPane().add(name);
        name.setBounds(70, 103, 226, 26);
        getContentPane().add(address);
        address.setBounds(87, 179, 265, 26);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 98, 56, 27);
        getContentPane().add(id);
        id.setBounds(70, 70, 114, 26);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Contact :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 207, 67, 26);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Address :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 174, 67, 27);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Gender :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 136, 56, 27);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Courses Of Study :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 271, 127, 26);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Date of Join :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 239, 82, 26);

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
        maincourse.setBounds(128, 276, 224, 27);

        jButton2.setText("Add This Student");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(720, 310, 266, 32);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ID :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 65, 42, 27);

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
        sub.setBounds(370, 276, 314, 27);

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(840, 60, 130, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/main.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1270, 500);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed

        gender = "Female";     }//GEN-LAST:event_femaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed

        gender = "Male";     }//GEN-LAST:event_maleActionPerformed

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked

        java.util.Date dt = new java.util.Date();         java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");         String ct = sdf.format(dt);         date.setText(ct);     }//GEN-LAST:event_dateMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      try
{
    p=(PreparedStatement) cn.c.prepareStatement("insert into student_info(id,name,gender,address,contact,date,main,sub,fee) values(?,?,?,?,?,?,?,?,?)");
    p.setString(1,id.getText());
    p.setString(2,name.getText());
    p.setString(3,gender);
    p.setString(4,address.getText());
    p.setString(5,contact.getText());
    p.setString(6,date.getText());
     p.setString(7,table.getValueAt(0,0).toString());
    p.setString(8,table.getValueAt(0,1).toString());
       p.setString(9,table.getValueAt(0,2).toString());
     
    
    p.executeUpdate();
    JOptionPane.showMessageDialog(null, "The Student was Successfully Added");
    main m= new main();
    m.setVisible(true);
    this.setVisible(false);
    
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null, e);
}  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void maincourseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_maincourseItemStateChanged
   
       try
    {
        
        s = (String) maincourse.getSelectedItem();
        p2 =  (PreparedStatement) cn.c.prepareStatement("select * from course where main=?");  
        p2.setString(1, s );  
        r2= p2.executeQuery();
        sub.removeAllItems();
            while(r2.next())
            {
              String hen = r2.getString("sub");  
              sub.addItem(hen);
            }   
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(rootPane, "king3");
    } 
   
   
    }//GEN-LAST:event_maincourseItemStateChanged

    private void maincourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maincourseActionPerformed

    }//GEN-LAST:event_maincourseActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
    
    }//GEN-LAST:event_subActionPerformed

    private void subItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_subItemStateChanged
        try
{ s = (String) sub.getSelectedItem();
   p3=(PreparedStatement) cn.c.prepareStatement("select * from course where sub=?");
   p3.setString(1,  s);  
   r3=p3.executeQuery();
   table.setModel(DbUtils.resultSetToTableModel(r3)); 
 
   
}
   catch (Exception e)
   {
       JOptionPane.showMessageDialog(null,"king2");
   }
    }//GEN-LAST:event_subItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        main m = new main();         m.setVisible(true);         this.setVisible(false);     }//GEN-LAST:event_jButton1ActionPerformed
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
        JOptionPane.showMessageDialog(rootPane, "king");
    }
}
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new add().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField date;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JComboBox sub;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
