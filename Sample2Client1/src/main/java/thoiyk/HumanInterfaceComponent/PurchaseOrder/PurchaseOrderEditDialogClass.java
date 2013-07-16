/*
 * This source code is part of the Thoyik
 * Copyright (C) 2013  Yoserizal
 * Feedback / Bug Reports yoser174@gmail.com
 * 
 * 
 * This project used:
 * KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.PurchaseOrder;

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
import KFramework30.Widgets.KDataBrowserBaseClass;
import KFramework30.Widgets.KDialogControllerClass;
import KFramework30.Widgets.KDialogControllerClass.KDialogInterface;
import KFramework30.Widgets.KDropDownFillerClass;
import KFramework30.Widgets.selectDialogClass;
import ProblemDomainComponent.PurchaseOrderClass;
import ProblemDomainComponent.supplierClass;
import java.awt.Font;
import java.awt.print.PageFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import thoiyk.HumanInterfaceComponent.PurchaseOrderItem.PurchaseOrderItemBrowserClass;
import thoiyk.HumanInterfaceComponent.supplier.supplierBrowserClass;


public class PurchaseOrderEditDialogClass 
extends javax.swing.JDialog
implements KDialogInterface, KDialogControllerClass.KDialogEventCallbackInterface
{
    
// uses
    private KConfigurationClass             configuration;
    private KLogClass                       log;
    private long                            parentID;
   
    // has defaulted   
    private PurchaseOrderItemBrowserClass             browser;   
    private KNonVisibleBinaryWidgetClass    productPictureRawDataContainer;
    private KDialogControllerClass            KDialogController;

    

    /** Creates new form facturaEditDialogClass */
    public PurchaseOrderEditDialogClass( 
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
                PurchaseOrderClass.class, 
                this, getContentPane() );   
                         
        
        KDialogController.setEventCallback(this);


                            
    }
        
    
    public void initializeDialog(int dialogModeParam, Long ID, Map foreingKeys ) throws KExceptionClass {
        

       KDropDownFillerClass typeComboFiller = new KDropDownFillerClass(
                        configuration, log, 
                        //SQL, might have parameters and where clause or order by
                        " select ID,  NAME from purchaseorderterm ",
                        "ID", termCombo, "TermPaymentID"
                        );

        typeComboFiller.load();        
        KDialogController.addNonVisibleWidget( typeComboFiller );  // to map it           

       KDropDownFillerClass typeComboFillerCurr = new KDropDownFillerClass(
                        configuration, log, 
                        //SQL, might have parameters and where clause or order by
                        " select ID,  CURRENCY from NEGARA ",
                        "ID", currCombo, "CurrencyID"
                        );

        typeComboFillerCurr.load();        
        KDialogController.addNonVisibleWidget( typeComboFillerCurr );  // to map it           

        
        //-------------------------------------------------------------                           
        //DEMO cuastom swing component integration with adapter  
        // dont forget to visually set the "name" property to the  field you want to map
//        JCalendarDemoWidgetAdapterClass dateChooserAdapter = new JCalendarDemoWidgetAdapterClass( jDateChooser1, "PODate" );                
  //      KDialogController.includeCustomWidgetForMapping( dateChooserAdapter );                
        //-------------------------------------------------------------                           

        // dont forget to visually set the "name" property to the  field you want to map
        JCalendarDemoWidgetAdapterClass dateChooserAdapter = new JCalendarDemoWidgetAdapterClass( jDateChooser1, "PODate" );                
        KDialogController.includeCustomWidgetForMapping( dateChooserAdapter ); 
        JCalendarDemoWidgetAdapterClass dateChooserAdapter2 = new JCalendarDemoWidgetAdapterClass( jDateChooser2, "DeliveryDate" );                
        KDialogController.includeCustomWidgetForMapping( dateChooserAdapter2 );                
      
        //-------------------------------------------------------------                           

        // start
//        KDialogController.initializeDialog( dialogModeParam, ID, foreingKeys );
          KDialogController.initializeDialog( dialogModeParam, ID, null  );

        checkSecurity();
        
        /*
    
       
        // ---------------------------------------------------------------------
            persistentObjectManagerClass POM = new persistentObjectManagerClass(configuration, log);
            // read the client of this invoice, no SQL anywhere ...
            supplierClass supplier = new supplierClass();

            supplier = ( supplierClass ) POM.copy4( ((PurchaseOrderClass)KDialogController.getCurrentObjectDisplayed()).getSupplierID(), supplierClass.class );
            suppliernameLbl.setText( supplier.getNama() );
            // ---------------------------------------------------------------------  
*/

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

       
        browser = new PurchaseOrderItemBrowserClass( 
                //
                 configuration, log,
                POItemBrowserJTable,
                PurchaseOrderItemBrowserClass.POITEM_BY_PO, 
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
        newButton.setEnabled( true);
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
        facLabel = new javax.swing.JTextField();
        idLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        suppliernameLbl = new javax.swing.JLabel();
        client_id3 = new javax.swing.JLabel();
        issuedbyLbl = new javax.swing.JLabel();
        client_id6 = new javax.swing.JLabel();
        SupplierID = new javax.swing.JLabel();
        supp_text02 = new javax.swing.JLabel();
        supp_text03 = new javax.swing.JLabel();
        termCombo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        issuedbyLbl1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        issuedbyLbl2 = new javax.swing.JLabel();
        printGraphButton1 = new javax.swing.JButton();
        Supplier_Text04Edit = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        clientExpressDelivery = new javax.swing.JCheckBox();
        currCombo = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        topLabel = new javax.swing.JLabel();
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
        statusidLbl = new javax.swing.JLabel();
        statusidLbl2 = new javax.swing.JLabel();
        statusidLbl3 = new javax.swing.JLabel();
        statusidLbl4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(100, 100));
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
        okButton.setBounds(670, 90, 80, 20);
        jLayeredPane1.add(okButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CancelButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        CancelButton.setBounds(670, 120, 80, 20);
        jLayeredPane1.add(CancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        applyButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        applyButton.setText("Apply"); // NOI18N
        applyButton.setName("applyButton"); // NOI18N
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });
        applyButton.setBounds(670, 150, 80, 20);
        jLayeredPane1.add(applyButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Purchase Order Header", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        jDateChooser1.setName("PODateR"); // NOI18N

        facLabel.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        facLabel.setName("facName"); // NOI18N

        idLbl.setText("ID");

        jLabel2.setText("PO Number");

        jLabel4.setText("Date");

        jLabel5.setText("SupplierID");

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("IssuedBy");

        suppliernameLbl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        suppliernameLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        suppliernameLbl.setName("Supplier_Text01"); // NOI18N

        client_id3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_id3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id3.setName("Nomor"); // NOI18N

        issuedbyLbl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        issuedbyLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        issuedbyLbl.setName("IssuedBy"); // NOI18N

        client_id6.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_id6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id6.setName("ID"); // NOI18N

        SupplierID.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        SupplierID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SupplierID.setName("SupplierID"); // NOI18N

        supp_text02.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        supp_text02.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        supp_text02.setName("Supplier_Text02"); // NOI18N

        supp_text03.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        supp_text03.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        supp_text03.setName("Supplier_Text03"); // NOI18N

        termCombo.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        termCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "30 days", "60 days", "120 days" }));
        termCombo.setName("TermPaymentIDCombo"); // NOI18N
        termCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termComboActionPerformed(evt);
            }
        });

        jLabel6.setText("Term Payment");

        jDateChooser2.setName("DeliveryDateLbl"); // NOI18N

        jLabel7.setText("Delivery Date");

        jLabel9.setText("Note");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setName("remark"); // NOI18N
        jScrollPane2.setViewportView(jTextArea1);

        jLabel10.setText("CheckedBy");

        issuedbyLbl1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        issuedbyLbl1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        issuedbyLbl1.setName("CheckedBy"); // NOI18N

        jLabel11.setText("AutorizedBy");

        issuedbyLbl2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        issuedbyLbl2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        issuedbyLbl2.setName("AuthorizedBy"); // NOI18N

        printGraphButton1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        printGraphButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/print1.gif"))); // NOI18N
        printGraphButton1.setText("print");
        printGraphButton1.setToolTipText("Edit element");
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

        Supplier_Text04Edit.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        Supplier_Text04Edit.setName("Supplier_Text04"); // NOI18N

        jLabel16.setText("Atn.");

        clientExpressDelivery.setBackground(new java.awt.Color(255, 255, 255));
        clientExpressDelivery.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        clientExpressDelivery.setText("PPN / VAT (Value Added Tax)");
        clientExpressDelivery.setName("vat"); // NOI18N

        currCombo.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        currCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IDR", "USD" }));
        currCombo.setName("TermPaymentIDCombo"); // NOI18N
        currCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currComboActionPerformed(evt);
            }
        });

        jLabel12.setText("Currency");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(idLbl)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(client_id6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(client_id3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(2, 2, 2)
                                .add(jLabel4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jDateChooser1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(423, 423, 423)
                                .add(facLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 280, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(supp_text02, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 291, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jLabel5)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(SupplierID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(1, 1, 1)
                                        .add(suppliernameLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 291, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(supp_text03, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 291, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(60, 60, 60)
                                .add(printGraphButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel8)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(issuedbyLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jLabel10)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(issuedbyLbl1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jLabel11)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(issuedbyLbl2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel7)
                                    .add(jLabel9))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 395, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jDateChooser2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jLabel6)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(termCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(155, 155, 155)
                                        .add(jLabel12)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(currCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(149, 149, 149)
                                .add(jLabel16)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(Supplier_Text04Edit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 266, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(clientExpressDelivery, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 224, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jDateChooser1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(facLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(idLbl)
                        .add(jLabel2)
                        .add(jLabel4))
                    .add(client_id3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(client_id6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(6, 6, 6)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jLabel5)
                                .add(suppliernameLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jButton1)
                            .add(SupplierID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(1, 1, 1)
                        .add(supp_text02, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(supp_text03, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(Supplier_Text04Edit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel16))
                        .add(13, 13, 13)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(clientExpressDelivery, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(currCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel12))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jDateChooser2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel7)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(termCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jLabel6)))
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel9)
                                .add(38, 38, 38)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(issuedbyLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(issuedbyLbl1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel10)
                            .add(issuedbyLbl2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel11)
                            .add(jLabel8))
                        .add(6, 6, 6))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(printGraphButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1.setBounds(0, 80, 660, 320);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        topLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        topLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/topBar.jpg"))); // NOI18N
        topLabel.setMaximumSize(new java.awt.Dimension(100, 44));
        topLabel.setMinimumSize(new java.awt.Dimension(100, 44));
        topLabel.setBounds(0, 0, 770, 647);
        jLayeredPane1.add(topLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

        statusidLbl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        statusidLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        statusidLbl.setName("StatusID"); // NOI18N

        statusidLbl2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        statusidLbl2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        statusidLbl2.setName("IssuedDate"); // NOI18N

        statusidLbl3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        statusidLbl3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        statusidLbl3.setName("AuthorizedDate"); // NOI18N

        statusidLbl4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        statusidLbl4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        statusidLbl4.setName("CheckedDate"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 770, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 760, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(DesktopToolbar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 770, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(statusidLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(123, 123, 123)
                        .add(statusidLbl2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(statusidLbl3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(statusidLbl4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 397, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(DesktopToolbar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 122, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(statusidLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(statusidLbl2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(statusidLbl3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(statusidLbl4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents
        
  private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

      
      
      try {
            
            issuedbyLbl.setText(configuration.getField( "system_user_name" ));
            
            


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
            issuedbyLbl.setText(configuration.getField( "system_user_name" ));

            KDialogController.OKbuttonActionPerformed();
                            
        } catch (KExceptionClass error ) {

              // log error
              log.log( this, KMetaUtilsClass.getStackTrace( error ) );

              // show error message
              KMetaUtilsClass.showErrorMessageFromException( getOwner(), error );               
        } 
}//GEN-LAST:event_applyButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            supplierBrowserClass supplierBrowser = new supplierBrowserClass(
                configuration, log, new javax.swing.JTable(), this );

            supplierBrowser.initializeTable();

            selectDialogClass selector = new selectDialogClass(
                configuration, log, this, supplierBrowser, "Select Supplier" );

            // dont want to allow this, for example
            selector.getNewButton().setEnabled(false);
            selector.getDeleteButton().setEnabled(false);
            parentID = selector.showDialog();

            SupplierID.setText( Long.toString(parentID));

            if( parentID < 0 ) 
            {
                throw new KExceptionClass( "You must select a Supplier !", null);
                        
            }            
            else
            {
            
               // ---------------------------------------------------------------------
                // display the supplier name                
                persistentObjectManagerClass POM = new persistentObjectManagerClass(configuration, log);
                supplierClass supplier = new supplierClass();
                supplier = ( supplierClass ) POM.copy4( parentID, supplierClass.class );

                suppliernameLbl.setText( supplier.getNama() );
                supp_text02.setText(supplier.getAlamat());
                supp_text03.setText("Telp."+supplier.getTelp()+" Fax."+supplier.getFax());
          //      supp_text04.setText(supplier.getContactname());
                // ---------------------------------------------------------------------        
            }   

            
        }
        catch( Exception error	){
            log.log( this, KMetaUtilsClass.getStackTrace( error ) );
            KMetaUtilsClass.showErrorMessageFromException( this, error );
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newButtonActionPerformed

    private void termComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_termComboActionPerformed

    private void printGraphButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printGraphButton1ActionPerformed
        
      try{
          
            log.log( this, "Batch printing PO" );
            persistentObjectManagerClass persistentObjectManager = 
                    new persistentObjectManagerClass( configuration, log );             

            //materialize the sdg
         //   PurchaseOrdersamplerecordClassClass po = new PurchaseOrderClass();
         //   po = (PurchaseOrderClass) persistentObjectManager.copy4( sdg_id, ASHURSampleDeliveryGroupClass.class );  

            persistentObjectManagerClass POM = new persistentObjectManagerClass(configuration, log);
            //PurchaseOrderClass po = new PurchaseOrderClass();
            PurchaseOrderClass po = ( PurchaseOrderClass ) POM.copy4( ((PurchaseOrderClass)KDialogController.getCurrentObjectDisplayed()).getID(), PurchaseOrderClass.class );
            
            // materialize the delivery
            //supplierClass sup = new supplierClass();
            //sup = (supplierClass) persistentObjectManager.copy4( po.getSupplierID(), supplierClass.class );  
            

          //KMetaUtilsClass.showMessage(this,po.getSupplier_Text01() );
            
            // ---------------------------------------------------------------------------------------
            //Header section
            KPrintSectionClass headerSection = new KPrintSectionClass(configuration, log, 520, 140);           

            // Header: Address "Mount Holly"
            headerSection.setFont( new Font( "arial", Font.PLAIN,                        8) ); 
//            headerSection.printText("Kframework Municipal Utilities Authority ",   350, 40 );
//            headerSection.printText("(Certification Number:1234)",              350, 50 );
//            headerSection.printText("300 Saturn Road, PO BOX 486",                350, 60 );
//            headerSection.printText("Mount Everest KA 08060",                         350, 70 );
//            headerSection.printText("Phone 609-123-1223  Fax: 609-123-1234",        350, 80 );
//            headerSection.printText("Email: vmaxxed@users.sourceforge.net",                        350, 90 );
//            
            headerSection.setFont( new Font( "arial", Font.PLAIN,                       12) );
            headerSection.printText("PURCHASE ORDER ",          170, 100 );
            headerSection.printLine(170,114,363,114);            
//            headerSection.setFont( new Font( "arial", Font.PLAIN,                        10) );
//            headerSection.printText("Date:",                                          0, 120 );
//            headerSection.printText( KMetaUtilsClass.time(),                          70, 120 );
//            headerSection.printText("Summary #: ",                                  350, 120 );
//            headerSection.printText(Long.toString(po.getID()),                                 405, 120 );
   

            // ---------------------------------------------------------------------------------------
            
            // Address section
//            KPrintSectionClass addressSection = new KPrintSectionClass(configuration, log, 520, 130 );                 
//            addressSection.setFont( new Font( "arial", Font.BOLD, 10) );
//            addressSection.printText("PO No:",                                         0, 20 );
//            addressSection.printText(po.getNomor(),                                    0, 30 );
//            addressSection.printText("Ship To:",                               350, 20 );
//            addressSection.printText("Ship To:",                               350, 20 );
   
            KPrintSectionClass leftTopSection = new KPrintSectionClass(configuration, log, 520, 130 );                 
            leftTopSection.setFont( new Font( "arial", Font.PLAIN, 10) );
            leftTopSection.printText("PO No",                                         0, 20 );
            leftTopSection.printText(po.getNomor(),                                   40, 20 );
            leftTopSection.printText("Date",                                          0, 30 );
            leftTopSection.printText(po.getPODate().toLocaleString(),                 40, 30 );
            leftTopSection.printText("To",                                            0, 40 );
            leftTopSection.printText(po.getSupplier_Text01(),                         40, 40 );
            leftTopSection.printText(po.getSupplier_Text02(),                         40, 50 );
            leftTopSection.printText(po.getSupplier_Text03(),                         40, 60 );
            leftTopSection.printText("Atn.",                                           0, 70 );
            leftTopSection.printText(po.getSupplier_Text04(),                         40, 70 );
            

           // KPrintSectionClass rightTopSection = new KPrintSectionClass(configuration, log, 520, 130 );                 
            leftTopSection.setFont( new Font( "arial", Font.PLAIN, 10) );
            leftTopSection.printText("Ship To",                                         340, 20 );
            leftTopSection.printText("Pintu Mas Garmindo PT",                           395, 20 );
            leftTopSection.printText("Jl.Raya Dramarga Km 7 No 61",                     395, 30 );
            leftTopSection.printText("Kab.Bogor Jawa Barat 16650",                      395, 40 );
            leftTopSection.printText("NPWP",                                            340, 50 );
            leftTopSection.printText("123.123.123.123",                                 395, 50 );
            leftTopSection.printText("Phone: +62 123456 Fax: +62 212334",               395, 60 );
            leftTopSection.printText("Atn.",                                            340, 70 );
            leftTopSection.printText("Arum / Ibu Lisye",                                395, 70 );

            // heading and Analytical Testing Service Summary
            // get a KePrintJob
            KPrintJobClass printJob = 
                new KPrintJobClass( configuration, log ); 

            PageFormat fixedPageFormat = ( PageFormat ) KPrintJobClass.defaultPageFormat.clone();
            fixedPageFormat.setOrientation( PageFormat.PORTRAIT );
            
            printJob.useSpecificPrintingDefaults(
                KPrintJobClass.defaultPrinterJob, fixedPageFormat );   

            // start job 
            printJob.setDefaultFont( new Font("Arial", Font.PLAIN, 10) );  
            printJob.setLeftMargin( 50 );
            printJob.setBottomMargin( 40 );
           
            printJob.startPrintJob();   //pop up system print dialog box            
            
            printJob.SetHeader( headerSection, KPrintJobClass.CENTER );                         
            
            printJob.printSection( leftTopSection, KPrintJobClass.CENTER );
            //printJob.printSection( rightTopSection, KPrintJobClass.CENTER );
            
            
           dbTransactionClientClass dbTransaction = 
           new dbTransactionClientClass( configuration, log ); 

            dbTransaction.prepare(

                " select ITEMNAME,KODE,PRID,sum(QTY) qty, sum(QTY*UNITPRICE) price " +
                 // End Fields used in the receipt
                 //--------------------------------------------------
                 "from "+
                 "purchaseorderitem poi " +
                 "left join " +
                 "v_po_item on poi.itemid=v_po_item.id " +
                " where " +
                    "poi.purchaseorderid=:v1 " +
                     "group by ITEMNAME,KODE,PRID " );

                dbTransaction.bind( ":v1",  po.getID() );                  

  //              log.log( caller, "Loading ashur sample, sample point data" );                                                                                                                
                dbTransaction.executeQuery( 0, 655356 );
    //            log.log( caller, "Loading complete." );                                                  

            // --------------------------------------------------------    
                
               //to get analysis info
                //dbTransactionClientClass AnalysisdbTransaction = 
                  //  new dbTransactionClientClass( configuration, log ); 
                    
                //for each sample, print sample and get analysis info
                //while( dbTransaction.fetch() ) { 
                    //print out sample info
                    KPrintSectionClass poitem = new KPrintSectionClass(configuration, log, 520, 90 ); 
                    
                    poitem.setFont( new Font( "arial", Font.PLAIN, 8) );
                    
                    //String valueBuffer = (String) dbTransaction.getProperty( "SAMPLE_LAB_ID" );   
                    // setup the DB printer
                    KPrintDataTableClass dbTable = new KPrintDataTableClass( 
                               configuration, log, 
                               dbTransaction, printJob, 0, 655356 );
                
                    //print anasys info
                    dbTable.addField( "ITEMNAME",        "ITEMNAME",        125 );   
                    dbTable.addField( "KODE",      "KODE",       60 );
                    dbTable.addField( "PRID",       "PRID",        40 );        
                    dbTable.addField( "QTY",    "QTY",     40 );                        
                    dbTable.addField( "PRICE",       "PRICE",        100 );        
                    //dbTable.addField( "ANALYSIS_CLIENT_PRICE","CLIENT PRICE", 100, KPrintJobClass.RIGHT );                        
                    
                    
                    
                    //dbTable.addSummary( "CLIENT PRICE", KPrintDataTableClass.SUM, "Total: $", null, 2 );
                    
                    
                    dbTable.setPrintingField( "ITEMNAME" );
                    dbTable.setPrintingField( "KODE" );
                    dbTable.setPrintingField( "PRID" );        
                    dbTable.setPrintingField( "QTY" );                        
                    dbTable.setPrintingField( "PRICE" );
                    //dbTable.setPrintingField( "CLIENT PRICE" );                        
                    //DBPrinter.setPrintingField( "SAMPLE ID" );  
                    
                    
                    dbTable.setHorizontalSpace( 20 );
                    printJob.setDefaultFont( new Font("Arial", Font.PLAIN, 8) ); 
                    int oldLeftMargin = printJob.getLeftMargin();
                    printJob.setLeftMargin(75);              
                    dbTable.setHeadersMode( dbTable.HEADER_TYPE_INLINEHEADER );                 
                    
                    dbTable.print();
                    
                    printJob.setDefaultFont( new Font("Arial", Font.PLAIN, 10) );
                    printJob.setLeftMargin(oldLeftMargin);
                   
                    //Footer section
                    KPrintSectionClass footerSection = new KPrintSectionClass(configuration, log, 520, 140);           
                    
                    footerSection.setFont( new Font( "arial", Font.PLAIN, 10) );
                    
                    footerSection.printText("Approval By",                                   0, 10 );
                    footerSection.printText("Checked By",                                   200, 10 );
                    footerSection.printText("Authorized Signature",                         400, 10 );
                    
                    footerSection.printText("Term Payment",                                   0, 120 );
                    footerSection.printText(po.getNomor(),                                   100, 120 );
                    footerSection.printText("Delivery Date",                                  0, 130 );
                    footerSection.printText(po.getDeliveryDate().toLocaleString(),                 100, 130 );
                    footerSection.printText("Note",                                            0, 140 );
                    
                    
                    
                    printJob.printSection( footerSection, KPrintJobClass.CENTER );
                    //footerSection.printText(po.get,                         40, 40 );

                    //footerSection.printText("Note",                                            0, 40 );

                    
//                    
//                    String valueBuffer = (String) dbTransaction.getProperty( "ITEMNAME" ); 
//                    poitem.printText(valueBuffer,                                    65, 10 );
//                    valueBuffer = (String) dbTransaction.getProperty( "KODE" ); 
//                    poitem.printText(valueBuffer,                                    265, 10 );
//                    valueBuffer = (String) dbTransaction.getProperty( "PRID" ); 
//                    poitem.printText(valueBuffer,                                     365, 10 );
//                    valueBuffer = (String) dbTransaction.getProperty( "QTY" ); 
//                    poitem.printText(valueBuffer,                                     415, 10 );
//                    
//                     printJob.printSection( poitem, KPrintJobClass.CENTER );
                    
                    

                //}
   
                    
                                
            printJob.submitPrintJob();  


            
        }
        catch( Exception error	){
            
                // log error
                log.log( this, KMetaUtilsClass.getStackTrace( error ) );		                
                // show error message
                KMetaUtilsClass.showErrorMessageFromException( this,  error );
        } 
                    
            

    }//GEN-LAST:event_printGraphButton1ActionPerformed

    private void currComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currComboActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JToolBar DesktopToolbar;
    private javax.swing.JTable POItemBrowserJTable;
    private javax.swing.JLabel SupplierID;
    private javax.swing.JTextField Supplier_Text04Edit;
    private javax.swing.JButton applyButton;
    private javax.swing.JCheckBox clientExpressDelivery;
    private javax.swing.JLabel client_id3;
    private javax.swing.JLabel client_id6;
    private javax.swing.JComboBox currCombo;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField facLabel;
    private javax.swing.JButton filterButton;
    private javax.swing.JLabel idLbl;
    private javax.swing.JLabel issuedbyLbl;
    private javax.swing.JLabel issuedbyLbl1;
    private javax.swing.JLabel issuedbyLbl2;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton newButton;
    private javax.swing.JButton okButton;
    private javax.swing.JButton printButton;
    private javax.swing.JButton printGraphButton1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton sortButton;
    private javax.swing.JLabel statusidLbl;
    private javax.swing.JLabel statusidLbl2;
    private javax.swing.JLabel statusidLbl3;
    private javax.swing.JLabel statusidLbl4;
    private javax.swing.JLabel supp_text02;
    private javax.swing.JLabel supp_text03;
    private javax.swing.JLabel suppliernameLbl;
    private javax.swing.JComboBox termCombo;
    private javax.swing.JLabel topLabel;
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
