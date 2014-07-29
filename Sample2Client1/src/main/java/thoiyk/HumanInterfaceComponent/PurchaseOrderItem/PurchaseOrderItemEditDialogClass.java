/*
 * This source code is part of the Thoyik
 * Copyright (C) 2013  Yoserizal
 * Feedback / Bug Reports yoser174@gmail.com
 * 
 * 
 * This project used:
 * KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */

package thoiyk.HumanInterfaceComponent.PurchaseOrderItem;
/**
 *
 * @author yoserizy
 */


//K
import thoiyk.HumanInterfaceComponent.PurchaseOrderItem.*;
import KFramework30.Base.*;
import KFramework30.Communication.persistentObjectManagerClass;
import KFramework30.Widgets.KDialogControllerClass;
import KFramework30.Widgets.KDialogControllerClass.KDialogEventCallbackInterface;
import KFramework30.Widgets.KDialogControllerClass.KDialogInterface;
import KFramework30.Widgets.KDropDownFillerClass;
import KFramework30.Widgets.selectDialogClass;
//APP
import ProblemDomainComponent.*;
//RTL
import java.util.Map;
import thoiyk.HumanInterfaceComponent.v_MachineAndSparepart.v_MachineAndSparePartBrowserClass;
import thoiyk.HumanInterfaceComponent.v_po_item.v_po_itemBrowserSimpleClass;


