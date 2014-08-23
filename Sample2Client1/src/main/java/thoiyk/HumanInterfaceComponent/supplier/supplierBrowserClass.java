/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.supplier;

/**
 *
 * @author yoserizy
 */
//rtl
import thoiyk.HumanInterfaceComponent.supplier.*;
import javax.swing.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;
import static KFramework30.Widgets.KDataBrowserBaseClass.BROWSER_COLUMN_TYPE_NUMERICNOFORMAT;

// system
import ProblemDomainComponent.supplierClass;


public class supplierBrowserClass 
extends KDataBrowserBaseClass {   
    
    // uses                       	
    
    // has

    public supplierBrowserClass(
            KConfigurationClass configurationParam,
            KLogClass logParam,
            JTable tableParam,
            java.awt.Window parentWindow ) throws KExceptionClass
    {
        
            // inherits
            super(
                    configurationParam, logParam,
                    true, tableParam, parentWindow,  
                    supplierClass.class,
                    supplierEditDialogClass.class
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
                " ID , NAMA, ALAMAT, TELP, FAX, NEGARA, NPWP ",
                
                // 2 tablas and joins                                             
                " SUPPLIER sup ",  
                
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setColumnNames( "sup", "ID", "id" );
            setColumnNames( "sup", "NAMA", "Nama" );
            setColumnNames( "sup", "ALAMAT", "Alamat" );
            setColumnNames( "sup", "TELP", "Telp" );
            setColumnNames( "sup", "FAX", "Fax" );
            setColumnNames( "sup", "NEGARA", "Negara" );
            setColumnNames( "sup", "NPWP", "NPWP" );
                
                       
            setDefaultOrder( "  NAMA " );

            
            // load data
            super.initializeTable();   
            
            // some customization
            adjustColumnWidth( "Nama", 100 );
            
            adjustColumnType("id",  BROWSER_COLUMN_TYPE_NUMERICNOFORMAT );
    }        

    
}
