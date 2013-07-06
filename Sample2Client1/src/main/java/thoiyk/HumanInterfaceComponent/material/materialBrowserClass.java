/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.material;

/**
 *
 * @author yoserizy
 */

//rtl
import thoiyk.HumanInterfaceComponent.material.*;
//import thoiyk.HumanInterfaceComponent.samplerecord.*;
import javax.swing.*;
import java.awt.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;
import KFramework30.Communication.persistentObjectManagerClass;

// system
import KFramework30.Widgets.DataBrowser.TableCellRenderers.ImageCellRendererClass;
import Sample1.HumanInterfaceComponent.system_mail.*;
import ProblemDomainComponent.fabricClass;
import java.util.HashMap;
import thoiyk.HumanInterfaceComponent.samplerecord.samplerecordEditDialogClass;


public class materialBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public materialBrowserClass(
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
                    samplerecordEditDialogClass.class
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
                " ID, DESCRIPTION ",
                
                // 2 tablas and joins                                             
                " SAMPLERECORD sr   "  ,
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setColumnNames( "sr", "ID", "id" );
            setColumnNames( "sr", "DESCRIPTION", "Description" );
            
            
            setDefaultOrder( "  ID " );

          //  setRowsHeight( 150 );
            
            // load data
            super.initializeTable();   
            
            // some customization
            adjustColumnWidth( "id", 100 );
            
            adjustColumnType("id",  BROWSER_COLUMN_TYPE_NUMERICNOFORMAT );
            
            
            
    }        


    
}
