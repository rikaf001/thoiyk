/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */

package thoiyk.HumanInterfaceComponent.DailySewingDtl;


// k
import KFramework30.Base.*;
import KFramework30.Communication.persistentObjectManagerClass;
import KFramework30.Widgets.KDialogControllerClass;

//app
import KFramework30.Widgets.KDialogControllerClass.KDialogInterface;
import KFramework30.Widgets.KDropDownFillerClass;
import KFramework30.Widgets.selectDialogClass;
import ProblemDomainComponent.DailySewingDtlClass;
import ProblemDomainComponent.ProdRecClass;
//import ProblemDomainComponent.productionrecordClass;
import java.util.Map;
import thoiyk.HumanInterfaceComponent.ProductionRecord.ProdRecBrowserClass;
//import thoiyk.HumanInterfaceComponent.PurchaseOrder.PurchaseOrderBrowserClass;

// rtl


public class DailySewingDtlEditDialogClass 
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
    public DailySewingDtlEditDialogClass( 
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
                DailySewingDtlClass.class, this, getContentPane() );        
                            
    }
    
    
    public void initializeDialog(int dialogModeParam, Long ID, Map foreingKeys ) throws KExceptionClass {
        
        KDropDownFillerClass typeComboFiller1 = new KDropDownFillerClass(
        configuration, log, 
        //SQL, might have parameters and where clause or order by
        " select ID,  NAMA from LINE ",
        "ID", penerimaCb, "LineID"
        );

        typeComboFiller1.load();        
        KDialogController.addNonVisibleWidget( typeComboFiller1 );  // to map it           

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
        lblTelp = new javax.swing.JLabel();
        system_user_id1 = new javax.swing.JLabel();
        lblID1 = new javax.swing.JLabel();
        lblNama1 = new javax.swing.JLabel();
        createdbyLbl = new javax.swing.JLabel();
        vl = new javax.swing.JLabel();
        LblAuditUser = new javax.swing.JLabel();
        lblTelp1 = new javax.swing.JLabel();
        qtyLabel2 = new javax.swing.JTextField();
        lblTelp8 = new javax.swing.JLabel();
        qtyLabel6 = new javax.swing.JTextField();
        lblTelp12 = new javax.swing.JLabel();
        qtyLabel9 = new javax.swing.JTextField();
        qtyLabel10 = new javax.swing.JTextField();
        qtyLabel11 = new javax.swing.JTextField();
        lblTelp15 = new javax.swing.JLabel();
        qtyLabel8 = new javax.swing.JTextField();
        qtyLabel14 = new javax.swing.JTextField();
        lblTelp17 = new javax.swing.JLabel();
        penerimaCb = new javax.swing.JComboBox();
        itemidLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        LblPRID = new javax.swing.JLabel();
        LblPRNo = new javax.swing.JLabel();
        lblTelp18 = new javax.swing.JLabel();
        qtyLabel12 = new javax.swing.JTextField();
        lblTelp19 = new javax.swing.JLabel();
        lblTelp20 = new javax.swing.JLabel();
        lblTelp21 = new javax.swing.JLabel();
        lblTelp22 = new javax.swing.JLabel();
        qtyLabel3 = new javax.swing.JTextField();
        lblTelp23 = new javax.swing.JLabel();
        qtyLabel15 = new javax.swing.JTextField();
        lblTelp24 = new javax.swing.JLabel();
        qtyLabel16 = new javax.swing.JTextField();
        lblTelp25 = new javax.swing.JLabel();
        qtyLabel7 = new javax.swing.JTextField();
        lblTelp26 = new javax.swing.JLabel();
        qtyLabel17 = new javax.swing.JTextField();
        lblTelp27 = new javax.swing.JLabel();
        qtyLabel18 = new javax.swing.JTextField();
        lblTelp28 = new javax.swing.JLabel();
        qtyLabel19 = new javax.swing.JTextField();
        lblTelp29 = new javax.swing.JLabel();
        qtyLabel20 = new javax.swing.JTextField();
        lblTelp30 = new javax.swing.JLabel();
        qtyLabel21 = new javax.swing.JTextField();
        lblTelp31 = new javax.swing.JLabel();
        qtyLabel22 = new javax.swing.JTextField();
        lblTelp32 = new javax.swing.JLabel();
        qtyLabel23 = new javax.swing.JTextField();
        lblTelp33 = new javax.swing.JLabel();
        qtyLabel24 = new javax.swing.JTextField();
        lblTelp34 = new javax.swing.JLabel();
        itemidLabel4 = new javax.swing.JLabel();
        lblTelp35 = new javax.swing.JLabel();
        itemidLabel5 = new javax.swing.JLabel();
        lblTelp36 = new javax.swing.JLabel();
        lblTelp11 = new javax.swing.JLabel();
        lblTelp37 = new javax.swing.JLabel();
        LblStyle = new javax.swing.JLabel();
        lblTelp38 = new javax.swing.JLabel();
        qtyLabel25 = new javax.swing.JTextField();

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
        lblNama.setText("PRNo");

        lblTelp.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp.setText("LineSewing");

        system_user_id1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        system_user_id1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        system_user_id1.setName("HDRID"); // NOI18N

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
        lblTelp1.setText("Style");

        qtyLabel2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel2.setName("j0845"); // NOI18N
        qtyLabel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyLabel2ActionPerformed(evt);
            }
        });

        lblTelp8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp8.setText("OPRHadir");

        qtyLabel6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel6.setName("HadirOPR"); // NOI18N

        lblTelp12.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp12.setText("HPHadir");

        qtyLabel9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel9.setName("HadirHP"); // NOI18N

        qtyLabel10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel10.setName("AbsentOPR"); // NOI18N

        qtyLabel11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel11.setName("AbsentHP"); // NOI18N

        lblTelp15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp15.setText("TotalOutput");

        qtyLabel8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel8.setName("j1415"); // NOI18N

        qtyLabel14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel14.setName("TargetPerJam"); // NOI18N

        lblTelp17.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblTelp17.setText("Output Sewing");

        penerimaCb.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        penerimaCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "???" }));
        penerimaCb.setName("TypeIDSelect"); // NOI18N
        penerimaCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penerimaCbActionPerformed(evt);
            }
        });

        itemidLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel3.setName("TotalOutput"); // NOI18N

        jButton2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton2.setText("Pick PR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        LblPRID.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblPRID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblPRID.setName("PRID"); // NOI18N

        LblPRNo.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblPRNo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblPRNo.setName("PRNo"); // NOI18N

        lblTelp18.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp18.setText("Target/Hr");

        qtyLabel12.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel12.setName("j1800"); // NOI18N

        lblTelp19.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp19.setText("8:45");

        lblTelp20.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp20.setText("14:15");

        lblTelp21.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp21.setText("18:00");

        lblTelp22.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp22.setText("9:30");

        qtyLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel3.setName("j0930"); // NOI18N
        qtyLabel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyLabel3ActionPerformed(evt);
            }
        });

        lblTelp23.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp23.setText("15:00");

        qtyLabel15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel15.setName("j1500"); // NOI18N

        lblTelp24.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp24.setText("19:45");

        qtyLabel16.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel16.setName("j1945"); // NOI18N

        lblTelp25.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp25.setText("10:15");

        qtyLabel7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel7.setName("j1015"); // NOI18N
        qtyLabel7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyLabel7ActionPerformed(evt);
            }
        });

        lblTelp26.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp26.setText("15:45");

        qtyLabel17.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel17.setName("j1545"); // NOI18N

        lblTelp27.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp27.setText("20:30");

        qtyLabel18.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel18.setName("j2030"); // NOI18N

        lblTelp28.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp28.setText("11:00");

        qtyLabel19.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel19.setName("j1100"); // NOI18N
        qtyLabel19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyLabel19ActionPerformed(evt);
            }
        });

        lblTelp29.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp29.setText("16:30");

        qtyLabel20.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel20.setName("j1630"); // NOI18N

        lblTelp30.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp30.setText("21:15");

        qtyLabel21.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel21.setName("j2115"); // NOI18N

        lblTelp31.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp31.setText("11:45");

        qtyLabel22.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel22.setName("j1145"); // NOI18N
        qtyLabel22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyLabel22ActionPerformed(evt);
            }
        });

        lblTelp32.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp32.setText("17:15");

        qtyLabel23.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel23.setName("j1715"); // NOI18N

        lblTelp33.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp33.setText("22:00");

        qtyLabel24.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel24.setName("j2200"); // NOI18N

        lblTelp34.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp34.setText("GrandTotal");

        itemidLabel4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel4.setName("GrandTotal"); // NOI18N

        lblTelp35.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp35.setText("BLC");

        itemidLabel5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel5.setName("BLC"); // NOI18N

        lblTelp36.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblTelp36.setText("Jumlah Pekerja");

        lblTelp11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp11.setText("OPRAbsent");

        lblTelp37.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp37.setText("HPAbsent");

        LblStyle.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblStyle.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblStyle.setName("Style"); // NOI18N

        lblTelp38.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp38.setText("13:30");

        qtyLabel25.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel25.setName("j1330"); // NOI18N
        qtyLabel25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyLabel25ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp19)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp22)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp25)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp28)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp31))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(qtyLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(qtyLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(qtyLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(qtyLabel19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(qtyLabel22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(28, 28, 28)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp20)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp23)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp26)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp29)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp32))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(qtyLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(qtyLabel15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(qtyLabel17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(qtyLabel20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(qtyLabel23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp21)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp24)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp27)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp30)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp33))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(qtyLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(qtyLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(qtyLabel18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(qtyLabel21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(qtyLabel24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(lblTelp17))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(114, 114, 114)
                        .add(lblTelp18)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(qtyLabel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(43, 43, 43)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblID)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblID1)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblNama)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp1)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(LblPRID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(LblPRNo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(jButton2))
                                .add(system_user_id1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(ID, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(penerimaCb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 276, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(LblStyle, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(102, 102, 102)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(itemidLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(itemidLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(itemidLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp15)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp34)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp35))
                            .add(lblTelp36)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(lblTelp12)
                                .add(13, 13, 13)
                                .add(qtyLabel9))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(lblTelp8)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(qtyLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblTelp11)
                            .add(lblTelp37))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(qtyLabel10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .add(qtyLabel11)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(vl)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblAuditUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 276, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(lblNama1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(createdbyLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 276, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(lblTelp38)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(qtyLabel25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .add(LblPRID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblPRNo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblTelp1)
                    .add(LblStyle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(penerimaCb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblTelp17)
                .add(8, 8, 8)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(qtyLabel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp18))
                .add(27, 27, 27)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp21)
                    .add(qtyLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(qtyLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp20)
                    .add(qtyLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp19))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp24)
                    .add(qtyLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(qtyLabel15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp23)
                    .add(qtyLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp22))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp27)
                    .add(qtyLabel18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(qtyLabel17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp26)
                    .add(qtyLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp25))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp30)
                    .add(qtyLabel21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(qtyLabel20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp29)
                    .add(qtyLabel19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp28))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp33)
                    .add(qtyLabel24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(qtyLabel23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp32)
                    .add(qtyLabel22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp31))
                .add(5, 5, 5)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(qtyLabel25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp38))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                            .add(itemidLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(lblTelp15))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                            .add(lblTelp34)
                            .add(itemidLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(2, 2, 2)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                            .add(lblTelp35)
                            .add(itemidLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(6, 6, 6)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(lblTelp36)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(lblTelp8)
                                    .add(qtyLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(lblTelp11)
                                    .add(qtyLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(lblTelp12)
                                .add(1, 1, 1))
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(qtyLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(lblTelp37)
                                .add(qtyLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(33, 33, 33)
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
                .add(0, 5, Short.MAX_VALUE))
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

    private void qtyLabel22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyLabel22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyLabel22ActionPerformed

    private void qtyLabel19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyLabel19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyLabel19ActionPerformed

    private void qtyLabel7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyLabel7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyLabel7ActionPerformed

    private void qtyLabel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyLabel3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyLabel3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
            ProdRecBrowserClass PRBrowser = new ProdRecBrowserClass(
                configuration, log, new javax.swing.JTable(), this );

            PRBrowser.initializeTable();

            selectDialogClass selector = new selectDialogClass(
                configuration, log, this, PRBrowser, "Select Production Record" );

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

                LblPRID.setText( Long.toString(parentID) );

                persistentObjectManagerClass persistentObjectManager =
                new persistentObjectManagerClass( configuration, log );

                ProdRecClass pr = new ProdRecClass();

                pr = (ProdRecClass) persistentObjectManager.copy4( parentID, ProdRecClass.class );

                LblPRID.setText(Long.toString(pr.getId()));
                LblPRNo.setText(pr.getPrno());
                LblStyle.setText(pr.getStyle());

            }

        }
        catch( Exception error	){
            log.log( this, KMetaUtilsClass.getStackTrace( error ) );
            KMetaUtilsClass.showErrorMessageFromException( this, error );
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void penerimaCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penerimaCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penerimaCbActionPerformed

    private void qtyLabel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyLabel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyLabel2ActionPerformed

    private void qtyLabel25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyLabel25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyLabel25ActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel LblAuditUser;
    private javax.swing.JLabel LblPRID;
    private javax.swing.JLabel LblPRNo;
    private javax.swing.JLabel LblStyle;
    private javax.swing.JButton applyButton;
    private javax.swing.ButtonGroup clientDiscountGroup;
    private javax.swing.JLabel createdbyLbl;
    private javax.swing.JLabel itemidLabel3;
    private javax.swing.JLabel itemidLabel4;
    private javax.swing.JLabel itemidLabel5;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNama1;
    private javax.swing.JLabel lblTelp;
    private javax.swing.JLabel lblTelp1;
    private javax.swing.JLabel lblTelp11;
    private javax.swing.JLabel lblTelp12;
    private javax.swing.JLabel lblTelp15;
    private javax.swing.JLabel lblTelp17;
    private javax.swing.JLabel lblTelp18;
    private javax.swing.JLabel lblTelp19;
    private javax.swing.JLabel lblTelp20;
    private javax.swing.JLabel lblTelp21;
    private javax.swing.JLabel lblTelp22;
    private javax.swing.JLabel lblTelp23;
    private javax.swing.JLabel lblTelp24;
    private javax.swing.JLabel lblTelp25;
    private javax.swing.JLabel lblTelp26;
    private javax.swing.JLabel lblTelp27;
    private javax.swing.JLabel lblTelp28;
    private javax.swing.JLabel lblTelp29;
    private javax.swing.JLabel lblTelp30;
    private javax.swing.JLabel lblTelp31;
    private javax.swing.JLabel lblTelp32;
    private javax.swing.JLabel lblTelp33;
    private javax.swing.JLabel lblTelp34;
    private javax.swing.JLabel lblTelp35;
    private javax.swing.JLabel lblTelp36;
    private javax.swing.JLabel lblTelp37;
    private javax.swing.JLabel lblTelp38;
    private javax.swing.JLabel lblTelp8;
    private javax.swing.JButton okButton;
    private javax.swing.JComboBox penerimaCb;
    private javax.swing.JTextField qtyLabel10;
    private javax.swing.JTextField qtyLabel11;
    private javax.swing.JTextField qtyLabel12;
    private javax.swing.JTextField qtyLabel14;
    private javax.swing.JTextField qtyLabel15;
    private javax.swing.JTextField qtyLabel16;
    private javax.swing.JTextField qtyLabel17;
    private javax.swing.JTextField qtyLabel18;
    private javax.swing.JTextField qtyLabel19;
    private javax.swing.JTextField qtyLabel2;
    private javax.swing.JTextField qtyLabel20;
    private javax.swing.JTextField qtyLabel21;
    private javax.swing.JTextField qtyLabel22;
    private javax.swing.JTextField qtyLabel23;
    private javax.swing.JTextField qtyLabel24;
    private javax.swing.JTextField qtyLabel25;
    private javax.swing.JTextField qtyLabel3;
    private javax.swing.JTextField qtyLabel6;
    private javax.swing.JTextField qtyLabel7;
    private javax.swing.JTextField qtyLabel8;
    private javax.swing.JTextField qtyLabel9;
    private javax.swing.JLabel system_user_id1;
    private javax.swing.JLabel vl;
    // End of variables declaration//GEN-END:variables


    
    
}
