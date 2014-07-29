/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */

package thoiyk.HumanInterfaceComponent.BCPemasukanBaku;


//K
import thoiyk.HumanInterfaceComponent.BCPemasukanBaku.*;
import KFramework30.Base.*;
import KFramework30.Widgets.KDialogControllerClass;
import KFramework30.Widgets.KDialogControllerClass.KDialogEventCallbackInterface;
import KFramework30.Widgets.KDialogControllerClass.KDialogInterface;
import KFramework30.Widgets.KDropDownFillerClass;
//APP
import ProblemDomainComponent.*;
//RTL

import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;


public class BCPemasukanBakuEditDialogClass
extends javax.swing.JDialog
implements  KDialogInterface, KDialogEventCallbackInterface
{
        
    // uses
    private KConfigurationClass             configuration;
    private KLogClass                       log;
 
    // has
    private KDialogControllerClass          KDialogController;
    private KNonVisibleBinaryWidgetClass    productPictureRawDataContainer;
    private long                            parentID;
    
 
    /** Creates new form facturaEditDialogClass */
    public BCPemasukanBakuEditDialogClass( 
        KConfigurationClass configurationParam, KLogClass logParam,
        java.awt.Window parentWindow)
        throws KExceptionClass
    {
        
        super( parentWindow, java.awt.Dialog.ModalityType.DOCUMENT_MODAL );
        initComponents ();
        pack ();
//        setSize( 650, 300 );
        KMetaUtilsClass.centerInScreen( this );
        
        // uses
        configuration = configurationParam;
        log = logParam;

        // has - defaulted     
        KDialogController = new KDialogControllerClass(                 
                configurationParam, logParam, 
                v_BC_PemasukanBakuClass.class, 
                this, getContentPane() );    
        
        productPictureRawDataContainer = new KNonVisibleBinaryWidgetClass(
                configurationParam, logParam, "image", 1024 /* 1Kb start size, its dynamic dont worry */ );
                         
        // add for auto binding and forget, just code the postEdit as shown below
        KDialogController.addNonVisibleWidget( productPictureRawDataContainer );
        
        KDialogController.setEventCallback( this );
    }
    
    
    //---------------------------------------------------------------------------
    
    private void checkSecurity()
    throws KExceptionClass
    {               
    }
    
    
    public void initializeDialog(int dialogModeParam, Long ID, Map foreingKeys ) throws KExceptionClass {

           
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
        CancelButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        idLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        issuedbyLbl = new javax.swing.JLabel();
        client_id6 = new javax.swing.JLabel();
        suppnameLbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        issuedbyLbl1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        issuedbyLbl2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        issuedbyLbl3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        client_id7 = new javax.swing.JLabel();
        client_id8 = new javax.swing.JLabel();
        client_id9 = new javax.swing.JLabel();
        client_id10 = new javax.swing.JLabel();
        client_id11 = new javax.swing.JLabel();
        client_id12 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        issuedbyLbl4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        suppnameLbl1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        suppnameLbl2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        client_id1 = new javax.swing.JLabel();
        suppnameLbl3 = new javax.swing.JLabel();
        topLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 250));
        setModal(true);
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
        CancelButton.setBounds(480, 70, 80, 20);
        jLayeredPane1.add(CancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pemasukan Bahan Baku & Penolong", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 10))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        idLbl.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        idLbl.setText("ID");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel4.setText("NoBC");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel5.setText("TglBC");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel8.setText("Nama");

        issuedbyLbl.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        issuedbyLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        issuedbyLbl.setName("CreatedBy"); // NOI18N

        client_id6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_id6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id6.setName("ID"); // NOI18N

        suppnameLbl.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        suppnameLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        suppnameLbl.setName("NoBC"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel7.setText("TglTrima");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel9.setText("Pengirim");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel10.setText("Currency");

        issuedbyLbl1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        issuedbyLbl1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        issuedbyLbl1.setName("Currency"); // NOI18N

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel11.setText("Unit");

        issuedbyLbl2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        issuedbyLbl2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        issuedbyLbl2.setName("Unit"); // NOI18N

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel16.setText("NoTrima");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel3.setText("DokBC");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel13.setText("KodeBrng");

        issuedbyLbl3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        issuedbyLbl3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        issuedbyLbl3.setName("Jumlah"); // NOI18N

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel14.setText("Jumlah");

        client_id7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_id7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id7.setName("DokBC"); // NOI18N

        client_id8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_id8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id8.setName("TglBC"); // NOI18N

        client_id9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_id9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id9.setName("TglTrima"); // NOI18N

        client_id10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_id10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id10.setName("NoTrima"); // NOI18N

        client_id11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_id11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id11.setName("Pengirim"); // NOI18N

        client_id12.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        client_id12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id12.setName("KodeBrng"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel12.setText("Nilai");

        issuedbyLbl4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        issuedbyLbl4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        issuedbyLbl4.setName("Nilai"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel6.setText("KawasanID");

        suppnameLbl1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        suppnameLbl1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        suppnameLbl1.setName("KawasanID"); // NOI18N

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel15.setText("Kawasan");

        suppnameLbl2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        suppnameLbl2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        suppnameLbl2.setName("Kawasan"); // NOI18N

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel17.setText("Nama");

        client_id1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_id1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id1.setName("prodId"); // NOI18N

        suppnameLbl3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        suppnameLbl3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        suppnameLbl3.setName("Nama"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(26, 26, 26)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, idLbl)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(client_id7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .add(client_id6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel6)
                            .add(jLabel15))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(suppnameLbl2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(suppnameLbl1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(0, 0, Short.MAX_VALUE)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel4)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel5)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel16)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel7)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel9)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel13)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel8)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel11)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel14)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel10)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel12))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(suppnameLbl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(client_id8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(client_id10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(client_id9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(issuedbyLbl4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(issuedbyLbl1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(issuedbyLbl3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(issuedbyLbl2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(client_id12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 184, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(issuedbyLbl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                    .add(client_id11, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(jLabel17)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(suppnameLbl3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)))))
                .addContainerGap())
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(0, 223, Short.MAX_VALUE)
                    .add(client_id1)
                    .add(0, 224, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(idLbl)
                    .add(client_id6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel3)
                    .add(client_id7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(suppnameLbl1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(suppnameLbl2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel15))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(suppnameLbl3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel17))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel4)
                    .add(suppnameLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel5)
                    .add(client_id8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel16)
                    .add(client_id10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel7)
                    .add(client_id9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel9)
                    .add(client_id11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel13)
                    .add(client_id12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel8)
                    .add(issuedbyLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel11)
                    .add(issuedbyLbl2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel14)
                    .add(issuedbyLbl3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel10)
                    .add(issuedbyLbl1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jLabel12)
                    .add(issuedbyLbl4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(0, 213, Short.MAX_VALUE)
                    .add(client_id1)
                    .add(0, 214, Short.MAX_VALUE)))
        );

        jPanel1.setBounds(10, 60, 460, 450);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        topLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        topLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/topBar.jpg"))); // NOI18N
        topLabel.setMaximumSize(new java.awt.Dimension(100, 44));
        topLabel.setMinimumSize(new java.awt.Dimension(100, 44));
        topLabel.setBounds(0, -3, 680, 650);
        jLayeredPane1.add(topLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 566, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 518, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
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
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel client_id1;
    private javax.swing.JLabel client_id10;
    private javax.swing.JLabel client_id11;
    private javax.swing.JLabel client_id12;
    private javax.swing.JLabel client_id6;
    private javax.swing.JLabel client_id7;
    private javax.swing.JLabel client_id8;
    private javax.swing.JLabel client_id9;
    private javax.swing.JLabel idLbl;
    private javax.swing.JLabel issuedbyLbl;
    private javax.swing.JLabel issuedbyLbl1;
    private javax.swing.JLabel issuedbyLbl2;
    private javax.swing.JLabel issuedbyLbl3;
    private javax.swing.JLabel issuedbyLbl4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel suppnameLbl;
    private javax.swing.JLabel suppnameLbl1;
    private javax.swing.JLabel suppnameLbl2;
    private javax.swing.JLabel suppnameLbl3;
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
