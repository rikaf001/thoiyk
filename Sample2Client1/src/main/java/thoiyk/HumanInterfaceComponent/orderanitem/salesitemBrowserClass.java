/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.orderanitem;

/**
 *
 * @author yoserizy
 */
import javax.swing.*;
import java.awt.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;
import KFramework30.Communication.persistentObjectManagerClass;
import static KFramework30.Widgets.KDataBrowserBaseClass.BROWSER_COLUMN_TYPE_CURRENCY;

// system
import ProblemDomainComponent.salesitemClass;
import Sample1.HumanInterfaceComponent.system_mail.*;
//import ProblemDomainComponent.sample_clientClass;
import ProblemDomainComponent.salesitemClass;
import thoiyk.HumanInterfaceComponent.orderanitem.salesitemEditDialogClass;
import java.util.HashMap;
import thoiyk.HumanInterfaceComponent.samplerecord.samplerecordBrowserClass;


public class salesitemBrowserClass 
extends KDataBrowserBaseClass {   
    
        // constants
        public static final int                ITEM_BY_SALES = 0;
    
	// uses
        private int                             mode;
        private long                            parent_id;

	// has - defaulted
    
    /** Creates new viajeBrowserClass */
    public salesitemBrowserClass(
            KConfigurationClass configurationParam,
            KLogClass logParam,
            int modeParam,
            long parent_idParam,
            JTable JTableParam,
            java.awt.Window parentWindow ) throws KExceptionClass
    {
        
        
            // inherits
            super(
                    configurationParam, logParam,
                    true, JTableParam, parentWindow,  
                    salesitemClass.class,
                    salesitemEditDialogClass.class
            );  
            
            // uses   
            mode = modeParam;
            parent_id = parent_idParam;
            
	    // has
            
            
    }        


    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                // 1 campos                    
                " sr.description , item.salesid, item.qty , item.cost , ( item.qty * item.cost )  as total , item.id ",
                
                // 2 tablas and joins                                             
                " salesitem item   " +
                " left join samplerecord sr on item.samplerecordid = sr.id "  ,
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
       /*     setColumnNames( "prod", "PROD_NAME", "Description" );               
            setColumnNames( "item", "ITEM_QUANTITY", "Quantity" );               
            setColumnNames( "item", "ITEM_COST", "Unit Cost" );     
            setColumnNames( "", "TOTAL", "TOTAL" );  
                       
            setDefaultOrder( " ITEM_ID " );
*/
            // only one mode ITEM_BY_SALES
            setDefaultCriteria( " item.salesid = ? " );
            bindDefaultParameter1( ":v1", parent_id );
              
            // hide the link id
            setVisibleColumnCount( 4 );
            
            // load data
            super.initializeTable();   
            
            // some customization
            //adjustColumnType("Unit Cost", BROWSER_COLUMN_TYPE_CURRENCY );
//            adjustColumnType("TOTAL", BROWSER_COLUMN_TYPE_CURRENCY );
            
            //adjustColumnWidth( "Quantity", 100 );              
           // adjustColumnFont(  "Quantity",  new Font( "arial", Font.BOLD, 10  ) );             
           // adjustColumnForegroundColor( "Quantity", Color.BLUE  );
            
    }        

    // ----------------------------------------------------------------------
    // ----------------------------------------------------------------------
    // Event handling
    // ----------------------------------------------------------------------
    // ----------------------------------------------------------------------


  public void newButtonActionPerformed()
  {       
      
      try{
              long prodId;
              {
                  
                       //--------------------------------------------------
                       // Open Product catalogue
                       samplerecordBrowserClass productCatalog = new samplerecordBrowserClass(
                                configuration, log, new javax.swing.JTable(), getParentWindow()  );
                       productCatalog.initializeTable();   
                                              
                       selectDialogClass selector = new selectDialogClass( 
                               configuration, log, getParentWindow(), productCatalog, "SampleRecord Catalog");
                       
                       // dont want to allow this, for exaple
                       selector.getNewButton().setEnabled(false);
                       selector.getDeleteButton().setEnabled(false);                       
                       
                       prodId = selector.showDialog();
                       
                       if( prodId == -1 ) throw new KExceptionClass( "You must select a SampeRecord ", null);      
                       
                       // Open Product catalogue                       
                       //--------------------------------------------------
                       
                }
   
                HashMap foreingKeys = new HashMap();
                foreingKeys.put( "salesid", parent_id );       
                foreingKeys.put( "samplerecordid", prodId );    
                super.newButtonActionPerformed( foreingKeys );
        }
        catch( Exception error	){           
                log.log( this, KMetaUtilsClass.getStackTrace( error ) );		                
                KMetaUtilsClass.showErrorMessageFromException( getParentWindow(), error );
        }
   
                       
  }
  
  

    
}
