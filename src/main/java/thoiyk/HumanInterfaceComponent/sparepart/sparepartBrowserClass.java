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
                " sp.ID, sp.SPAREPARTTYPEID,spt.NAMA TYPE, sp.SUPPLIERID,sup.nama SUPPLIER, sp.KODE, sp.UKURAN, sp.MESIN, sp.QTY",
                
                // 2 tablas and joins                                             
                " SPAREPART sp   "  +
                " left join SPAREPARTTYPE spt on sp.spareparttypeid=spt.id" +
                " left join SUPPLIER sup on sp.supplierid=sup.id"    ,
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setColumnNames( "sp", "ID", "ID" );
            setColumnNames( "sp", "SPAREPARTTYPEID", "TypeID" );
            setColumnNames( "spt", "TYPE", "TypeName" );
            setColumnNames( "sp", "SUPPLIERID", "SupplierID" );
            setColumnNames( "sup", "SUPPLIER", "SupplierName" );
            setColumnNames( "sp", "KODE", "Code" );
            setColumnNames( "sp", "UKURAN", "Size" );
            setColumnNames( "sp", "MESIN", "Machine" );
            setColumnNames( "sp", "QTY", "Qty" );
            setDefaultOrder( "  ID " );

            //            setRowsHeight( 150 );
            
            // load data
            super.initializeTable();   
            
            // some customization
            //adjustColumnWidth( "id", 100 );
            //adjustColumnWidth( "Name", 200 );  
            //adjustColumnWidth( "Cost", 100 );  
            
            //adjustColumnType( "Cost", BROWSER_COLUMN_TYPE_CURRENCY );            
            //adjustColumnFont(  "Cost",  new Font( "arial", Font.BOLD, 10  ) );             
            //adjustColumnForegroundColor( "Cost", Color.BLUE  );
            
  //          adjustColumnWidth( "IMAGE", 210 );  
   //         setColumnRenderer( "IMAGE", new ImageCellRendererClass( tableModel, log, 120, 150 ) );
            
    }        


    
}
