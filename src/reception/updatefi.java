/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reception;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author LEVY
 */
public class updatefi extends javax.swing.JFrame {

    /**
     * Creates new form updatefi
     */
    public updatefi() {
        initComponents();
    Dimension screenSize,frameSize;
int x,y;
screenSize=Toolkit.getDefaultToolkit().getScreenSize();
frameSize=getSize();
x=(screenSize.width-frameSize.width)/2;
y=(screenSize.height-frameSize.height)/2;
setLocation(x, y);


        setIcon();
    
    }
    private void setIcon() {
    
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("GLOBAL.JPG")));
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
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        tot = new javax.swing.JTextField();
        code3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        payed = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        payed1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        payed2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        month = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ATLAS COLLEGE MANAGEMENT SYSTEM");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "UPDATE FEES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(0, 0, 255));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reception/change.jpg"))); // NOI18N
        jButton7.setText("UPDATE");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Registration Number");

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 255));
        jButton9.setText("Search");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        name.setEditable(false);
        name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tot.setEditable(false);
        tot.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        code3.setEditable(false);
        code3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        code3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        code3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        code3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                code3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                code3KeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Student Name");

        amount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("New Amount");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Total Fees");

        payed.setEditable(false);
        payed.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        payed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        payed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("Amount Paid");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Reciept Number");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setText("Month");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setText("Balance");

        payed1.setEditable(false);
        payed1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        payed1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        payed1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setText("Total Fees Paid");

        payed2.setEditable(false);
        payed2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        payed2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        payed2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        month.setEditable(false);
        month.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        month.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        month.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel13)
                                .addComponent(jLabel18)
                                .addComponent(jLabel23)
                                .addComponent(jLabel24))
                            .addGap(87, 87, 87))
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tot, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(payed)
                            .addComponent(name)
                            .addComponent(payed1)
                            .addComponent(payed2)
                            .addComponent(code3)
                            .addComponent(amount))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(month)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(code3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payed, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payed2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payed1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reception/back-icon.png"))); // NOI18N
        jButton1.setText("BACK");
        jButton1.setToolTipText("");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reception/Clear-icon.png"))); // NOI18N
        jButton8.setText("Clear");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (amount.getText().trim().isEmpty()){
            showMessageDialog(null, "PLEASE, FILL IN THE NEW AMOUNT!!!", "ATLAS INTERGRATED INFORMATION MANAGEMENT SYSTEM", ERROR_MESSAGE);
            //amount.setText("");
        }
        else{

            PreparedStatement st;
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stok", "root", "");
                String query = "UPDATE `fin` SET `paid`="+amount.getText()+" WHERE  tno="+jTextField1.getText()+"";
                st = con.prepareStatement(query);
                if(st.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "Amount changed successfully");
                }

            } catch (SQLException ex) {
                Logger.getLogger(fin.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stok", "root", "");
                String query2 = "UPDATE `balance` SET `bal`=?,`paid`=? WHERE month = '"+month.getText()+"'  AND num = '"+code3.getText()+"'";
                st = con.prepareStatement(query2);
                int originalbalance,newbalance,newpayed;
                int oldpayed=Integer.parseInt(payed2.getText());
                int currentbalance=Integer.parseInt(payed1.getText());
                int initialpayment=Integer.parseInt(payed.getText());
                int newdep=Integer.parseInt(amount.getText());
                
                int initialpayed;
                initialpayed=oldpayed-initialpayment;
                int otot=oldpayed-initialpayment;
                int ntot=otot+newdep;
                newpayed=newdep+initialpayed;
                originalbalance=currentbalance+initialpayment;
                newbalance=originalbalance-newdep;
                st.setString(1, ""+newbalance);
                st.setString(2, ""+ntot);
              //  st.setString(2,""+newpayed);
                st.executeUpdate();

                if(st.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "Balance Successfully Changed");
                    fin f=new fin();
                    f.setVisible(true);
                    this.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Update not successful");
                }

            }   catch (SQLException ex) {
                Logger.getLogger(fin.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        //        payed.setText("");
        //        Balance.setText("");
        //        code3.setText("");
        //        tot.setText("");
        //        name.setText("");
        //        fname.setText("");
        //        amount.setText("");
        //        fac.setText("");
        //        adate.setCalendar(null);

        updatefi f=new updatefi();
        f.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        try{
            String nm = name.getText();

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stok", "root", "");
            String query = "SELECT `num`, `paid`,`month` FROM `fin` WHERE tno="+jTextField1.getText()+"  ";

            PreparedStatement st;
            st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(rs.next()){

                code3.setText(rs.getString(1));
                payed.setText(rs.getString(2));
                month.setText(rs.getString(3));
           

            }
            else{
                showMessageDialog(null, "RECIEPT NUMBER DOES NOT MATCH WITH ANY TRANSACTION !!!\n\nPLEASE, FILL IN THE CORRECT RECIEPT NUMBER !!!", "PIU STUDENT INFORMATION MANAGEMENT SYSTEM", ERROR_MESSAGE);
                jTextField1.setText("");
            }

        }
        catch(SQLException ex){
            Logger.getLogger(fin.class.getName()).log(Level.SEVERE, null, ex);
        }

        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stok", "root", "");
            String query2 = "SELECT `name`, `bal` FROM `balance` WHERE  month = '"+month.getText()+"' AND num = '"+code3.getText()+"'";
            PreparedStatement st;
            st = con.prepareStatement(query2);
            ResultSet rs = st.executeQuery();

            if(rs.next()){
                name.setText(rs.getString(1));
                payed1.setText(rs.getString(2));
              //  fname.setText(rs.getString(3));
              //  tot.setText(rs.getString(4));
               // payed2.setText(rs.getString(5));

            }

        }
        catch(SQLException ex){
            Logger.getLogger(fin.class.getName()).log(Level.SEVERE, null, ex);
        }
         try{            
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stok", "root", "");
         String query2 = "SELECT sum(paid),tot  FROM `fin` WHERE  month = '"+month.getText()+"' AND  num = '"+code3.getText()+"'";
         PreparedStatement st;
         st = con.prepareStatement(query2);
         ResultSet rs = st.executeQuery();

         if(rs.next()){
         payed2.setText(rs.getString(1));
         tot.setText(rs.getString(2));
         
         }
     
   }
   catch(SQLException ex){
         Logger.getLogger(fin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void code3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_code3KeyPressed
        //
        //        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //            try{
                //                String nm = name.getText();
                //                String cos = fname.getText();
                //
                //                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/global", "root", "");
                //                String query = "SELECT `name`,`fname`,`coursename` FROM student WHERE num ='"+code3.getText()+"'";
                //                // String query2 = "SELECT sum(totalamount)  FROM `payment` WHERE  mont = '"+mm.getSelectedItem()+"' AND yr = '"+yy.getSelectedItem()+"' AND num = '"+code3.getText()+"'";
                //                PreparedStatement st;
                //                st = con.prepareStatement(query);
                //                ResultSet rs = st.executeQuery();
                //
                //                if(rs.next()){
                    //                    name.setText(rs.getString("name"));
                    //                    fac.setText(rs.getString("fname"));
                    //                    fname.setText(rs.getString("coursename"));
                    //
                    //                }
                //                else{
                    //                    javax.swing.JOptionPane.showMessageDialog(null, "Registration Number:"+code3.getText()+ "  Does Not Exist");
                    //                    code3.setText("");
                    //                }
                //
                //            }
            //            catch(SQLException ex){
                //                Logger.getLogger(finance.class.getName()).log(Level.SEVERE, null, ex);
                //            }
            //            try{
                //                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/global", "root", "");
                //                String query1= "SELECT `amount`FROM `fee` WHERE `fname`='"+fname.getText()+"'";
                //                PreparedStatement st;
                //                st = con.prepareStatement(query1);
                //                ResultSet rsq= st.executeQuery();
                //                while(rsq.next()){
                    //                    tot.setText(rsq.getString("amount"));
                    //                }
                //            }
            //            catch(SQLException ex){
                //                Logger.getLogger(finance.class.getName()).log(Level.SEVERE, null, ex);
                //            }
            //            try{
                //                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/global", "root", "");
                //                String query2 = "SELECT sum(totalamount)  FROM `payment` WHERE  mont = '"+mm.getSelectedItem()+"' AND yr = '"+yy.getSelectedItem()+"' AND num = '"+code3.getText()+"'";
                //                PreparedStatement st;
                //                st = con.prepareStatement(query2);
                //                ResultSet rs = st.executeQuery();
                //
                //                if(rs.next()){
                    //                    payed.setText(rs.getString(1));
                    //
                    //                }
                //
                //            }
            //            catch(SQLException ex){
                //                Logger.getLogger(finance.class.getName()).log(Level.SEVERE, null, ex);
                //            }}
    }//GEN-LAST:event_code3KeyPressed

    private void code3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_code3KeyReleased

    }//GEN-LAST:event_code3KeyReleased

    private void amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == keyEvent.VK_DELETE))) {
            evt.consume();

        }
    }//GEN-LAST:event_amountKeyTyped

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

           
        try{
            String nm = name.getText();

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stok", "root", "");
            String query = "SELECT `num`, `paid`,`month` FROM `fin` WHERE tno="+jTextField1.getText()+"  ";

            PreparedStatement st;
            st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(rs.next()){

                code3.setText(rs.getString(1));
                payed.setText(rs.getString(2));
                month.setText(rs.getString(3));
           

            }
            else{
                showMessageDialog(null, "RECIEPT NUMBER DOES NOT MATCH WITH ANY TRANSACTION !!!\n\nPLEASE, FILL IN THE CORRECT RECIEPT NUMBER !!!", "PIU STUDENT INFORMATION MANAGEMENT SYSTEM", ERROR_MESSAGE);
                jTextField1.setText("");
            }

        }
        catch(SQLException ex){
            Logger.getLogger(fin.class.getName()).log(Level.SEVERE, null, ex);
        }

        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stok", "root", "");
            String query2 = "SELECT `name`, `bal` FROM `balance` WHERE  month = '"+month.getText()+"' AND num = '"+code3.getText()+"'";
            PreparedStatement st;
            st = con.prepareStatement(query2);
            ResultSet rs = st.executeQuery();

            if(rs.next()){
                name.setText(rs.getString(1));
                payed1.setText(rs.getString(2));
              //  fname.setText(rs.getString(3));
              //  tot.setText(rs.getString(4));
               // payed2.setText(rs.getString(5));

            }

        }
        catch(SQLException ex){
            Logger.getLogger(fin.class.getName()).log(Level.SEVERE, null, ex);
        }
         try{            
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stok", "root", "");
         String query2 = "SELECT sum(paid),tot  FROM `fin` WHERE  month = '"+month.getText()+"' AND  num = '"+code3.getText()+"'";
         PreparedStatement st;
         st = con.prepareStatement(query2);
         ResultSet rs = st.executeQuery();

         if(rs.next()){
         payed2.setText(rs.getString(1));
         tot.setText(rs.getString(2));
         
         }
     
   }
   catch(SQLException ex){
         Logger.getLogger(fin.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == keyEvent.VK_DELETE))) {
            evt.consume();

        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        manage l = new manage();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(updatefi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatefi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatefi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatefi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatefi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField code3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField month;
    private javax.swing.JTextField name;
    private javax.swing.JTextField payed;
    private javax.swing.JTextField payed1;
    private javax.swing.JTextField payed2;
    private javax.swing.JTextField tot;
    // End of variables declaration//GEN-END:variables
}
