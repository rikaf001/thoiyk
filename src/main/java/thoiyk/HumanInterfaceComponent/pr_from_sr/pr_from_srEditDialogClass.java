/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */

package thoiyk.HumanInterfaceComponent.pr_from_sr;

/**
 *
 * @author yoserizy
 */
// k
import thoiyk.HumanInterfaceComponent.pr_from_sr.*;
import KFramework30.Base.*;
import KFramework30.Communication.persistentObjectManagerClass;
import KFramework30.Widgets.KDialogControllerClass;

//app
import KFramework30.Widgets.KDialogControllerClass.KDialogInterface;
import KFramework30.Widgets.KDropDownFillerClass;
import KFramework30.Widgets.selectDialogClass;
import ProblemDomainComponent.buyerClass;
import ProblemDomainComponent.pr_from_srClass;
import ProblemDomainComponent.samplerecordClass;

// rtl
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import thoiyk.HumanInterfaceComponent.pr_from_sritem.pr_from_sritemBrowserClass;
import thoiyk.HumanInterfaceComponent.samplerecord.samplerecordBrowserClass;


public class pr_from_srEditDialogClass 
extends javax.swing.JDialog
implements KDialogInterface
{
    
    // uses
    private KConfigurationClass             configuration;
    private KLogClass                       log;
    private long                            parentID;
   
    // has defaulted   
    private pr_from_sritemBrowserClass             browser;   
    private KNonVisibleBinaryWidgetClass    productPictureRawDataContainer;
    private KDialogControllerClass            KDialogController;

    
    //end of object persistent functions------------------------------------------------------

    /** Creates new form facturaEditDialogClass */
    public pr_from_srEditDialogClass( 
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
                configuration, log, 
                pr_from_srClass.class, this, getContentPane() );        
        
          productPictureRawDataContainer = new KNonVisibleBinaryWidgetClass(
                   configurationParam, logParam, "image", 1024 /* 1Kb start size, its dynamic dont worry */ );
                         
        // add for auto binding and forget, just code the postEdit as shown below
        KDialogController.addNonVisibleWidget( productPictureRawDataContainer );

                            
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
        
        cbSRType.setEnabled(false);
        
        
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
                       
        
        
       browser = new pr_from_sritemBrowserClass(
                configuration, log, FacturasBrowserJTable, 
                pr_from_sritemBrowserClass.SRITEM_BY_SR, id, this );
        
      //  browser.saveSQLOperation( 
      //          totalLabel, " sum( fac.fac_total ) ", facturaBrowserClass.BROWSER_COLUMN_TYPE_CURRENCY, true );        
        
        browser.initializeTable();
        
        //if (browser.getSelectedFieldValue("ID")=="0")
        //{
            //issuedby2Label.setText("Tes");
            
        //}
                
        

        //setup container button
        
        if(Long.valueOf(selectid.getText())==0)
        {
        
        newButton.addActionListener( browser );
        deleteButton.addActionListener( browser );
        editButton.addActionListener( browser );        

        newButton.setEnabled( true);
        deleteButton.setEnabled( true);
        editButton.setEnabled( true);  
        
        selectBtn.setEnabled(false);
        }
        
        parentID=Long.valueOf(selectid.getText());
         persistentObjectManagerClass persistentObjectManager = 
                    new persistentObjectManagerClass( configuration, log );             

            //materialize the sdg
            samplerecordClass sr = new samplerecordClass();
            sr = (samplerecordClass) persistentObjectManager.copy4( parentID, samplerecordClass.class );  

                        //materialize the sdg
            //samplerecordClass sr = new samplerecordClass();
            sr = (samplerecordClass) persistentObjectManager.copy4( parentID, samplerecordClass.class );  

            descLabel.setText(sr.getDescription());
            cbSRType.setSelectedIndex((int) sr.getSamplerecordtypeid());
            srid.setText( Long.toString(parentID));
            selectid.setText( Long.toString(parentID));
          


        
        
                        
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
        client_id = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pictureLabel = new javax.swing.JLabel();
        buyerLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbSRType = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        issuedbyLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        client_name1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        srid = new javax.swing.JLabel();
        selectBtn = new javax.swing.JButton();
        descLabel = new javax.swing.JLabel();
        styleLabel = new javax.swing.JLabel();
        buyerNameLabel = new javax.swing.JLabel();
        system_user_mask = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();
        DesktopToolbar = new javax.swing.JToolBar();
        newButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        topLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FacturasBrowserJTable = new javax.swing.JTable();
        selectid = new javax.swing.JLabel();
        client_id2 = new javax.swing.JLabel();

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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Production Record Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Id ");

        client_id.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_id.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id.setName("id"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel10.setText("Description");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Style");

        pictureLabel.setToolTipText("");
        pictureLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pictureLabel.setName("prodPictureXXX"); // NOI18N

        buyerLabel.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        buyerLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buyerLabel.setName("buyerid"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Buyer");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("PR");

        cbSRType.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cbSRType.setEnabled(false);
        cbSRType.setName("cbSamplerecordstatus"); // NOI18N
        cbSRType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSRTypeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel11.setText("Type");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("IssuedBy");

        issuedbyLabel.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        issuedbyLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        issuedbyLabel.setName("issuedby"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Qty");
        jLabel6.setName("labelQty"); // NOI18N

        client_name1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_name1.setName("qty"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("SampleRecord");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("SR");

        srid.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        srid.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        srid.setName("id"); // NOI18N

        selectBtn.setText("jButton2");
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });

        descLabel.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        descLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        descLabel.setName("description"); // NOI18N

        styleLabel.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        styleLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        styleLabel.setName("style"); // NOI18N

        buyerNameLabel.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        buyerNameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buyerNameLabel.setName("buyerid"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pictureLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(4, 4, 4)
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(client_id, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(srid, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(selectBtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(jPanel1Layout.createSequentialGroup()
                            .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 18, Short.MAX_VALUE)
                            .add(client_name1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 221, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(jPanel1Layout.createSequentialGroup()
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(18, 18, 18)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(issuedbyLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 86, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(8, 135, Short.MAX_VALUE))
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(buyerLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(buyerNameLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .add(jPanel1Layout.createSequentialGroup()
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel10)
                                .add(jLabel11)
                                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(18, 18, 18)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(cbSRType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 172, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(0, 0, Short.MAX_VALUE))
                                .add(descLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(styleLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(client_id, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(2, 2, 2)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(srid, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(selectBtn))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pictureLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel11)
                            .add(cbSRType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jLabel2))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(descLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(styleLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(buyerLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(buyerNameLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(9, 9, 9)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(issuedbyLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel5))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel6)
                            .add(client_name1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.setBounds(0, 60, 510, 220);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        system_user_mask.setText("jLabel2");
        system_user_mask.setName("system_user_mask"); // NOI18N
        system_user_mask.setBounds(14, 373, 122, 25);
        jLayeredPane1.add(system_user_mask, javax.swing.JLayeredPane.DEFAULT_LAYER);

        okButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        okButton.setBounds(530, 80, 80, 20);
        jLayeredPane1.add(okButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CancelButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        CancelButton.setBounds(530, 110, 80, 20);
        jLayeredPane1.add(CancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        applyButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        applyButton.setText("Apply"); // NOI18N
        applyButton.setName("applyButton"); // NOI18N
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });
        applyButton.setBounds(530, 140, 80, 20);
        jLayeredPane1.add(applyButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

        DesktopToolbar.setBounds(0, 280, 620, 46);
        jLayeredPane1.add(DesktopToolbar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        topLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        topLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/topBar.jpg"))); // NOI18N
        topLabel1.setMaximumSize(new java.awt.Dimension(100, 44));
        topLabel1.setMinimumSize(new java.awt.Dimension(100, 44));
        topLabel1.setPreferredSize(new java.awt.Dimension(100, 647));
        topLabel1.setBounds(0, 0, 630, 647);
        jLayeredPane1.add(topLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

        selectid.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        selectid.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        selectid.setName("selectid"); // NOI18N

        client_id2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_id2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id2.setName("samplerecordstatusid"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(client_id2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(20, 20, 20)
                .add(selectid, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 333, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 206, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, selectid, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, client_id2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
        
  private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
                       
      // tambahkan created by dan tanggal jika tidak ada
       try{
           issuedbyLabel.setText(configuration.getField( "system_user_name" ));
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

            KDialogController.OKbuttonActionPerformed();
                            
        } catch (KExceptionClass error ) {

              // log error
              log.log( this, KMetaUtilsClass.getStackTrace( error ) );

              // show error message
              KMetaUtilsClass.showErrorMessageFromException(  getOwner(), error );               
        }    
    
    
}//GEN-LAST:event_applyButtonActionPerformed

    private void cbSRTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSRTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSRTypeActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed

        try
        {
            samplerecordBrowserClass samplerecordBrowser = new samplerecordBrowserClass(
                configuration, log, new javax.swing.JTable(), this );

            samplerecordBrowser.initializeTable();

            selectDialogClass selector = new selectDialogClass(
                configuration, log, this, samplerecordBrowser, "Select Sample Record" );

            // dont want to allow this, for example
            selector.getNewButton().setEnabled(false);
            selector.getEditButton().setEnabled(false);
            selector.getDeleteButton().setEnabled(false);
            

            parentID = selector.showDialog();
            
            persistentObjectManagerClass persistentObjectManager = 
                    new persistentObjectManagerClass( configuration, log );             

            //materialize the sample record
            samplerecordClass sr = new samplerecordClass();
            sr = (samplerecordClass) persistentObjectManager.copy4( parentID, samplerecordClass.class );  
            
            //materialize the buyer
            buyerClass byr = new buyerClass();
            byr = (buyerClass) persistentObjectManager.copy4( sr.getBuyerid(), buyerClass.class );  


            descLabel.setText(sr.getDescription());
            cbSRType.setSelectedIndex((int) sr.getSamplerecordtypeid());
            buyerLabel.setText(Long.toString(sr.getBuyerid()));
            buyerNameLabel.setText(byr.getNama());
            srid.setText( Long.toString(parentID));
            styleLabel.setText(sr.getStyle());
            issuedbyLabel.setText(sr.getIssuedby());
            
            if(sr.getImage().length>0)
            {    
                pictureLabel.setIcon( new ImageIcon( sr.getImage()) ) ;              
                pictureLabel.repaint();
            }
            
            selectid.setText( Long.toString(parentID));

            //if( parentID == -1 ) throw new KExceptionClass( "You must select a client for the invoice!", null);

            // ambil detail dari SR
            
         try
         {
             this.setupTables(Long.valueOf(srid.getText()));
         }
          catch (KExceptionClass error ) {

              // log error
              log.log( this, KMetaUtilsClass.getStackTrace( error ) );

              // show error message
              KMetaUtilsClass.showErrorMessageFromException( getOwner(), error );               
        } 

        }
        catch( Exception error	){
            log.log( this, KMetaUtilsClass.getStackTrace( error ) );
            KMetaUtilsClass.showErrorMessageFromException( this, error );
        }
    }//GEN-LAST:event_selectBtnActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newButtonActionPerformed

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
    private javax.swing.JTable FacturasBrowserJTable;
    private javax.swing.JButton applyButton;
    private javax.swing.JLabel buyerLabel;
    private javax.swing.JLabel buyerNameLabel;
    private javax.swing.JComboBox cbSRType;
    private javax.swing.ButtonGroup clientDiscountGroup;
    private javax.swing.JLabel client_id;
    private javax.swing.JLabel client_id2;
    private javax.swing.JTextField client_name1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel descLabel;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel issuedbyLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JButton newButton;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JButton selectBtn;
    private javax.swing.JLabel selectid;
    private javax.swing.JLabel srid;
    private javax.swing.JLabel styleLabel;
    private javax.swing.JLabel system_user_mask;
    private javax.swing.JLabel topLabel1;
    // End of variables declaration//GEN-END:variables


    
    
}
