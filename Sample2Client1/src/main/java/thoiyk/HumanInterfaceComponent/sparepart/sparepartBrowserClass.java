/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.sparepart;

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
import ProblemDomainComponent.sparepartClass;


public class sparepartBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public sparepartBrowserClass(
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
                    sparepartClass.class,
                    sparepartEditDialogClass.class
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
                " sp.ID,sp.image,spt.NAMA TYPE,sup.nama SUPPLIER, sp.KODE, sp.UKURAN, sp.MESIN, sp.DESCRIPTION",
                
                // 2 tablas and joins                                             
                " SPAREPART sp   "  +
                " left join SPAREPARTTYPE spt on sp.spareparttypeid=spt.id" +
                " left join SUPPLIER sup on sp.supplierid=sup.id"    ,
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setColumnNames( "sp", "ID", "ID" );
            //setColumnNames( "sp", "SPAREPARTTYPEID", "TypeID" );
            setColumnNames( "spt", "TYPE", "TypeName" );
            setColumnNames( "sp", "IMAGE", "Pic" );
            setColumnNames( "sup", "SUPPLIER", "SupplierName" );
            setColumnNames( "sp", "KODE", "Code" );
            setColumnNames( "sp", "UKURAN", "Size" );
            setColumnNames( "sp", "MESIN", "Machine" );
            setColumnNames( "sp", "DESCRIPTION", "Description" );
            //setColumnNames( "sp", "QTY", "Qty" );
            setDefaultOrder( "  ID " );

            setRowsHeight( 150 );
            
            // load data
            super.initializeTable();   
            
            // some customization
            adjustColumnWidth( "ID", 50 );
            adjustColumnWidth( "TypeName", 100 );  
            adjustColumnWidth( "SupplierName", 200 );  
            adjustColumnWidth( "Code", 100 ); 
            adjustColumnWidth( "Size", 100 ); 
            adjustColumnWidth( "Machine", 100 ); 
            adjustColumnWidth( "Description", 200 ); 
            
            
            //adjustColumnType( "Cost", BROWSER_COLUMN_TYPE_CURRENCY );            
            //adjustColumnFont(  "Cost",  new Font( "arial", Font.BOLD, 10  ) );             
            //adjustColumnForegroundColor( "Cost", Color.BLUE  );
            
           adjustColumnWidth( "Pic", 210 );  
           setColumnRenderer( "Pic", new ImageCellRendererClass( tableModel, log, 120, 150 ) );
            
    }        


    
}
