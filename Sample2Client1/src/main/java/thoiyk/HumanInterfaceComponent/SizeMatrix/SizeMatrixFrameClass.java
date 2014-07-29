/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.SizeMatrix;


import thoiyk.HumanInterfaceComponent.SizeMatrix.*;
import Sample1.desktopToolbarListenerInterface;
import Sample1.desktopAccessInterface;
import KFramework30.Base.*;
import KFramework30.Widgets.*;
import java.awt.event.ActionListener;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;


public class SizeMatrixFrameClass extends javax.swing.JInternalFrame 
implements desktopToolbarListenerInterface, InternalFrameListener
{

	// uses
	private KConfigurationClass              configuration;
	private KLogClass                        log;
        private desktopAccessInterface          mainToolbar;

	// has - defaulted
	private SizeMatrixBrowserClass             browser;
                
        public void internalFrameOpened(InternalFrameEvent e) {}
        public void internalFrameClosing(InternalFrameEvent e) {}
        public void internalFrameClosed(InternalFrameEvent e) {}
        public void internalFrameIconified(InternalFrameEvent e) {}
        public void internalFrameDeiconified(InternalFrameEvent e) {}
        public void internalFrameActivated(InternalFrameEvent e) {
                mainToolbar.enableDelete( true );
                mainToolbar.enableNew( true );
                mainToolbar.enableEdit( true );                
                mainToolbar.enableSort( true );
                mainToolbar.enableFilter( true ); 
                mainToolbar.enableRefresh( true );
                mainToolbar.enablePrint( true );
                mainToolbar.enableExport( true );
        }
        public void internalFrameDeactivated(InternalFrameEvent e) {
                mainToolbar.enableDelete( false );
                mainToolbar.enableNew( false );
                mainToolbar.enableEdit( false );
                mainToolbar.enableSort( false );
                mainToolbar.enableFilter( false );  
                mainToolbar.enableRefresh( false );
                mainToolbar.enablePrint( false );  
                mainToolbar.enableExport( false );
        }


        public ActionListener getDesktopToolbarActionListener() {
            return( browser );
        }
                        

    public SizeMatrixFrameClass(KConfigurationClass configurationParam,KLogClass logParam,desktopAccessInterface systemDesktopParam ) throws KExceptionClass
    {        
        initComponents ();
        
        // uses
	configuration = configurationParam;
	log = logParam;
        mainToolbar = systemDesktopParam;
        
	// has defaulted
	browser =  new SizeMatrixBrowserClass( configuration, log, justificationTable, mainToolbar.getDesktopsWindow()  );                           
        browser.initializeTable();        
        
        // init
        addInternalFrameListener( this );            
               
    }            


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        justificationTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jScrollPane1.setName("jScrollPane1"); // NOI18N
        jScrollPane1.setPreferredSize(new java.awt.Dimension(0, 0));

        justificationTable.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        justificationTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        justificationTable.setName("justificationTable"); // NOI18N
        jScrollPane1.setViewportView(justificationTable);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/topBar.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel1.setName("jLabel1"); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable justificationTable;
    // End of variables declaration//GEN-END:variables

}
