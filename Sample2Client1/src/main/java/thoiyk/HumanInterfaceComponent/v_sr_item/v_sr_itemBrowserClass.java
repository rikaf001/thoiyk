/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.v_sr_item;

/**
 *
 * @author yoserizy
 */
//rtl
import javax.swing.*;
import javax.swing.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;

// system
import ProblemDomainComponent.fabricClass;


public class v_sr_itemBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    public v_sr_itemBrowserClass (KConfigurationClass configurationParam,
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
    

    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                // 1 campos                    
                " ID, CATEGORY,SUBCATEGORY, NAMA ",
                
                // 2 tablas and joins                                             
                " v_sr_item vsri",
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setColumnNames( "vsri", "ID", "ID" );
            setColumnNames( "vsri", "CATEGORY", "Category" );
            setColumnNames( "vsri", "SUBCATEGORY", "SubCategory" );
            setColumnNames( "vsri", "NAMA", "Nama" );
            
            // load data
            super.initializeTable();   
            
            adjustColumnWidth( "ID", 50 ); 
            adjustColumnWidth( "Category", 100 ); 
            adjustColumnWidth( "SubCategory", 100 ); 
            adjustColumnWidth( "Nama", 500 );  
            
    }        


    
}
