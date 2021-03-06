
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yasith Fonseka
 */
public class booking extends javax.swing.JFrame implements MouseListener{

    /**
     * Creates new form booking
     */
    public booking() {
        initComponents();
        tb1.addMouseListener(this);
        tb2.addMouseListener(this);
        tb3.addMouseListener(this);
        tb4.addMouseListener(this);
        tb5.addMouseListener(this);
        tb6.addMouseListener(this);
        tb7.addMouseListener(this);
        tb8.addMouseListener(this);
        tb9.addMouseListener(this);
        tb10.addMouseListener(this);
        connect();
        
    }
    int seatsno = 0; 
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/busticketsystem","root","");    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void bill(){
        String cus = txt1.getText();
        int seat = seatsno;
        String price = txt2.getText();
        
        SimpleDateFormat data_form = new SimpleDateFormat();
        String date = data_form.format(cal.getDate());
        txtarea.setText(txtarea.getText() + "\n");
        txtarea.setText(txtarea.getText() + "\n");
        txtarea.setText(txtarea.getText() + "****************************************************\n");
        txtarea.setText(txtarea.getText() + "*********************BILL TICKET********************\n");
        txtarea.setText(txtarea.getText() + "****************************************************\n");
        txtarea.setText(txtarea.getText() + "\n");
        txtarea.setText(txtarea.getText() + "- Customer :" + "\t" + cus + "\n");
        txtarea.setText(txtarea.getText() + "- Seat No :" + "\t" + seat + "\n");
        txtarea.setText(txtarea.getText() + "- Price :" + "\t" + price + "\n");
        txtarea.setText(txtarea.getText() + "- Date" + "\t" + date + "\n");
        txtarea.setText(txtarea.getText() + "\n");
        txtarea.setText(txtarea.getText() + "**********************THANK YOU*********************\n");
    
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
        jLabel2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        tb1 = new javax.swing.JLabel();
        tb2 = new javax.swing.JLabel();
        tb3 = new javax.swing.JLabel();
        tb4 = new javax.swing.JLabel();
        tb5 = new javax.swing.JLabel();
        tb6 = new javax.swing.JLabel();
        tb7 = new javax.swing.JLabel();
        tb8 = new javax.swing.JLabel();
        tb9 = new javax.swing.JLabel();
        tb10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        cal = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Bus Booking System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Customer :");

        txt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tb1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tb1.setText("1");

        tb2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tb2.setText("2");

        tb3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tb3.setText("3");

        tb4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tb4.setText("4");

        tb5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tb5.setText("5");

        tb6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tb6.setText("6");

        tb7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tb7.setText("7");

        tb8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tb8.setText("8");

        tb9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tb9.setText("9");

        tb10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tb10.setText("10");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tb1)
                        .addGap(18, 18, 18)
                        .addComponent(tb2)
                        .addGap(18, 18, 18)
                        .addComponent(tb3)
                        .addGap(18, 18, 18)
                        .addComponent(tb4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tb6)
                        .addGap(18, 18, 18)
                        .addComponent(tb7)
                        .addGap(18, 18, 18)
                        .addComponent(tb8)
                        .addGap(18, 18, 18)
                        .addComponent(tb9)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tb5)
                    .addComponent(tb10))
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb1)
                    .addComponent(tb2)
                    .addComponent(tb3)
                    .addComponent(tb4)
                    .addComponent(tb5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb6)
                    .addComponent(tb7)
                    .addComponent(tb8)
                    .addComponent(tb9)
                    .addComponent(tb10))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Seats");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Price :");

        txt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtarea.setColumns(20);
        txtarea.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        button1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button1.setLabel("BOOK");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button2.setLabel("Check");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)))
                                .addGap(18, 18, 18)
                                .addComponent(cal, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel13)))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cal, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        String cus = txt1.getText();
        int seat = seatsno;
        String price = txt2.getText();
        
        SimpleDateFormat data_form = new SimpleDateFormat("yyyy-MM-dd");
        String date = data_form.format(cal.getDate());
        
        try {
            pst = con.prepareStatement("Select * from book where date = ? and seat_no = ?");
            pst.setString(1, date);
            pst.setInt(2, seat);
            rs = pst.executeQuery();
            
            if(rs.next() == true)
            {
                JOptionPane.showMessageDialog(this, "Seat is already booked");
            }
            else
            {
                pst = con.prepareStatement("Insert into book(cus_name,seat_no,price,date) values (?,?,?,?) ");
                pst.setString(1, cus);
                pst.setInt(2, seat);
                pst.setString(3, price);
                pst.setString(4, date);
                int k = pst.executeUpdate();
                
                if(k==1)
                {
                    JOptionPane.showMessageDialog(null, "Seat booked");
                    bill();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "something wrong");
                }
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        check c = new check();
        c.setVisible(true);
        
    }//GEN-LAST:event_button2ActionPerformed

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
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new booking().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private com.toedter.calendar.JCalendar cal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tb1;
    private javax.swing.JLabel tb10;
    private javax.swing.JLabel tb2;
    private javax.swing.JLabel tb3;
    private javax.swing.JLabel tb4;
    private javax.swing.JLabel tb5;
    private javax.swing.JLabel tb6;
    private javax.swing.JLabel tb7;
    private javax.swing.JLabel tb8;
    private javax.swing.JLabel tb9;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == tb1)
        {
            seatsno = 1;
        }
        else if(e.getSource() == tb2)
        {
            seatsno = 2;
        }
        else if(e.getSource() == tb3)
        {
            seatsno = 3;
        }
        else if(e.getSource() == tb4)
        {
            seatsno = 4;
        }
        else if(e.getSource() == tb5)
        {
            seatsno = 5;
        }
        else if(e.getSource() == tb6)
        {
            seatsno = 6;
        }
        else if(e.getSource() == tb7)
        {
            seatsno = 7;
        }
        else if(e.getSource() == tb8)
        {
            seatsno = 8;
        }
        else if(e.getSource() == tb9)
        {
            seatsno = 9;
        }
        else if(e.getSource() == tb10)
        {
            seatsno = 10;
        }
        
        JOptionPane.showMessageDialog(null, seatsno);
   
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
