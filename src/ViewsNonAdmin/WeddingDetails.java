/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewsNonAdmin;


/**
 *
 * @author LopezLaps
 */
public class WeddingDetails extends javax.swing.JFrame {

    public static DataObjects.WeddingDetails weddingDetails = null;
    /**
     * Creates new form WeddingDetails
     */
    
    
    public WeddingDetails() {
        Themes.Theme.renderAluminium(WeddingDetails.class.getName());
        Themes.Theme.setIcon(this);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_bookername = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_dateofwedding = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_fullnameofbride = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_fullnameofgroom = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_city = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_contactnumber = new javax.swing.JTextField();
        btn_wdnext = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        mi_registrationforadmin = new javax.swing.JMenuItem();
        mi_adminlogin = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wd.png_48x48.png"))); // NOI18N
        jLabel1.setText("WEDDING DETAILS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 60));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 153));
        jLabel10.setText("Booker Name:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, -1));

        txt_bookername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_bookername.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_bookername.setPreferredSize(new java.awt.Dimension(5, 18));
        jPanel1.add(txt_bookername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 270, 34));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 153));
        jLabel15.setText("Date of Wedding :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 130, -1));

        txt_dateofwedding.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dateofwedding.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_dateofwedding.setPreferredSize(new java.awt.Dimension(5, 18));
        jPanel1.add(txt_dateofwedding, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 250, 34));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 153));
        jLabel16.setText("Full Name of the Bride:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 170, -1));

        txt_fullnameofbride.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_fullnameofbride.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_fullnameofbride.setPreferredSize(new java.awt.Dimension(5, 18));
        jPanel1.add(txt_fullnameofbride, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 350, 34));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 153));
        jLabel17.setText("Full Name of the Groom:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 170, -1));

        txt_fullnameofgroom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_fullnameofgroom.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_fullnameofgroom.setPreferredSize(new java.awt.Dimension(5, 18));
        jPanel1.add(txt_fullnameofgroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 350, 34));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 153));
        jLabel18.setText("Address:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 70, -1));

        txt_address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_address.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_address.setPreferredSize(new java.awt.Dimension(5, 18));
        jPanel1.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 350, 34));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 153));
        jLabel19.setText("City:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 53, -1));

        txt_city.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_city.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_city.setPreferredSize(new java.awt.Dimension(5, 18));
        jPanel1.add(txt_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 350, 34));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 153));
        jLabel20.setText("Contact Number:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 130, -1));

        txt_contactnumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_contactnumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_contactnumber.setPreferredSize(new java.awt.Dimension(5, 18));
        jPanel1.add(txt_contactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 350, 34));

        btn_wdnext.setBackground(new java.awt.Color(255, 0, 153));
        btn_wdnext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_wdnext.setForeground(new java.awt.Color(255, 255, 255));
        btn_wdnext.setText("Next");
        btn_wdnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_wdnextActionPerformed(evt);
            }
        });
        jPanel1.add(btn_wdnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 160, 41));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 810, 400));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wd.png_64x64.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 70, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pc2.png_64x64.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 70, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/g.png_64x64.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, -1, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 350, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 300, 10));

        jMenu2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home2.png"))); // NOI18N
        jMenu2.setText("HOME");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu5.setBackground(new java.awt.Color(153, 153, 153));
        jMenu5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin_icon2.png"))); // NOI18N
        jMenu5.setText("Admin");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        mi_registrationforadmin.setForeground(new java.awt.Color(255, 0, 153));
        mi_registrationforadmin.setText("Registration for new Admin");
        mi_registrationforadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_registrationforadminActionPerformed(evt);
            }
        });
        jMenu5.add(mi_registrationforadmin);

        mi_adminlogin.setForeground(new java.awt.Color(255, 0, 153));
        mi_adminlogin.setText("AdminLogin");
        mi_adminlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_adminloginActionPerformed(evt);
            }
        });
        jMenu5.add(mi_adminlogin);

        jMenuBar1.add(jMenu5);

        jMenu4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/terms_and_agreement.png"))); // NOI18N
        jMenu4.setText("Terms and condition");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(885, 653));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private DataObjects.WeddingDetails getWeddingDetails(){
        DataObjects.WeddingDetails wedDetails = new DataObjects.WeddingDetails();
        if(WeddingDetails.weddingDetails == null){
            WeddingDetails.weddingDetails = wedDetails;
        }
        
        WeddingDetails.weddingDetails.setBookerName(this.txt_bookername.getText());
        WeddingDetails.weddingDetails.setDateOfWedding(this.txt_dateofwedding.getText());
        WeddingDetails.weddingDetails.setFullnameOfTheBride(this.txt_fullnameofbride.getText());
        WeddingDetails.weddingDetails.setFullnameOfTheGroom(this.txt_fullnameofgroom.getText());
        WeddingDetails.weddingDetails.setAddress(this.txt_address.getText());
        WeddingDetails.weddingDetails.setCity(this.txt_city.getText());
        WeddingDetails.weddingDetails.setContactNo(this.txt_contactnumber.getText());
        
        return WeddingDetails.weddingDetails;
    }
    
    private void setFormWeddingDetails(){
        if(ViewsNonAdmin.WeddingDetails.weddingDetails != null){
            DataObjects.WeddingDetails wedDetails = ViewsNonAdmin.WeddingDetails.weddingDetails;
            
            txt_bookername.setText(wedDetails.getBookerName());
            txt_fullnameofbride.setText(wedDetails.getFullnameOfTheBride());
            txt_fullnameofgroom.setText(wedDetails.getFullnameOfTheGroom());
            txt_address.setText(wedDetails.getAddress());
            txt_city.setText(wedDetails.getCity());
            txt_contactnumber.setText(wedDetails.getContactNo());
        }
    }
    
    private void btn_wdnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_wdnextActionPerformed
        //GetWeddingDetails();
        this.getWeddingDetails();
        ViewsNonAdmin.WeddingDetails.weddingDetails.logData();
        new ViewsNonAdmin.PhotoCoverage().setVisible(true);
        dispose();

    }//GEN-LAST:event_btn_wdnextActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
       new Views.Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void mi_registrationforadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_registrationforadminActionPerformed
        new ViewsAdmin.AdminsRegistration().setVisible(true);
        dispose();
    }//GEN-LAST:event_mi_registrationforadminActionPerformed

    private void mi_adminloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_adminloginActionPerformed
        new ViewsAdmin.Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_mi_adminloginActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        if(ViewsNonAdmin.WeddingDetails.weddingDetails != null){
            ViewsNonAdmin.WeddingDetails.weddingDetails.logData();
            this.setFormWeddingDetails();
        }
        
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        Themes.Theme.renderAluminium(WeddingDetails.class.getName());
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeddingDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_wdnext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JMenuItem mi_adminlogin;
    private javax.swing.JMenuItem mi_registrationforadmin;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_bookername;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txt_contactnumber;
    private javax.swing.JTextField txt_dateofwedding;
    private javax.swing.JTextField txt_fullnameofbride;
    private javax.swing.JTextField txt_fullnameofgroom;
    // End of variables declaration//GEN-END:variables
}
