/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.JenisDokPabean;

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
import ProblemDomainComponent.JenisDokPabeanClass;


public class JenisDokPabeanBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public JenisDokPabeanBrowserClass(
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
                    JenisDokPabeanClass.class,
                    JenisDokPabeanEditDialogClass.class
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
                " kw.id,kw.grup,kw.kode,kw.nama, kw.createdby, kw.datecreated ",
                
                // 2 tablas and joins                                             
                " JENISDOKPABEAN kw   ",
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setColumnNames( "kw", "ID", "ID" );
            setColumnNames( "kw", "GRUP", "Grup" );
            setColumnNames( "kw", "KODE", "Kode" );
            setColumnNames( "kw", "NAMA", "Nama" );
            setColumnNames( "kw", "CREATEDBY", "CreatedBy" );
            setColumnNames( "kw", "DATECREATED", "DateCreated" );
            setDefaultOrder( "  ID " );
            
            // load data
            super.initializeTable();   
                        
    }        


    
}
