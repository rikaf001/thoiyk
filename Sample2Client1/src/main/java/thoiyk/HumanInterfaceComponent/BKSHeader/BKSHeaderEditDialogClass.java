/*
 * This source code is part of the Thoyik
 * Copyright (C) 2013  Yoserizal
 * Feedback / Bug Reports yoser174@gmail.com
 * 
 * 
 * This project used:
 * KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.BKSHeader;

/**
 *
 * @author yoserizy
 */

// rtl
import KFramework30.Base.*;
import KFramework30.Communication.dbTransactionClientClass;
import KFramework30.Communication.persistentObjectManagerClass;
import KFramework30.Printing.KPrintDataTableClass;
import KFramework30.Printing.KPrintJobClass;
import KFramework30.Printing.KPrintSectionClass;
import java.util.Map;

// app
import Sample1.UserCustomWidgets.JCalendarDemoWidgetAdapterClass;

// fwk
import KFramework30.Widgets.KDialogControllerClass;
import KFramework30.Widgets.KDialogControllerClass.KDialogInterface;
import KFramework30.Widgets.KDropDownFillerClass;
import KFramework30.Widgets.selectDialogClass;
import ProblemDomainComponent.BKSHeaderClass;
import ProblemDomainComponent.ServiceTypeClass;
import ProblemDomainComponent.PurchaseOrderClass;
import ProblemDomainComponent.samplerecordClass;
import ProblemDomainComponent.supplierClass;
import ProblemDomainComponent.v_PenerimaClass;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.print.PageFormat;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.util.HashMap;
import javax.swing.JDialog;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JRViewer;
import thoiyk.HumanInterfaceComponent.BKSDetail.BKSDetailBrowserClass;
import thoiyk.HumanInterfaceComponent.ProductionRecord.ProdRecBrowserSimpleClass;
import thoiyk.HumanInterfaceComponent.PurchaseOrder.PurchaseOrderApprovedBrowserClass;
import thoiyk.HumanInterfaceComponent.supplier.supplierBrowserClass;

