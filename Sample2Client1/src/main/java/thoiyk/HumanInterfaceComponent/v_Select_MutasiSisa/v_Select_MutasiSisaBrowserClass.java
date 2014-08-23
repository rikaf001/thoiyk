/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.v_Select_MutasiSisa;

/**
 *
 * @author yoserizy
 */
//rtl
import javax.swing.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;
import ProblemDomainComponent.v_Select_MutasiSisaClass;

// system


public class v_Select_MutasiSisaBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    public v_Select_MutasiSisaBrowserClass (KConfigurationClass configurationParam,
            KLogClass logParam,
            JTable tableParam,
            java.awt.Window parentWindow           
            ) throws KExceptionClass
    {
    super(
                    configurationParam, logParam,
                    true, tableParam, parentWindow,  
                    v_Select_MutasiSisaClass.class,
                    null//v_sr_iteEditDialogClass.class
            );
    };
    

    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                // 1 campos                    
                " ID, DESCRIPTION, MSK, KEL ",
                
                // 2 tablas and joins                                             
                " v_select_mutasisisa vb",
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
//            setColumnNames( "vb", "ID", "ID" );
//            setColumnNames( "vb", "TIPE", "Tipe" );
//            setColumnNames( "vb", "NAMA", "Nama" );
//            setColumnNames( "vb", "UNIT", "Unit" );
            
            // load data
            super.initializeTable();   
            
            //adjustColumnWidth( "Nama", 500 );  
            
    }        


    
}
