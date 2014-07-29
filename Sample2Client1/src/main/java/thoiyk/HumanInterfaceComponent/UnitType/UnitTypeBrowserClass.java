/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.UnitType;

/**
 *
 * @author yoserizy
 */
//rtl
import thoiyk.HumanInterfaceComponent.UnitType.*;
import javax.swing.*;
import java.awt.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;
import KFramework30.Communication.persistentObjectManagerClass;
import static KFramework30.Widgets.KDataBrowserBaseClass.BROWSER_COLUMN_TYPE_NUMERICNOFORMAT;

// system
import ProblemDomainComponent.kontakClass;
import java.util.HashMap;


public class UnitTypeBrowserClass 
extends KDataBrowserBaseClass {   
    
    // uses                       	
    
    // has

    public UnitTypeBrowserClass(
            KConfigurationClass configurationParam,
            KLogClass logParam,
            JTable tableParam,
            java.awt.Window parentWindow ) throws KExceptionClass
    {
        
            // inherits
            super(
                    configurationParam, logParam,
                    true, tableParam, parentWindow,  
                    kontakClass.class,
                    UnitTypeEditDialogClass.class
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
                " ID , NAMA",
                
                // 2 tablas and joins                                             
                " unittype neg ",  
                
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setColumnNames( "neg", "ID", "ID" );
            setColumnNames( "neg", "NAMA", "Nama" );
                
                       
            setDefaultOrder( "  ID " );

            
            // load data
            super.initializeTable();   
            
            // some customization
            adjustColumnWidth( "Nama", 100 );
            
            adjustColumnType("ID",  BROWSER_COLUMN_TYPE_NUMERICNOFORMAT );
    }        

    
}
