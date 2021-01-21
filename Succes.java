import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Succes extends javax.swing.JFrame {

    

    /**
     * Creates new form Succes
     */
    public Succes() {
       
        initComponents();
        showTableData();
       // DefaultTableModel model = (DefaultTableModel)jtable_default.getModel();
     //   model.setRowCount(0);
     /*   try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "batman", "54928");
            
            String colhead[]={"FIRST_NAME","LAST_NAME","AGE","MOBILE_NUMBER","SIT_NUMBER","COMISSION","PASSENGER_ID","PAYMENT"};
            model.setColumnIdentifiers(colhead);
            String query1 = "select * from TICKET_DETAILS";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query1);
            ResultSetMetaData rsmd =rs.getMetaData();
            int cols = rsmd.getColumnCount();
            while(rs.next())
            {
               Object[] obj = new Object[cols];
               for(int i=0; i<cols;i++)
               {
                   obj[i]=rs.getObject(i+1);
               }
               model.addRow(obj);
                
                
                
            }
            
            
            
            
            
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }*/
        
        
        
        
        
        
        
      
    }
    
public void showTableData() 
       {
           try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "batman", "54928");
       String query1 = "select * from PASSENGER_DETAILS";
           PreparedStatement pst;
            pst = connection.prepareStatement(query1);
           ResultSet rs = pst.executeQuery(query1);
           jtable_default.setModel(DbUtils.resultSetToTableModel(rs));
           
           }
           catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

           }
           
           
           
           }
    /*public ArrayList<ticket> userList() {
        try {
            ArrayList<ticket> usersList = new ArrayList<>();
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "batman", "54928");
            String query1 = "select * from TICKET_DETAILS";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query1);
            ticket Ticket;
            while (rs.next()) {
                {
                    Ticket = new ticket(rs.getString("fstnm"),rs.getString("lstnm"), rs.getString("age"), rs.getString("mobnumb"), rs.getString("sitno"), rs.getString("comsn"), rs.getInt("pasid"), rs.getString("paym"), rs.getString("strpnt"), rs.getString("endpnt"), rs.getString("time"), rs.getString("date"), rs.getString("type"), rs.getString("cls"));
                    usersList.add(Ticket);
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return usersList;
    }

    public void show_ticket() {
        ArrayList<ticket> list = userList();
        DefaultTableModel model = (DefaultTableModel)jtable_default.getModel();
        Object[] row = new Object[14];
        for (int i = 0; i < list.size(); i++) 
        {
          row[0]=list.get(i).getfstnm();       
          row[1]=list.get(i).getlstnm();
          
          row[2]=list.get(i).getage()    ;   
          row[3]=list.get(i).getmobnumb(); 
           row[4]=list.get(i).getsitno();        
          row[5]=list.get(i).getcomsn();  
          row[6]=list.get(i).getpasid();        
          row[7]=list.get(i).getpaym();  
            row[8]=list.get(i).getstrpnt();        
          row[9]=list.get(i).getendpnt();  
          row[10]=list.get(i).gettime();        
          row[11]=list.get(i).getdate();  
           row[12]=list.get(i).gettype();        
          row[13]=list.get(i).getcls();                                                                
                   
          model.addRow(row);
                   
                   
                   
                   
                   
                   
        }

    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        mobnumb = new javax.swing.JTextField();
        sitno = new javax.swing.JTextField();
        ticid = new javax.swing.JTextField();
        comsn = new javax.swing.JTextField();
        paym = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_default = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pasid = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));

        jLabel1.setText("First name");

        jLabel2.setText("Last name");

        jLabel3.setText("Age");

        jLabel5.setText("sit number");

        jLabel6.setText("mobile number");

        jLabel8.setText("comission");

        jLabel9.setText("Ticket id");

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });

        sitno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sitnoActionPerformed(evt);
            }
        });

        ticid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticidActionPerformed(evt);
            }
        });

        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        reset.setText("reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel14.setText("Class");

        jtable_default.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First name", "Last name", "Age", "Mobile number", "Sit number", "Comission", "Ticket  id", "Payment", "Passenger id"
            }
        ));
        jtable_default.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_defaultMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable_default);

        jLabel13.setText("Payment");

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel4.setText("Passenger ID");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comsn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mobnumb, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(save)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(paym)
                                    .addComponent(sitno, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ticid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(pasid, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update)
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(reset)
                        .addGap(101, 101, 101)
                        .addComponent(back)
                        .addGap(112, 390, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(update)
                                .addComponent(jLabel3)
                                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(mobnumb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sitno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(paym, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(ticid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(pasid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 49, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delete))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(back)
                            .addComponent(save)
                            .addComponent(reset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "batman", "54928");
            String query = "insert into PASSENGER_DETAILS(FIRST_NAME,LAST_NAME,AGE,MOBILE_NUMBER,SIT_NUMBER,COMISSION,TICKET_ID,PAYMENT,PASSENGER_ID)VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst;
            pst = connection.prepareStatement(query);
            pst.setString(1, firstname.getText());
            pst.setString(2, lastname.getText());
            pst.setString(3, age.getText());
            pst.setString(4, mobnumb.getText());
            pst.setString(5, sitno.getText());
            pst.setString(6, comsn.getText());
            pst.setString(7, ticid.getText());
            pst.setString(8, paym.getText());
            pst.setString(9, pasid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "inserted successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ticket does not go to any bus");

        }    // TODO add your handling code here:
           showTableData();

    }//GEN-LAST:event_saveActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:

        lastname.setText("");
        firstname.setText("");
        age.setText("");
        mobnumb.setText("");
        
        sitno.setText("");
       
        comsn.setText("");
        paym.setText("");
        ticid.setText("");
        pasid.setText("");
        


    }//GEN-LAST:event_resetActionPerformed

    private void ticidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ticidActionPerformed

    private void jtable_defaultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_defaultMouseClicked
      int i= jtable_default.getSelectedRow();  // TODO add your handling code here:
    TableModel model =jtable_default.getModel();
   firstname.setText(model.getValueAt(i, 0).toString());
    lastname.setText(model.getValueAt(i, 1).toString());
    age.setText(model.getValueAt(i, 2).toString());
    mobnumb.setText(model.getValueAt(i, 3).toString());
    sitno.setText(model.getValueAt(i, 4).toString());
    comsn.setText(model.getValueAt(i, 5).toString());
    ticid.setText(model.getValueAt(i, 6).toString());
    paym.setText(model.getValueAt(i, 7).toString());
    pasid.setText(model.getValueAt(i, 8).toString());
    
    
    /*  Connection connection= null;
        String f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14;
        
            f1=this.firstname.getText();
        f2=this.lastname.getText();
        f3=this.age.getText();
        f4=this.mobnumb.getText();
        f5=this.sitno.getText();
        f6=this.comsn.getText();
        f7=this.pasid.getText();
        f8=this.paym.getText();
        f9=this.stpnt.getText();        
        f10=this.endpnt.getText();
        f11=this.time.getText();
        f12=this.date.getText();
       // f13=this.type.getText();
        //f14=this.cls.getText();
       
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "batman", "54928");
            if(connection!=null)
                
            {
            
            int i=0;
            String query1 = "select * from TICKET_DETAILS";
            Statement st = connection.createStatement();
           ResultSet rs = st.executeQuery(query1);
            while(rs.next())
             {
                 jtable_default.getModel().setValueAt(rs.getString("firstname"), i, 0);
                 jtable_default.getModel().setValueAt(rs.getString("lastname"), i, 1);
                 jtable_default.getModel().setValueAt(rs.getString("age"), i, 2);
                 jtable_default.getModel().setValueAt(rs.getString("mobnumb"), i, 3);
                 jtable_default.getModel().setValueAt(rs.getString("sitno"), i, 4);
                 jtable_default.getModel().setValueAt(rs.getString("comsn"), i, 5);
                 jtable_default.getModel().setValueAt(rs.getString("pasid"), i, 6);
                 jtable_default.getModel().setValueAt(rs.getString("paym"), i, 7);
                 jtable_default.getModel().setValueAt(rs.getString("stpnt"), i, 8);
                 jtable_default.getModel().setValueAt(rs.getString("endpnt"), i, 9);
                 jtable_default.getModel().setValueAt(rs.getString("time"), i, 10);
                 jtable_default.getModel().setValueAt(rs.getString("date"), i, 11);
                // jtable_default.getModel().setValueAt(rs.getString("firstname"), i, 12);
              //   jtable_default.getModel().setValueAt(rs.getString("firstname"), i, 13);
                i++;
             }
            
            
            
            
            
        }
        }  
        catch (ClassNotFoundException | SQLException ex) {
            //JOptionPane.showMessageDialog(null, e);
           Logger.getLogger(Succes.class.getName()).log(Level.SEVERE,null,ex);
        }
        */
        
     
        
        
        
        
        
        
    }//GEN-LAST:event_jtable_defaultMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
       try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "batman", "54928");
            String query = " UPDATE PASSENGER_DETAILS SET FIRST_NAME=?,LAST_NAME=?,AGE=?,MOBILE_NUMBER=?,SIT_NUMBER=?,COMISSION=?,TICKET_ID=?, PAYMENT=? WHERE PASSENGER_ID=?";
            PreparedStatement pqst;
            pqst = connection.prepareStatement(query);
            
            pqst.setString(1, firstname.getText());
            pqst.setString(2, lastname.getText());
            pqst.setString(3, age.getText());
            pqst.setString(4, mobnumb.getText());
            pqst.setString(5, sitno.getText());
            pqst.setString(6, comsn.getText());
            pqst.setString(7, ticid.getText());
            pqst.setString(8, paym.getText());
            pqst.setString(9, pasid.getText());
          
            pqst.executeUpdate();
            showTableData();
            JOptionPane.showMessageDialog(null, "updated successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ticket does not exist");

        }    // TODO add your handling code here:
 
       showTableData();
        
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "batman", "54928");
            String query = "DELETE FROM PASSENGER_DETAILS  WHERE PASSENGER_ID=?";
            PreparedStatement pqst;
            pqst = connection.prepareStatement(query);
            pqst.setString(1, pasid.getText());
            
            pqst.executeUpdate();
            JOptionPane.showMessageDialog(null, "DELETED successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }    // TODO add your handling code here:
       showTableData(); 
    }//GEN-LAST:event_deleteActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.hide();
        busManagementSystem field = new busManagementSystem();
        field.setVisible(true);
       // setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void sitnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sitnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sitnoActionPerformed

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
            java.util.logging.Logger.getLogger(Succes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Succes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Succes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Succes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Succes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField comsn;
    private javax.swing.JButton delete;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable_default;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField mobnumb;
    private javax.swing.JTextField pasid;
    private javax.swing.JTextField paym;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JTextField sitno;
    private javax.swing.JTextField ticid;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
