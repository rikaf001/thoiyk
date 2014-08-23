/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.v_PR_Finish;

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


public class v_PR_FinishBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    public v_PR_FinishBrowserClass (KConfigurationClass configurationParam,
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
                " ID, PRNO,PRNO, BUYERID,BUYERNAME, STYLE, QTY, CUTTING, SEWING ",
                
                // 2 tablas and joins                                             
                " v_PR_Finish vsri",
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
        /*    setColumnNames( "vsri", "ID", "ID" );
            setColumnNames( "vsri", "CATEGORY", "Category" );
            setColumnNames( "vsri", "NAMA", "Nama" );
           */ 
            // load data
            super.initializeTable();   
            
           // adjustColumnWidth( "Nama", 500 );  
            
    }        


    
}
