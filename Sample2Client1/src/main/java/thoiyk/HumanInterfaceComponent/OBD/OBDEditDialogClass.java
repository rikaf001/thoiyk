/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */

package thoiyk.HumanInterfaceComponent.OBD;


//K
import thoiyk.HumanInterfaceComponent.OBD.*;
import KFramework30.Base.*;
import KFramework30.Widgets.KDialogControllerClass;
import KFramework30.Widgets.KDialogControllerClass.KDialogEventCallbackInterface;
import KFramework30.Widgets.KDialogControllerClass.KDialogInterface;
import KFramework30.Widgets.KDropDownFillerClass;
import ProblemDomainComponent.OBDClass;
//APP

//RTL
import java.util.Map;


public class OBDEditDialogClass
extends javax.swing.JDialog
implements  KDialogInterface, KDialogEventCallbackInterface
{
        
    // uses
    private KConfigurationClass             configuration;
    private KLogClass                       log;
    
    private long                            parentID;

 
    // has
    private KDialogControllerClass          KDialogController;
    private KNonVisibleBinaryWidgetClass    productPictureRawDataContainer;
 
    /** Creates new form facturaEditDialogClass */
    public OBDEditDialogClass( 
        KConfigurationClass configurationParam, KLogClass logParam,
        java.awt.Window parentWindow)
        throws KExceptionClass
    {
        
        super( parentWindow, java.awt.Dialog.ModalityType.DOCUMENT_MODAL );
        initComponents ();
        pack ();
       // setSize( 650, 300 );
        KMetaUtilsClass.centerInScreen( this );
        
        // uses
        configuration = configurationParam;
        log = logParam;

        // has - defaulted     
        KDialogController = new KDialogControllerClass(                 
                configurationParam, logParam, 
                OBDClass.class, 
                this, getContentPane() );    
                
        KDialogController.setEventCallback( this );
    }
    
    
    //---------------------------------------------------------------------------
    
    private void checkSecurity()
    throws KExceptionClass
    {               
    }
    
    
    public void initializeDialog(int dialogModeParam, Long ID, Map foreingKeys ) throws KExceptionClass {
        
        KDropDownFillerClass statusComboFiller = new KDropDownFillerClass(
                        configuration, log, 
                        //SQL, might have parameters and where clause or order by
                        " select ID,  NAMA from OBDType ",
                        "ID", cbAccType, "OBDTypeID"
                        );

        statusComboFiller.load();        
        KDialogController.addNonVisibleWidget( statusComboFiller );  // to map it           
                
                
        // start
        KDialogController.initializeDialog( dialogModeParam, ID, foreingKeys );        
        checkSecurity();        
    }

    public void setupTables(long businessObjectOID) throws KExceptionClass {}
    public void saveBrowserChanges() {}
    
    //---------------------------------------------------------------------------

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbAccType = new javax.swing.JComboBox();
        client_address4 = new javax.swing.JTextField();
        client_id3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LblAuditUser = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        client_address5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        client_address6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        client_address7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        client_address8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        client_address10 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        client_id5 = new javax.swing.JLabel();
        client_id6 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();
        topLabel = new javax.swing.JLabel();
        client_id1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "OBD Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 10))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("ID");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel8.setText("OBDType");

        lbl.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl.setName("ID"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel10.setText("Kode Mesin");

        cbAccType.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cbAccType.setName("cbServiceType"); // NOI18N
        cbAccType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAccTypeActionPerformed(evt);
            }
        });

        client_address4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address4.setName("KodeMesin"); // NOI18N

        client_id3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_id3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id3.setName("AuditDate"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("AuditDate");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("AuditUser");

        LblAuditUser.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblAuditUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblAuditUser.setName("AuditUser"); // NOI18N

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel11.setText("Mesin");

        client_address5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address5.setName("Mesin"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel12.setText("Proses");

        client_address6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address6.setName("Proses"); // NOI18N

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel13.setText("Allow(%)");

        client_address7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address7.setName("Allow"); // NOI18N

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel14.setText("P/45mnt");

        client_address8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address8.setName("PPer45Mnt"); // NOI18N

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel15.setText("P/Jam");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel16.setText("RMS");

        client_address10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address10.setName("RMS"); // NOI18N

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel17.setText("H/PRS");

        client_id5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_id5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id5.setName("HPerPRS"); // NOI18N

        client_id6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_id6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id6.setName("PPer1Jam"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel8)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel10)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel11)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel12)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel13)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel14)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel15)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel16)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel17)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel2)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(lbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(client_address4)
                            .add(client_address5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .add(client_address6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .add(client_address7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .add(client_address8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .add(LblAuditUser, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .add(client_id3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(client_id5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(cbAccType, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(client_address10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 192, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(client_id6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 36, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cbAccType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(client_address4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(client_address5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(client_address6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(client_address7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(client_address8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(client_id6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(client_address10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(client_id5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(client_id3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblAuditUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.setBounds(0, 60, 320, 380);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jPanel1.getAccessibleContext().setAccessibleName("Accessories");

        okButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        okButton.setBounds(430, 70, 80, 20);
        jLayeredPane1.add(okButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CancelButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        CancelButton.setBounds(430, 100, 80, 20);
        jLayeredPane1.add(CancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        applyButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        applyButton.setText("Apply"); // NOI18N
        applyButton.setName("applyButton"); // NOI18N
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });
        applyButton.setBounds(430, 130, 80, 20);
        jLayeredPane1.add(applyButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        topLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        topLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/topBar.jpg"))); // NOI18N
        topLabel.setMaximumSize(new java.awt.Dimension(100, 44));
        topLabel.setMinimumSize(new java.awt.Dimension(100, 44));
        topLabel.setBounds(0, -3, 680, 650);
        jLayeredPane1.add(topLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        client_id1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_id1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id1.setName("prodId"); // NOI18N
        client_id1.setBounds(0, 0, 4, 4);
        jLayeredPane1.add(client_id1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 533, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
        
  private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        try {
            LblAuditUser.setText(configuration.getField( "system_user_name" ));      
            KDialogController.OKbuttonActionPerformed();

            setVisible (false);
            dispose ();      
                        
        } catch (KExceptionClass error ) {

              // log error
              log.log( this, KMetaUtilsClass.getStackTrace( error ) );

              // show error message
              KMetaUtilsClass.showErrorMessageFromException( getOwner(), error );               
        }
  }//GEN-LAST:event_okButtonActionPerformed
  
  private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
      setVisible (false);
      dispose ();
  }//GEN-LAST:event_CloseButtonActionPerformed
  
 
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible (false);
        dispose ();
    }//GEN-LAST:event_closeDialog

    private void cbAccTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAccTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAccTypeActionPerformed

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed

        try {
            LblAuditUser.setText(configuration.getField( "system_user_name" ));
            KDialogController.OKbuttonActionPerformed();

        } catch (KExceptionClass error ) {

            // log error
            log.log( this, KMetaUtilsClass.getStackTrace( error ) );

            // show error message
            KMetaUtilsClass.showErrorMessageFromException(  getOwner(), error );
        }

    }//GEN-LAST:event_applyButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel LblAuditUser;
    private javax.swing.JButton applyButton;
    private javax.swing.JComboBox cbAccType;
    private javax.swing.JTextField client_address10;
    private javax.swing.JTextField client_address4;
    private javax.swing.JTextField client_address5;
    private javax.swing.JTextField client_address6;
    private javax.swing.JTextField client_address7;
    private javax.swing.JTextField client_address8;
    private javax.swing.JLabel client_id1;
    private javax.swing.JLabel client_id3;
    private javax.swing.JLabel client_id5;
    private javax.swing.JLabel client_id6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel topLabel;
    // End of variables declaration//GEN-END:variables

    
// We want call backs on display and materialize, to render pic...
// these are activated as we implement KDialogEventCallbackInterface
    
    @Override
    public void preNewObject() throws Exception {
    }

    @Override
    public void postNewObject(KBusinessObjectClass businessObject) throws Exception {
    }

    @Override
    public void prePushBack(KBusinessObjectClass businessObject) throws Exception {
    }

    @Override
    public void postPushBack(KBusinessObjectClass businessObject) throws Exception {
    }

    @Override
    public void preEdit() throws Exception {
    }

    @Override
    public void postEdit(KBusinessObjectClass businessObject) throws Exception {
        
       }

    @Override
    public void preUpdate(KBusinessObjectClass businessObject) throws Exception {
    }

    @Override
    public void postUpdate(KBusinessObjectClass businessObject) throws Exception {
    }
   
    
}
