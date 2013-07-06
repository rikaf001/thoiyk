/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.samplerecordstatus;

/**
 *
 * @author yoserizy
 */
//rtl
import thoiyk.HumanInterfaceComponent.samplerecordstatus.*;
import javax.swing.*;
import java.awt.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;
import KFramework30.Communication.persistentObjectManagerClass;
import static KFramework30.Widgets.KDataBrowserBaseClass.BROWSER_COLUMN_TYPE_NUMERICNOFORMAT;

// system
import ProblemDomainComponent.spareparttypeClass;
import java.util.HashMap;


public class samplerecordstatusBrowserClass 
extends KDataBrowserBaseClass {   
    
    // uses                       	
    
    // has

    public samplerecordstatusBrowserClass(
            KConfigurationClass configurationParam,
            KLogClass logParam,
            JTable tableParam,
            java.awt.Window parentWindow ) throws KExceptionClass
    {
        
            // inherits
            super(
                    configurationParam, logParam,
                    true, tableParam, parentWindow,  
                    spareparttypeClass.class,
                    samplerecordstatusEditDialogClass.class
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
                " ID , NAMA ",
                
                // 2 tablas and joins                                             
                " SAMPLERECORDSTATUS srs ",  
                
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setColumnNames( "srs", "ID", "id" );
            setColumnNames( "srs", "NAMA", "Nama" );
                
                       
            setDefaultOrder( "  NAMA " );

            
            // load data
            super.initializeTable();   
            
            // some customization
            adjustColumnWidth( "Nama", 100 );
            
            adjustColumnType("id",  BROWSER_COLUMN_TYPE_NUMERICNOFORMAT );
    }        

    
}
