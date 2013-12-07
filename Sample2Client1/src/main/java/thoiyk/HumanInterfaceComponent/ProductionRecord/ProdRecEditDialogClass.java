/*
 * This source code is part of the Thoyik
 * Copyright (C) 2013  Yoserizal
 * Feedback / Bug Reports yoser174@gmail.com
 * 
 * 
 * This project used:
 * KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */

package thoiyk.HumanInterfaceComponent.ProductionRecord;


// k
import KFramework30.Base.*;
import KFramework30.Communication.dbTransactionClientClass;
import KFramework30.Communication.persistentObjectManagerClass;
import KFramework30.Printing.KPrintDataTableClass;
import KFramework30.Printing.KPrintJobClass;
import KFramework30.Printing.KPrintSectionClass;
import KFramework30.Widgets.KDialogControllerClass;

//app
import KFramework30.Widgets.KDialogControllerClass.KDialogInterface;
import KFramework30.Widgets.KDropDownFillerClass;
import KFramework30.Widgets.selectDialogClass;
import ProblemDomainComponent.buyerClass;
import ProblemDomainComponent.outstandingorderClass;
import ProblemDomainComponent.ProdRecClass;
import ProblemDomainComponent.samplerecordClass;
import ProblemDomainComponent.samplerecordstyleClass;
import java.awt.Font;
import java.awt.print.PageFormat;
import java.text.DateFormat;

// rtl
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import thoiyk.HumanInterfaceComponent.ProductionRecordSize.ProdRecSizeBrowserClass;
import thoiyk.HumanInterfaceComponent.buyer.buyerBrowserClass;
import thoiyk.HumanInterfaceComponent.ProdutionRecordItem.ProdRecItemBrowserClass;
import thoiyk.HumanInterfaceComponent.outstandingorder.outstandingorderBrowserClass;


