/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */

package thoiyk.HumanInterfaceComponent.CuttingDailyRepDtl;


// k
import KFramework30.Base.*;
import KFramework30.Communication.persistentObjectManagerClass;
import KFramework30.Widgets.KDialogControllerClass;

//app
import KFramework30.Widgets.KDialogControllerClass.KDialogInterface;
import KFramework30.Widgets.KDropDownFillerClass;
import KFramework30.Widgets.selectDialogClass;
import ProblemDomainComponent.CuttingDailyRepDtlClass;
import ProblemDomainComponent.CuttingDailyRepHdrClass;
import ProblemDomainComponent.ProdRecItemClass;
import ProblemDomainComponent.v_PRSizeItemClass;
import ProblemDomainComponent.v_SR_ItemClass;
//import ProblemDomainComponent.productionrecordClass;
import java.util.Map;
import thoiyk.HumanInterfaceComponent.v_PRAllItem.v_PRAllItemBrowserClass;
import thoiyk.HumanInterfaceComponent.v_PRSizeItem.v_PRSizeItemBrowserClass;
//import thoiyk.HumanInterfaceComponent.PurchaseOrder.PurchaseOrderBrowserClass;

// rtl


public class CuttingDailyRepDtlEditDialogClass 
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
    public CuttingDailyRepDtlEditDialogClass( 
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
                CuttingDailyRepDtlClass.class, this, getContentPane() );        
                            
    }
    
    
    public void initializeDialog(int dialogModeParam, Long ID, Map foreingKeys ) throws KExceptionClass {
        
       KDropDownFillerClass typeComboFiller1 = new KDropDownFillerClass(
        configuration, log, 
        //SQL, might have parameters and where clause or order by
        " select ID,  NAMA from MARKER ",
        "ID", cbMarker, "MarkerID"
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
        jPanel1 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        lblTelp = new javax.swing.JLabel();
        LblHdrID = new javax.swing.JLabel();
        lblID1 = new javax.swing.JLabel();
        LblItemID = new javax.swing.JLabel();
        lblNama1 = new javax.swing.JLabel();
        createdbyLbl = new javax.swing.JLabel();
        vl = new javax.swing.JLabel();
        LblAuditUser = new javax.swing.JLabel();
        lblTelp1 = new javax.swing.JLabel();
        qtyLabel1 = new javax.swing.JTextField();
        lblTelp3 = new javax.swing.JLabel();
        lblTelp4 = new javax.swing.JLabel();
        lblTelp5 = new javax.swing.JLabel();
        qtyLabel4 = new javax.swing.JTextField();
        lblTelp6 = new javax.swing.JLabel();
        lblTelp7 = new javax.swing.JLabel();
        qtyLabel5 = new javax.swing.JTextField();
        lblTelp8 = new javax.swing.JLabel();
        qtyLabel6 = new javax.swing.JTextField();
        lblTelp12 = new javax.swing.JLabel();
        qtyLabel9 = new javax.swing.JTextField();
        lblTelp13 = new javax.swing.JLabel();
        qtyLabel10 = new javax.swing.JTextField();
        lblTelp14 = new javax.swing.JLabel();
        qtyLabel11 = new javax.swing.JTextField();
        lblTelp11 = new javax.swing.JLabel();
        lblTelp16 = new javax.swing.JLabel();
        qtyLabel13 = new javax.swing.JTextField();
        qtyLabel14 = new javax.swing.JTextField();
        lblTelp17 = new javax.swing.JLabel();
        cbMarker = new javax.swing.JComboBox();
        itemidLabel1 = new javax.swing.JLabel();
        itemidLabel2 = new javax.swing.JLabel();
        itemidLabel4 = new javax.swing.JLabel();
        lblTelp18 = new javax.swing.JLabel();
        itemidLabel5 = new javax.swing.JLabel();
        lblTelp19 = new javax.swing.JLabel();
        lblTelp20 = new javax.swing.JLabel();
        qtyLabel3 = new javax.swing.JTextField();
        qtyLabel15 = new javax.swing.JTextField();
        LblXS = new javax.swing.JLabel();
        LblS = new javax.swing.JLabel();
        LblM = new javax.swing.JLabel();
        LblL = new javax.swing.JLabel();
        Lbl3XL = new javax.swing.JLabel();
        LblXXL = new javax.swing.JLabel();
        LblXL = new javax.swing.JLabel();
        lblTelp21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        LblItemName = new javax.swing.JLabel();
        lblTelp22 = new javax.swing.JLabel();
        qtyLabel16 = new javax.swing.JTextField();
        lblNama2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        LblColour = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cutting Daily Report Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 10))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        lblID.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblID.setText("ID");

        ID.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        ID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ID.setName("ID"); // NOI18N

        lblNama.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblNama.setText("ItemID");

        lblTelp.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp.setText("Marker");

        LblHdrID.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblHdrID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblHdrID.setName("HdrID"); // NOI18N

        lblID1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblID1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblID1.setText("HDRID");

        LblItemID.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblItemID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblItemID.setName("ItemID"); // NOI18N

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
        lblTelp1.setText("Total Qty Ratio");

        qtyLabel1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel1.setName("TtlQtyRatio"); // NOI18N

        lblTelp3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp3.setText("Total Cut");

        lblTelp4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp4.setText("Total Fabric Used");

        lblTelp5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp5.setText("XS");

        qtyLabel4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel4.setName("LXS"); // NOI18N

        lblTelp6.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblTelp6.setText("Size");

        lblTelp7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp7.setText("S");

        qtyLabel5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel5.setName("LS"); // NOI18N

        lblTelp8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp8.setText("L");

        qtyLabel6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel6.setName("LL"); // NOI18N

        lblTelp12.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp12.setText("XL");

        qtyLabel9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel9.setName("LXL"); // NOI18N

        lblTelp13.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp13.setText("XXL");

        qtyLabel10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel10.setName("LXXL"); // NOI18N

        lblTelp14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp14.setText("3XL");

        qtyLabel11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel11.setName("LXXXL"); // NOI18N

        lblTelp11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp11.setText("Marker Lenght");

        lblTelp16.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp16.setText("M");

        qtyLabel13.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel13.setName("LM"); // NOI18N

        qtyLabel14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel14.setName("Layer"); // NOI18N

        lblTelp17.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp17.setText("Layer");

        cbMarker.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cbMarker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "???" }));
        cbMarker.setName("TypeIDSelect"); // NOI18N
        cbMarker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMarkerActionPerformed(evt);
            }
        });

        itemidLabel1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel1.setName("TotalFabricUsed"); // NOI18N

        itemidLabel2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel2.setName("TotalCut"); // NOI18N

        itemidLabel4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel4.setName("MarkerLenght"); // NOI18N

        lblTelp18.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp18.setText("Yy");

        itemidLabel5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel5.setName("Yy"); // NOI18N

        lblTelp19.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp19.setText("Yard");

        lblTelp20.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp20.setText("Inch");

        qtyLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel3.setName("Yard"); // NOI18N

        qtyLabel15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel15.setName("Inch"); // NOI18N
        qtyLabel15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyLabel15ActionPerformed(evt);
            }
        });

        LblXS.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblXS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblXS.setName("XS"); // NOI18N

        LblS.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS.setName("S"); // NOI18N

        LblM.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblM.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblM.setName("M"); // NOI18N

        LblL.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblL.setName("L"); // NOI18N

        Lbl3XL.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Lbl3XL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Lbl3XL.setName("XXXL"); // NOI18N

        LblXXL.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblXXL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblXXL.setName("XXL"); // NOI18N

        LblXL.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblXL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblXL.setName("XL"); // NOI18N

        lblTelp21.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        lblTelp21.setText("Layer");

        jButton1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        LblItemName.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblItemName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblItemName.setName("ItemName"); // NOI18N

        lblTelp22.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp22.setText("Layer");

        qtyLabel16.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLabel16.setName("Layer"); // NOI18N

        lblNama2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblNama2.setText("Colour");

        jButton2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        LblColour.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblColour.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblColour.setName("Colour"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblID)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblNama)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblNama2)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp22)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp1)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp17)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp19)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp20)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp3)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp11)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp4)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp18)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp5)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp7)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp16)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp8)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp12)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp13)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp14)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, lblNama1)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, vl))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cbMarker, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(qtyLabel1)
                    .add(qtyLabel14)
                    .add(createdbyLbl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(LblAuditUser, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(LblItemID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblItemName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblColour, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(qtyLabel16)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(ID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(lblID1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(LblHdrID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(qtyLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 227, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(qtyLabel15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 227, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(itemidLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 227, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(itemidLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 227, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(itemidLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 227, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(itemidLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 227, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(LblXS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(LblS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(LblM, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(LblL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(LblXL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(LblXXL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(Lbl3XL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(lblTelp6))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(lblTelp21)
                                    .add(qtyLabel10)
                                    .add(qtyLabel9)
                                    .add(qtyLabel6)
                                    .add(qtyLabel13)
                                    .add(qtyLabel5)
                                    .add(qtyLabel4)
                                    .add(qtyLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(2, 2, 2)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(ID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblID1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblHdrID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(LblItemID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton1)
                    .add(LblItemName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblNama))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblNama2)
                    .add(jButton2)
                    .add(LblColour, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(qtyLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp22))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp)
                    .add(cbMarker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp1)
                    .add(qtyLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp17)
                    .add(qtyLabel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp19)
                    .add(qtyLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp20)
                    .add(qtyLabel15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 11, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblTelp3)
                    .add(itemidLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(itemidLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp11))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(itemidLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp18)
                    .add(itemidLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblTelp6)
                    .add(lblTelp21))
                .add(3, 3, 3)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp5)
                    .add(LblXS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(qtyLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp7)
                    .add(LblS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(qtyLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp16)
                    .add(LblM, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(qtyLabel13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp8)
                    .add(LblL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(qtyLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(7, 7, 7)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp12)
                    .add(LblXL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(qtyLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp13)
                    .add(LblXXL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(qtyLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp14)
                    .add(Lbl3XL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(qtyLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblNama1)
                    .add(createdbyLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(vl)
                    .add(LblAuditUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );

        okButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        CancelButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        applyButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        applyButton.setText("Apply"); // NOI18N
        applyButton.setName("applyButton"); // NOI18N
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

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
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(58, 58, 58)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {

            persistentObjectManagerClass POMHdr = new persistentObjectManagerClass(configuration, log);
            CuttingDailyRepHdrClass Hdr = new CuttingDailyRepHdrClass();
            Hdr = ( CuttingDailyRepHdrClass ) POMHdr.copy4( Long.decode(LblHdrID.getText()), CuttingDailyRepHdrClass.class );

            v_PRAllItemBrowserClass PRAllBrowser = new v_PRAllItemBrowserClass(
                configuration, log, new javax.swing.JTable(),1,Hdr.getPRID() , this );

            PRAllBrowser.initializeTable();

            selectDialogClass selector = new selectDialogClass(
                configuration, log, this, PRAllBrowser, "Select PR Item" );

            // dont want to allow this, for example
            selector.getNewButton().setEnabled(false);
            selector.getDeleteButton().setEnabled(false);
            parentID = selector.showDialog();

            if( parentID < 0 )
            {
                throw new KExceptionClass( "You must select a PR Item !", null);

            }
            else
            {

                // ---------------------------------------------------------------------
                // display the PR Item ID and Name
                persistentObjectManagerClass POM = new persistentObjectManagerClass(configuration, log);
                ProdRecItemClass PRItem = new ProdRecItemClass();
                PRItem = ( ProdRecItemClass ) POM.copy4( parentID, ProdRecItemClass.class );

                persistentObjectManagerClass POMSR = new persistentObjectManagerClass(configuration, log);
                v_SR_ItemClass SRItem = new v_SR_ItemClass();
                SRItem = ( v_SR_ItemClass ) POMSR.copy4( PRItem.getItemid(), v_SR_ItemClass.class );

                LblItemID.setText(String.valueOf(PRItem.getItemid()));
                
                LblItemName.setText(SRItem.getNama());

/*
                persistentObjectManagerClass POM = new persistentObjectManagerClass(configuration, log);
                buyerClass buyer = new buyerClass();
                buyer = ( buyerClass ) POM.copy4( parentID, buyerClass.class );

                LblBuyerID.setText( Long.toString(buyer.getId()) );
                LblBuyerName.setText( buyer.getNama() );
                // ---------------------------------------------------------------------
                */
            }

        }
        catch( Exception error	){
            log.log( this, KMetaUtilsClass.getStackTrace( error ) );
            KMetaUtilsClass.showErrorMessageFromException( this, error );
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void qtyLabel15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyLabel15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyLabel15ActionPerformed

    private void cbMarkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMarkerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMarkerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
            
            persistentObjectManagerClass POMHdr = new persistentObjectManagerClass(configuration, log);
            CuttingDailyRepHdrClass Hdr = new CuttingDailyRepHdrClass();
            Hdr = ( CuttingDailyRepHdrClass ) POMHdr.copy4( Long.decode(LblHdrID.getText()), CuttingDailyRepHdrClass.class );
            
            v_PRSizeItemBrowserClass PRSizeBrowser = new v_PRSizeItemBrowserClass(
                configuration, log, new javax.swing.JTable(),1,Hdr.getPRID(), this );

            PRSizeBrowser.initializeTable();

            selectDialogClass selector = new selectDialogClass(
                configuration, log, this, PRSizeBrowser, "Select PR Size Item" );

            // dont want to allow this, for example
            selector.getNewButton().setEnabled(false);
            selector.getDeleteButton().setEnabled(false);
            parentID = selector.showDialog();

            if( parentID < 0 )
            {
                throw new KExceptionClass( "You must select a PR Size Item !", null);

            }
            else
            {
                persistentObjectManagerClass POMSize = new persistentObjectManagerClass(configuration, log);
                v_PRSizeItemClass PRSize = new v_PRSizeItemClass();
                PRSize = ( v_PRSizeItemClass ) POMSize.copy4( parentID, v_PRSizeItemClass.class );

                LblColour.setText(PRSize.getWarna());
                
                LblXS.setText(String.valueOf(PRSize.getXS()));
                LblS.setText(String.valueOf(PRSize.getS()));
                LblM.setText(String.valueOf(PRSize.getM()));
                LblL.setText(String.valueOf(PRSize.getL()));
                LblXL.setText(String.valueOf(PRSize.getXL()));
                LblXXL.setText(String.valueOf(PRSize.getXXL()));
                Lbl3XL.setText(String.valueOf(PRSize.getXXXL()));
                // ---------------------------------------------------------------------
                // display the buyer name
/*
                persistentObjectManagerClass POM = new persistentObjectManagerClass(configuration, log);
                buyerClass buyer = new buyerClass();
                buyer = ( buyerClass ) POM.copy4( parentID, buyerClass.class );

                LblBuyerID.setText( Long.toString(buyer.getId()) );
                LblBuyerName.setText( buyer.getNama() );
                // ---------------------------------------------------------------------
                */
            }

        }
        catch( Exception error	){
            log.log( this, KMetaUtilsClass.getStackTrace( error ) );
            KMetaUtilsClass.showErrorMessageFromException( this, error );
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Lbl3XL;
    private javax.swing.JLabel LblAuditUser;
    private javax.swing.JLabel LblColour;
    private javax.swing.JLabel LblHdrID;
    private javax.swing.JLabel LblItemID;
    private javax.swing.JLabel LblItemName;
    private javax.swing.JLabel LblL;
    private javax.swing.JLabel LblM;
    private javax.swing.JLabel LblS;
    private javax.swing.JLabel LblXL;
    private javax.swing.JLabel LblXS;
    private javax.swing.JLabel LblXXL;
    private javax.swing.JButton applyButton;
    private javax.swing.JComboBox cbMarker;
    private javax.swing.ButtonGroup clientDiscountGroup;
    private javax.swing.JLabel createdbyLbl;
    private javax.swing.JLabel itemidLabel1;
    private javax.swing.JLabel itemidLabel2;
    private javax.swing.JLabel itemidLabel4;
    private javax.swing.JLabel itemidLabel5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNama1;
    private javax.swing.JLabel lblNama2;
    private javax.swing.JLabel lblTelp;
    private javax.swing.JLabel lblTelp1;
    private javax.swing.JLabel lblTelp11;
    private javax.swing.JLabel lblTelp12;
    private javax.swing.JLabel lblTelp13;
    private javax.swing.JLabel lblTelp14;
    private javax.swing.JLabel lblTelp16;
    private javax.swing.JLabel lblTelp17;
    private javax.swing.JLabel lblTelp18;
    private javax.swing.JLabel lblTelp19;
    private javax.swing.JLabel lblTelp20;
    private javax.swing.JLabel lblTelp21;
    private javax.swing.JLabel lblTelp22;
    private javax.swing.JLabel lblTelp3;
    private javax.swing.JLabel lblTelp4;
    private javax.swing.JLabel lblTelp5;
    private javax.swing.JLabel lblTelp6;
    private javax.swing.JLabel lblTelp7;
    private javax.swing.JLabel lblTelp8;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField qtyLabel1;
    private javax.swing.JTextField qtyLabel10;
    private javax.swing.JTextField qtyLabel11;
    private javax.swing.JTextField qtyLabel13;
    private javax.swing.JTextField qtyLabel14;
    private javax.swing.JTextField qtyLabel15;
    private javax.swing.JTextField qtyLabel16;
    private javax.swing.JTextField qtyLabel3;
    private javax.swing.JTextField qtyLabel4;
    private javax.swing.JTextField qtyLabel5;
    private javax.swing.JTextField qtyLabel6;
    private javax.swing.JTextField qtyLabel9;
    private javax.swing.JLabel vl;
    // End of variables declaration//GEN-END:variables


    
    
}
