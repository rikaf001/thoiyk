/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.mesin;

/**
 *
 * @author yoserizy
 */
//rtl
import javax.swing.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;
import KFramework30.Widgets.DataBrowser.TableCellRenderers.ImageCellRendererClass;

// system
import ProblemDomainComponent.mesinClass;
import thoiyk.HumanInterfaceComponent.mesin.mesinEditDialogClass;


public class mesinBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public mesinBrowserClass(
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
                    mesinClass.class,
                    mesinEditDialogClass.class
            );  
            
            // uses                   
	    // has            
    }        


    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                // 1 campos                    
                " msn.ID,mt.nama TYPE,msn.image,sup.nama SUPPLIER, msn.KODE, msn.DESCRIPTION",
                
                // 2 tablas and joins                                             
                " MESIN msn   "  +
                " left join MESINTYPE mt on msn.mesintypeid=mt.id " +
                " left join SUPPLIER sup on msn.supplierid=sup.id"    ,
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
           setColumnNames( "msn", "ID", "ID" );
          // setColumnNames( "msn", "MESINTYPEID", "TypeID" );
           setColumnNames( "mt", "TYPE", "TypeName" );
           setColumnNames( "msn", "IMAGE", "Pic" );
           setColumnNames( "sup", "SUPPLIER", "SupplierName" );
           setColumnNames( "msn", "KODE", "Code" );
           setColumnNames( "msn", "DESCRIPTION", "Description" );
           //setColumnNames( "msn", "QTY", "Qty" );
       /*     setColumnNames( "stk", "STOCKTYPEID", "StockTypeID" );
            setColumnNames( "stk", "BUYERID", "BuyerID" );                                      
            //setColumnNames( "stk", "PRODUCT", "Product" );                                      
            setColumnNames( "stk", "COLOUR", "Colour" );                                      
*/
           setDefaultOrder( "  ID " );

            setRowsHeight( 150 );
            
            // load data
            super.initializeTable();   
            
            // some customization
            adjustColumnWidth( "ID", 20 );
            adjustColumnWidth( "TypeName", 100 );  
            adjustColumnWidth( "SupplierName", 200 );  
            adjustColumnWidth( "Code", 100 );  
            adjustColumnWidth( "Description", 200 ); 
            
            //adjustColumnType( "Cost", BROWSER_COLUMN_TYPE_CURRENCY );            
            //adjustColumnFont(  "Cost",  new Font( "arial", Font.BOLD, 10  ) );             
            //adjustColumnForegroundColor( "Cost", Color.BLUE  );
            
            adjustColumnWidth( "Pic", 210 );  
            setColumnRenderer( "Pic", new ImageCellRendererClass( tableModel, log, 120, 150 ) );
            
    }        


    
}
