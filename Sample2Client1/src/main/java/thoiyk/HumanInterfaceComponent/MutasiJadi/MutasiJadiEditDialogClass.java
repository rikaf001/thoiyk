/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */

package thoiyk.HumanInterfaceComponent.MutasiJadi;


//K
import thoiyk.HumanInterfaceComponent.MutasiJadi.*;
import KFramework30.Base.*;
import KFramework30.Communication.persistentObjectManagerClass;
import KFramework30.Widgets.selectDialogClass;
import KFramework30.Widgets.KDialogControllerClass.KDialogEventCallbackInterface;
//APP
import ProblemDomainComponent.*;
import KFramework30.Widgets.KDialogControllerClass;
import KFramework30.Widgets.KDialogControllerClass.KDialogInterface;
import KFramework30.Widgets.KDropDownFillerClass;

//RTL
import java.util.Map;
import thoiyk.HumanInterfaceComponent.v_Select_MutasiJadi.v_Select_MutasiJadiBrowserClass;


public class MutasiJadiEditDialogClass
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
    public MutasiJadiEditDialogClass( 
        KConfigurationClass configurationParam, KLogClass logParam,
        java.awt.Window parentWindow)
        throws KExceptionClass
    {
        
        super( parentWindow, java.awt.Dialog.ModalityType.DOCUMENT_MODAL );
        initComponents ();
        pack ();
        //setSize( 650, 300 );
        KMetaUtilsClass.centerInScreen( this );
        
        // uses
        configuration = configurationParam;
        log = logParam;

        // has - defaulted     
        KDialogController = new KDialogControllerClass(                 
                configurationParam, logParam, 
                MutasiJadiClass.class, 
                this, getContentPane() );    
        
        
        KDialogController.setEventCallback( this );
    }
    
    
    //---------------------------------------------------------------------------
    
    private void checkSecurity()
    throws KExceptionClass
    {               
    }
    
    
    public void initializeDialog(int dialogModeParam, Long ID, Map foreingKeys ) throws KExceptionClass {

        KDropDownFillerClass typeComboFiller1 = new KDropDownFillerClass(
                        configuration, log, 
                        //SQL, might have parameters and where clause or order by
                        " select ID,  NAMA from UNITTYPE ",
                        "ID", currCombo3, "UnitTypeID"
                        );

        typeComboFiller1.load();        
        KDialogController.addNonVisibleWidget( typeComboFiller1 );  // to map it           

       KDropDownFillerClass typeComboFiller2 = new KDropDownFillerClass(
                        configuration, log, 
                        //SQL, might have parameters and where clause or order by
                        " select ID,  NAMA from KODEKAWASAN ",
                        "ID", currCombo2, "KodeKawasanID"
                        );

        typeComboFiller2.load();        
        KDialogController.addNonVisibleWidget( typeComboFiller2 );  // to map it           
       
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
        idLbl = new javax.swing.JLabel();
        client_id6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        createdbyLbl = new javax.swing.JLabel();
        issuedbyLbl1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idLbl2 = new javax.swing.JLabel();
        mskLbl = new javax.swing.JLabel();
        kelLbl = new javax.swing.JLabel();
        issuedbyLbl3 = new javax.swing.JLabel();
        client_id8 = new javax.swing.JLabel();
        idLbl3 = new javax.swing.JLabel();
        idLbl4 = new javax.swing.JLabel();
        client_id9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        brngidLbl = new javax.swing.JLabel();
        idLbl1 = new javax.swing.JLabel();
        brngnamaLbl = new javax.swing.JLabel();
        idLbl5 = new javax.swing.JLabel();
        idLbl6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Supplier_Text04Edit = new javax.swing.JTextField();
        idLbl7 = new javax.swing.JLabel();
        currCombo2 = new javax.swing.JComboBox();
        currCombo3 = new javax.swing.JComboBox();
        Supplier_Text04Edit1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();
        topLabel = new javax.swing.JLabel();
        client_id1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 250));
        setModal(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Mutasi Barang Jadi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        idLbl.setText("ID");

        client_id6.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_id6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id6.setName("ID"); // NOI18N

        jLabel4.setText("Saldo Akhir");

        jLabel8.setText("CreatedBy");

        createdbyLbl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        createdbyLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        createdbyLbl.setName("createdby"); // NOI18N

        issuedbyLbl1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        issuedbyLbl1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        issuedbyLbl1.setName("DateCreated"); // NOI18N

        jLabel10.setText("DateCreated");

        idLbl2.setText("Pemasukan");

        mskLbl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mskLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mskLbl.setName("Pemasukan"); // NOI18N

        kelLbl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        kelLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        kelLbl.setName("Pengeluaran"); // NOI18N

        issuedbyLbl3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        issuedbyLbl3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        issuedbyLbl3.setName("SaldoAkhir"); // NOI18N

        client_id8.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_id8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id8.setName("Selisih"); // NOI18N

        idLbl3.setText("Selisih");

        idLbl4.setText("Saldo Awal");

        client_id9.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_id9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id9.setName("SaldoAwal"); // NOI18N

        jLabel5.setText("Pengeluaran");

        brngidLbl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        brngidLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        brngidLbl.setName("BarangID"); // NOI18N

        idLbl1.setText("Barang");

        brngnamaLbl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        brngnamaLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        brngnamaLbl.setName("BarangNama"); // NOI18N

        idLbl5.setText("Kawasan");

        idLbl6.setText("Unit");

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Supplier_Text04Edit.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        Supplier_Text04Edit.setName("StockOpname"); // NOI18N

        idLbl7.setText("Stock Opname");

        currCombo2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        currCombo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IDR", "USD" }));
        currCombo2.setName("TypeIDSelect"); // NOI18N
        currCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currCombo2ActionPerformed(evt);
            }
        });

        currCombo3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        currCombo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IDR", "USD" }));
        currCombo3.setName("TypeIDSelect"); // NOI18N
        currCombo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currCombo3ActionPerformed(evt);
            }
        });

        Supplier_Text04Edit1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        Supplier_Text04Edit1.setName("Penyesuaian"); // NOI18N

        jLabel6.setText("Penyesuaian");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(16, 16, 16)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(idLbl5)
                            .add(idLbl))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(client_id6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(currCombo2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(idLbl1)
                            .add(idLbl6)
                            .add(idLbl7)
                            .add(idLbl3)
                            .add(idLbl4)
                            .add(idLbl2)
                            .add(jLabel5)
                            .add(jLabel6)
                            .add(jLabel4))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(currCombo3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(brngidLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(brngnamaLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 220, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(Supplier_Text04Edit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 145, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(client_id8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 145, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, kelLbl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, mskLbl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, client_id9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, issuedbyLbl3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, Supplier_Text04Edit1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))))
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                            .add(jLabel10)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(issuedbyLbl1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                            .add(jLabel8)
                            .add(18, 18, 18)
                            .add(createdbyLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 151, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(client_id6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(idLbl))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(idLbl5)
                    .add(currCombo2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(idLbl1)
                    .add(brngidLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton1)
                    .add(brngnamaLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(currCombo3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(idLbl6))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(idLbl7)
                    .add(Supplier_Text04Edit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(idLbl3)
                    .add(client_id8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(client_id9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(idLbl4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mskLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(idLbl2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(kelLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Supplier_Text04Edit1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(issuedbyLbl3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel8)
                    .add(createdbyLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel10)
                    .add(issuedbyLbl1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.setBounds(0, 60, 540, 410);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jPanel1.getAccessibleContext().setAccessibleName("Fabric");

        CancelButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        CancelButton.setBounds(550, 100, 80, 20);
        jLayeredPane1.add(CancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        okButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        okButton.setBounds(550, 70, 80, 23);
        jLayeredPane1.add(okButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        applyButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        applyButton.setText("Apply"); // NOI18N
        applyButton.setName("applyButton"); // NOI18N
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });
        applyButton.setBounds(550, 130, 80, 20);
        jLayeredPane1.add(applyButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        topLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        topLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/topBar.jpg"))); // NOI18N
        topLabel.setMaximumSize(new java.awt.Dimension(100, 44));
        topLabel.setMinimumSize(new java.awt.Dimension(100, 44));
        topLabel.setBounds(0, -3, 660, 650);
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
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 653, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            v_Select_MutasiJadiBrowserClass selectBrowser = new v_Select_MutasiJadiBrowserClass(
                configuration, log, new javax.swing.JTable(), this );

            selectBrowser.initializeTable();

            selectDialogClass selector = new selectDialogClass(
                configuration, log, this, selectBrowser, "Select Barang" );

            // dont want to allow this, for example
            selector.getNewButton().setEnabled(false);
            selector.getDeleteButton().setEnabled(false);
            parentID = selector.showDialog();



            if( parentID < 0 )
            {
                throw new KExceptionClass( "You must select a Barang !", null);

            }
            else
            {

                // ---------------------------------------------------------------------
                // display the supplier name
                persistentObjectManagerClass POM1 = new persistentObjectManagerClass(configuration, log);
               // v_Select_MutasiJadiClass baku = new v_Select_MutasiJadiClass();
               v_Select_MutasiJadiClass baku = ( v_Select_MutasiJadiClass ) POM1.copy4( parentID, v_Select_MutasiJadiClass.class );

                
                brngidLbl.setText( Long.toString(parentID));
                brngnamaLbl.setText( baku.getDescription() );
                mskLbl.setText(Long.toString(baku.getMsk()));
                kelLbl.setText(Long.toString(baku.getKel()));

                // ---------------------------------------------------------------------
            }

        }
        catch( Exception error	){
            log.log( this, KMetaUtilsClass.getStackTrace( error ) );
            KMetaUtilsClass.showErrorMessageFromException( this, error );
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void currCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currCombo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currCombo2ActionPerformed

    private void currCombo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currCombo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currCombo3ActionPerformed

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
    private javax.swing.JTextField Supplier_Text04Edit;
    private javax.swing.JTextField Supplier_Text04Edit1;
    private javax.swing.JButton applyButton;
    private javax.swing.JLabel brngidLbl;
    private javax.swing.JLabel brngnamaLbl;
    private javax.swing.JLabel client_id1;
    private javax.swing.JLabel client_id6;
    private javax.swing.JLabel client_id8;
    private javax.swing.JLabel client_id9;
    private javax.swing.JLabel createdbyLbl;
    private javax.swing.JComboBox currCombo2;
    private javax.swing.JComboBox currCombo3;
    private javax.swing.JLabel idLbl;
    private javax.swing.JLabel idLbl1;
    private javax.swing.JLabel idLbl2;
    private javax.swing.JLabel idLbl3;
    private javax.swing.JLabel idLbl4;
    private javax.swing.JLabel idLbl5;
    private javax.swing.JLabel idLbl6;
    private javax.swing.JLabel idLbl7;
    private javax.swing.JLabel issuedbyLbl1;
    private javax.swing.JLabel issuedbyLbl3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kelLbl;
    private javax.swing.JLabel mskLbl;
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
