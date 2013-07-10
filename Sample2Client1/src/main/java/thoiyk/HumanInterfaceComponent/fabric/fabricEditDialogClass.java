/*
This source code is part of the KFRAMEWORK  (http://k-framework.sourceforge.net/)
Copyright (C) 2001  Alejandro Vazquez, Ke Li
Feedback / Bug Reports vmaxxed@users.sourceforge.net

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 2.1 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package thoiyk.HumanInterfaceComponent.fabric;


//K
import thoiyk.HumanInterfaceComponent.fabric.*;
import KFramework30.Base.*;
import KFramework30.Widgets.KDialogControllerClass;
import KFramework30.Widgets.KDialogControllerClass.KDialogEventCallbackInterface;
import KFramework30.Widgets.KDialogControllerClass.KDialogInterface;
import KFramework30.Widgets.KDropDownFillerClass;
import KFramework30.Widgets.selectDialogClass;
//APP
import ProblemDomainComponent.*;
//RTL
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import thoiyk.HumanInterfaceComponent.supplier.supplierBrowserClass;


public class fabricEditDialogClass
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
    public fabricEditDialogClass( 
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
                fabricClass.class, 
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

      
        KDropDownFillerClass statusComboFiller = new KDropDownFillerClass(
                        configuration, log, 
                        //SQL, might have parameters and where clause or order by
                        " select ID,  NAMA from fabrictype ",
                        "ID", cbFabricType, "fabrictypeid"
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
        jLabel9 = new javax.swing.JLabel();
        client_id2 = new javax.swing.JLabel();
        pictureLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        client_address1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        client_address2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        client_address3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        client_address4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        client_address5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        client_address6 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        client_address7 = new javax.swing.JTextField();
        cbFabricType = new javax.swing.JComboBox();
        supplierid = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();
        textLabel = new javax.swing.JLabel();
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Products", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Id ");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel8.setText("Fabric Type");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel9.setText("Supplier:");

        client_id2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_id2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        client_id2.setName("id"); // NOI18N

        pictureLabel.setToolTipText("");
        pictureLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pictureLabel.setName("prodPictureXXX"); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jButton1.setText("Load Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadImage(evt);
            }
        });

        client_address1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_address1.setName("kode"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel10.setText("Code:");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel11.setText("Content:");

        client_address2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_address2.setName("content"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel12.setText("Construction:");

        client_address3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_address3.setName("construction"); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel13.setText("Finishing:");

        client_address4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_address4.setName("finishing"); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel14.setText("Colour:");

        client_address5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_address5.setName("colour"); // NOI18N

        jLabel15.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel15.setText("Width:");

        client_address6.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_address6.setName("width"); // NOI18N

        jLabel16.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel16.setText("Weight:");

        client_address7.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        client_address7.setName("weight"); // NOI18N

        cbFabricType.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        cbFabricType.setName("cbFabricType"); // NOI18N
        cbFabricType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFabricTypeActionPerformed(evt);
            }
        });

        supplierid.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        supplierid.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        supplierid.setName("supplierid"); // NOI18N

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel2.setText("image best fit size:  197 x 134 px");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(4, 4, 4)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(pictureLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel2)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 119, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(1, 1, 1)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(36, 36, 36)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(client_address4)
                                    .add(client_address5)
                                    .add(client_address6)
                                    .add(client_address7)))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                                .add(jLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(36, 36, 36)
                                .add(client_address3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(163, 163, 163))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(64, 64, 64)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(client_id2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(supplierid, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(250, 250, 250))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(cbFabricType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 172, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(163, 163, 163))))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(36, 36, 36)
                                .add(client_address1))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(36, 36, 36)
                                .add(client_address2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(26, 26, 26)
                                .add(pictureLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel2))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(16, 16, 16)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(client_id2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(cbFabricType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(2, 2, 2)
                                        .add(supplierid, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jButton2)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jLabel8)
                                        .add(9, 9, 9)
                                        .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(client_address1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel11)
                                    .add(client_address2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel12)
                                    .add(client_address3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel13)
                                    .add(client_address4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(11, 11, 11)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(client_address5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel14)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButton1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel15)
                    .add(client_address6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel16)
                    .add(client_address7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(0, 25, Short.MAX_VALUE))
        );

        jPanel1.setBounds(0, 60, 540, 330);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jPanel1.getAccessibleContext().setAccessibleName("Fabric");

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
        applyButton.setText("Reset"); // NOI18N
        applyButton.setName("applyButton"); // NOI18N
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });
        applyButton.setBounds(550, 130, 80, 20);
        jLayeredPane1.add(applyButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        textLabel.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        textLabel.setForeground(new java.awt.Color(255, 255, 255));
        textLabel.setText("Fabric");
        textLabel.setBounds(140, 0, 270, 50);
        jLayeredPane1.add(textLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
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
supplierid.setText("");
client_address1.setText("");
client_address2.setText("");
client_address3.setText("");
client_address4.setText("");
client_address5.setText("");
client_address6.setText("");
client_address7.setText("");
pictureLabel.setIcon(null);
}//GEN-LAST:event_applyButtonActionPerformed

private void loadImage(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadImage

    loadPic();
    
}//GEN-LAST:event_loadImage

    private void cbFabricTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFabricTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFabricTypeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try
        {
            supplierBrowserClass supplierBrowser = new supplierBrowserClass(
                configuration, log, new javax.swing.JTable(), this );

            supplierBrowser.initializeTable();

            selectDialogClass selector = new selectDialogClass(
                configuration, log, this, supplierBrowser, "Select Supplier" );

            // dont want to allow this, for example
            selector.getNewButton().setEnabled(false);
            selector.getDeleteButton().setEnabled(false);

            parentID = selector.showDialog();

            supplierid.setText( Long.toString(parentID));

            //if( parentID == -1 ) throw new KExceptionClass( "You must select a client for the invoice!", null);

            /*
            * */
        }
        catch( Exception error	){
            log.log( this, KMetaUtilsClass.getStackTrace( error ) );
            KMetaUtilsClass.showErrorMessageFromException( this, error );
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    

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
    private javax.swing.JButton applyButton;
    private javax.swing.JComboBox cbFabricType;
    private javax.swing.JTextField client_address1;
    private javax.swing.JTextField client_address2;
    private javax.swing.JTextField client_address3;
    private javax.swing.JTextField client_address4;
    private javax.swing.JTextField client_address5;
    private javax.swing.JTextField client_address6;
    private javax.swing.JTextField client_address7;
    private javax.swing.JLabel client_id1;
    private javax.swing.JLabel client_id2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JLabel supplierid;
    private javax.swing.JLabel textLabel;
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
        
        fabricClass product = (fabricClass) businessObject;
        
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
