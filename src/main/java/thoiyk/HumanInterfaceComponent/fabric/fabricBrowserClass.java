/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.fabric;

/**
 *
 * @author yoserizy
 */

//rtl
import javax.swing.*;
import java.awt.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;
import KFramework30.Communication.persistentObjectManagerClass;

// system
import KFramework30.Widgets.DataBrowser.TableCellRenderers.ImageCellRendererClass;
import static KFramework30.Widgets.KDataBrowserBaseClass.BROWSER_COLUMN_TYPE_CURRENCY;
import Sample1.HumanInterfaceComponent.system_mail.*;
import ProblemDomainComponent.sample_productClass;
import ProblemDomainComponent.fabricClass;
import Sample1.HumanInterfaceComponent.sample_product.productEditDialogClass;
import java.util.HashMap;


public class fabricBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public fabricBrowserClass(
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


    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                // 1 campos                    
                " fbc.ID, fbt.nama TYPE, sup.nama SUPPLIER, fbc.KODE, fbc.CONTENT,fbc.CONSTRUCTION, fbc.FINISHING,  fbc.COLOUR, fbc.WIDTH, fbc.WEIGHT",
                
                // 2 tablas and joins                                             
                " FABRIC fbc   "  +
                " left join FABRICTYPE fbt on fbc.fabrictypeid=fbt.id" +
                " left join SUPPLIER sup on fbc.supplierid=sup.id"    ,
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setColumnNames( "fbc", "ID", "ID" );
            //setColumnNames( "fbc", "FABRICTYPEID", "TypeID" );
            setColumnNames( "fbt", "TYPE", "Type Name" );
           // setColumnNames( "fbc", "SUPPLIERID", "SupplierID" );
            setColumnNames( "sup", "SUPPLIER", "Supplier Name" );
            setColumnNames( "fbc", "KODE", "Code" );
            setColumnNames( "fbc", "CONTENT", "Content" );
            setColumnNames( "fbc", "CONSTRUCTION", "Construction" );
            setColumnNames( "fbc", "FINISHING", "Finishing" );
            setColumnNames( "fbc", "COLOUR", "Colour" );
           // setColumnNames( "fbc", "QTY", "Qty" );
            setColumnNames( "fbc", "WIDTH", "Width" );
            setColumnNames( "fbc", "WEIGHT", "Weigth" );
            setDefaultOrder( "  ID " );

            //setRowsHeight( 150 );
            
            // load data
            super.initializeTable();   
            
            // some customization
            //adjustColumnWidth( "id", 100 );
            //adjustColumnWidth( "Name", 200 );  
            //adjustColumnWidth( "Cost", 100 );  
            
            //adjustColumnType( "Cost", BROWSER_COLUMN_TYPE_CURRENCY );            
            //adjustColumnFont(  "Cost",  new Font( "arial", Font.BOLD, 10  ) );             
            //adjustColumnForegroundColor( "Cost", Color.BLUE  );
            
            //adjustColumnWidth( "IMAGE", 210 );  
            //setColumnRenderer( "IMAGE", new ImageCellRendererClass( tableModel, log, 120, 150 ) );
            
    }        


    
}