public class BKSHeaderEditDialogClass 
extends javax.swing.JDialog
implements KDialogInterface, KDialogControllerClass.KDialogEventCallbackInterface
{
    
// uses
    private KConfigurationClass             configuration;
    private KLogClass                       log;
    private long                            parentID;
   
    // has defaulted   
    private BKSDetailBrowserClass             browser;   
    private KNonVisibleBinaryWidgetClass    productPictureRawDataContainer;
    private KDialogControllerClass            KDialogController;

    

    /** Creates new form facturaEditDialogClass */
    public BKSHeaderEditDialogClass( 
        KConfigurationClass configurationParam, KLogClass logParam, java.awt.Window parentWindow )
        throws KExceptionClass
{
        
        super( parentWindow, java.awt.Dialog.ModalityType.DOCUMENT_MODAL );
        initComponents ();
        pack ();
       // setSize( 630, 600 );
        KMetaUtilsClass.centerInScreen( this );
        
        // uses
        configuration = configurationParam;
        log = logParam;
        
        // has - defaulted     
        KDialogController = new KDialogControllerClass(                 
                configurationParam, logParam, 
                BKSHeaderClass.class, 
                this, getContentPane() );   
                         
        
        KDialogController.setEventCallback(this);


                            
    }
        
    
    public void initializeDialog(int dialogModeParam, Long ID, Map foreingKeys ) throws KExceptionClass {
        


               

        KDropDownFillerClass typeComboFiller2 = new KDropDownFillerClass(
                        configuration, log, 
                        //SQL, might have parameters and where clause or order by
                        " select ID,  NAME from SERVICETYPE ",
                        "ID", cbTipeService, "ServiceTypeID"
                        );

        typeComboFiller2.load();        
        
        KDialogController.addNonVisibleWidget( typeComboFiller2 );  // to map it  
        
        KDropDownFillerClass typeComboFiller3 = new KDropDownFillerClass(
                        configuration, log, 
                        //SQL, might have parameters and where clause or order by
                        " select ID,  NAMA from KODEKAWASAN ",
                        "ID", cbKawasan, "KawasanID"
                        );

        typeComboFiller3.load();        
        KDialogController.addNonVisibleWidget( typeComboFiller3 );  // to map it  
        
         KDropDownFillerClass typeComboFiller4 = new KDropDownFillerClass(
                        configuration, log, 
                        //SQL, might have parameters and where clause or order by
                        " select ID,  NAMA from JENISDOKPABEAN ",
                        "ID", cbJenisDok, "JenisDokID"
                        );

        typeComboFiller4.load();        
        KDialogController.addNonVisibleWidget( typeComboFiller4 );  // to map it           


        // dont forget to visually set the "name" property to the  field you want to map
        JCalendarDemoWidgetAdapterClass dateChooserAdapter = new JCalendarDemoWidgetAdapterClass( jDateChooser1, "Tanggal" );                
        KDialogController.includeCustomWidgetForMapping( dateChooserAdapter ); 
        JCalendarDemoWidgetAdapterClass dateChooserAdapter3 = new JCalendarDemoWidgetAdapterClass( jDateChooser3, "TanggalSelesai" );                
        KDialogController.includeCustomWidgetForMapping( dateChooserAdapter3 );                
        JCalendarDemoWidgetAdapterClass dateChooserAdapter4 = new JCalendarDemoWidgetAdapterClass( jDateChooser4, "TglBC" );                
        KDialogController.includeCustomWidgetForMapping( dateChooserAdapter4 );                
      
        //-------------------------------------------------------------                           

        // start
          KDialogController.initializeDialog( dialogModeParam, ID, null  );

        checkSecurity();
        

    }    

    
    
    //---------------------------------------------------------------------------    
    
    // called when a browser has a row changed ...    
    public void tableToolbarButtonClickedNotification( String action ) {
        
        try {
            
                //  .. since the total might have changed, do a reload of the invoice ->
                KDialogController.edit();
                // .. to load the new total which is controlled by the server
                // ... and avoid a record version changed error, for optimitic locking.
                            
        } catch (KExceptionClass error ) {
            
              // log error
              log.log( this, KMetaUtilsClass.getStackTrace( error ) );
              // show error message
              KMetaUtilsClass.showErrorMessageFromException( getOwner(), error );
        }
    }
    
    
    //---------------------------------------------------------------------------
    
    private void checkSecurity()
    throws KExceptionClass
    {
        
    }
        
    // called from browser when a user clicked save.....  for editable browsers, see client dialog for examples
    @Override        
    public void saveBrowserChanges() {     
    }    
    
    @Override
    public void setupTables(long id) throws KExceptionClass {

       
        browser = new BKSDetailBrowserClass( 
                //
                 configuration, log,
                POItemBrowserJTable,
                BKSDetailBrowserClass.POITEM_BY_PO, 
                id,
                
                 this );
                
        browser.initializeTable();
        
        // register me to be notified for actions on rows, see implement above -> tableToolbarButtonClickedNotification
//        browser.addButtonActionListener( this );
        
        //setup container button
        newButton.addActionListener( browser );
        deleteButton.addActionListener( browser );
        editButton.addActionListener( browser );        
        sortButton.addActionListener( browser );
        filterButton.addActionListener( browser );     
        printButton.addActionListener( browser );   
        refreshButton.addActionListener( browser );          
//        saveChangesButton1.addActionListener( browser );  

//        saveChangesButton1.setEnabled( true);        
//        newButton.setEnabled( true);
        deleteButton.setEnabled( true);
        editButton.setEnabled( true);        
        sortButton.setEnabled( true);
        filterButton.setEnabled( true);
        printButton.setEnabled( true);
        refreshButton.setEnabled( true); 
    }
    
    
    //----------------------------------------------------------------------
  
        
   

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        okButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        idLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        issuedbyLbl = new javax.swing.JLabel();
        LblHdrID = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LblAuditUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        Supplier_Text04Edit2 = new javax.swing.JTextField();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cbKawasan = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        printGraphButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        cbTipeService = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        cbJenisDok = new javax.swing.JComboBox();
        idLbl1 = new javax.swing.JLabel();
        LblSuppID = new javax.swing.JLabel();
        LblSuppName = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        idLbl2 = new javax.swing.JLabel();
        LblPONo = new javax.swing.JLabel();
        LblPONo1 = new javax.swing.JLabel();
        Supplier_Text04Edit3 = new javax.swing.JTextField();
        pridLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        POItemBrowserJTable = new javax.swing.JTable();
        DesktopToolbar = new javax.swing.JToolBar();
        newButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        sortButton = new javax.swing.JButton();
        filterButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        printButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        refreshButton = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(100, 100));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        okButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        okButton.setBounds(570, 40, 80, 20);
        jLayeredPane1.add(okButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CancelButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        CancelButton.setBounds(570, 70, 80, 20);
        jLayeredPane1.add(CancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        applyButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        applyButton.setText("Apply"); // NOI18N
        applyButton.setName("applyButton"); // NOI18N
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });
        applyButton.setBounds(570, 100, 80, 20);
        jLayeredPane1.add(applyButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Barang Keluar Service (BKS)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 10))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        jDateChooser1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jDateChooser1.setName("TanggalPick"); // NOI18N

        idLbl.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        idLbl.setText("ID");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel4.setText("Tanggal");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel8.setText("AuditDate");

        issuedbyLbl.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        issuedbyLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        issuedbyLbl.setName("AuditDate"); // NOI18N

        LblHdrID.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblHdrID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblHdrID.setName("ID"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel7.setText("Tgl.Selesai");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel9.setText("NoBC");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel10.setText("AuditUser");

        LblAuditUser.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblAuditUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblAuditUser.setName("AuditUser"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel3.setText("Nomor");

        jDateChooser3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jDateChooser3.setName("NoSJPick"); // NOI18N

        Supplier_Text04Edit2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Supplier_Text04Edit2.setName("NoBC"); // NOI18N

        jDateChooser4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jDateChooser4.setName("TglBCPick"); // NOI18N

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel13.setText("TglBC");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel5.setText("Penerima");

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel17.setText("Kawasan");

        cbKawasan.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cbKawasan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IDR", "USD" }));
        cbKawasan.setName("TypeIDSelect"); // NOI18N
        cbKawasan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKawasanActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Action", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 10))); // NOI18N

        printGraphButton1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        printGraphButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/print1.gif"))); // NOI18N
        printGraphButton1.setText("print");
        printGraphButton1.setToolTipText("Print Porduct Out");
        printGraphButton1.setActionCommand("edit");
        printGraphButton1.setFocusable(false);
        printGraphButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        printGraphButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        printGraphButton1.setMaximumSize(new java.awt.Dimension(80, 40));
        printGraphButton1.setMinimumSize(new java.awt.Dimension(80, 40));
        printGraphButton1.setPreferredSize(new java.awt.Dimension(80, 40));
        printGraphButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        printGraphButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printGraphButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton2.setText("Pick from PO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jButton2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(printGraphButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(printGraphButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel18.setText("TipeService");

        cbTipeService.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cbTipeService.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IDR", "USD" }));
        cbTipeService.setName("TypeIDSelect"); // NOI18N
        cbTipeService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipeServiceActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel15.setText("JenisDok");

        cbJenisDok.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cbJenisDok.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IDR", "USD" }));
        cbJenisDok.setName("TypeIDSelect"); // NOI18N
        cbJenisDok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJenisDokActionPerformed(evt);
            }
        });

        idLbl1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        idLbl1.setText("Supplier");

        LblSuppID.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblSuppID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblSuppID.setName("SupplierID"); // NOI18N

        LblSuppName.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblSuppName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblSuppName.setName("SupplierName"); // NOI18N

        jButton3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        idLbl2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        idLbl2.setText("PONo.");

        LblPONo.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblPONo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblPONo.setName("PONo"); // NOI18N

        LblPONo1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblPONo1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblPONo1.setName("Nomor"); // NOI18N

        Supplier_Text04Edit3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Supplier_Text04Edit3.setName("Penerima"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, idLbl)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel4)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, idLbl1)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, idLbl2)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel5)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel7)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel9)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel13)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel17)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel15)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel8)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel18)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel10))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(Supplier_Text04Edit3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 184, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(156, 156, 156))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(LblSuppID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblSuppName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, LblHdrID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(LblAuditUser, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, issuedbyLbl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, cbJenisDok, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, cbKawasan, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jDateChooser4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, Supplier_Text04Edit2)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, cbTipeService, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jDateChooser3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jDateChooser1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, LblPONo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, LblPONo1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 85, Short.MAX_VALUE)
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(41, 41, 41))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                            .add(idLbl)
                            .add(LblHdrID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel3)
                            .add(LblPONo1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                            .add(jLabel4)
                            .add(jDateChooser1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                            .add(idLbl1)
                            .add(LblSuppID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(LblSuppName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton3))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(idLbl2)
                            .add(LblPONo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(Supplier_Text04Edit3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel7)
                    .add(jDateChooser3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel18)
                    .add(cbTipeService, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel9)
                    .add(Supplier_Text04Edit2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel13)
                    .add(jDateChooser4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel17)
                    .add(cbKawasan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel15)
                    .add(cbJenisDok, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel8)
                    .add(issuedbyLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel10)
                    .add(LblAuditUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.setBounds(0, 0, 550, 420);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        pridLbl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        pridLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pridLbl.setName("PRID"); // NOI18N
        pridLbl.setBounds(0, 0, 4, 4);
        jLayeredPane1.add(pridLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        POItemBrowserJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(POItemBrowserJTable);

        DesktopToolbar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DesktopToolbar.setFloatable(false);
        DesktopToolbar.setRollover(true);
        DesktopToolbar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DesktopToolbar.setMargin(new java.awt.Insets(200, 0, 0, 0));
        DesktopToolbar.setMaximumSize(new java.awt.Dimension(367, 42));
        DesktopToolbar.setMinimumSize(new java.awt.Dimension(367, 42));

        newButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/new1.jpg"))); // NOI18N
        newButton.setText("New");
        newButton.setToolTipText("Create a link to asociado"); // NOI18N
        newButton.setActionCommand("new");
        newButton.setEnabled(false);
        newButton.setFocusable(false);
        newButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        newButton.setMaximumSize(new java.awt.Dimension(50, 40));
        newButton.setMinimumSize(new java.awt.Dimension(50, 40));
        newButton.setPreferredSize(new java.awt.Dimension(50, 40));
        newButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });
        DesktopToolbar.add(newButton);

        editButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit1.jpg"))); // NOI18N
        editButton.setText("Edit");
        editButton.setToolTipText("Edit asociado"); // NOI18N
        editButton.setActionCommand("edit");
        editButton.setEnabled(false);
        editButton.setFocusable(false);
        editButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        editButton.setMaximumSize(new java.awt.Dimension(45, 40));
        editButton.setMinimumSize(new java.awt.Dimension(45, 40));
        editButton.setPreferredSize(new java.awt.Dimension(45, 40));
        editButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar.add(editButton);

        deleteButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete1.jpg"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setToolTipText("Remove link to asociado"); // NOI18N
        deleteButton.setActionCommand("delete");
        deleteButton.setEnabled(false);
        deleteButton.setFocusable(false);
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        deleteButton.setMaximumSize(new java.awt.Dimension(45, 40));
        deleteButton.setMinimumSize(new java.awt.Dimension(45, 40));
        deleteButton.setPreferredSize(new java.awt.Dimension(45, 40));
        deleteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar.add(deleteButton);

        jSeparator1.setMaximumSize(new java.awt.Dimension(15, 32767));
        jSeparator1.setPreferredSize(new java.awt.Dimension(15, 0));
        DesktopToolbar.add(jSeparator1);

        sortButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        sortButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/sort.jpg"))); // NOI18N
        sortButton.setText("Sort");
        sortButton.setActionCommand("sort");
        sortButton.setEnabled(false);
        sortButton.setFocusable(false);
        sortButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sortButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        sortButton.setMaximumSize(new java.awt.Dimension(45, 40));
        sortButton.setMinimumSize(new java.awt.Dimension(45, 40));
        sortButton.setPreferredSize(new java.awt.Dimension(45, 40));
        sortButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar.add(sortButton);

        filterButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        filterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/filter1.jpg"))); // NOI18N
        filterButton.setText("Filter");
        filterButton.setActionCommand("filter");
        filterButton.setEnabled(false);
        filterButton.setFocusable(false);
        filterButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        filterButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        filterButton.setMaximumSize(new java.awt.Dimension(45, 40));
        filterButton.setMinimumSize(new java.awt.Dimension(45, 40));
        filterButton.setPreferredSize(new java.awt.Dimension(45, 40));
        filterButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar.add(filterButton);

        jSeparator2.setMaximumSize(new java.awt.Dimension(15, 32767));
        jSeparator2.setPreferredSize(new java.awt.Dimension(15, 0));
        DesktopToolbar.add(jSeparator2);

        printButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        printButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/print.jpg"))); // NOI18N
        printButton.setText("Print");
        printButton.setActionCommand("print");
        printButton.setEnabled(false);
        printButton.setFocusable(false);
        printButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        printButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        printButton.setMaximumSize(new java.awt.Dimension(60, 40));
        printButton.setPreferredSize(new java.awt.Dimension(60, 40));
        printButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar.add(printButton);

        jSeparator3.setMaximumSize(new java.awt.Dimension(15, 32767));
        jSeparator3.setPreferredSize(new java.awt.Dimension(15, 0));
        DesktopToolbar.add(jSeparator3);

        refreshButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refresh1.jpg"))); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.setActionCommand("refresh");
        refreshButton.setEnabled(false);
        refreshButton.setFocusable(false);
        refreshButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        refreshButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        refreshButton.setMaximumSize(new java.awt.Dimension(60, 40));
        refreshButton.setPreferredSize(new java.awt.Dimension(60, 40));
        refreshButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar.add(refreshButton);

        jSeparator4.setMaximumSize(new java.awt.Dimension(15, 32767));
        jSeparator4.setPreferredSize(new java.awt.Dimension(15, 0));
        DesktopToolbar.add(jSeparator4);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
            .add(DesktopToolbar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(0, 0, 0)
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 419, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(DesktopToolbar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 148, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
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

private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        try {
            LblAuditUser.setText(configuration.getField( "system_user_name" ));

            KDialogController.OKbuttonActionPerformed();
                            
        } catch (KExceptionClass error ) {

              // log error
              log.log( this, KMetaUtilsClass.getStackTrace( error ) );

              // show error message
              KMetaUtilsClass.showErrorMessageFromException( getOwner(), error );               
        } 
}//GEN-LAST:event_applyButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newButtonActionPerformed

    private void printGraphButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printGraphButton1ActionPerformed
     
        try 
        {
            
            Map<String, Object> parameters = new HashMap<String, Object>();
            Integer hdrID = Integer.parseInt(LblHdrID.getText());
            parameters.put("BKSId", hdrID);
            Connection jdbcConnection = DriverManager.getConnection(configuration.getField( "jasper_jdbc" ), "sample", "sample");            
            JasperReport jasperReport = (JasperReport)JRLoader.loadObject(new URL(configuration.getField( "jasper_url" )+"report/BKS.jasper"));              
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jdbcConnection);
             
            JDialog jv = new JDialog();
            jv.setModal(true);
            jv.setMinimumSize(new Dimension(700,600));
            jv.setLocation(300,100);
            jv.getContentPane().add(new JRViewer(jasperPrint));
            jv.validate();
            jv.pack();
            jv.setVisible(true);
          
            }
         catch( Exception error	){
            log.log( this, KMetaUtilsClass.getStackTrace( error ) );
            KMetaUtilsClass.showErrorMessageFromException( this, error );
        }
  
                    
            

    }//GEN-LAST:event_printGraphButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
            PurchaseOrderApprovedBrowserClass PRBrowser = new PurchaseOrderApprovedBrowserClass(
                configuration, log, new javax.swing.JTable(), this );

            PRBrowser.initializeTable();

            selectDialogClass selector = new selectDialogClass(
                configuration, log, this, PRBrowser, "Select Purchase Order" );

            // dont want to allow this, for example
            selector.getNewButton().setEnabled(false);
            selector.getDeleteButton().setEnabled(false);
            parentID = selector.showDialog();

//            SupplierID.setText( Long.toString(parentID));

            if( parentID < 0 ) 
            {
                throw new KExceptionClass( "You must select a Production Record !", null);
                        
            }            
            else
            {
            
                pridLbl.setText( Long.toString(parentID) );
                if(parentID>0)
                {
                    persistentObjectManagerClass prPOM = new persistentObjectManagerClass(configuration, log);
                    PurchaseOrderClass poClass = new PurchaseOrderClass();
                    poClass = ( PurchaseOrderClass ) prPOM.copy4( parentID, PurchaseOrderClass.class );  
                    LblPONo.setText(poClass.getNomor());
                    LblSuppID.setText(String.valueOf(poClass.getSupplierID()));
                    LblSuppName.setText(poClass.getSupplier_Text01());
                 
                }
                
            }   

            
        }
        catch( Exception error	){
            log.log( this, KMetaUtilsClass.getStackTrace( error ) );
            KMetaUtilsClass.showErrorMessageFromException( this, error );
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbKawasanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKawasanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKawasanActionPerformed

    private void cbTipeServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipeServiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipeServiceActionPerformed

    private void cbJenisDokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJenisDokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJenisDokActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
        {
            supplierBrowserClass SuppBrowser = new supplierBrowserClass(
                configuration, log, new javax.swing.JTable(), this );

            SuppBrowser.initializeTable();

            selectDialogClass selector = new selectDialogClass(
                configuration, log, this, SuppBrowser, "Select Supplier" );

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
            
                LblSuppID.setText( Long.toString(parentID) );
                // get nama
                if(parentID>0)
                {
                   persistentObjectManagerClass SuppPOM = new persistentObjectManagerClass(configuration, log);
                    supplierClass suppClass = new supplierClass();
                    suppClass = ( supplierClass ) SuppPOM.copy4( parentID, supplierClass.class );  
                    LblSuppName.setText(suppClass.getNama());
                }   

                
            }   

            
        }
        catch( Exception error	){
            log.log( this, KMetaUtilsClass.getStackTrace( error ) );
            KMetaUtilsClass.showErrorMessageFromException( this, error );
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JToolBar DesktopToolbar;
    private javax.swing.JLabel LblAuditUser;
    private javax.swing.JLabel LblHdrID;
    private javax.swing.JLabel LblPONo;
    private javax.swing.JLabel LblPONo1;
    private javax.swing.JLabel LblSuppID;
    private javax.swing.JLabel LblSuppName;
    private javax.swing.JTable POItemBrowserJTable;
    private javax.swing.JTextField Supplier_Text04Edit2;
    private javax.swing.JTextField Supplier_Text04Edit3;
    private javax.swing.JButton applyButton;
    private javax.swing.JComboBox cbJenisDok;
    private javax.swing.JComboBox cbKawasan;
    private javax.swing.JComboBox cbTipeService;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton filterButton;
    private javax.swing.JLabel idLbl;
    private javax.swing.JLabel idLbl1;
    private javax.swing.JLabel idLbl2;
    private javax.swing.JLabel issuedbyLbl;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JButton newButton;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel pridLbl;
    private javax.swing.JButton printButton;
    private javax.swing.JButton printGraphButton1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton sortButton;
    // End of variables declaration//GEN-END:variables
   
    
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
  
        /*
        pr_newClass product = (pr_newClass) businessObject;
        if( product.getImage() != null ){
            
            pictureLabel.setIcon(  new ImageIcon( product.getImage() ) );            
        }
        * */
        
        
    }

    @Override
    public void preUpdate(KBusinessObjectClass businessObject) throws Exception {
    }

    @Override
    public void postUpdate(KBusinessObjectClass businessObject) throws Exception {
    }    
    
    
}