public class ProdRecEditDialogClass 
extends javax.swing.JDialog
implements KDialogInterface, KDialogControllerClass.KDialogEventCallbackInterface
{
    
    // uses
    private KConfigurationClass             configuration;
    private KLogClass                       log;
    private long                            parentID;
   
    // has defaulted   
    private ProdRecItemBrowserClass         browser;   
    private ProdRecSizeBrowserClass              ProdRecSizeBrowser;
    private KNonVisibleBinaryWidgetClass    productPictureRawDataContainer;
    private KDialogControllerClass            KDialogController;

    
    //end of object persistent functions------------------------------------------------------

    /** Creates new form facturaEditDialogClass */
    public ProdRecEditDialogClass( 
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
                ProdRecClass.class, 
                this, getContentPane() );   
          /*
        KDialogController = new KDialogControllerClass(                 
                configuration, log, 
                pr_newClass.class, this, getContentPane() );        
        */
          productPictureRawDataContainer = new KNonVisibleBinaryWidgetClass(
                   configurationParam, logParam, "image", 1024 /* 1Kb start size, its dynamic dont worry */ );
                         
        // add for auto binding and forget, just code the postEdit as shown below
        KDialogController.addNonVisibleWidget( productPictureRawDataContainer );
        
        KDialogController.setEventCallback(this);


                            
    }
    
    
    public void initializeDialog(int dialogModeParam, Long ID, Map foreingKeys ) throws KExceptionClass {
                        
        

            
        
        KDropDownFillerClass typeComboFiller = new KDropDownFillerClass(
                        configuration, log, 
                        //SQL, might have parameters and where clause or order by
                        " select ID,  NAMA from stocktype ",
                        "ID", cbSRType, "samplerecordtypeid"
                        );

        typeComboFiller.load();        
        KDialogController.addNonVisibleWidget( typeComboFiller );  // to map it           
        
                // start
        KDialogController.initializeDialog( dialogModeParam, ID, null  );

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
                       
        
        
       browser = new ProdRecItemBrowserClass(
                configuration, log, FacturasBrowserJTable, 
                ProdRecItemBrowserClass.SRITEM_BY_SR, id, this );
        
      //  browser.saveSQLOperation( 
      //          totalLabel, " sum( fac.fac_total ) ", facturaBrowserClass.BROWSER_COLUMN_TYPE_CURRENCY, true );        
        
        browser.initializeTable();

        //setup container button
        newButton.addActionListener( browser );
        deleteButton.addActionListener( browser );
        editButton.addActionListener( browser );        
        sortButton.addActionListener( browser );
        filterButton.addActionListener( browser );     
        printButton.addActionListener( browser );   
        refreshButton.addActionListener( browser );          
        saveChangesButton1.addActionListener( browser );  

        saveChangesButton1.setEnabled( true);        
        newButton.setEnabled( true);
        deleteButton.setEnabled( true);
        editButton.setEnabled( true);        
        sortButton.setEnabled( true);
        filterButton.setEnabled( true);
        printButton.setEnabled( true);
        refreshButton.setEnabled( true);    

        
        //if (browser.getSelectedFieldValue("ID")=="0")
        //{
            //issuedby2Label.setText("Tes");
            
        //}
                
        ProdRecSizeBrowser = new ProdRecSizeBrowserClass(
                configuration, log, SizeBrowserTable, 
                ProdRecSizeBrowserClass.PRSIZEITEM_BY_PRSIZE, id, this );
        
        ProdRecSizeBrowser.initializeTable();

        //setup container button
        newButton1.addActionListener( ProdRecSizeBrowser );
        deleteButton1.addActionListener( ProdRecSizeBrowser );
        editButton1.addActionListener( ProdRecSizeBrowser );        
        sortButton1.addActionListener( ProdRecSizeBrowser );
        filterButton1.addActionListener( ProdRecSizeBrowser );     
        printButton1.addActionListener( ProdRecSizeBrowser );   
        refreshButton1.addActionListener( ProdRecSizeBrowser );          

        newButton1.setEnabled( true);
        deleteButton1.setEnabled( true);
        editButton1.setEnabled( true);        
        sortButton1.setEnabled( true);
        filterButton1.setEnabled( true);
        printButton1.setEnabled( true);
        refreshButton1.setEnabled( true);    

                        
    }
     
    public void saveBrowserChanges() {
        
        if( browser != null ){ 
            try {
                
                browser.saveBrowserChanges();
                
            } catch (KExceptionClass error ) {
                
                  // log error
                  log.log( this, KMetaUtilsClass.getStackTrace( error ) );

                  // show error message
                  KMetaUtilsClass.showErrorMessageFromException( getOwner(), error );               
            }
        }
        
    }    
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientDiscountGroup = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        descriptionLbl = new javax.swing.JTextField();
        client_id = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pictureLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        buyerid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbSRType = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        issuedbyLabel = new javax.swing.JLabel();
        styleLbl = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        qtyLbl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        buyernameLbl = new javax.swing.JLabel();
        client_id1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        PickfROBtn = new javax.swing.JButton();
        printGraphButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        LblAuditUser = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        DesktopToolbar1 = new javax.swing.JToolBar();
        newButton1 = new javax.swing.JButton();
        editButton1 = new javax.swing.JButton();
        deleteButton1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        sortButton1 = new javax.swing.JButton();
        filterButton1 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        printButton1 = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        refreshButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        SizeBrowserTable = new javax.swing.JTable();
        topLabel1 = new javax.swing.JLabel();
        SRStatusIDLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FacturasBrowserJTable = new javax.swing.JTable();
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
        saveChangesButton1 = new javax.swing.JButton();
        selectidLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Production Record Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 10))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Id ");

        descriptionLbl.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        descriptionLbl.setName("description"); // NOI18N

        client_id.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_id.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id.setName("id"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel10.setText("Description");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Style");

        pictureLabel.setToolTipText("");
        pictureLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pictureLabel.setName("prodPictureXXX"); // NOI18N

        jButton1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton1.setText("Load Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1loadImage(evt);
            }
        });

        buyerid.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        buyerid.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buyerid.setName("buyerid"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Buyer");

        cbSRType.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cbSRType.setName("cbSamplerecordstatus"); // NOI18N
        cbSRType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSRTypeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel11.setText("Type");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("AuditDate");

        issuedbyLabel.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        issuedbyLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        issuedbyLabel.setName("AuditDate"); // NOI18N

        styleLbl.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        styleLbl.setName("style"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Qty");
        jLabel6.setName("labelQty"); // NOI18N

        qtyLbl.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        qtyLbl.setName("qty"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel7.setText("image best fit size:  197 x 134 px");

        buyernameLbl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        buyernameLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buyernameLbl.setName("buyername"); // NOI18N

        client_id1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_id1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id1.setName("prno"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Action", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 10))); // NOI18N

        PickfROBtn.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        PickfROBtn.setText("Pick from RO");
        PickfROBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PickfROBtnActionPerformed(evt);
            }
        });

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

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(PickfROBtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 108, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, printGraphButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(PickfROBtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(printGraphButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("AuditUser");

        LblAuditUser.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblAuditUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblAuditUser.setName("AuditUser"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(4, 4, 4)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(client_id, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(client_id1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(13, 13, 13))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(jLabel7))
                            .add(pictureLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(1, 1, 1)))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel11)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel2)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel6)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(styleLbl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .add(descriptionLbl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(buyerid, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(buyernameLbl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(cbSRType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 172, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(qtyLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 83, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(issuedbyLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(LblAuditUser, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 119, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(2, 2, 2)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(client_id, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(client_id1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(pictureLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(1, 1, 1)
                .add(jLabel7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jButton1))
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel11)
                            .add(cbSRType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(descriptionLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(styleLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel3)
                            .add(buyerid, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(buyernameLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(qtyLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel6))))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel5)
                    .add(issuedbyLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel8)
                    .add(LblAuditUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBounds(0, 60, 647, 230);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        okButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        okButton.setBounds(660, 90, 80, 20);
        jLayeredPane1.add(okButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CancelButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        CancelButton.setBounds(660, 120, 80, 20);
        jLayeredPane1.add(CancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        applyButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        applyButton.setText("Apply"); // NOI18N
        applyButton.setName("applyButton"); // NOI18N
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });
        applyButton.setBounds(660, 150, 80, 20);
        jLayeredPane1.add(applyButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Size Breakdown", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 10))); // NOI18N

        DesktopToolbar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DesktopToolbar1.setFloatable(false);
        DesktopToolbar1.setRollover(true);
        DesktopToolbar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DesktopToolbar1.setMargin(new java.awt.Insets(200, 0, 0, 0));
        DesktopToolbar1.setMaximumSize(new java.awt.Dimension(367, 42));
        DesktopToolbar1.setMinimumSize(new java.awt.Dimension(367, 42));

        newButton1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        newButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/new1.jpg"))); // NOI18N
        newButton1.setText("New");
        newButton1.setToolTipText("Create a link to asociado"); // NOI18N
        newButton1.setActionCommand("new");
        newButton1.setEnabled(false);
        newButton1.setFocusable(false);
        newButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        newButton1.setMaximumSize(new java.awt.Dimension(50, 40));
        newButton1.setMinimumSize(new java.awt.Dimension(50, 40));
        newButton1.setPreferredSize(new java.awt.Dimension(50, 40));
        newButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar1.add(newButton1);

        editButton1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        editButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit1.jpg"))); // NOI18N
        editButton1.setText("Edit");
        editButton1.setToolTipText("Edit asociado"); // NOI18N
        editButton1.setActionCommand("edit");
        editButton1.setEnabled(false);
        editButton1.setFocusable(false);
        editButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        editButton1.setMaximumSize(new java.awt.Dimension(45, 40));
        editButton1.setMinimumSize(new java.awt.Dimension(45, 40));
        editButton1.setPreferredSize(new java.awt.Dimension(45, 40));
        editButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar1.add(editButton1);

        deleteButton1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        deleteButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete1.jpg"))); // NOI18N
        deleteButton1.setText("Delete");
        deleteButton1.setToolTipText("Remove link to asociado"); // NOI18N
        deleteButton1.setActionCommand("delete");
        deleteButton1.setEnabled(false);
        deleteButton1.setFocusable(false);
        deleteButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        deleteButton1.setMaximumSize(new java.awt.Dimension(45, 40));
        deleteButton1.setMinimumSize(new java.awt.Dimension(45, 40));
        deleteButton1.setPreferredSize(new java.awt.Dimension(45, 40));
        deleteButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar1.add(deleteButton1);

        jSeparator5.setMaximumSize(new java.awt.Dimension(15, 32767));
        jSeparator5.setPreferredSize(new java.awt.Dimension(15, 0));
        DesktopToolbar1.add(jSeparator5);

        sortButton1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        sortButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/sort.jpg"))); // NOI18N
        sortButton1.setText("Sort");
        sortButton1.setActionCommand("sort");
        sortButton1.setEnabled(false);
        sortButton1.setFocusable(false);
        sortButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sortButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        sortButton1.setMaximumSize(new java.awt.Dimension(45, 40));
        sortButton1.setMinimumSize(new java.awt.Dimension(45, 40));
        sortButton1.setPreferredSize(new java.awt.Dimension(45, 40));
        sortButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar1.add(sortButton1);

        filterButton1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        filterButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/filter1.jpg"))); // NOI18N
        filterButton1.setText("Filter");
        filterButton1.setActionCommand("filter");
        filterButton1.setEnabled(false);
        filterButton1.setFocusable(false);
        filterButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        filterButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        filterButton1.setMaximumSize(new java.awt.Dimension(45, 40));
        filterButton1.setMinimumSize(new java.awt.Dimension(45, 40));
        filterButton1.setPreferredSize(new java.awt.Dimension(45, 40));
        filterButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar1.add(filterButton1);

        jSeparator6.setMaximumSize(new java.awt.Dimension(15, 32767));
        jSeparator6.setPreferredSize(new java.awt.Dimension(15, 0));
        DesktopToolbar1.add(jSeparator6);

        printButton1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        printButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/print.jpg"))); // NOI18N
        printButton1.setText("Print");
        printButton1.setActionCommand("print");
        printButton1.setEnabled(false);
        printButton1.setFocusable(false);
        printButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        printButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        printButton1.setMaximumSize(new java.awt.Dimension(60, 40));
        printButton1.setPreferredSize(new java.awt.Dimension(60, 40));
        printButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar1.add(printButton1);

        jSeparator7.setMaximumSize(new java.awt.Dimension(15, 32767));
        jSeparator7.setPreferredSize(new java.awt.Dimension(15, 0));
        DesktopToolbar1.add(jSeparator7);

        refreshButton1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        refreshButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/refresh1.jpg"))); // NOI18N
        refreshButton1.setText("Refresh");
        refreshButton1.setActionCommand("refresh");
        refreshButton1.setEnabled(false);
        refreshButton1.setFocusable(false);
        refreshButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        refreshButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        refreshButton1.setMaximumSize(new java.awt.Dimension(60, 40));
        refreshButton1.setPreferredSize(new java.awt.Dimension(60, 40));
        refreshButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar1.add(refreshButton1);

        SizeBrowserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(SizeBrowserTable);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, DesktopToolbar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .add(DesktopToolbar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
        );

        jPanel3.setBounds(0, 290, 430, 170);
        jLayeredPane1.add(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        topLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        topLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/topBar.jpg"))); // NOI18N
        topLabel1.setMaximumSize(new java.awt.Dimension(100, 44));
        topLabel1.setMinimumSize(new java.awt.Dimension(100, 44));
        topLabel1.setPreferredSize(new java.awt.Dimension(100, 647));
        topLabel1.setBounds(-40, 0, 800, 647);
        jLayeredPane1.add(topLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        SRStatusIDLbl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        SRStatusIDLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SRStatusIDLbl.setName("samplerecordstatusid"); // NOI18N

        FacturasBrowserJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(FacturasBrowserJTable);

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

        saveChangesButton1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        saveChangesButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit1.jpg"))); // NOI18N
        saveChangesButton1.setText("Apply Changes");
        saveChangesButton1.setActionCommand("save");
        saveChangesButton1.setEnabled(false);
        saveChangesButton1.setFocusable(false);
        saveChangesButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveChangesButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        saveChangesButton1.setMaximumSize(new java.awt.Dimension(100, 40));
        saveChangesButton1.setMinimumSize(new java.awt.Dimension(100, 40));
        saveChangesButton1.setPreferredSize(new java.awt.Dimension(100, 40));
        saveChangesButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DesktopToolbar.add(saveChangesButton1);

        selectidLbl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        selectidLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        selectidLbl.setName("selectid"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(1, 1, 1)
                .add(jLayeredPane1))
            .add(DesktopToolbar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 378, Short.MAX_VALUE)
                    .add(selectidLbl)
                    .add(0, 379, Short.MAX_VALUE)))
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 378, Short.MAX_VALUE)
                    .add(SRStatusIDLbl)
                    .add(0, 379, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 464, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(DesktopToolbar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 96, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 312, Short.MAX_VALUE)
                    .add(selectidLbl)
                    .add(0, 313, Short.MAX_VALUE)))
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 312, Short.MAX_VALUE)
                    .add(SRStatusIDLbl)
                    .add(0, 313, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
        
  private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
                       
      // tambahkan created by dan tanggal jika tidak ada
       try{
           LblAuditUser.setText(configuration.getField( "system_user_name" ));
           }
      catch( Exception error ){
                
                System.out.println( "... tidak bisa buat issuedby:" );                
                System.out.println( KMetaUtilsClass.getStackTrace( error ) );                
                //throw new KExceptionClass( "Could not locate a magnus.conf file", error );                  
                
            }
               
      //issueddateLabel.setText("2013-06-01 00:00:00");
      
      try {

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

    private void jButton1loadImage(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1loadImage

        loadPic();

    }//GEN-LAST:event_jButton1loadImage

    private void cbSRTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSRTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSRTypeActionPerformed

    private void PickfROBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PickfROBtnActionPerformed

        try
        {
            outstandingorderBrowserClass outstandingorderBrowser = new outstandingorderBrowserClass(
                configuration, log, new javax.swing.JTable(), this );

            outstandingorderBrowser.initializeTable();

            selectDialogClass selector = new selectDialogClass(
                configuration, log, this, outstandingorderBrowser, "Select Received Order" );

            // dont want to allow this, for example
            selector.getNewButton().setEnabled(false);
            selector.getEditButton().setEnabled(false);
            selector.getDeleteButton().setEnabled(false);
            

            parentID = selector.showDialog();

            buyerid.setText( Long.toString(parentID));

if( parentID == -1 ) 
            {
                throw new KExceptionClass( "You must select a Received Order!", null);
            }
            else
            {
                persistentObjectManagerClass ROPOM = new persistentObjectManagerClass(configuration, log);
                outstandingorderClass ROClass = new outstandingorderClass();
                ROClass = ( outstandingorderClass ) ROPOM.copy4( parentID, outstandingorderClass.class );
                //mining the data
                styleLbl.setText(ROClass.getStyle());
                buyerid.setText(Long.toString(ROClass.getBuyerid()));
                
                //refresh item
                refreshButton.doClick();
                
                selectidLbl.setText(Long.toString(ROClass.getId()));
                qtyLbl.setText(Long.toString((long)ROClass.getQty()));
                
                //get image
                if(ROClass.getSrid()>0)
                {
                    // its mean there is picture
                    persistentObjectManagerClass SRPOM = new persistentObjectManagerClass(configuration, log);
                    samplerecordClass SRClass = new samplerecordClass();
                    SRClass = ( samplerecordClass ) SRPOM.copy4( ROClass.getSrid(), samplerecordClass.class );                    
                    
                    if(SRClass.getImage()!=null)
                    {
                        pictureLabel.setIcon( new ImageIcon( SRClass.getImage() ));
                    }
                    descriptionLbl.setText(SRClass.getDescription());
                    cbSRType.setSelectedIndex((int) SRClass.getSamplerecordtypeid());
                    styleLbl.setText(SRClass.getStyle());
                    buyerid.setText(Long.toString(SRClass.getBuyerid()));
                    buyernameLbl.setText(SRClass.getBuyername());
                    //qtyLbl.setText(SRClass.getQ);
                    
                }
                
                
                

            }
        }
        catch( Exception error	){
            log.log( this, KMetaUtilsClass.getStackTrace( error ) );
            KMetaUtilsClass.showErrorMessageFromException( this, error );
        }
    }//GEN-LAST:event_PickfROBtnActionPerformed

    private void printGraphButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printGraphButton1ActionPerformed

        try{

            log.log( this, "Printing Production Record" );
            persistentObjectManagerClass persistentObjectManager =
            new persistentObjectManagerClass( configuration, log );

            //materialize the sdg
            //   BTBHeadersamplerecordClassClass po = new BKBHeaderClass();
            //   po = (BKBHeaderClass) persistentObjectManager.copy4( sdg_id, ASHURSampleDeliveryGroupClass.class );

            persistentObjectManagerClass POM = new persistentObjectManagerClass(configuration, log);
            ProdRecClass ProdRecBrowser = ( ProdRecClass ) POM.copy4( ((ProdRecClass)KDialogController.getCurrentObjectDisplayed()).getId(), ProdRecClass.class );

            //materialize Product In Type
            //persistentObjectManagerClass POMProdRecBrowserType = new persistentObjectManagerClass(configuration, log);
            //BTBTypeClass ProdRecBrowserType = ( BTBTypeClass ) POMProdRecBrowserType.copy4( ProdRecBrowser.getTypeID(), BTBTypeClass.class );

            //materialize Supplier
            //persistentObjectManagerClass POMSupp = new persistentObjectManagerClass(configuration, log);
            //supplierClass Supp = ( supplierClass ) POMSupp.copy4( ProdRecBrowser.getSupplierID(), supplierClass.class );

            //BTBHeaderTermClass poterm = new BTBHeaderTermClass();
            //poterm = (BTBHeaderTermClass) persistentObjectManager.copy4( po.getTermPaymentID(), BTBHeaderTermClass.class );

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
            headerSection.printText("PRODUCTION RECORD",          170, 100 );
            headerSection.printLine(170,114,307,114);
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
            /*          leftTopSection.setFont( new Font( "arial", Font.PLAIN, 10) );
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

            */
            // KPrintSectionClass rightTopSection = new KPrintSectionClass(configuration, log, 520, 130 );
            leftTopSection.setFont( new Font( "arial", Font.PLAIN, 10) );
            //            leftTopSection.printText("Ship To",                                         320, 20 );
            leftTopSection.printText(configuration.getField("per_nama").toString(),0, 20 );
            leftTopSection.printText(configuration.getField("per_alamat1").toString(),0, 30 );
            leftTopSection.printText(configuration.getField("per_alamat2").toString(),0, 40 );
            //            leftTopSection.printText("NPWP",                                            0, 50 );
            //            leftTopSection.printText("123.123.123.123",                                 0, 60 );
            leftTopSection.printText("Phone: "+configuration.getField("per_telp").toString()+" Fax: "+configuration.getField("per_fax").toString(),0, 50 );
            //            leftTopSection.printText("Atn.",                                            320, 70 );
            //            leftTopSection.printText("Arum / Ibu Lisye",                                360, 70 );

            samplerecordstyleClass Type = ( samplerecordstyleClass ) POM.copy4(ProdRecBrowser.getSamplerecordtypeid() , samplerecordstyleClass.class );

            // informasi BTB
            leftTopSection.printText("NO",                              300, 20 );
            leftTopSection.printText(ProdRecBrowser.getPrno(),                 360, 20 );
            leftTopSection.printText("Type",                             300, 30 );
            leftTopSection.printText(Type.getNama(),    360, 30 );
            leftTopSection.printText("Buyer",                        300, 40 );
            leftTopSection.printText(ProdRecBrowser.getBuyername(),          360, 40 );
            leftTopSection.printText("Description",                            300, 50 );
            leftTopSection.printText(ProdRecBrowser.getDescription(),                  360, 50 );
            leftTopSection.printText("Style",                           300, 60 );
            leftTopSection.printText(ProdRecBrowser.getStyle(),      360, 60 );
            leftTopSection.printText("Qty",                           300, 70 );
            leftTopSection.printText(Long.toString(ProdRecBrowser.getQty()),      360, 70 );

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

            // Print Size BreakDown
            dbTransactionClientClass dbTranSize =
            new dbTransactionClientClass( configuration, log );

            dbTranSize.prepare(
                " select pv.warna,nvl(XS,0) XS,nvl(S,0) S, nvl(M,0) M, nvl(L,0) L, nvl(XL,0) XL, nvl(XXL,0) XXL, nvl(XXXL,0) XXXL,prs.total  " +
                " from " +
                " (" +
                "    SELECT distinct sz.warna,sz.ukuran,prs.qty " +
                "    FROM  productionrecordsize prs  left join sizecolour sz on prs.sizeid=sz.id " +
                " where prs.hdrid=:v1 " +
                "    ) " +
                "    pivot " +
                "    ( " +
                "    sum(qty) " +
                "    for " +
                "    (ukuran) " +
                "    in " +
                "    ('XS' as XS,'S' as S,'M' as M,'L' as L,'XL' as XL,'XXL' as XXL,'3XL' as XXXL) " +
                "    ) pv " +
                " left join " +
                "    ( " +
                "    SELECT distinct sz.warna,sum(prs.qty) total " +
                "    FROM  productionrecordsize prs  left  " +
                "    join sizecolour sz on prs.sizeid=sz.id " +
                "    where prs.hdrid=:v2 " +   
                "    group by sz.warna " +
                "    ) prs " +
                "    on prs.warna = pv.warna"         
            );

            dbTranSize.bind( ":v1",  ProdRecBrowser.getId() );
            dbTranSize.bind( ":v2",  ProdRecBrowser.getId() );
            dbTranSize.executeQuery( 0, 655356 );
            // --------------------------------------------------------

            //to get analysis info
            dbTransactionClientClass AnalysisdbTranSize =
            new dbTransactionClientClass( configuration, log );

            //for each sample, print sample and get analysis info
            //while( dbTransaction.fetch() ) {
                //print out sample info
                KPrintSectionClass poitem = new KPrintSectionClass(configuration, log, 520, 90 );

                poitem.setFont( new Font( "arial", Font.PLAIN, 8) );

                //String valueBuffer = (String) dbTransaction.getProperty( "SAMPLE_LAB_ID" );
                // setup the DB printer
                KPrintDataTableClass dbTable = new KPrintDataTableClass(
                    configuration, log,
                    dbTranSize, printJob, 0, 655356 );

                //print anasys info
                dbTable.addField( "WARNA","Colour",100 );
                dbTable.addField( "XS", "XS",20 );
                dbTable.addField( "S", "S",20 );
                dbTable.addField( "M", "M",20 );
                dbTable.addField( "L", "L",20 );
                dbTable.addField( "XL","XL",20 );
                dbTable.addField( "XXL","XXL",20 );
                dbTable.addField( "XXXL","3XL",20 );
                dbTable.addField( "TOTAL","Total",30 );

                //dbTable.addSummary( "CLIENT ProdRecICE", KPrintDataTableClass.SUM, "Total: $", null, 2 );

                dbTable.setPrintingField( "Colour" );
                dbTable.setPrintingField( "XS" );
                dbTable.setPrintingField( "S" );
                dbTable.setPrintingField( "M" );
                dbTable.setPrintingField( "L" );
                dbTable.setPrintingField( "XL" );
                dbTable.setPrintingField( "XXL" );
                dbTable.setPrintingField( "3XL" );
                dbTable.setPrintingField( "Total" );

                // summary
                dbTable.addSummary( "XS", KPrintDataTableClass.SUM, null, null, 2 );
                dbTable.addSummary( "S", KPrintDataTableClass.SUM, null, null, 2 );
                dbTable.addSummary( "M", KPrintDataTableClass.SUM, null, null, 2 );
                dbTable.addSummary( "L", KPrintDataTableClass.SUM, null, null, 2 );
                dbTable.addSummary( "XL", KPrintDataTableClass.SUM, null, null, 2 );
                dbTable.addSummary( "XXL", KPrintDataTableClass.SUM, null, null, 2 );
                dbTable.addSummary( "3XL", KPrintDataTableClass.SUM, null, null, 2 );
                dbTable.addSummary( "Total", KPrintDataTableClass.SUM, null, null, 2 );

                dbTable.setHorizontalSpace( 10 );
                printJob.setDefaultFont( new Font("Arial", Font.PLAIN, 8) );
                int oldLeftMargin = printJob.getLeftMargin();
                printJob.setLeftMargin(40);
                dbTable.setHeadersMode( dbTable.HEADER_TYPE_INLINEHEADER );

                dbTable.print();



            dbTransactionClientClass dbTransaction =
            new dbTransactionClientClass( configuration, log );

            dbTransaction.prepare(
                "  select rownum,vpr.nama itemname,pri.qty,vpr.unit unit,pri.comp,pri.tolerance,pri.qtyneed " +
                " from " +
                " productionrecorditem pri " +
                " left join v_sr_item vpr on pri.itemid=vpr.id " +
                " where pri.samplerecordid=:v1 "
            );

            dbTransaction.bind( ":v1",  ProdRecBrowser.getId() );
            dbTransaction.executeQuery( 0, 655356 );
            // --------------------------------------------------------

            //to get analysis info
            dbTransactionClientClass AnalysisdbTransaction =
            new dbTransactionClientClass( configuration, log );

            //for each sample, print sample and get analysis info
            //while( dbTransaction.fetch() ) {
                //print out sample info
                KPrintSectionClass pritem = new KPrintSectionClass(configuration, log, 520, 290 );

                pritem.setFont( new Font( "arial", Font.PLAIN, 8) );

                //String valueBuffer = (String) dbTransaction.getProperty( "SAMPLE_LAB_ID" );
                // setup the DB printer
                KPrintDataTableClass dbTablePR = new KPrintDataTableClass(
                    configuration, log,
                    dbTransaction, printJob, 0, 655356 );

                //print anasys info
                dbTablePR.addField( "ROWNUM","No",10 );
                dbTablePR.addField( "ITEMNAME", "Name",200 );
                dbTablePR.addField( "QTY", "Qty",50 );
                dbTablePR.addField( "UNIT", "Unit",80 );
                dbTablePR.addField( "COMP", "Comp",50 );
                dbTablePR.addField( "TOLERANCE","Tolerance",50 );
                dbTablePR.addField( "QTYNEED","QtyNeed",50 );

                //dbTable.addSummary( "CLIENT ProdRecICE", KPrintDataTableClass.SUM, "Total: $", null, 2 );

                dbTablePR.setPrintingField( "No" );
                dbTablePR.setPrintingField( "Name" );
                dbTablePR.setPrintingField( "Qty" );
                dbTablePR.setPrintingField( "Unit" );
                dbTablePR.setPrintingField( "Comp" );
                dbTablePR.setPrintingField( "Tolerance" );
                dbTablePR.setPrintingField( "QtyNeed" );

                // summary
                //dbTable.addSummary( "Price", KPrintDataTableClass.SUM, null, null, 2 );

                dbTablePR.setHorizontalSpace( 10 );
                printJob.setDefaultFont( new Font("Arial", Font.PLAIN, 8) );
                int oldLeftMarginPR = printJob.getLeftMargin();
                printJob.setLeftMargin(40);
                dbTablePR.setHeadersMode( dbTablePR.HEADER_TYPE_INLINEHEADER );

                
                dbTablePR.print();

                printJob.setDefaultFont( new Font("Arial", Font.PLAIN, 10) );
                printJob.setLeftMargin(oldLeftMarginPR);

                //Footer section
                KPrintSectionClass footerSection = new KPrintSectionClass(configuration, log, 520, 140);

                footerSection.setFont( new Font( "arial", Font.PLAIN, 10) );

                footerSection.printText("Type",         0, 10 );
                footerSection.printText(ProdRecBrowser.getAuditUser(),0, 30 );
                footerSection.printText(DateFormat.getDateTimeInstance().format(ProdRecBrowser.getAuditDate()),0, 40 );
                footerSection.printText("Kontrol Kualitas", 200, 10 );
                footerSection.printText("Mengetahui",       400, 10 );

                //                    footerSection.printText("Term Payment",                                   0, 120 );
                //                    footerSection.printText(poterm.getName(),                                   100, 120 );
                //                    footerSection.printText("Delivery Date",                                  0, 130 );
                //                    footerSection.printText(po.getDeliveryDate().toLocaleString(),                 100, 130 );
                //                    footerSection.printText("Note",                                            0, 140 );

                printJob.printSection( footerSection, KPrintJobClass.CENTER );
                //footerSection.printText(po.get,                         40, 40 );

                //footerSection.printText("Note",                                            0, 40 );

                //
                //                    String valueBuffer = (String) dbTransaction.getProperty( "ITEMNAME" );
                //                    poitem.printText(valueBuffer,                                    65, 10 );
                //                    valueBuffer = (String) dbTransaction.getProperty( "KODE" );
                //                    poitem.printText(valueBuffer,                                    265, 10 );
                //                    valueBuffer = (String) dbTransaction.getProperty( "ProdRecID" );
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

public void loadPic(){
    
    try{
        
          JFileChooser chooser = new JFileChooser();
          int returnVal = chooser.showOpenDialog( this );
          
          if( returnVal == JFileChooser.APPROVE_OPTION ){
       
              // get file path
              String fileChosen = chooser.getSelectedFile().getAbsolutePath();
                               
              KBinaryDataClass fileContents = new KBinaryDataClass();
              
              fileContents.loadFromDisk( fileChosen );
              
              // replace image
              log.log( this, "Replace Image...." + fileContents.length() );   
              
              pictureLabel.setIcon( new ImageIcon( fileContents.data() ) );              
              pictureLabel.repaint();
              
              productPictureRawDataContainer.setBinaryData( fileContents.data() );
          }
          
        } catch (KExceptionClass error ) {

              // log error
              log.log( this, KMetaUtilsClass.getStackTrace( error ) );

              // show error message
              KMetaUtilsClass.showErrorMessageFromException( getOwner(), error );               
        }           
}

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JToolBar DesktopToolbar;
    private javax.swing.JToolBar DesktopToolbar1;
    private javax.swing.JTable FacturasBrowserJTable;
    private javax.swing.JLabel LblAuditUser;
    private javax.swing.JButton PickfROBtn;
    private javax.swing.JLabel SRStatusIDLbl;
    private javax.swing.JTable SizeBrowserTable;
    private javax.swing.JButton applyButton;
    private javax.swing.JLabel buyerid;
    private javax.swing.JLabel buyernameLbl;
    private javax.swing.JComboBox cbSRType;
    private javax.swing.ButtonGroup clientDiscountGroup;
    private javax.swing.JLabel client_id;
    private javax.swing.JLabel client_id1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JTextField descriptionLbl;
    private javax.swing.JButton editButton;
    private javax.swing.JButton editButton1;
    private javax.swing.JButton filterButton;
    private javax.swing.JButton filterButton1;
    private javax.swing.JLabel issuedbyLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JButton newButton;
    private javax.swing.JButton newButton1;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JButton printButton;
    private javax.swing.JButton printButton1;
    private javax.swing.JButton printGraphButton1;
    private javax.swing.JTextField qtyLbl;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton refreshButton1;
    private javax.swing.JButton saveChangesButton1;
    private javax.swing.JLabel selectidLbl;
    private javax.swing.JButton sortButton;
    private javax.swing.JButton sortButton1;
    private javax.swing.JTextField styleLbl;
    private javax.swing.JLabel topLabel1;
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
        
        ProdRecClass product = (ProdRecClass) businessObject;
        if( product.getImage() != null ){
            
            pictureLabel.setIcon(  new ImageIcon( product.getImage() ) );            
        }
        
        
    }

    @Override
    public void preUpdate(KBusinessObjectClass businessObject) throws Exception {
    }

    @Override
    public void postUpdate(KBusinessObjectClass businessObject) throws Exception {
    }    
    

}
