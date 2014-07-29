/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.SizeType;

/**
 *
 * @author yoserizy
 */
//rtl
import thoiyk.HumanInterfaceComponent.SizeType.*;
import javax.swing.*;
import java.awt.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;
import KFramework30.Communication.persistentObjectManagerClass;
import static KFramework30.Widgets.KDataBrowserBaseClass.BROWSER_COLUMN_TYPE_NUMERICNOFORMAT;

// system
import ProblemDomainComponent.SizeTypeClass;
import java.util.HashMap;


public class SizeTypeBrowserClass 
extends KDataBrowserBaseClass {   
    
    // uses                       	
    
    // has

    public SizeTypeBrowserClass(
            KConfigurationClass configurationParam,
            KLogClass logParam,
            JTable tableParam,
            java.awt.Window parentWindow ) throws KExceptionClass
    {
        
            // inherits
            super(
                    configurationParam, logParam,
                    true, tableParam, parentWindow,  
                    SizeTypeClass.class,
                    SizeTypeEditDialogClass.class
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
                " ID , NAMA, AUDITDATE, AUDITUSER ",
                
                // 2 tablas and joins                                             
                " SIZETYPE sz ",  
                
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
//            setColumnNames( "sz", "ID", "id" );
  //          setColumnNames( "sz", "NAMA", "Nama" );
                
                       
            setDefaultOrder( "  ID " );

            
            // load data
            super.initializeTable();   
            
            // some customization
            //adjustColumnWidth( "Nama", 100 );
            
            adjustColumnType("ID",  BROWSER_COLUMN_TYPE_NUMERICNOFORMAT );
    }        

    
}