public class PurchaseOrderItemEditDialogClass
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
    public PurchaseOrderItemEditDialogClass( 
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
                PurchaseOrderItemClass.class, 
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        client_id2 = new javax.swing.JLabel();
        LblQtyNeeded = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        itemIDLbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        poidLbl = new javax.swing.JLabel();
        client_address2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        PRNoLbl = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();
        topLabel = new javax.swing.JLabel();
        system_user_id1 = new javax.swing.JLabel();

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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PO Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Id ");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel9.setText("Item ID");

        client_id2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_id2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id2.setName("ID"); // NOI18N

        LblQtyNeeded.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        LblQtyNeeded.setName("Qty"); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel11.setText("Qty");

        jButton2.setText("pick from PR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        itemIDLbl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        itemIDLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        itemIDLbl.setName("ItemID"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel10.setText("PuchaseOrderID");

        poidLbl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        poidLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        poidLbl.setName("PurchaseOrderID"); // NOI18N

        client_address2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_address2.setName("UnitPrice"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel12.setText("Unit Price");

        PRNoLbl.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        PRNoLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PRNoLbl.setName("PRNo"); // NOI18N

        jButton3.setText("Machine/SparePart");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, poidLbl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, client_id2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .add(136, 392, Short.MAX_VALUE))
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(LblQtyNeeded, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(client_address2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(itemIDLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(PRNoLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton3)))
                .add(0, 57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(client_id2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(poidLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(itemIDLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jButton2)
                        .add(jButton3))
                    .add(PRNoLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(client_address2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel12))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(LblQtyNeeded, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel11))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.setBounds(0, 60, 540, 180);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jPanel1.getAccessibleContext().setAccessibleName("Accessories");

        okButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        okButton.setBounds(550, 70, 80, 20);
        jLayeredPane1.add(okButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CancelButton.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        CancelButton.setBounds(550, 100, 80, 20);
        jLayeredPane1.add(CancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
        topLabel.setBounds(0, -3, 680, 650);
        jLayeredPane1.add(topLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        system_user_id1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        system_user_id1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        system_user_id1.setName("ProductionRecordID"); // NOI18N
        system_user_id1.setBounds(90, 190, 50, 20);
        jLayeredPane1.add(system_user_id1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 653, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
        
  private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
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
              KMetaUtilsClass.showErrorMessageFromException( getOwner(), error );               
        } 
}//GEN-LAST:event_applyButtonActionPerformed


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try
        {
            v_po_itemBrowserSimpleClass v_po_itemBrowser = new v_po_itemBrowserSimpleClass(
                                        configuration, log, new javax.swing.JTable(), this );

                               v_po_itemBrowser.initializeTable();   


                               selectDialogClass selector = new selectDialogClass( 
                                       configuration, log, this, v_po_itemBrowser, "Select PO Item" );

                               // dont want to allow this, for example
                               selector.getNewButton().setEnabled(false);
                               selector.getDeleteButton().setEnabled(false);                       

                               parentID = selector.showDialog();
                               
                               itemIDLbl.setText( Long.toString(parentID)); 
                               
                               

                            if( parentID < 0 ) 
                            {
                                throw new KExceptionClass( "You must select a item from PR !", null);

                            }            
                            else
                            {

                               // ---------------------------------------------------------------------
                                // display the PR No                
                                persistentObjectManagerClass POM = new persistentObjectManagerClass(configuration, log);
                                v_PO_ItemClass v_po_item = new v_PO_ItemClass();
                                v_po_item = ( v_PO_ItemClass ) POM.copy4( parentID, v_PO_ItemClass.class );
                                
                                persistentObjectManagerClass POM2 = new persistentObjectManagerClass(configuration, log);
                                ProdRecItemClass v_po_item2 = new ProdRecItemClass();
                                v_po_item2 = ( ProdRecItemClass ) POM.copy4( parentID, ProdRecItemClass.class );
    
                                PRNoLbl.setText(v_po_item.getPRNo());
                                LblQtyNeeded.setText(Double.toString(v_po_item2.getQtyneed()));
                                // ---------------------------------------------------------------------        
                            }   

                               /*
  * */
        }          
        catch( Exception error	){            
                log.log( this, KMetaUtilsClass.getStackTrace( error ) );		                
                KMetaUtilsClass.showErrorMessageFromException( this, error );
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  try
        {
            v_MachineAndSparePartBrowserClass v_msBrowser = new v_MachineAndSparePartBrowserClass(
                                        configuration, log, new javax.swing.JTable(), this );

                               v_msBrowser.initializeTable();   


                               selectDialogClass selector = new selectDialogClass( 
                                       configuration, log, this, v_msBrowser, "Select Machine or SparePart" );

                               // dont want to allow this, for example
                               selector.getNewButton().setEnabled(false);
                               selector.getDeleteButton().setEnabled(false);                       

                               parentID = selector.showDialog();
                               
                               itemIDLbl.setText( Long.toString(parentID)); 
                               
                               

                            if( parentID < 0 ) 
                            {
                                throw new KExceptionClass( "You must select a item from Machine or SparePart !", null);

                            }            
/*                            else
                            {

                               // ---------------------------------------------------------------------
                                // display the PR No                
                                persistentObjectManagerClass POM = new persistentObjectManagerClass(configuration, log);
                                v_PO_ItemClass v_po_item = new v_PO_ItemClass();
                                v_po_item = ( v_PO_ItemClass ) POM.copy4( parentID, v_PO_ItemClass.class );
                                
                                PRNoLbl.setText(v_po_item.getPRNo());
                                // ---------------------------------------------------------------------        
                            }   
*/
                               /*
  * */
        }          
        catch( Exception error	){            
                log.log( this, KMetaUtilsClass.getStackTrace( error ) );		                
                KMetaUtilsClass.showErrorMessageFromException( this, error );
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    

public void loadPic(){
/*    
    try{
        
          JFileChooser chooser = new JFileChooser();
          int returnVal = chooser.showOpenDialog( this );
          
          if( returnVal == JFileChooser.APPROVE_OPTION ){
       
              // get file path
              String fileChosen = chooser.getSelectedFile().getAbsolutePath();
                               
              KBinaryDataClass fileContents = new KBinaryDataClass();
              
              fileContents.loadFromDisk( fileChosen );
              
              // replace image
              log.log( this, "Reemplazando...." + fileContents.length() );   
              
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
        */ 
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField LblQtyNeeded;
    private javax.swing.JLabel PRNoLbl;
    private javax.swing.JButton applyButton;
    private javax.swing.JTextField client_address2;
    private javax.swing.JLabel client_id2;
    private javax.swing.JLabel itemIDLbl;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel poidLbl;
    private javax.swing.JLabel system_user_id1;
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
/*        
        accessoriesClass product = (accessoriesClass) businessObject;
        
        if( product.getImage() != null ){
            
            pictureLabel.setIcon(  new ImageIcon( product.getImage() ) );            
        }
        */ 
    }

    @Override
    public void preUpdate(KBusinessObjectClass businessObject) throws Exception {
    }

    @Override
    public void postUpdate(KBusinessObjectClass businessObject) throws Exception {
    }
   
    
}
