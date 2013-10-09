/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */

package thoiyk.HumanInterfaceComponent.FormKainDetail;


// k
import KFramework30.Base.*;
import KFramework30.Widgets.KDialogControllerClass;

//app
import KFramework30.Widgets.KDialogControllerClass.KDialogInterface;
import KFramework30.Widgets.KDropDownFillerClass;
import ProblemDomainComponent.FormKainDetailClass;
//import ProblemDomainComponent.productionrecordClass;
import java.util.Map;
//import thoiyk.HumanInterfaceComponent.PurchaseOrder.PurchaseOrderBrowserClass;

// rtl


public class FormKainDetailEditDialogClass 
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
    public FormKainDetailEditDialogClass( 
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
                FormKainDetailClass.class, this, getContentPane() );        
                            
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
        jPanel1 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        lblTelp = new javax.swing.JLabel();
        qtyLabel = new javax.swing.JTextField();
        system_user_id1 = new javax.swing.JLabel();
        lblID1 = new javax.swing.JLabel();
        itemidLabel = new javax.swing.JLabel();
        lblNama1 = new javax.swing.JLabel();
        createdbyLbl = new javax.swing.JLabel();
        lblNama2 = new javax.swing.JLabel();
        itemidLabel2 = new javax.swing.JLabel();
        lblTelp1 = new javax.swing.JLabel();
        qtyLabel1 = new javax.swing.JTextField();
        lblTelp2 = new javax.swing.JLabel();
        lblTelp3 = new javax.swing.JLabel();
        qtyLabel2 = new javax.swing.JTextField();
        lblTelp4 = new javax.swing.JLabel();
        qtyLabel3 = new javax.swing.JTextField();
        lblTelp5 = new javax.swing.JLabel();
        qtyLabel4 = new javax.swing.JTextField();
        lblTelp6 = new javax.swing.JLabel();
        lblTelp7 = new javax.swing.JLabel();
        qtyLabel5 = new javax.swing.JTextField();
        lblTelp8 = new javax.swing.JLabel();
        qtyLabel6 = new javax.swing.JTextField();
        lblTelp9 = new javax.swing.JLabel();
        lblTelp12 = new javax.swing.JLabel();
        qtyLabel9 = new javax.swing.JTextField();
        lblTelp13 = new javax.swing.JLabel();
        qtyLabel10 = new javax.swing.JTextField();
        lblTelp14 = new javax.swing.JLabel();
        qtyLabel11 = new javax.swing.JTextField();
        lblTelp15 = new javax.swing.JLabel();
        qtyLabel12 = new javax.swing.JTextField();
        lblTelp10 = new javax.swing.JLabel();
        qtyLabel7 = new javax.swing.JTextField();
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "BTS Record Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        lblID.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblID.setText("ID");

        ID.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ID.setName("ID"); // NOI18N

        lblNama.setText("ItemID");

        lblTelp.setText("Jenis Kain");

        qtyLabel.setName("JenisKain"); // NOI18N

        system_user_id1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        system_user_id1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        system_user_id1.setName("HdrID"); // NOI18N

        lblID1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblID1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblID1.setText("HDRID");

        itemidLabel.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        itemidLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel.setName("ItemID"); // NOI18N

        lblNama1.setText("CreatedBy");

        createdbyLbl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        createdbyLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        createdbyLbl.setName("CreatedBy"); // NOI18N

        lblNama2.setText("DateCreated");

        itemidLabel2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        itemidLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemidLabel2.setName("DateCreated"); // NOI18N

        lblTelp1.setText("Warna");

        qtyLabel1.setName("Warna"); // NOI18N

        lblTelp2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTelp2.setText("Quantity");

        lblTelp3.setText("Order");

        qtyLabel2.setName("QtyOrder"); // NOI18N

        lblTelp4.setText("Allowance");

        qtyLabel3.setName("QtyAllowance"); // NOI18N

        lblTelp5.setText("Cut");

        qtyLabel4.setName("QtyCut"); // NOI18N

        lblTelp6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTelp6.setText("Consumtion");

        lblTelp7.setText("Given");

        qtyLabel5.setName("ConsumtionGiven"); // NOI18N

        lblTelp8.setText("Actual");

        qtyLabel6.setName("ConsumtionActual"); // NOI18N

        lblTelp9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTelp9.setText("Kain");

        lblTelp12.setText("Datang");

        qtyLabel9.setName("KainDatang"); // NOI18N

        lblTelp13.setText("Butuh");

        qtyLabel10.setName("KainButuh"); // NOI18N

        lblTelp14.setText("+ / -");

        qtyLabel11.setName("KainPlusMin"); // NOI18N

        lblTelp15.setText("%");

        qtyLabel12.setName("KainPersen"); // NOI18N

        lblTelp10.setText("Keterangan");

        qtyLabel7.setName("Keterangan"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(4, 4, 4)
                        .add(lblID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(lblTelp))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(lblNama))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(6, 6, 6)
                        .add(lblID1)))
                .add(22, 22, 22)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(system_user_id1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(itemidLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(378, 378, 378))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(ID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(qtyLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 190, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(qtyLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE))))
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(jPanel1Layout.createSequentialGroup()
                            .add(lblTelp4)
                            .add(18, 18, 18)
                            .add(qtyLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(lblTelp1)
                                    .add(lblTelp2)))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(51, 51, 51)
                                .add(lblTelp3)
                                .add(18, 18, 18)
                                .add(qtyLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(jPanel1Layout.createSequentialGroup()
                            .add(lblTelp5)
                            .add(18, 18, 18)
                            .add(qtyLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(lblTelp8)
                                    .add(18, 18, 18)
                                    .add(qtyLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(lblTelp6)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(41, 41, 41)
                                        .add(lblTelp7)
                                        .add(18, 18, 18)
                                        .add(qtyLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(lblTelp13)
                                    .add(18, 18, 18)
                                    .add(qtyLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(lblTelp12)
                                    .add(18, 18, 18)
                                    .add(qtyLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(lblTelp15)
                                    .add(18, 18, 18)
                                    .add(qtyLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(jPanel1Layout.createSequentialGroup()
                                    .add(lblTelp14)
                                    .add(18, 18, 18)
                                    .add(qtyLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(qtyLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 208, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(lblNama2)
                                    .add(lblNama1))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(createdbyLbl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(itemidLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .add(174, 174, 174)))))
                .add(84, 84, 84))
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblTelp9)
                    .add(lblTelp10))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(2, 2, 2)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(ID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblID1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(system_user_id1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(10, 10, 10)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblNama)
                    .add(itemidLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(9, 9, 9)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblTelp)
                    .add(qtyLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblTelp1)
                    .add(qtyLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(lblTelp2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblTelp3)
                    .add(qtyLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblTelp4)
                    .add(qtyLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblTelp5)
                    .add(qtyLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblTelp6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblTelp7)
                    .add(qtyLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblTelp8)
                    .add(qtyLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(7, 7, 7)
                .add(lblTelp9)
                .add(5, 5, 5)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblTelp12)
                    .add(qtyLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblTelp13)
                    .add(qtyLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblTelp14)
                    .add(qtyLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblTelp15)
                    .add(qtyLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblTelp10)
                    .add(qtyLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblNama1)
                    .add(createdbyLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblNama2)
                    .add(itemidLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        okButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        CancelButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        applyButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
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
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 510, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(okButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(CancelButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(applyButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(20, 20, 20))
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
                .addContainerGap(421, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
        
  private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

      // calculate
      //qtyneedLabel.setText(Long.toString( String.valueOf("s") ));
      //qtyneedLabel.setText((qtyLabel.getText() * compLabel.getText() * toleranceLabel.getText());
      
      
        try {
            createdbyLbl.setText(configuration.getField( "system_user_name" ));

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


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel ID;
    private javax.swing.JButton applyButton;
    private javax.swing.ButtonGroup clientDiscountGroup;
    private javax.swing.JLabel createdbyLbl;
    private javax.swing.JLabel itemidLabel;
    private javax.swing.JLabel itemidLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNama1;
    private javax.swing.JLabel lblNama2;
    private javax.swing.JLabel lblTelp;
    private javax.swing.JLabel lblTelp1;
    private javax.swing.JLabel lblTelp10;
    private javax.swing.JLabel lblTelp12;
    private javax.swing.JLabel lblTelp13;
    private javax.swing.JLabel lblTelp14;
    private javax.swing.JLabel lblTelp15;
    private javax.swing.JLabel lblTelp2;
    private javax.swing.JLabel lblTelp3;
    private javax.swing.JLabel lblTelp4;
    private javax.swing.JLabel lblTelp5;
    private javax.swing.JLabel lblTelp6;
    private javax.swing.JLabel lblTelp7;
    private javax.swing.JLabel lblTelp8;
    private javax.swing.JLabel lblTelp9;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField qtyLabel;
    private javax.swing.JTextField qtyLabel1;
    private javax.swing.JTextField qtyLabel10;
    private javax.swing.JTextField qtyLabel11;
    private javax.swing.JTextField qtyLabel12;
    private javax.swing.JTextField qtyLabel2;
    private javax.swing.JTextField qtyLabel3;
    private javax.swing.JTextField qtyLabel4;
    private javax.swing.JTextField qtyLabel5;
    private javax.swing.JTextField qtyLabel6;
    private javax.swing.JTextField qtyLabel7;
    private javax.swing.JTextField qtyLabel9;
    private javax.swing.JLabel system_user_id1;
    // End of variables declaration//GEN-END:variables


    
    
}
