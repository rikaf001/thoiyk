/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */

package thoiyk.HumanInterfaceComponent.SewingOpBreakDownDtl;


// k
import KFramework30.Base.*;
import KFramework30.Communication.persistentObjectManagerClass;
import KFramework30.Widgets.KDialogControllerClass;

//app
import KFramework30.Widgets.KDialogControllerClass.KDialogInterface;
import KFramework30.Widgets.KDropDownFillerClass;
import KFramework30.Widgets.selectDialogClass;
import ProblemDomainComponent.OBDClass;
import ProblemDomainComponent.OBDTypeClass;
import ProblemDomainComponent.SewingOpBreakDownDtlClass;
import ProblemDomainComponent.ProdRecClass;
//import ProblemDomainComponent.productionrecordClass;
import java.util.Map;
import thoiyk.HumanInterfaceComponent.OBD.OBDBrowserClass;
//import thoiyk.HumanInterfaceComponent.PurchaseOrder.PurchaseOrderBrowserClass;

// rtl


public class SewingOpBreakDownDtlEditDialogClass 
extends javax.swing.JDialog
implements KDialogInterface
{
    
    // uses
    private KConfigurationClass             configuration;
    private KLogClass                       log;
    private long                            parentID;
   
    // has defaulted   
    private KDialogControllerClass            KDialogController;

    
    //end of object persistent functions------------------------------------------------------

    /** Creates new form facturaEditDialogClass */
    public SewingOpBreakDownDtlEditDialogClass( 
        KConfigurationClass configurationParam, KLogClass logParam, java.awt.Window parentWindow )
        throws KExceptionClass
    {
        
        super( parentWindow, java.awt.Dialog.ModalityType.DOCUMENT_MODAL );
        initComponents ();
        pack ();
//        setSize( 630, 600 );
        KMetaUtilsClass.centerInScreen( this );
        
        // uses
        configuration = configurationParam;
        log = logParam;
        
        // has - defaulted     
        KDialogController = new KDialogControllerClass(                 
                configuration, log, 
                SewingOpBreakDownDtlClass.class, this, getContentPane() );        
                            
    }
    
    
    public void initializeDialog(int dialogModeParam, Long ID, Map foreingKeys ) throws KExceptionClass {
        
        /*KDropDownFillerClass typeComboFiller1 = new KDropDownFillerClass(
        configuration, log, 
        //SQL, might have parameters and where clause or order by
        " select ID,  NAMA from LINE ",
        "ID", penerimaCb, "LineID"
        );

        typeComboFiller1.load();        
        KDialogController.addNonVisibleWidget( typeComboFiller1 );  // to map it           
*/
        // start
        KDialogController.initializeDialog( dialogModeParam, ID, foreingKeys  );
        checkSecurity();
        
    }
    
    //---------------------------------------------------------------------------
    
    private void checkSecurity()
    throws KExceptionClass
    {
  
    }
    
    //---------------------------------------------------------------------------
    
    @Override   
    public void setupTables( long id )
    throws KExceptionClass
    {
                       
        
                        
    }
     
    public void saveBrowserChanges() {
        
        
    }    
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientDiscountGroup = new javax.swing.ButtonGroup();
        okButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        system_user_id1 = new javax.swing.JLabel();
        lblID1 = new javax.swing.JLabel();
        lblNama1 = new javax.swing.JLabel();
        createdbyLbl = new javax.swing.JLabel();
        vl = new javax.swing.JLabel();
        LblAuditUser = new javax.swing.JLabel();
        lblTelp1 = new javax.swing.JLabel();
        lblTelp8 = new javax.swing.JLabel();
        lblTelp12 = new javax.swing.JLabel();
        lblTelp15 = new javax.swing.JLabel();
        LblP45 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        LblOBDId = new javax.swing.JLabel();
        lblTelp34 = new javax.swing.JLabel();
        LblPPerJam = new javax.swing.JLabel();
        lblTelp35 = new javax.swing.JLabel();
        LblRMS = new javax.swing.JLabel();
        lblTelp36 = new javax.swing.JLabel();
        LblOBDType = new javax.swing.JLabel();
        lblTelp38 = new javax.swing.JLabel();
        qtyLabel25 = new javax.swing.JTextField();
        lblTelp2 = new javax.swing.JLabel();
        LblKodeMesin = new javax.swing.JLabel();
        lblTelp3 = new javax.swing.JLabel();
        LblMesin = new javax.swing.JLabel();
        lblTelp4 = new javax.swing.JLabel();
        LblProses = new javax.swing.JLabel();
        lblTelp39 = new javax.swing.JLabel();
        qtyLabel26 = new javax.swing.JTextField();
        lblTelp5 = new javax.swing.JLabel();
        LblStyle4 = new javax.swing.JLabel();
        lblTelp6 = new javax.swing.JLabel();
        LblStyle5 = new javax.swing.JLabel();
        lblTelp7 = new javax.swing.JLabel();
        LblStyle6 = new javax.swing.JLabel();
        lblTelp40 = new javax.swing.JLabel();
        lblTelp41 = new javax.swing.JLabel();
        LblHPerPRS = new javax.swing.JLabel();
        itemidLabel7 = new javax.swing.JLabel();
        qtyLabel27 = new javax.swing.JTextField();
        lblTelp9 = new javax.swing.JLabel();
        itemidLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        okButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        CancelButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        applyButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        applyButton.setText("Apply"); // NOI18N
        applyButton.setName("applyButton"); // NOI18N
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Form Sewing Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 10))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        lblID.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblID.setText("ID");

        ID.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        ID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ID.setName("ID"); // NOI18N

        lblNama.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblNama.setText("OBD");

        system_user_id1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        system_user_id1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        system_user_id1.setName("HdrID"); // NOI18N

        lblID1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblID1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblID1.setText("HDRID");

        lblNama1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblNama1.setText("AuditDate");

        createdbyLbl.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        createdbyLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        createdbyLbl.setName("AuditDate"); // NOI18N

        vl.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        vl.setText("AuditUser");

        LblAuditUser.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblAuditUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblAuditUser.setName("AuditUser"); // NOI18N

        lblTelp1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp1.setText("OBDType");

        lblTelp8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp8.setText("MC/Call");

        lblTelp12.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp12.setText("MC/Act");

        lblTelp15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp15.setText("P/45mnt");

        LblP45.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblP45.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblP45.setName("PPer45"); // NOI18N

        jButton2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton2.setText("Pick OBD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        LblOBDId.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblOBDId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblOBDId.setName("OBDID"); // NOI18N

        lblTelp34.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp34.setText("P/Jam");

        LblPPerJam.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblPPerJam.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblPPerJam.setName("PPerJam"); // NOI18N

        lblTelp35.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp35.setText("RMS");

        LblRMS.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblRMS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblRMS.setName("RMS"); // NOI18N

        lblTelp36.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblTelp36.setText("Balancing");

        LblOBDType.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblOBDType.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblOBDType.setName("OBDType"); // NOI18N

        lblTelp38.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp38.setText("s/d Jam 15");

        qtyLabel25.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel25.setName("Jam15"); // NOI18N
        qtyLabel25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyLabel25ActionPerformed(evt);
            }
        });

        lblTelp2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp2.setText("Kode Mesin");

        LblKodeMesin.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblKodeMesin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblKodeMesin.setName("KodeMesin"); // NOI18N

        lblTelp3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp3.setText("Mesin");

        LblMesin.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblMesin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblMesin.setName("Mesin"); // NOI18N

        lblTelp4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp4.setText("Proses");

        LblProses.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblProses.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblProses.setName("Proses"); // NOI18N

        lblTelp39.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp39.setText("Actual Time");

        qtyLabel26.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel26.setName("ActualTime"); // NOI18N
        qtyLabel26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyLabel26ActionPerformed(evt);
            }
        });

        lblTelp5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp5.setText("Stand Time (-10%)");

        LblStyle4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblStyle4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblStyle4.setName("StandTime10"); // NOI18N

        lblTelp6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp6.setText("Allow%");

        LblStyle5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblStyle5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblStyle5.setName("Allowance"); // NOI18N

        lblTelp7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp7.setText("Stand Time");

        LblStyle6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblStyle6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblStyle6.setName("StandTime"); // NOI18N

        lblTelp40.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblTelp40.setText("Target");

        lblTelp41.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp41.setText("H/PRS");

        LblHPerPRS.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblHPerPRS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblHPerPRS.setName("HPerPRS"); // NOI18N

        itemidLabel7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel7.setName("MCPerCall"); // NOI18N

        qtyLabel27.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel27.setName("MCPerAct"); // NOI18N
        qtyLabel27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyLabel27ActionPerformed(evt);
            }
        });

        lblTelp9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp9.setText("Adj Prs / 45 mnt ");

        itemidLabel8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel8.setName("AdjPRSPer45"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(53, 53, 53)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(10, 10, 10)
                                .add(lblTelp39)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(qtyLabel26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 286, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(0, 0, Short.MAX_VALUE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(lblTelp2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblKodeMesin, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblID)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblID1)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblNama)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp1))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(jPanel1Layout.createSequentialGroup()
                                            .add(LblOBDId, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jButton2))
                                        .add(system_user_id1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(ID, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .add(LblOBDType, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(lblTelp3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblMesin, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(lblTelp4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblProses, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(lblTelp5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblStyle4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(1, 1, 1))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(lblTelp6)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblStyle5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(lblTelp7)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblStyle6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(lblTelp40)
                                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                        .add(jPanel1Layout.createSequentialGroup()
                                            .add(lblTelp41)
                                            .add(41, 41, 41)
                                            .add(LblHPerPRS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(jPanel1Layout.createSequentialGroup()
                                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp15)
                                                .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp34)
                                                .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp35))
                                            .add(41, 41, 41)
                                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                .add(LblP45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .add(LblRMS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .add(LblPPerJam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                                .add(0, 0, Short.MAX_VALUE))))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(lblTelp36)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(vl)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(LblAuditUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 276, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(lblNama1)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(createdbyLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 276, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(lblTelp38)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(qtyLabel25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(lblTelp8)
                                        .add(lblTelp12))
                                    .add(26, 26, 26)
                                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(itemidLabel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                        .add(qtyLabel27))))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(lblTelp9)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(itemidLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(187, 187, 187)))
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(2, 2, 2)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(ID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblID1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(system_user_id1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblNama)
                    .add(LblOBDId, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblTelp1)
                    .add(LblOBDType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblTelp2)
                    .add(LblKodeMesin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblTelp3)
                    .add(LblMesin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblTelp4)
                    .add(LblProses, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(qtyLabel26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp39))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblTelp5)
                    .add(LblStyle4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblTelp6)
                    .add(LblStyle5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblTelp7)
                    .add(LblStyle6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(lblTelp40)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(lblTelp15))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(LblP45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblTelp34)
                    .add(LblPPerJam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(2, 2, 2)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblTelp35)
                    .add(LblRMS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblTelp41)
                    .add(LblHPerPRS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(7, 7, 7)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(qtyLabel25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp38))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblTelp36)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblTelp8)
                    .add(itemidLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblTelp12)
                    .add(qtyLabel27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblTelp9)
                    .add(itemidLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(lblNama1)
                            .add(createdbyLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblAuditUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, vl))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(okButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(CancelButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(applyButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(41, 41, 41)
                .add(okButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(10, 10, 10)
                .add(CancelButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(10, 10, 10)
                .add(applyButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
        
  private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

      // calculate
      //qtyneedLabel.setText(Long.toString( String.valueOf("s") ));
      //qtyneedLabel.setText((qtyLabel.getText() * compLabel.getText() * toleranceLabel.getText());
      
      
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
  
  
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
  
        setVisible (false);
        dispose ();
        
    }//GEN-LAST:event_closeDialog

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
            OBDBrowserClass OBDBrowser = new OBDBrowserClass(
                configuration, log, new javax.swing.JTable(), this );

            OBDBrowser.initializeTable();

            selectDialogClass selector = new selectDialogClass(
                configuration, log, this, OBDBrowser, "Select OBD" );

            // dont want to allow this, for example
            selector.getNewButton().setEnabled(false);
            selector.getDeleteButton().setEnabled(false);
            parentID = selector.showDialog();

            if( parentID < 0 )
            {
                throw new KExceptionClass( "You must select a Production Record !", null);

            }
            else
            {

                LblOBDId.setText( Long.toString(parentID) );

                persistentObjectManagerClass persistentObjectManager =
                new persistentObjectManagerClass( configuration, log );

                OBDClass OBD = new OBDClass();

                OBD = (OBDClass) persistentObjectManager.copy4( parentID, OBDClass.class );

                persistentObjectManagerClass POM =
                new persistentObjectManagerClass( configuration, log );

                OBDTypeClass OBDType = new OBDTypeClass();

                OBDType = (OBDTypeClass) POM.copy4( OBD.getOBDTypeID(), OBDTypeClass.class );

                LblOBDType.setText(OBDType.getNama());
                LblKodeMesin.setText(OBD.getKodeMesin());
                LblMesin.setText(OBD.getMesin());
                LblProses.setText(OBD.getProses());
                LblP45.setText(Double.toString(OBD.getPPer45Mnt()));
                LblPPerJam.setText(Double.toString(OBD.getPPer1Jam()));
                LblRMS.setText(Double.toString(OBD.getRMS()));
                LblHPerPRS.setText(Double.toString(OBD.getHPerPRS()));
                
                

            }

        }
        catch( Exception error	){
            log.log( this, KMetaUtilsClass.getStackTrace( error ) );
            KMetaUtilsClass.showErrorMessageFromException( this, error );
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void qtyLabel25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyLabel25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyLabel25ActionPerformed

    private void qtyLabel26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyLabel26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyLabel26ActionPerformed

    private void qtyLabel27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyLabel27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyLabel27ActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel LblAuditUser;
    private javax.swing.JLabel LblHPerPRS;
    private javax.swing.JLabel LblKodeMesin;
    private javax.swing.JLabel LblMesin;
    private javax.swing.JLabel LblOBDId;
    private javax.swing.JLabel LblOBDType;
    private javax.swing.JLabel LblP45;
    private javax.swing.JLabel LblPPerJam;
    private javax.swing.JLabel LblProses;
    private javax.swing.JLabel LblRMS;
    private javax.swing.JLabel LblStyle4;
    private javax.swing.JLabel LblStyle5;
    private javax.swing.JLabel LblStyle6;
    private javax.swing.JButton applyButton;
    private javax.swing.ButtonGroup clientDiscountGroup;
    private javax.swing.JLabel createdbyLbl;
    private javax.swing.JLabel itemidLabel7;
    private javax.swing.JLabel itemidLabel8;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNama1;
    private javax.swing.JLabel lblTelp1;
    private javax.swing.JLabel lblTelp12;
    private javax.swing.JLabel lblTelp15;
    private javax.swing.JLabel lblTelp2;
    private javax.swing.JLabel lblTelp3;
    private javax.swing.JLabel lblTelp34;
    private javax.swing.JLabel lblTelp35;
    private javax.swing.JLabel lblTelp36;
    private javax.swing.JLabel lblTelp38;
    private javax.swing.JLabel lblTelp39;
    private javax.swing.JLabel lblTelp4;
    private javax.swing.JLabel lblTelp40;
    private javax.swing.JLabel lblTelp41;
    private javax.swing.JLabel lblTelp5;
    private javax.swing.JLabel lblTelp6;
    private javax.swing.JLabel lblTelp7;
    private javax.swing.JLabel lblTelp8;
    private javax.swing.JLabel lblTelp9;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField qtyLabel25;
    private javax.swing.JTextField qtyLabel26;
    private javax.swing.JTextField qtyLabel27;
    private javax.swing.JLabel system_user_id1;
    private javax.swing.JLabel vl;
    // End of variables declaration//GEN-END:variables


    
    
}
