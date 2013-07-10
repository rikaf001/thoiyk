/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.v_PRHeadItem;

/**
 *
 * @author yoserizy
 */
//rtl
import javax.swing.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;

// system
import ProblemDomainComponent.fabricClass;


public class v_PRHeadItemBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses           
    
    // has

    public v_PRHeadItemBrowserClass (KConfigurationClass configurationParam,
            KLogClass logParam,
            JTable tableParam,
            java.awt.Window parentWindow           
            ) throws KExceptionClass
    {
    super(
                    configurationParam, logParam,
                    true, tableParam, parentWindow,  
                    fabricClass.class,
                    null//v_sr_iteEditDialogClass.class
            );
    };

    
    /** Creates new viajeBrowserClass */
    /*
     * public v_sr_itemBrowserClass(
            KConfigurationClass configurationParam,
            KLogClass logParam,
            JTable tableParam,
            java.awt.Window parentWindow           
            ) throws KExceptionClass
    {
        
            // inherits
        
            super(
                    configurationParam, logParam,
                    true, tableParam, parentWindow,  
                    fabricClass.class,
                    fabricEditDialogClass.class
            );  
            
            // uses                   
	    // has            
    }        
*/

    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                // 1 campos                    
                " ID,PRID,SRID,PRNO,BUYERNAME,DESCRIPTION,ISSUEDBY,ITEMID ",
                
                // 2 tablas and joins                                             
                " V_PRHEADITEM vpo  "    ,
                
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            //setColumnNames( "fbc", "NAMA", "Nama" );
       /*     setColumnNames( "stk", "STOCKTYPEID", "StockTypeID" );
            setColumnNames( "stk", "BUYERID", "BuyerID" );                                      
            //setColumnNames( "stk", "PRODUCT", "Product" );                                      
            setColumnNames( "stk", "COLOUR", "Colour" );                                      
            setColumnNames( "stk", "IMAGE", "Image" );                                      
            setDefaultOrder( "  ID " );
*/
            //setRowsHeight( 150 );
            
            // load data
            super.initializeTable();   
            
            // some customization
            //adjustColumnWidth( "id", 100 );
           // adjustColumnWidth( "Nama", 500 );  
            //adjustColumnWidth( "Cost", 100 );  
            
            //adjustColumnType( "Cost", BROWSER_COLUMN_TYPE_CURRENCY );            
            //adjustColumnFont(  "Cost",  new Font( "arial", Font.BOLD, 10  ) );             
            //adjustColumnForegroundColor( "Cost", Color.BLUE  );
            
            //adjustColumnWidth( "IMAGE", 210 );  
            //setColumnRenderer( "IMAGE", new ImageCellRendererClass( tableModel, log, 120, 150 ) );
            
    }        


    
}
