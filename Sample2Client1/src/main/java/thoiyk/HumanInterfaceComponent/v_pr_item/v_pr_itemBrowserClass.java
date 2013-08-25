/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.v_pr_item;

/**
 *
 * @author yoserizy
 */
import javax.swing.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;

// system
import ProblemDomainComponent.fabricClass;


public class v_pr_itemBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    public v_pr_itemBrowserClass (KConfigurationClass configurationParam,
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
                " ID, CATEGORY, NAMA ",
                
                // 2 tablas and joins                                             
                " v_pr_item vsri",
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setColumnNames( "vsri", "ID", "ID" );
            setColumnNames( "vsri", "CATEGORY", "Category" );
            setColumnNames( "vsri", "NAMA", "Nama" );
            
            // load data
            super.initializeTable();   
            
            adjustColumnWidth( "Nama", 500 );  
            
    }        


    
}
