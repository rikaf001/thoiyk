/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.buyer;

/**
 *
 * @author yoserizy
 */
//rtl
import javax.swing.*;
import java.awt.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;
import KFramework30.Communication.persistentObjectManagerClass;

// system
import ProblemDomainComponent.buyerClass;
import java.util.HashMap;


public class buyerBrowserClass 
extends KDataBrowserBaseClass {   
    
    // uses                       	
    
    // has

    public buyerBrowserClass(
            KConfigurationClass configurationParam,
            KLogClass logParam,
            JTable tableParam,
            java.awt.Window parentWindow ) throws KExceptionClass
    {
        
            // inherits
            super(
                    configurationParam, logParam,
                    true, tableParam, parentWindow,  
                    buyerClass.class,
                    buyerEditDialogClass.class
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
                " ID , NAMA, ALAMAT, TELP, FAX, NPWP, NOIZINTPB, CONTACTPERSON ",
                
                // 2 tablas and joins                                             
                " BUYER byr ",  
                
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setColumnNames( "byr", "ID", "ID" );
            setColumnNames( "byr", "NAMA", "Name" );
            setColumnNames( "byr", "ALAMAT", "Address" );                                      
            setColumnNames( "byr", "TELP", "Phone" );
            setColumnNames( "byr", "FAX", "FAX" );                                      
            setColumnNames( "byr", "NPWP", "NPWP" );
            setColumnNames( "byr", "NOIZINTPB", "NOIZINTPB" );
            setColumnNames( "byr", "CONTACTPERSON", "CONTACTPERSON" );
            
            setDefaultOrder( "  NAMA " );

            
            // load data
            super.initializeTable();   
            
            // some customization
            adjustColumnWidth( "Name", 100 );
            adjustColumnWidth( "Address", 200 );                        
 
            adjustColumnType("ID",  BROWSER_COLUMN_TYPE_NUMERICNOFORMAT );
    }        

    
}
