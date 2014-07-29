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
import KFramework30.Widgets.KDialogControllerClass;

//app
import KFramework30.Widgets.KDialogControllerClass.KDialogInterface;
import KFramework30.Widgets.KDropDownFillerClass;
import KFramework30.Widgets.selectDialogClass;
import ProblemDomainComponent.buyerClass;
import ProblemDomainComponent.ReceivedOrderClass;
import ProblemDomainComponent.ProdRecClass;
import ProblemDomainComponent.SizeMatrixClass;
import ProblemDomainComponent.samplerecordClass;
import java.awt.Dimension;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;

// rtl
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

import javax.swing.JFileChooser;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JRViewer;


import java.net.URL;
import net.sf.jasperreports.engine.util.JRLoader;

import thoiyk.HumanInterfaceComponent.ProductionRecordSize.ProdRecSizeBrowserClass;
import thoiyk.HumanInterfaceComponent.ProdutionRecordItem.ProdRecItemBrowserClass;
import thoiyk.HumanInterfaceComponent.SizeMatrix.SizeMatrixBrowserClass;
import thoiyk.HumanInterfaceComponent.ReceivedOrder.outstandingorderBrowserClass;


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
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        justificationTable = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        descriptionLbl = new javax.swing.JTextField();
        LblHdrID = new javax.swing.JLabel();
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
        jPanel5 = new javax.swing.JPanel();
        PickfROBtn1 = new javax.swing.JButton();
        LblS1 = new javax.swing.JLabel();
        LblS2 = new javax.swing.JLabel();
        LblS3 = new javax.swing.JLabel();
        LblS4 = new javax.swing.JLabel();
        LblS5 = new javax.swing.JLabel();
        LblS6 = new javax.swing.JLabel();
        LblS7 = new javax.swing.JLabel();
        LblS8 = new javax.swing.JLabel();
        LblS9 = new javax.swing.JLabel();
        LblS10 = new javax.swing.JLabel();
        LblS11 = new javax.swing.JLabel();
        LblS12 = new javax.swing.JLabel();
        LblS13 = new javax.swing.JLabel();
        LblS14 = new javax.swing.JLabel();
        LblS15 = new javax.swing.JLabel();
        LblSizeMatrixID = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
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
        jPanel7 = new javax.swing.JPanel();
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
        SRStatusIDLbl = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        selectidLbl = new javax.swing.JLabel();

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 805, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 535, Short.MAX_VALUE)
        );

        justificationTable.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        justificationTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(justificationTable);

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

        LblHdrID.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblHdrID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblHdrID.setName("id"); // NOI18N

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
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(printGraphButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 107, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(PickfROBtn))
                .addContainerGap())
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
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(4, 4, 4)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(jLabel1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblHdrID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
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
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 119, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(2, 2, 2)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblHdrID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
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

        jPanel1.setBounds(0, 0, 650, 230);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SizeMatrix", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 10))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        PickfROBtn1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        PickfROBtn1.setText("Pick Size");
        PickfROBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PickfROBtn1ActionPerformed(evt);
            }
        });

        LblS1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblS1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS1.setName("S1"); // NOI18N

        LblS2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblS2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS2.setName("S2"); // NOI18N

        LblS3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblS3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS3.setName("S3"); // NOI18N

        LblS4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblS4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS4.setName("S4"); // NOI18N

        LblS5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblS5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS5.setName("S5"); // NOI18N

        LblS6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblS6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS6.setName("S6"); // NOI18N

        LblS7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblS7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS7.setName("S7"); // NOI18N

        LblS8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblS8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS8.setName("S8"); // NOI18N

        LblS9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblS9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS9.setName("S9"); // NOI18N

        LblS10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblS10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS10.setName("S10"); // NOI18N

        LblS11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblS11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS11.setName("S11"); // NOI18N

        LblS12.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblS12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS12.setName("S12"); // NOI18N

        LblS13.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblS13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS13.setName("S13"); // NOI18N

        LblS14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblS14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS14.setName("S14"); // NOI18N

        LblS15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblS15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS15.setName("S15"); // NOI18N

        LblSizeMatrixID.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblSizeMatrixID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblSizeMatrixID.setName("SizeMatrixID"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(PickfROBtn1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblSizeMatrixID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(LblS1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblS2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblS3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblS4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblS5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblS6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblS7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblS8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblS9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblS10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblS11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblS12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblS13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblS14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblS15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(PickfROBtn1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblSizeMatrixID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(LblS1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblS2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblS3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblS4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblS5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblS6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblS7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblS8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblS9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblS10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblS11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblS12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblS13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblS14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblS15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(17, 17, 17))
        );

        jPanel5.setBounds(0, 230, 760, 80);
        jLayeredPane1.add(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);

        FacturasBrowserJTable.setAutoCreateRowSorter(true);
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

        org.jdesktop.layout.GroupLayout jPanel8Layout = new org.jdesktop.layout.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(DesktopToolbar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel8Layout.createSequentialGroup()
                .add(DesktopToolbar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Detail Grid", jPanel8);

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

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setAutoscrolls(true);

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

        SRStatusIDLbl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        SRStatusIDLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SRStatusIDLbl.setName("samplerecordstatusid"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel7Layout = new org.jdesktop.layout.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel7Layout.createSequentialGroup()
                        .add(0, 0, 0)
                        .add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE))
                    .add(DesktopToolbar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(6, 6, 6))
            .add(jPanel7Layout.createSequentialGroup()
                .add(SRStatusIDLbl)
                .add(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .add(0, 0, 0)
                .add(DesktopToolbar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 232, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 37, Short.MAX_VALUE)
                .add(SRStatusIDLbl))
        );

        jTabbedPane2.addTab("Size BreakDown", jPanel7);

        jTabbedPane2.setBounds(0, 310, 760, 350);
        jLayeredPane1.add(jTabbedPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        okButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        okButton.setBounds(670, 40, 80, 20);
        jLayeredPane1.add(okButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CancelButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        CancelButton.setBounds(670, 70, 80, 20);
        jLayeredPane1.add(CancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        applyButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        applyButton.setText("Apply"); // NOI18N
        applyButton.setName("applyButton"); // NOI18N
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });
        applyButton.setBounds(670, 100, 80, 20);
        jLayeredPane1.add(applyButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );

        jPanel4.setBounds(-30, 260, 100, 100);
        jLayeredPane1.add(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        selectidLbl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        selectidLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        selectidLbl.setName("selectid"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(1, 1, 1)
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE))
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 378, Short.MAX_VALUE)
                    .add(selectidLbl)
                    .add(0, 379, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 329, Short.MAX_VALUE)
                    .add(selectidLbl)
                    .add(0, 329, Short.MAX_VALUE)))
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
                ReceivedOrderClass ROClass = new ReceivedOrderClass();
                ROClass = ( ReceivedOrderClass ) ROPOM.copy4( parentID, ReceivedOrderClass.class );
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
                    //cbSRType.setSelectedIndex((int) SRClass.getSamplerecordtypeid());
                    //cbSRType.setSelectedItem((int) SRClass.getSamplerecordtypeid());
                    
                    styleLbl.setText(SRClass.getStyle());
                    buyerid.setText(Long.toString(ROClass.getBuyerid()));

                    persistentObjectManagerClass BuyerPOM = new persistentObjectManagerClass(configuration, log);
                    buyerClass buyer = new buyerClass();
                    buyer = ( buyerClass ) BuyerPOM.copy4( ROClass.getBuyerid(), buyerClass.class );
                    
                    buyernameLbl.setText(buyer.getNama());
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
    
              
        try 
        {
            
            Map<String, Object> parameters = new HashMap<String, Object>();
            Integer hdrID = Integer.parseInt(LblHdrID.getText());
            parameters.put("PRId", hdrID);
            //File file = new File("").getAbsolutePath()+"src/main/java/thoiyk/HumanInterfaceComponent/ProductionRecord/ProductionRecord.jrxml";
         //   InputStream in =getClass().getResourceAsStream("src/main/java/thoiyk/HumanInterfaceComponent/ProductionRecord/ProductionRecord.jasper"); 
          //  File("").getAbsolutePath()+"src/com/ztscorp/lms/reports/HibernateQueryDemoReport.jrxml"
           // JasperDesign jasperDesign = JRXmlLoader.load(in);
           //  JasperDesign jasperDesign = JRXmlLoader.load("file:ProductionRecord.jrxml");
        //    JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
        //    Connection jdbcConnection = DriverManager.getConnection(configuration.getField( "jasper_jdbc" ), "sample", "sample");
         //   JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jdbcConnection);
         
           // JasperPrint jasperPrint = (JasperPrint)JRLoader.loadObject(new URL("http://localhost:8080/Sample2Server1/ProductionRecord.jrxml"));
             Connection jdbcConnection = DriverManager.getConnection(configuration.getField( "jasper_jdbc" ), "sample", "sample");
             
               //JasperDesign jasperDesign = (JasperDesign)JRLoader.loadObject(new URL("http://localhost:8080/Sample2Server1/ProductionRecord.jrxml"));
               JasperReport jasperReport = (JasperReport)JRLoader.loadObject(new URL(configuration.getField( "jasper_url" )+"report/ProductionRecord.jasper"));
            //    JasperPrint jasperPrint = (JasperPrint)JRLoader.loadObject(new URL("http://localhost:8080/Sample2Server1/ProductionRecord.jrxml"));
             
             JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jdbcConnection);
             
            JDialog jv = new JDialog();
            jv.setModal(true);
        //    jv.setm
            jv.setMinimumSize(new Dimension(700,600));
           // jv.setSize(new Dimension(900,990));
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

    private void PickfROBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PickfROBtn1ActionPerformed
   try
        {
            SizeMatrixBrowserClass SizeMatrixBrowser = new SizeMatrixBrowserClass(
                configuration, log, new javax.swing.JTable(), this );

            SizeMatrixBrowser.initializeTable();

            selectDialogClass selector = new selectDialogClass(
                configuration, log, this, SizeMatrixBrowser, "Select Size" );

            // dont want to allow this, for example
            //selector.getNewButton().setEnabled(false);
            selector.getEditButton().setEnabled(false);
            selector.getDeleteButton().setEnabled(false);
            

            parentID = selector.showDialog();

//            buyerid.setText( Long.toString(parentID));

            if( parentID == -1 ) 
            {
                throw new KExceptionClass( "You must select a Size Matrix!", null);
            }
            else
            {
                persistentObjectManagerClass ROPOM = new persistentObjectManagerClass(configuration, log);
                SizeMatrixClass ROClass = new SizeMatrixClass();
                ROClass = ( SizeMatrixClass ) ROPOM.copy4( parentID, SizeMatrixClass.class );
                
                //mining the data
                LblS1.setText(ROClass.getS1());
                LblS2.setText(ROClass.getS2());
                LblS3.setText(ROClass.getS3());
                LblS4.setText(ROClass.getS4());
                LblS5.setText(ROClass.getS5());
                LblS6.setText(ROClass.getS6());
                LblS7.setText(ROClass.getS7());
                LblS8.setText(ROClass.getS8());
                LblS9.setText(ROClass.getS9());
                LblS10.setText(ROClass.getS10());
                LblS11.setText(ROClass.getS11());
                LblS12.setText(ROClass.getS12());
                LblS13.setText(ROClass.getS13());
                LblS14.setText(ROClass.getS14());
                LblS15.setText(ROClass.getS15());
                LblSizeMatrixID.setText(Long.toString(ROClass.getID()));

            }
        }
        catch( Exception error	){
            log.log( this, KMetaUtilsClass.getStackTrace( error ) );
            KMetaUtilsClass.showErrorMessageFromException( this, error );
        }
    }//GEN-LAST:event_PickfROBtn1ActionPerformed

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
    private javax.swing.JLabel LblHdrID;
    private javax.swing.JLabel LblS1;
    private javax.swing.JLabel LblS10;
    private javax.swing.JLabel LblS11;
    private javax.swing.JLabel LblS12;
    private javax.swing.JLabel LblS13;
    private javax.swing.JLabel LblS14;
    private javax.swing.JLabel LblS15;
    private javax.swing.JLabel LblS2;
    private javax.swing.JLabel LblS3;
    private javax.swing.JLabel LblS4;
    private javax.swing.JLabel LblS5;
    private javax.swing.JLabel LblS6;
    private javax.swing.JLabel LblS7;
    private javax.swing.JLabel LblS8;
    private javax.swing.JLabel LblS9;
    private javax.swing.JLabel LblSizeMatrixID;
    private javax.swing.JButton PickfROBtn;
    private javax.swing.JButton PickfROBtn1;
    private javax.swing.JLabel SRStatusIDLbl;
    private javax.swing.JTable SizeBrowserTable;
    private javax.swing.JButton applyButton;
    private javax.swing.JLabel buyerid;
    private javax.swing.JLabel buyernameLbl;
    private javax.swing.JComboBox cbSRType;
    private javax.swing.ButtonGroup clientDiscountGroup;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable justificationTable;
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
