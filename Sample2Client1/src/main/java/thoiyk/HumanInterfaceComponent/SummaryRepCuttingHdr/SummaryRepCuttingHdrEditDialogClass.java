/*
 * This source code is part of the Thoyik
 * Copyright (C) 2013  Yoserizal
 * Feedback / Bug Reports yoser174@gmail.com
 * 
 * 
 * This project used:
 * KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.SummaryRepCuttingHdr;

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

// fwk
import KFramework30.Widgets.KDialogControllerClass;
import KFramework30.Widgets.KDialogControllerClass.KDialogInterface;
import ProblemDomainComponent.BTSHeaderClass;
import ProblemDomainComponent.SummaryRepCuttingHdrClass;
import ProblemDomainComponent.supplierClass;
import java.awt.Font;
import java.awt.print.PageFormat;
import java.text.DateFormat;


public class SummaryRepCuttingHdrEditDialogClass 
extends javax.swing.JDialog
implements KDialogInterface, KDialogControllerClass.KDialogEventCallbackInterface
{
    
// uses
    private KConfigurationClass             configuration;
    private KLogClass                       log;
    private long                            parentID;
   
    // has defaulted   
    private KNonVisibleBinaryWidgetClass    productPictureRawDataContainer;
    private KDialogControllerClass            KDialogController;

    

    /** Creates new form facturaEditDialogClass */
    public SummaryRepCuttingHdrEditDialogClass( 
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
                SummaryRepCuttingHdrClass.class, 
                this, getContentPane() );   
                       
        
        KDialogController.setEventCallback(this);


                            
    }
        
    
    public void initializeDialog(int dialogModeParam, Long ID, Map foreingKeys ) throws KExceptionClass {

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

       
                        
        // register me to be notified for actions on rows, see implement above -> tableToolbarButtonClickedNotification
//        browser.addButtonActionListener( this );
        
        //setup container button
    }
    
    
    //----------------------------------------------------------------------
  
        
   

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        CancelButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        idLbl = new javax.swing.JLabel();
        client_id6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        prnoLbl = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        stylenameLbl = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        printGraphButton1 = new javax.swing.JButton();
        LblBuyerName = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        LblBuyerName1 = new javax.swing.JLabel();
        client_id8 = new javax.swing.JLabel();
        client_id9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        stylenameLbl1 = new javax.swing.JLabel();
        LblBuyerName3 = new javax.swing.JLabel();
        LblBuyerName4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        topLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        CancelButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        CancelButton.setBounds(560, 60, 80, 20);
        jLayeredPane1.add(CancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Summary Report Cutting", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 10))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        idLbl.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        idLbl.setText("ID");

        client_id6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_id6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id6.setName("ID"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel3.setText("PRNo");

        prnoLbl.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        prnoLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        prnoLbl.setName("PRNo"); // NOI18N

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel15.setText("StyleName");

        stylenameLbl.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        stylenameLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        stylenameLbl.setName("StyleName"); // NOI18N

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel18.setText("Buyer");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Action", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 10))); // NOI18N

        printGraphButton1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        printGraphButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/print1.gif"))); // NOI18N
        printGraphButton1.setText("print");
        printGraphButton1.setToolTipText("Print Porduct In");
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
                .add(printGraphButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(printGraphButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        LblBuyerName.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblBuyerName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblBuyerName.setName("BuyerName"); // NOI18N

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel19.setText("Nama Material");

        LblBuyerName1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblBuyerName1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblBuyerName1.setName("Material"); // NOI18N

        client_id8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_id8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id8.setName("PRID"); // NOI18N

        client_id9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_id9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id9.setName("ItemID"); // NOI18N

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel16.setText("SupplierName");

        stylenameLbl1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        stylenameLbl1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        stylenameLbl1.setName("SupplierName"); // NOI18N

        LblBuyerName3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblBuyerName3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblBuyerName3.setName("AuditDate"); // NOI18N

        LblBuyerName4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        LblBuyerName4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblBuyerName4.setName("AuditUser"); // NOI18N

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel21.setText("AuditDate");

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel22.setText("AuditUser");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, idLbl)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel15)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel16)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel18)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel19)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel21)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel22))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(LblBuyerName1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, LblBuyerName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, stylenameLbl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(client_id6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(client_id9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(client_id8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(prnoLbl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .add(LblBuyerName3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 172, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(LblBuyerName4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 172, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, stylenameLbl1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(0, 58, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                            .add(idLbl)
                            .add(client_id6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(client_id9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                            .add(jLabel3)
                            .add(prnoLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(client_id8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                            .add(jLabel15)
                            .add(stylenameLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                            .add(jLabel16)
                            .add(stylenameLbl1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel18)
                    .add(LblBuyerName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel19)
                    .add(LblBuyerName1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(LblBuyerName3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel21))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(LblBuyerName4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel22))
                .add(23, 23, 23))
        );

        jPanel1.setBounds(0, 50, 550, 260);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        topLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        topLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/topBar.jpg"))); // NOI18N
        topLabel.setMaximumSize(new java.awt.Dimension(100, 44));
        topLabel.setMinimumSize(new java.awt.Dimension(100, 44));
        topLabel.setBounds(0, -13, 770, 650);
        jLayeredPane1.add(topLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .add(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents
          
  private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
      setVisible (false);
      dispose ();
  }//GEN-LAST:event_CloseButtonActionPerformed
    
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible (false);
        dispose ();
    }//GEN-LAST:event_closeDialog

    private void printGraphButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printGraphButton1ActionPerformed
        
        
      try{
          
            log.log( this, "Printing Summary Report Cutting" );
            persistentObjectManagerClass persistentObjectManager = 
                    new persistentObjectManagerClass( configuration, log );             

            persistentObjectManagerClass POM = new persistentObjectManagerClass(configuration, log);
            //BTSHeaderClass po = new BTSHeaderClass();
            SummaryRepCuttingHdrClass SumRepCut = ( SummaryRepCuttingHdrClass ) POM.copy4( ((SummaryRepCuttingHdrClass)KDialogController.getCurrentObjectDisplayed()).getID(), SummaryRepCuttingHdrClass.class );

            //materialize Supplier
//            persistentObjectManagerClass POMSupp = new persistentObjectManagerClass(configuration, log);
//            supplierClass Supp = ( supplierClass ) POMSupp.copy4( SumRepCut., supplierClass.class );

            
            // ---------------------------------------------------------------------------------------
            //Header section
            KPrintSectionClass headerSection = new KPrintSectionClass(configuration, log, 520, 140);           

            headerSection.setFont( new Font( "arial", Font.PLAIN,                       12) );
            headerSection.printText("SUMMARY REPORTING CUTTING",          170, 100 );
            headerSection.printLine(170,114,307,114);            
   
            KPrintSectionClass leftTopSection = new KPrintSectionClass(configuration, log, 520, 130 );                 

            leftTopSection.setFont( new Font( "arial", Font.PLAIN, 10) );
            leftTopSection.printText(configuration.getField("per_nama").toString(),0, 20 );
            leftTopSection.printText(configuration.getField("per_alamat1").toString(),0, 30 );
            leftTopSection.printText(configuration.getField("per_alamat2").toString(),0, 40 );
            leftTopSection.printText("Phone: "+configuration.getField("per_telp").toString()+" Fax: "+configuration.getField("per_fax").toString(),0, 50 );

            
            // informasi BTB
            leftTopSection.printText("NOPR",                              300, 20 );
            leftTopSection.printText(SumRepCut.getStyleName() ,                 360, 20 );
            leftTopSection.printText("Style",                             300, 30 );
            leftTopSection.printText(SumRepCut.getStyleName(),    360, 30 );
            leftTopSection.printText("Nam Material",                        300, 40 );
            leftTopSection.printText(SumRepCut.getMaterial(),          360, 40 );
            leftTopSection.printText("Supplier",                            300, 50 );
            leftTopSection.printText(SumRepCut.getSupplierName(),                  360, 50 );
            
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
                  "  select rownum,poi.itemname,bts.itemqty,uta.nama itemunit, RETRIEVE_BKS_PRNO(bts.itemid) pr_no, RETRIEVE_BKS_STYLE(bts.itemid) style, RETRIEVE_BKS_NO(bts.itemid) no_bks,RETRIEVE_BKS_TGL(bts.itemid) tgl_bks " +
                    " from bts_dtl bts "+
                        "left join v_po_item poi on bts.itemid=poi.id " +
                        "left join unittype uta on bts.itemunitid=uta.id " +
                        "left join unittype utb on bts.actualunitid=utb.id " +
                    " where bts.hdrid=:v1 "
                    );

                dbTransaction.bind( ":v1",  SumRepCut.getID() );                  
                dbTransaction.executeQuery( 0, 655356 );
                // --------------------------------------------------------    
                
               //to get analysis info
                dbTransactionClientClass AnalysisdbTransaction = 
                    new dbTransactionClientClass( configuration, log ); 
                    
                    KPrintSectionClass poitem = new KPrintSectionClass(configuration, log, 520, 90 ); 
                    
                    poitem.setFont( new Font( "arial", Font.PLAIN, 8) );
                    
                    // setup the DB printer
                    KPrintDataTableClass dbTable = new KPrintDataTableClass( 
                               configuration, log, 
                               dbTransaction, printJob, 0, 655356 );
                
                    //print anasys info
                    dbTable.addField( "ROWNUM","No",10 );
                    dbTable.addField( "ITEMNAME", "Name",200 );
                    dbTable.addField( "ITEMQTY","Qty",30 );
                    dbTable.addField( "ITEMUNIT","Unit",50 );        
                    dbTable.addField( "PR_NO","PRNo",30 );
                    dbTable.addField( "STYLE","Style",50 );        
                    dbTable.addField( "NO_BKS","BKSNo",30 );
                    dbTable.addField( "TGL_BKS","BKSTgl",50 );        

                    
                    
                    //dbTable.addSummary( "CLIENT PRICE", KPrintDataTableClass.SUM, "Total: $", null, 2 );
                    
                    
                    dbTable.setPrintingField( "No" );
                    dbTable.setPrintingField( "Name" );
                    dbTable.setPrintingField( "Qty" );
                    dbTable.setPrintingField( "Unit" );
                    dbTable.setPrintingField( "PRNo" );
                    dbTable.setPrintingField( "Style" );
                    dbTable.setPrintingField( "BKSNo" );
                    dbTable.setPrintingField( "BKSTgl" );
                    
                   
                    
                    
                    // summary
                    //dbTable.addSummary( "Price", KPrintDataTableClass.SUM, null, null, 2 );
                  
                    
                    dbTable.setHorizontalSpace( 10 );
                    printJob.setDefaultFont( new Font("Arial", Font.PLAIN, 8) ); 
                    int oldLeftMargin = printJob.getLeftMargin();
                    printJob.setLeftMargin(40);              
                    dbTable.setHeadersMode( dbTable.HEADER_TYPE_INLINEHEADER );                 
                    
                    dbTable.print();
                    
                    printJob.setDefaultFont( new Font("Arial", Font.PLAIN, 10) );
                    printJob.setLeftMargin(oldLeftMargin);
                   
                    //Footer section
                    KPrintSectionClass footerSection = new KPrintSectionClass(configuration, log, 520, 140);           
                    
                    footerSection.setFont( new Font( "arial", Font.PLAIN, 10) );
                    
//                    footerSection.printText("Penerima",         0, 10 );
  //                  footerSection.printText(SumRepCut.getAuditUser(),0, 30 );
   //                 footerSection.printText(DateFormat.getDateTimeInstance().format(SumRepCut.getAuditDate()),0, 40 );
   //                 footerSection.printText("Kontrol Kualitas", 200, 10 );
   //                 footerSection.printText("Mengetahui",       400, 10 );
                    
                    
                    printJob.printSection( footerSection, KPrintJobClass.CENTER );
   
                    
                                
            printJob.submitPrintJob();  


            
        }
        catch( Exception error	){
            
                // log error
                log.log( this, KMetaUtilsClass.getStackTrace( error ) );		                
                // show error message
                KMetaUtilsClass.showErrorMessageFromException( this,  error );
        } 
                    
            

    }//GEN-LAST:event_printGraphButton1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel LblBuyerName;
    private javax.swing.JLabel LblBuyerName1;
    private javax.swing.JLabel LblBuyerName3;
    private javax.swing.JLabel LblBuyerName4;
    private javax.swing.JLabel client_id6;
    private javax.swing.JLabel client_id8;
    private javax.swing.JLabel client_id9;
    private javax.swing.JLabel idLbl;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton printGraphButton1;
    private javax.swing.JLabel prnoLbl;
    private javax.swing.JLabel stylenameLbl;
    private javax.swing.JLabel stylenameLbl1;
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
