/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.accessories;

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
import ProblemDomainComponent.accessoriesClass;
import Sample1.HumanInterfaceComponent.sample_product.productEditDialogClass;


public class accessoriesBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public accessoriesBrowserClass(
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
                    accessoriesClass.class,
                    accessoriesEditDialogClass.class
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
                " acs.id, act.NAMA TYPE, acs.image,sup.nama SUPPLIER, acs.KODE, acs.UKURAN, acs.COLOUR, acs.DESCRIPTION ",
                
                // 2 tablas and joins                                             
                " ACCESSORIES acs   " +
                " left join ACCESSORIESTYPE act on acs.accessoriestypeid=act.id" + 
                " left join SUPPLIER sup on acs.supplierid=sup.id"     ,
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setColumnNames( "acs", "ID", "ID" );
            //setColumnNames( "acs", "ACCESSORIESTYPEID", "TypeID" );
            setColumnNames( "act", "TYPE", "TypeName" );                                           
            setColumnNames( "acs", "IMAGE", "Pic" );
            setColumnNames( "acs", "SUPPLIER", "SupplierName" );
            setColumnNames( "acs", "KODE", "Code" );
            setColumnNames( "acs", "UKURAN", "Size" );
            setColumnNames( "acs", "COLOUR", "Colour" );
            setColumnNames( "acs", "DESCRIPTION", "Description" );
            //setColumnNames( "acs", "QTY", "Qty" );
            setDefaultOrder( "  ID " );

            setRowsHeight( 150 );
            
            // load data
            super.initializeTable();   
            
            // some customization
            adjustColumnWidth( "ID", 50 );
            //adjustColumnWidth( "TypeID", 50 );  
            adjustColumnWidth( "TypeName", 100 );  
            //adjustColumnWidth( "SupplierID", 50 );  
            adjustColumnWidth( "SupplierName", 150 );
            adjustColumnWidth( "Code", 50 );
            adjustColumnWidth( "Size", 50 );
            adjustColumnWidth( "Colour", 50 );
            adjustColumnWidth( "Description", 200 );
            //adjustColumnWidth( "Qty", 50 );
            //adjustColumnType( "Cost", BROWSER_COLUMN_TYPE_CURRENCY );            
            //adjustColumnFont(  "Cost",  new Font( "arial", Font.BOLD, 10  ) );             
            //adjustColumnForegroundColor( "Cost", Color.BLUE  );
            //adjustColumnType( "Cost", BROWSER_COLUMN_TYPE_CURRENCY ); 
            adjustColumnWidth( "Pic", 210 );  
            setColumnRenderer( "Pic", new ImageCellRendererClass( tableModel, log, 120, 150 ) );
            
    }        


    
}
