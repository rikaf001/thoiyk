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
import ProblemDomainComponent.v_PRItemClass;
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
    private CuttingDailyRepDtlSizeBrowserClass             browser;  

    
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
/*
 * @Override   
    public void setupTables( long id )
    throws KExceptionClass
    {
                       
        
                        
    }
   */  
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
        LblQtyRatio = new javax.swing.JTextField();
        lblTelp3 = new javax.swing.JLabel();
        lblTelp4 = new javax.swing.JLabel();
        lblTelp11 = new javax.swing.JLabel();
        LblLayer = new javax.swing.JTextField();
        lblTelp17 = new javax.swing.JLabel();
        cbMarker = new javax.swing.JComboBox();
        itemidLabel1 = new javax.swing.JLabel();
        itemidLabel2 = new javax.swing.JLabel();
        itemidLabel4 = new javax.swing.JLabel();
        lblTelp18 = new javax.swing.JLabel();
        itemidLabel5 = new javax.swing.JLabel();
        lblTelp19 = new javax.swing.JLabel();
        lblTelp20 = new javax.swing.JLabel();
        LblYard = new javax.swing.JTextField();
        LblInch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        LblItemName = new javax.swing.JLabel();
        lblNama2 = new javax.swing.JLabel();
        LblColour = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        itemidLabel3 = new javax.swing.JLabel();
        itemidLabel7 = new javax.swing.JLabel();
        itemidLabel8 = new javax.swing.JLabel();
        itemidLabel9 = new javax.swing.JLabel();
        itemidLabel10 = new javax.swing.JLabel();
        itemidLabel11 = new javax.swing.JLabel();
        itemidLabel12 = new javax.swing.JLabel();
        itemidLabel13 = new javax.swing.JLabel();
        itemidLabel14 = new javax.swing.JLabel();
        itemidLabel15 = new javax.swing.JLabel();
        itemidLabel16 = new javax.swing.JLabel();
        itemidLabel17 = new javax.swing.JLabel();
        itemidLabel18 = new javax.swing.JLabel();
        itemidLabel19 = new javax.swing.JLabel();
        itemidLabel20 = new javax.swing.JLabel();
        lblTelp2 = new javax.swing.JLabel();
        LblYard1 = new javax.swing.JTextField();
        LblYard2 = new javax.swing.JTextField();
        LblYard3 = new javax.swing.JTextField();
        LblYard4 = new javax.swing.JTextField();
        LblYard5 = new javax.swing.JTextField();
        LblYard6 = new javax.swing.JTextField();
        LblYard7 = new javax.swing.JTextField();
        LblYard8 = new javax.swing.JTextField();
        LblYard9 = new javax.swing.JTextField();
        LblYard10 = new javax.swing.JTextField();
        LblYard11 = new javax.swing.JTextField();
        LblYard12 = new javax.swing.JTextField();
        LblYard13 = new javax.swing.JTextField();
        LblYard14 = new javax.swing.JTextField();
        LblYard15 = new javax.swing.JTextField();
        lblTelp5 = new javax.swing.JLabel();
        lblTelp6 = new javax.swing.JLabel();
        LblYard16 = new javax.swing.JTextField();
        LblYard17 = new javax.swing.JTextField();
        LblYard18 = new javax.swing.JTextField();
        LblYard19 = new javax.swing.JTextField();
        LblYard20 = new javax.swing.JTextField();
        LblYard21 = new javax.swing.JTextField();
        LblYard22 = new javax.swing.JTextField();
        LblYard23 = new javax.swing.JTextField();
        LblYard24 = new javax.swing.JTextField();
        LblYard25 = new javax.swing.JTextField();
        LblYard26 = new javax.swing.JTextField();
        LblYard27 = new javax.swing.JTextField();
        LblYard28 = new javax.swing.JTextField();
        LblYard29 = new javax.swing.JTextField();
        LblYard30 = new javax.swing.JTextField();
        lblTelp7 = new javax.swing.JLabel();
        LblYard31 = new javax.swing.JTextField();
        LblYard32 = new javax.swing.JTextField();
        LblYard33 = new javax.swing.JTextField();
        LblYard34 = new javax.swing.JTextField();
        LblYard35 = new javax.swing.JTextField();
        LblYard36 = new javax.swing.JTextField();
        LblYard37 = new javax.swing.JTextField();
        LblYard38 = new javax.swing.JTextField();
        LblYard39 = new javax.swing.JTextField();
        LblYard40 = new javax.swing.JTextField();
        LblYard41 = new javax.swing.JTextField();
        LblYard42 = new javax.swing.JTextField();
        LblYard43 = new javax.swing.JTextField();
        LblYard44 = new javax.swing.JTextField();
        LblYard45 = new javax.swing.JTextField();
        itemidLabel6 = new javax.swing.JLabel();
        LblFabricType = new javax.swing.JLabel();
        lblNama3 = new javax.swing.JLabel();
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

        LblQtyRatio.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblQtyRatio.setName("TtlQtyRatio"); // NOI18N

        lblTelp3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp3.setText("Total Cut");

        lblTelp4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp4.setText("Total Fabric Used");

        lblTelp11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp11.setText("Marker Lenght");

        LblLayer.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblLayer.setName("Layer"); // NOI18N

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

        LblYard.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard.setName("Yard"); // NOI18N

        LblInch.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblInch.setName("Inch"); // NOI18N
        LblInch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LblInchActionPerformed(evt);
            }
        });

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

        lblNama2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblNama2.setText("Colour");

        LblColour.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblColour.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblColour.setName("Colour"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Size"));
        jPanel2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N

        itemidLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel3.setName("Size1"); // NOI18N

        itemidLabel7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel7.setName("Size2"); // NOI18N

        itemidLabel8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel8.setName("Size3"); // NOI18N

        itemidLabel9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel9.setName("Size4"); // NOI18N

        itemidLabel10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel10.setName("Size5"); // NOI18N

        itemidLabel11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel11.setName("Size6"); // NOI18N

        itemidLabel12.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel12.setName("Size7"); // NOI18N

        itemidLabel13.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel13.setName("Size8"); // NOI18N

        itemidLabel14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel14.setName("Size9"); // NOI18N

        itemidLabel15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel15.setName("Size10"); // NOI18N

        itemidLabel16.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel16.setName("Size11"); // NOI18N

        itemidLabel17.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel17.setName("Size12"); // NOI18N

        itemidLabel18.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel18.setName("Size13"); // NOI18N

        itemidLabel19.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel19.setName("Size14"); // NOI18N

        itemidLabel20.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel20.setName("Size15"); // NOI18N

        lblTelp2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp2.setText("Size");

        LblYard1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard1.setName("SLayer1"); // NOI18N

        LblYard2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard2.setName("SLayer2"); // NOI18N

        LblYard3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard3.setName("SLayer3"); // NOI18N

        LblYard4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard4.setName("SLayer4"); // NOI18N

        LblYard5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard5.setName("SLayer5"); // NOI18N

        LblYard6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard6.setName("SLayer6"); // NOI18N

        LblYard7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard7.setName("SLayer7"); // NOI18N

        LblYard8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard8.setName("SLayer8"); // NOI18N

        LblYard9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard9.setName("SLayer9"); // NOI18N

        LblYard10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard10.setName("SLayer10"); // NOI18N

        LblYard11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard11.setName("SLayer11"); // NOI18N

        LblYard12.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard12.setName("SLayer12"); // NOI18N

        LblYard13.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard13.setName("SLayer13"); // NOI18N

        LblYard14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard14.setName("SLayer14"); // NOI18N

        LblYard15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard15.setName("SLayer15"); // NOI18N

        lblTelp5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp5.setText("Layer");

        lblTelp6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp6.setText("Size Ratio");

        LblYard16.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard16.setName("SRatio1"); // NOI18N

        LblYard17.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard17.setName("SRatio2"); // NOI18N

        LblYard18.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard18.setName("SRatio3"); // NOI18N

        LblYard19.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard19.setName("SRatio4"); // NOI18N

        LblYard20.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard20.setName("SRatio5"); // NOI18N

        LblYard21.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard21.setName("SRatio6"); // NOI18N

        LblYard22.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard22.setName("SRatio7"); // NOI18N

        LblYard23.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard23.setName("SRatio8"); // NOI18N

        LblYard24.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard24.setName("SRatio9"); // NOI18N

        LblYard25.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard25.setName("SRatio10"); // NOI18N

        LblYard26.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard26.setName("SRatio11"); // NOI18N

        LblYard27.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard27.setName("SRatio12"); // NOI18N

        LblYard28.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard28.setName("SRatio13"); // NOI18N

        LblYard29.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard29.setName("SRatio14"); // NOI18N

        LblYard30.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard30.setName("SRatio15"); // NOI18N

        lblTelp7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblTelp7.setText("Size Breakdown");

        LblYard31.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard31.setName("SSDown1"); // NOI18N

        LblYard32.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard32.setName("SSDown2"); // NOI18N

        LblYard33.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard33.setName("SSDown3"); // NOI18N

        LblYard34.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard34.setName("SSDown4"); // NOI18N

        LblYard35.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard35.setName("SSDown5"); // NOI18N

        LblYard36.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard36.setName("SSDown6"); // NOI18N

        LblYard37.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard37.setName("SSDown7"); // NOI18N

        LblYard38.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard38.setName("SSDown8"); // NOI18N

        LblYard39.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard39.setName("SSDown9"); // NOI18N

        LblYard40.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard40.setName("SSDown10"); // NOI18N

        LblYard41.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard41.setName("SSDown11"); // NOI18N

        LblYard42.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard42.setName("SSDown12"); // NOI18N

        LblYard43.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard43.setName("SSDown13"); // NOI18N

        LblYard44.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard44.setName("SSDown14"); // NOI18N

        LblYard45.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblYard45.setName("SSDown15"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp2)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblTelp5))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(LblYard1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblYard2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblYard3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblYard4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblYard5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblYard6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblYard7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblYard8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblYard9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblYard10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblYard11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblYard12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblYard13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblYard14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblYard15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(itemidLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(itemidLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(itemidLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(itemidLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(itemidLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(itemidLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(itemidLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(itemidLabel13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(itemidLabel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(itemidLabel15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(itemidLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(itemidLabel17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(itemidLabel18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(itemidLabel19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(itemidLabel20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .add(lblTelp6)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(LblYard16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblYard17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblYard18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblYard19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblYard20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblYard21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblYard22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblYard23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblYard24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblYard25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblYard26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblYard27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblYard28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblYard29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblYard30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(lblTelp7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(LblYard31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(LblYard32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(LblYard33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(LblYard34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(LblYard35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(LblYard36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(LblYard37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(LblYard38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(LblYard39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(LblYard40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(LblYard41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(LblYard42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(LblYard43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(LblYard44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(LblYard45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(itemidLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(itemidLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(itemidLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(itemidLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(itemidLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(itemidLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(itemidLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(itemidLabel13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(itemidLabel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(itemidLabel15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(itemidLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(itemidLabel17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(itemidLabel18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(itemidLabel19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(itemidLabel20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(LblYard1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(LblYard16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp6))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(LblYard31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblYard45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTelp7))
                .add(0, 10, Short.MAX_VALUE))
        );

        itemidLabel6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        itemidLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel6.setName("SizeDtlID"); // NOI18N

        LblFabricType.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblFabricType.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblFabricType.setName("Tipe"); // NOI18N

        lblNama3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblNama3.setText("Type Fabric");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(lblID)
                            .add(lblNama)
                            .add(lblNama2)
                            .add(lblTelp)
                            .add(lblTelp1)
                            .add(lblTelp17)
                            .add(lblTelp19)
                            .add(lblTelp20)
                            .add(lblTelp3)
                            .add(lblTelp11)
                            .add(lblTelp4)
                            .add(lblTelp18)
                            .add(lblNama1)
                            .add(vl)
                            .add(lblNama3))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(itemidLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 227, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(itemidLabel6))
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, LblFabricType, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, cbMarker, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, LblQtyRatio)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, LblLayer)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                                    .add(LblItemID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(LblItemName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 202, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                                    .add(ID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(lblID1)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                    .add(LblHdrID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(org.jdesktop.layout.GroupLayout.LEADING, LblYard, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 227, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, LblInch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 227, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, itemidLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 227, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, itemidLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 227, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, itemidLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 227, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, createdbyLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 231, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, LblAuditUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 231, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, LblColour, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
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
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(LblFabricType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblNama3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 12, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblNama2)
                    .add(LblColour, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp)
                    .add(cbMarker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp1)
                    .add(LblQtyRatio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp17)
                    .add(LblLayer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp19)
                    .add(LblYard, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblTelp20)
                    .add(LblInch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .add(itemidLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(itemidLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
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
                .add(applyButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
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
                persistentObjectManagerClass POM7 = new persistentObjectManagerClass(configuration, log);
                v_PRItemClass PRItem = new v_PRItemClass();
                PRItem = ( v_PRItemClass ) POM7.copy4( (Long) parentID, v_PRItemClass.class );

           
                LblItemID.setText(String.valueOf(parentID));                
                LblItemName.setText(PRItem.getNama());
                LblFabricType.setText(PRItem.getTipe());
                LblColour.setText(PRItem.getWarna());
                
                
            }

        }
        catch( Exception error	){
            log.log( this, KMetaUtilsClass.getStackTrace( error ) );
            KMetaUtilsClass.showErrorMessageFromException( this, error );
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LblInchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LblInchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LblInchActionPerformed

    private void cbMarkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMarkerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMarkerActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel LblAuditUser;
    private javax.swing.JLabel LblColour;
    private javax.swing.JLabel LblFabricType;
    private javax.swing.JLabel LblHdrID;
    private javax.swing.JTextField LblInch;
    private javax.swing.JLabel LblItemID;
    private javax.swing.JLabel LblItemName;
    private javax.swing.JTextField LblLayer;
    private javax.swing.JTextField LblQtyRatio;
    private javax.swing.JTextField LblYard;
    private javax.swing.JTextField LblYard1;
    private javax.swing.JTextField LblYard10;
    private javax.swing.JTextField LblYard11;
    private javax.swing.JTextField LblYard12;
    private javax.swing.JTextField LblYard13;
    private javax.swing.JTextField LblYard14;
    private javax.swing.JTextField LblYard15;
    private javax.swing.JTextField LblYard16;
    private javax.swing.JTextField LblYard17;
    private javax.swing.JTextField LblYard18;
    private javax.swing.JTextField LblYard19;
    private javax.swing.JTextField LblYard2;
    private javax.swing.JTextField LblYard20;
    private javax.swing.JTextField LblYard21;
    private javax.swing.JTextField LblYard22;
    private javax.swing.JTextField LblYard23;
    private javax.swing.JTextField LblYard24;
    private javax.swing.JTextField LblYard25;
    private javax.swing.JTextField LblYard26;
    private javax.swing.JTextField LblYard27;
    private javax.swing.JTextField LblYard28;
    private javax.swing.JTextField LblYard29;
    private javax.swing.JTextField LblYard3;
    private javax.swing.JTextField LblYard30;
    private javax.swing.JTextField LblYard31;
    private javax.swing.JTextField LblYard32;
    private javax.swing.JTextField LblYard33;
    private javax.swing.JTextField LblYard34;
    private javax.swing.JTextField LblYard35;
    private javax.swing.JTextField LblYard36;
    private javax.swing.JTextField LblYard37;
    private javax.swing.JTextField LblYard38;
    private javax.swing.JTextField LblYard39;
    private javax.swing.JTextField LblYard4;
    private javax.swing.JTextField LblYard40;
    private javax.swing.JTextField LblYard41;
    private javax.swing.JTextField LblYard42;
    private javax.swing.JTextField LblYard43;
    private javax.swing.JTextField LblYard44;
    private javax.swing.JTextField LblYard45;
    private javax.swing.JTextField LblYard5;
    private javax.swing.JTextField LblYard6;
    private javax.swing.JTextField LblYard7;
    private javax.swing.JTextField LblYard8;
    private javax.swing.JTextField LblYard9;
    private javax.swing.JButton applyButton;
    private javax.swing.JComboBox cbMarker;
    private javax.swing.ButtonGroup clientDiscountGroup;
    private javax.swing.JLabel createdbyLbl;
    private javax.swing.JLabel itemidLabel1;
    private javax.swing.JLabel itemidLabel10;
    private javax.swing.JLabel itemidLabel11;
    private javax.swing.JLabel itemidLabel12;
    private javax.swing.JLabel itemidLabel13;
    private javax.swing.JLabel itemidLabel14;
    private javax.swing.JLabel itemidLabel15;
    private javax.swing.JLabel itemidLabel16;
    private javax.swing.JLabel itemidLabel17;
    private javax.swing.JLabel itemidLabel18;
    private javax.swing.JLabel itemidLabel19;
    private javax.swing.JLabel itemidLabel2;
    private javax.swing.JLabel itemidLabel20;
    private javax.swing.JLabel itemidLabel3;
    private javax.swing.JLabel itemidLabel4;
    private javax.swing.JLabel itemidLabel5;
    private javax.swing.JLabel itemidLabel6;
    private javax.swing.JLabel itemidLabel7;
    private javax.swing.JLabel itemidLabel8;
    private javax.swing.JLabel itemidLabel9;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNama1;
    private javax.swing.JLabel lblNama2;
    private javax.swing.JLabel lblNama3;
    private javax.swing.JLabel lblTelp;
    private javax.swing.JLabel lblTelp1;
    private javax.swing.JLabel lblTelp11;
    private javax.swing.JLabel lblTelp17;
    private javax.swing.JLabel lblTelp18;
    private javax.swing.JLabel lblTelp19;
    private javax.swing.JLabel lblTelp2;
    private javax.swing.JLabel lblTelp20;
    private javax.swing.JLabel lblTelp3;
    private javax.swing.JLabel lblTelp4;
    private javax.swing.JLabel lblTelp5;
    private javax.swing.JLabel lblTelp6;
    private javax.swing.JLabel lblTelp7;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel vl;
    // End of variables declaration//GEN-END:variables

    

    
@Override
    public void setupTables(long id) throws KExceptionClass {

      }
    
}
