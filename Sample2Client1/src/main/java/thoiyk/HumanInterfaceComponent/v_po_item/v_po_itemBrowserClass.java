/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.v_po_item;

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


public class v_po_itemBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    public v_po_itemBrowserClass (KConfigurationClass configurationParam,
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
     * public v_po_itemBrowserClass(
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
                " ID, PRNO, BUYERNAME,SUBCATEGORY, ITEMNAME, QTYNEED",
                
                // 2 tablas and joins                                             
                " v_po_item vpoi"    ,
                
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setColumnNames( "vpoi", "ID", "ID" );
            setColumnNames( "vpoi", "PRNO", "PRNO" );
            setColumnNames( "vpoi", "BUYERNAME", "Buyer Name" );
            setColumnNames( "vpoi", "SUBCATEGORY", "SubCategory" );
            setColumnNames( "vpoi", "ITEMNAME", "Description" );
            setColumnNames( "vpoi", "QTYNEED", "Qty Need" );
            
            setDefaultOrder( "itemid" );
            // load data
            super.initializeTable();   
            
            
            // some customization
            adjustColumnWidth( "ID", 60 );
            adjustColumnWidth( "PRNO", 80 );
            adjustColumnWidth( "Buyer Name", 100 );        
            adjustColumnWidth( "SubCategory", 100 );
            adjustColumnWidth( "Description", 200 );
             adjustColumnWidth( "Qty Need", 100 );
            
    }        


    
}
