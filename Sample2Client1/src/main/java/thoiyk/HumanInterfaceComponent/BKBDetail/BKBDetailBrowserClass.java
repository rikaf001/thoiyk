/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.BKBDetail;

/**
 *
 * @author yoserizy
 */
//rtl
import javax.swing.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;
import KFramework30.Widgets.DataBrowser.KBrowserDataWriterInterface;
import KFramework30.Widgets.DataBrowser.cellRenderingHookInterface;
import KFramework30.Widgets.DataBrowser.recordClass;
import static KFramework30.Widgets.KDataBrowserBaseClass.BROWSER_COLUMN_TYPE_NUMERICNOFORMAT;

// system
import ProblemDomainComponent.BKBDetailClass;
import java.awt.Color;
import java.awt.Component;
import java.util.HashMap;
import thoiyk.HumanInterfaceComponent.PurchaseOrder.PurchaseOrderBrowserClass;



public class BKBDetailBrowserClass 
extends KDataBrowserBaseClass 
implements 
cellRenderingHookInterface,  // to customize the data at runtime OPTIONAL
KBrowserDataWriterInterface // to make it RW  OPTIONAL
{   
        
        // modes
        static public final int ALL_POITEM = 0;
        static public final int POITEM_BY_PO = 1;
    
	// uses
        private int                             mode;
        private long                            parentID;
        private long                            productID;

	// has - defaulted
        
        
    
    /** Creates new viajeBrowserClass */
    public BKBDetailBrowserClass(
            KConfigurationClass configurationParam,
            KLogClass logParam,
            JTable tableParam,            
            int modeParam, long parentIDparam,            
            java.awt.Window parentWindow ) throws KExceptionClass
    {
        
            // inherits
            super(
                    configurationParam, logParam,
                    true, tableParam, parentWindow,  
                    BKBDetailClass.class,
                    BKBDetailEditDialogClass.class
            );  
            
            // uses   
            mode = modeParam;
            parentID = parentIDparam;
            
	    // has
            
            // set
            setCellDisplayHook( this );
            
            
    }        



    public void initializeTable()
    throws KExceptionClass
    {	      
 

                                            
            if( mode == POITEM_BY_PO ){   
                
                // this is a read write browsers
                setBrowserSaveListener(this);
                
                if( configuration.getField("databaseType").equals( "oracle" )  ){
                    
                    super.initializeSQLQuery(     

                        // 1 fields                    
                        "bkb.id,pri.nama name,bkb.itemqty, uta.nama itemunit, RETRIEVE_BTB_NO(itemid) no_btb,RETRIEVE_BTB_TGL(itemid) tanggal,RETRIEVE_BTB_NOBC(itemid) no_bc ",    

                        // 2 tables and joins                                                
                        " bkb_dtl bkb " +
                        "left join v_pr_item pri on bkb.itemid=pri.id " +
                        "left join unittype uta on bkb.itemunitid=uta.id ",

                        // 3 key of primary PDC object
                        "ID"                                                                                              
                            );    
                    
                }else{
                
                    throw new KExceptionClass( "Data base type not recognized " + configuration.getField("databaseType"), null );
                }
                
                setColumnNames( "pi", "ID", "ID" );             
                setColumnNames( "pi", "NAME", "Nama" );
                setColumnNames( "pi", "ITEMQTY", "ItemQty" );             
                setColumnNames( "pi", "ITEMUNIT", "Unit" );
                setColumnNames( "pi", "NO_BTB", "NoBTB" );
                setColumnNames( "pi", "TANGGAL", "Tanggal" );
                setColumnNames( "pi", "NO_BC", "NoBC" );
                // replace criteria
                setDefaultCriteria( " hdrid = ? " );               
                bindDefaultParameter1( ":hdrid",  parentID  );     
                
            }else{  // mode = ALL_INVOICES
                
                // this is NOT a read write browsers
                //setBrowserSaveListener(this);
                
              if( configuration.getField("databaseType").equals( "oracle" )  ){
                    
                    super.initializeSQLQuery(     

                        // 1 fields                    
                        "bkb.id,pri.nama name,bkb.itemqty, uta.nama itemunit, RETRIEVE_BTB_NO(itemid) no_btb,RETRIEVE_BTB_TGL(itemid) tanggal,RETRIEVE_BTB_NOBC(itemid) no_bc ",    

                        // 2 tables and joins                                                
                        " bkb_dtl bkb " +
                        "left join v_pr_item pri on bkb.itemid=pri.id " +
                        "left join unittype uta on bkb.itemunitid=uta.id ",

                        // 3 key of primary PDC object
                        "ID"                                                                                                   
                            );    
                    
                }else{
                
                    throw new KExceptionClass( "Data base type not recognized " + configuration.getField("databaseType"), null );
                }               
                
                // FOR ALL INVOICES
                
                setColumnNames( "pi", "ID", "ID" );             
                setColumnNames( "pi", "NAME", "Nama" );
                setColumnNames( "pi", "ITEMQTY", "ItemQty" );             
                setColumnNames( "pi", "ITEMUNIT", "Unit" );
                setColumnNames( "pi", "NO_BTB", "NoBTB" );
                setColumnNames( "pi", "TANGGAL", "Tanggal" );
                setColumnNames( "pi", "NO_BC", "NoBC" );
                
            }

            setDefaultOrder( "itemid" );
                                
            
            super.initializeTable();   
            
            adjustColumnWidth( "ID", 40 );
            adjustColumnWidth( "Nama", 200 );
            adjustColumnWidth( "ItemQty", 80 );
            adjustColumnWidth( "Unit",80 );
            adjustColumnWidth( "NoBTB",80 );
            adjustColumnWidth( "Tanggal",80 );
            adjustColumnWidth( "NoBC",80 );
            
            adjustColumnType("ID",  BROWSER_COLUMN_TYPE_NUMERICNOFORMAT );
            

            if( mode == POITEM_BY_PO ){                        
                
            }
            
                       
    }        

    
    //----------------------------------------------------
    
       // Fired on browser save action, either by button called or user browser.save ...
       // Required because it is RW, and implements KBrowserDataWriterInterface
       // OPTIONAL , if no RW  remove this and the implements  KBrowserDataWriterInterface
        // For a bare minimums example better see the productBrowserClass
    
        @Override
        public void save( java.util.List< String > fieldNames, java.util.List< recordClass > data ){                
            
            /*
            try {            
            
                // load status
                Properties invoiceStatusProp = new Properties();
                dbTransactionClientClass query = new dbTransactionClientClass(configuration, log);
                query.prepare( " select FACSTATUS_ID, FACSTATUS_STATUS from SAMPLE_FACTURA_STATUS " );
                query.executeQuery(0, 999);
                while( query.fetch() ){
                    invoiceStatusProp.put( query.getField("FACSTATUS_STATUS"), query.getField("FACSTATUS_ID") );
                }
                                                    
                // for you to see
                Iterator dataRowChanged = data.iterator();
                while( dataRowChanged.hasNext() ){
                    
                    recordClass currentRow = (recordClass) dataRowChanged.next();

                    // materialize object
                    sample_facturaClass factura = new sample_facturaClass();

                    persistentObjectManagerClass pom = new persistentObjectManagerClass(configuration, log) ;
                    factura = (sample_facturaClass) pom.copy4( KMetaUtilsClass.getIntegralNumericValueFromString(  (String) currentRow.getValueAt(6) ), factura.getClass()  );
                                       
                    // update it
                    
                    // OK box
                    
                        String OKbox = (String) currentRow.getValueAt(0);
                        // will return ture or false for the checkbox
                        // not used in this example. This is a sample on how to read it
                    
                    // DATE
                        factura.setFacDate(                                 
                                KMetaUtilsClass.stringToDate(
                                    KMetaUtilsClass.KDEFAULT_LONG_DATE_TIME_FORMAT, (String) currentRow.getValueAt(3)  ) );

                    // STATUS
                        factura.setFacstatusId( KMetaUtilsClass.getIntegralNumericValueFromString( invoiceStatusProp.getProperty( (String) currentRow.getValueAt(4) ) ) );
                        
                    // TOTAL
                        factura.setFacTotal( KMetaUtilsClass.getCurrencyNumericValueFromString( (String)currentRow.getValueAt(5) ) );

                    // save it
                    factura = (sample_facturaClass) pom.update4( KMetaUtilsClass.getIntegralNumericValueFromString( (String)currentRow.getValueAt(6) ), factura);

                }
                
            } catch (KExceptionClass error) {
                
                // log error
                log.log( this, KMetaUtilsClass.getStackTrace( error ) );		                
                // show error message
                KMetaUtilsClass.showErrorMessageFromException( getParentWindow(), error );                

            }
                
            */
           
        
    }      
  
  // ---------------------------------------------------------------------------     
        
        // These two are OPTIONAL to show how to customize the rendering
        // Used because it immplements cellRenderingHookInterface
        // Remove immplements and functions if not required
        // For a bare minimums example better see the productBrowser.class
        
        public void cellEditHook(int row, int col, boolean isSelected, Component editor, String ColumnName, String value, recordClass record, KLogClass log) throws KExceptionClass {
                 // not customizing the editor
        }          

        public void cellRenderingHook( 
            int row, int col, // what cell are we executing for 
            boolean isSelected, // is it currently highlited ?
            Component renderer, // here is the renderer, change it, or replaze it altogether
            String ColumnName, String value,  // data
            recordClass record, // the whole row data
            KLogClass log ) // the log used
            throws KExceptionClass               
        {
            boolean updateRenderer = false;

            // -----------------------------------------------------------------------                                    
            if( ColumnName.equals( "TOTAL" ) ) {

                if( KMetaUtilsClass.getCurrencyNumericValueFromString( value ) < 0 ){ 

                    renderer.setForeground( Color.red ); 

                    if( isSelected  )renderer.setBackground( Color.yellow );

                    updateRenderer = true;
                }

            }                
            // -----------------------------------------------------------------------            
           
        }
        
        
    // ----------------------------------------------------------------------
    // ----------------------------------------------------------------------
    // Event handling
    // ----------------------------------------------------------------------
    // ----------------------------------------------------------------------


  @Override
  public void newButtonActionPerformed() // need override default to set foreing keys to parent
   
  {       
      
        try{            
            
                // ------------------------------------------------
                // when not inside a client edit dialog
            
                        if( mode == ALL_POITEM ){

                            // build a client browser
                               PurchaseOrderBrowserClass pr_new = new PurchaseOrderBrowserClass(
                                        configuration, log, new javax.swing.JTable(), getParentWindow() );

                               pr_new.initializeTable();   


                               selectDialogClass selector = new selectDialogClass( 
                                       configuration, log, getParentWindow(), pr_new, "Select Production Record Item" );

                               // dont want to allow this, for example
                               selector.getNewButton().setEnabled(false);
                               selector.getDeleteButton().setEnabled(false);                       

                               productID = selector.showDialog();
                               log.log( this,"---------------------------------------\nparentID:"+parentID);        

                               if( parentID == -1 ) throw new KExceptionClass( "You must select a production record for the pr_newitem!", null);
                        }

                // when not inside a client edit dialog
                // ------------------------------------------------               
                        
                        
            
                
                HashMap foreingKeys = new HashMap();
                //foreingKeys.put( "itemid", productID );                                             
                foreingKeys.put( "hdrid", parentID );
                super.newButtonActionPerformed( foreingKeys ); 
                
                
        }
        catch( Exception error	){            
                log.log( this, KMetaUtilsClass.getStackTrace( error ) );		                
                KMetaUtilsClass.showErrorMessageFromException( getParentWindow(), error );
        }
 
                     
  }
  
  


}
