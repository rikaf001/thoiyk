/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */

package thoiyk.HumanInterfaceComponent.SizeMatrix;


//K
import thoiyk.HumanInterfaceComponent.SizeMatrix.*;
import KFramework30.Base.*;
import KFramework30.Widgets.KDialogControllerClass;
import KFramework30.Widgets.KDialogControllerClass.KDialogEventCallbackInterface;
import KFramework30.Widgets.KDialogControllerClass.KDialogInterface;
import KFramework30.Widgets.KDropDownFillerClass;
import ProblemDomainComponent.SizeMatrixClass;
//APP

//RTL
import java.util.Map;


public class SizeMatrixEditDialogClass
extends javax.swing.JDialog
implements  KDialogInterface, KDialogEventCallbackInterface
{
        
    // uses
    private KConfigurationClass             configuration;
    private KLogClass                       log;
    
    private long                            parentID;

 
    // has
    private KDialogControllerClass          KDialogController;
    private KNonVisibleBinaryWidgetClass    productPictureRawDataContainer;
 
    /** Creates new form facturaEditDialogClass */
    public SizeMatrixEditDialogClass( 
        KConfigurationClass configurationParam, KLogClass logParam,
        java.awt.Window parentWindow)
        throws KExceptionClass
    {
        
        super( parentWindow, java.awt.Dialog.ModalityType.DOCUMENT_MODAL );
        initComponents ();
        pack ();
       // setSize( 650, 300 );
        KMetaUtilsClass.centerInScreen( this );
        
        // uses
        configuration = configurationParam;
        log = logParam;

        // has - defaulted     
        KDialogController = new KDialogControllerClass(                 
                configurationParam, logParam, 
                SizeMatrixClass.class, 
                this, getContentPane() );    
                
        KDialogController.setEventCallback( this );
    }
    
    
    //---------------------------------------------------------------------------
    
    private void checkSecurity()
    throws KExceptionClass
    {               
    }
    
    
    public void initializeDialog(int dialogModeParam, Long ID, Map foreingKeys ) throws KExceptionClass {
        
        KDropDownFillerClass statusComboFiller = new KDropDownFillerClass(
                        configuration, log, 
                        //SQL, might have parameters and where clause or order by
                        " select ID,  NAMA from Sizetype ",
                        "ID", cbAccType, "SizeTypeID"
                        );

        statusComboFiller.load();        
        KDialogController.addNonVisibleWidget( statusComboFiller );  // to map it           
                
                
        // start
        KDialogController.initializeDialog( dialogModeParam, ID, foreingKeys );        
        checkSecurity();        
    }

    public void setupTables(long businessObjectOID) throws KExceptionClass {}
    public void saveBrowserChanges() {}
    
    //---------------------------------------------------------------------------

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        client_id2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbAccType = new javax.swing.JComboBox();
        client_address4 = new javax.swing.JTextField();
        client_address5 = new javax.swing.JTextField();
        client_address6 = new javax.swing.JTextField();
        client_address7 = new javax.swing.JTextField();
        client_address8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        client_address9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        client_address10 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        client_address11 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        client_address12 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        client_address13 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        client_address14 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        client_address15 = new javax.swing.JTextField();
        client_address16 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        client_address17 = new javax.swing.JTextField();
        client_address18 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        client_id3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LblAuditUser = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        topLabel = new javax.swing.JLabel();
        client_id1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Size Matrix", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 10))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("ID");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel8.setText("SizeType");

        client_id2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_id2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id2.setName("ID"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel10.setText("1");

        cbAccType.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cbAccType.setName("cbServiceType"); // NOI18N
        cbAccType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAccTypeActionPerformed(evt);
            }
        });

        client_address4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address4.setName("S1"); // NOI18N

        client_address5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address5.setName("S2"); // NOI18N

        client_address6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address6.setName("S3"); // NOI18N

        client_address7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address7.setName("S4"); // NOI18N

        client_address8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address8.setName("S5"); // NOI18N

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel11.setText("2");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel12.setText("3");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel13.setText("4");

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel14.setText("5");

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel15.setText("6");

        client_address9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address9.setName("S6"); // NOI18N

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel16.setText("7");

        client_address10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address10.setName("S7"); // NOI18N

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel17.setText("8");

        client_address11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address11.setName("S8"); // NOI18N

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel18.setText("9");

        client_address12.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address12.setName("S9"); // NOI18N

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel19.setText("10");

        client_address13.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address13.setName("S10"); // NOI18N

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel20.setText("12");

        client_address14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address14.setName("S15"); // NOI18N

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel21.setText("14");

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel22.setText("13");

        client_address15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address15.setName("S13"); // NOI18N

        client_address16.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address16.setName("S11"); // NOI18N

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel23.setText("15");

        client_address17.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address17.setName("S14"); // NOI18N

        client_address18.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_address18.setName("S12"); // NOI18N

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel24.setText("11");

        client_id3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_id3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id3.setName("AuditDate"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("AuditDate");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("AuditUser");

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
                        .add(21, 21, 21)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel8))
                        .add(6, 6, 6)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(client_id2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(cbAccType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 301, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .add(jLabel2)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(client_id3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 323, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(20, 20, 20)
                                    .add(jLabel10))
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel12)
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel13)
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel14)
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel11))))
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(client_address4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .add(client_address5)
                                .add(client_address6)
                                .add(client_address7)
                                .add(client_address8))
                            .add(18, 18, 18)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel17)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel18)
                                .add(jLabel19)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel15, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel16, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(client_address9)
                                .add(client_address10)
                                .add(client_address11)
                                .add(client_address12)
                                .add(client_address13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 83, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(18, 18, 18)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel24)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel22)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel21)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel23)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel20))
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(client_address16)
                                .add(client_address18)
                                .add(client_address15)
                                .add(client_address17)
                                .add(client_address14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 83, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblAuditUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 323, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(client_id2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cbAccType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(41, 41, 41)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(client_address4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel15)
                    .add(client_address9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(client_address16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel11)
                    .add(client_address5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel16)
                    .add(client_address10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel20)
                    .add(client_address18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel12)
                    .add(client_address6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel17)
                    .add(client_address11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel22)
                    .add(client_address15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel13)
                    .add(client_address7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel18)
                    .add(client_address12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel21)
                    .add(client_address17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel14)
                    .add(client_address8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel19)
                    .add(client_address13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel23)
                    .add(client_address14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 37, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(client_id3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(LblAuditUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.setBounds(0, 60, 410, 330);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jPanel1.getAccessibleContext().setAccessibleName("Accessories");

        okButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        okButton.setBounds(430, 70, 80, 20);
        jLayeredPane1.add(okButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CancelButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        CancelButton.setBounds(430, 100, 80, 20);
        jLayeredPane1.add(CancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        topLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        topLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/topBar.jpg"))); // NOI18N
        topLabel.setMaximumSize(new java.awt.Dimension(100, 44));
        topLabel.setMinimumSize(new java.awt.Dimension(100, 44));
        topLabel.setBounds(0, -3, 680, 650);
        jLayeredPane1.add(topLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        client_id1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_id1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id1.setName("prodId"); // NOI18N
        client_id1.setBounds(0, 0, 4, 4);
        jLayeredPane1.add(client_id1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 533, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
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

    private void cbAccTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAccTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAccTypeActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel LblAuditUser;
    private javax.swing.JComboBox cbAccType;
    private javax.swing.JTextField client_address10;
    private javax.swing.JTextField client_address11;
    private javax.swing.JTextField client_address12;
    private javax.swing.JTextField client_address13;
    private javax.swing.JTextField client_address14;
    private javax.swing.JTextField client_address15;
    private javax.swing.JTextField client_address16;
    private javax.swing.JTextField client_address17;
    private javax.swing.JTextField client_address18;
    private javax.swing.JTextField client_address4;
    private javax.swing.JTextField client_address5;
    private javax.swing.JTextField client_address6;
    private javax.swing.JTextField client_address7;
    private javax.swing.JTextField client_address8;
    private javax.swing.JTextField client_address9;
    private javax.swing.JLabel client_id1;
    private javax.swing.JLabel client_id2;
    private javax.swing.JLabel client_id3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel topLabel;
    // End of variables declaration//GEN-END:variables

    
// We want call backs on display and materialize, to render pic...
// these are activated as we implement KDialogEventCallbackInterface
    
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
        
       }

    @Override
    public void preUpdate(KBusinessObjectClass businessObject) throws Exception {
    }

    @Override
    public void postUpdate(KBusinessObjectClass businessObject) throws Exception {
    }
   
    
}
