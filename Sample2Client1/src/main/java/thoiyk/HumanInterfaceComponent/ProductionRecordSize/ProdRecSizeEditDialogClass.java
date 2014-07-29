/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */

package thoiyk.HumanInterfaceComponent.ProductionRecordSize;


// k
import KFramework30.Base.*;
import KFramework30.Communication.persistentObjectManagerClass;
import KFramework30.Widgets.KDialogControllerClass;

//app
import KFramework30.Widgets.KDialogControllerClass.KDialogInterface;
import KFramework30.Widgets.selectDialogClass;
import ProblemDomainComponent.CuttingDailyRepHdrClass;
import ProblemDomainComponent.ProdRecClass;
import ProblemDomainComponent.ProdRecSizeClass;
import ProblemDomainComponent.v_PRItemClass;

// rtl
import java.util.Map;
import thoiyk.HumanInterfaceComponent.v_PRAllItem.v_PRAllItemBrowserClass;
import thoiyk.HumanInterfaceComponent.v_PRSizeItem.v_PRSizeItemBrowserClass;


public class ProdRecSizeEditDialogClass 
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
    public ProdRecSizeEditDialogClass( 
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
                ProdRecSizeClass.class, this, getContentPane() );        
                            
    }
    
    
    public void initializeDialog(int dialogModeParam, Long ID, Map foreingKeys ) throws KExceptionClass {
        
           
        
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
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        LblAuditUser = new javax.swing.JLabel();
        LblSizeID = new javax.swing.JLabel();
        LblAuditDate = new javax.swing.JLabel();
        LblHdrID = new javax.swing.JLabel();
        lblID1 = new javax.swing.JLabel();
        LblWarna = new javax.swing.JLabel();
        lblNama1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LblQ1 = new javax.swing.JTextField();
        LblS1 = new javax.swing.JLabel();
        LblS2 = new javax.swing.JLabel();
        LblQ2 = new javax.swing.JTextField();
        LblS3 = new javax.swing.JLabel();
        LblQ3 = new javax.swing.JTextField();
        LblS4 = new javax.swing.JLabel();
        LblQ4 = new javax.swing.JTextField();
        LblS5 = new javax.swing.JLabel();
        LblQ5 = new javax.swing.JTextField();
        LblS6 = new javax.swing.JLabel();
        LblQ6 = new javax.swing.JTextField();
        LblS7 = new javax.swing.JLabel();
        LblQ7 = new javax.swing.JTextField();
        LblS8 = new javax.swing.JLabel();
        LblQ8 = new javax.swing.JTextField();
        LblS9 = new javax.swing.JLabel();
        LblQ9 = new javax.swing.JTextField();
        LblS10 = new javax.swing.JLabel();
        LblQ10 = new javax.swing.JTextField();
        LblS11 = new javax.swing.JLabel();
        LblQ11 = new javax.swing.JTextField();
        LblS12 = new javax.swing.JLabel();
        LblQ12 = new javax.swing.JTextField();
        LblS13 = new javax.swing.JLabel();
        LblQ13 = new javax.swing.JTextField();
        LblS14 = new javax.swing.JLabel();
        LblQ14 = new javax.swing.JTextField();
        LblS15 = new javax.swing.JLabel();
        LblQ15 = new javax.swing.JTextField();
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

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Size Break Down", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 10))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        lblID.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblID.setText("ID");

        ID.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ID.setName("ID"); // NOI18N

        lblNama.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblNama.setText("ItemID");

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel1.setText("AuditDate");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel2.setText("AuditUser");

        jButton1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        LblAuditUser.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblAuditUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblAuditUser.setName("AuditUser"); // NOI18N

        LblSizeID.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblSizeID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblSizeID.setName("ItemID"); // NOI18N

        LblAuditDate.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblAuditDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblAuditDate.setName("AuditDate"); // NOI18N

        LblHdrID.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblHdrID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblHdrID.setName("HdrID"); // NOI18N

        lblID1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblID1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblID1.setText("HdrID");

        LblWarna.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblWarna.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblWarna.setName("Warna"); // NOI18N

        lblNama1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        lblNama1.setText("Colour");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Qty", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 10))); // NOI18N

        LblQ1.setName("Q1"); // NOI18N

        LblS1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblS1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS1.setName("ID"); // NOI18N

        LblS2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblS2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS2.setName("ID"); // NOI18N

        LblQ2.setName("Q2"); // NOI18N

        LblS3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblS3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS3.setName("ID"); // NOI18N

        LblQ3.setName("Q3"); // NOI18N

        LblS4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblS4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS4.setName("ID"); // NOI18N

        LblQ4.setName("Q4"); // NOI18N

        LblS5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblS5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS5.setName("ID"); // NOI18N

        LblQ5.setName("Q5"); // NOI18N

        LblS6.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblS6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS6.setName("ID"); // NOI18N

        LblQ6.setName("Q6"); // NOI18N

        LblS7.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblS7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS7.setName("ID"); // NOI18N

        LblQ7.setName("Q7"); // NOI18N

        LblS8.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblS8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS8.setName("ID"); // NOI18N

        LblQ8.setName("Q8"); // NOI18N

        LblS9.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblS9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS9.setName("ID"); // NOI18N

        LblQ9.setName("Q9"); // NOI18N

        LblS10.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblS10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS10.setName("ID"); // NOI18N

        LblQ10.setName("Q10"); // NOI18N

        LblS11.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblS11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS11.setName("ID"); // NOI18N

        LblQ11.setName("Q11"); // NOI18N

        LblS12.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblS12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS12.setName("ID"); // NOI18N

        LblQ12.setName("Q12"); // NOI18N

        LblS13.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblS13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS13.setName("ID"); // NOI18N

        LblQ13.setName("Q13"); // NOI18N

        LblS14.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblS14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS14.setName("ID"); // NOI18N

        LblQ14.setName("Q14"); // NOI18N

        LblS15.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblS15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LblS15.setName("ID"); // NOI18N

        LblQ15.setName("Q15"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(LblQ1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .add(LblS1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(LblQ2)
                    .add(LblS2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(LblQ3)
                    .add(LblS3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(LblQ4)
                    .add(LblS4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(LblQ5)
                    .add(LblS5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(LblQ6)
                    .add(LblS6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(LblQ7)
                    .add(LblS7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(LblQ8)
                    .add(LblS8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(LblQ9)
                    .add(LblS9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(LblQ10)
                    .add(LblS10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(LblQ11)
                    .add(LblS11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(LblQ12)
                    .add(LblS12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(LblQ13)
                    .add(LblS13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(LblQ14)
                    .add(LblS14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(LblQ15)
                    .add(LblS15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(LblS15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblQ15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(LblS14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LblQ14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(jPanel2Layout.createSequentialGroup()
                            .add(LblS13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(LblQ13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(LblS12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(LblQ12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jPanel2Layout.createSequentialGroup()
                                    .add(LblS11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(LblQ11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel2Layout.createSequentialGroup()
                                        .add(LblS10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(LblQ10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jPanel2Layout.createSequentialGroup()
                                        .add(LblS9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(LblQ9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jPanel2Layout.createSequentialGroup()
                                        .add(LblS8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(LblQ8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                        .add(jPanel2Layout.createSequentialGroup()
                                            .add(LblS7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(LblQ7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jPanel2Layout.createSequentialGroup()
                                                .add(LblS6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(LblQ6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(jPanel2Layout.createSequentialGroup()
                                                .add(LblS5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(LblQ5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(jPanel2Layout.createSequentialGroup()
                                                .add(LblS4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(LblQ4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(jPanel2Layout.createSequentialGroup()
                                                .add(LblS3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(LblQ3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(jPanel2Layout.createSequentialGroup()
                                                .add(LblS2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(LblQ2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(jPanel2Layout.createSequentialGroup()
                                                .add(LblS1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(LblQ1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(lblID)
                            .add(lblID1)
                            .add(lblNama)
                            .add(jLabel1)
                            .add(jLabel2)
                            .add(lblNama1))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(LblHdrID, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(LblSizeID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(0, 0, Short.MAX_VALUE))
                                    .add(ID, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(LblWarna, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .add(331, 331, 331))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, LblAuditDate, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                    .add(LblAuditUser, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 2, Short.MAX_VALUE))))
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
                    .add(LblHdrID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(lblNama)
                    .add(LblSizeID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(LblWarna, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblNama1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel1)
                    .add(LblAuditDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel2)
                    .add(LblAuditUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBounds(0, 0, 740, 280);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(okButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(CancelButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(applyButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(okButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(10, 10, 10)
                .add(CancelButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(10, 10, 10)
                .add(applyButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(94, 190, Short.MAX_VALUE))
            .add(jLayeredPane1)
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
            v_PRSizeItemBrowserClass PRAllBrowser = new v_PRSizeItemBrowserClass(
                configuration, log, new javax.swing.JTable(),1,Long.decode(LblHdrID.getText()) , this );
            

            PRAllBrowser.initializeTable();

            selectDialogClass selector = new selectDialogClass(
                configuration, log, this, PRAllBrowser, "Select Size Colour Data" );

            // dont want to allow this, for example
            selector.getNewButton().setEnabled(false);
            selector.getDeleteButton().setEnabled(false);
            parentID = selector.showDialog();


            if( parentID == -1 ) throw new KExceptionClass( "You must select a select Size Colour Data !", null);
            else        
            {
                   LblSizeID.setText( Long.toString(parentID));
                   
                  persistentObjectManagerClass POM = new persistentObjectManagerClass(configuration, log);
                    v_PRItemClass sColour = new v_PRItemClass();
                    sColour = ( v_PRItemClass ) POM.copy4( parentID, v_PRItemClass.class );

                   LblWarna.setText(sColour.getWarna());
                   
                   persistentObjectManagerClass POMPR = new persistentObjectManagerClass(configuration, log);
                   ProdRecClass PR = new ProdRecClass();
                   PR = ( ProdRecClass ) POMPR.copy4( Long.decode(LblHdrID.getText()) , ProdRecClass.class );
                   
                   LblS1.setText(PR.getS1());
                   LblS2.setText(PR.getS2());
                   LblS3.setText(PR.getS3());
                   LblS4.setText(PR.getS4());
                   LblS5.setText(PR.getS5());
                   LblS6.setText(PR.getS6());
                   LblS7.setText(PR.getS7());
                   LblS8.setText(PR.getS8());
                   LblS9.setText(PR.getS9());
                   LblS10.setText(PR.getS10());
                   LblS11.setText(PR.getS11());
                   LblS12.setText(PR.getS12());
                   LblS13.setText(PR.getS13());
                   LblS14.setText(PR.getS14());
                   LblS15.setText(PR.getS15());
                   

                   
            }; 
            
        }
        catch( Exception error	){
            log.log( this, KMetaUtilsClass.getStackTrace( error ) );
            KMetaUtilsClass.showErrorMessageFromException( this, error );
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel LblAuditDate;
    private javax.swing.JLabel LblAuditUser;
    private javax.swing.JLabel LblHdrID;
    private javax.swing.JTextField LblQ1;
    private javax.swing.JTextField LblQ10;
    private javax.swing.JTextField LblQ11;
    private javax.swing.JTextField LblQ12;
    private javax.swing.JTextField LblQ13;
    private javax.swing.JTextField LblQ14;
    private javax.swing.JTextField LblQ15;
    private javax.swing.JTextField LblQ2;
    private javax.swing.JTextField LblQ3;
    private javax.swing.JTextField LblQ4;
    private javax.swing.JTextField LblQ5;
    private javax.swing.JTextField LblQ6;
    private javax.swing.JTextField LblQ7;
    private javax.swing.JTextField LblQ8;
    private javax.swing.JTextField LblQ9;
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
    private javax.swing.JLabel LblSizeID;
    private javax.swing.JLabel LblWarna;
    private javax.swing.JButton applyButton;
    private javax.swing.ButtonGroup clientDiscountGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNama1;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables


    
    
}
