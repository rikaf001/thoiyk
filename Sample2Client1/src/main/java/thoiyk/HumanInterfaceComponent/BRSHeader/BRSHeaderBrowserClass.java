/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.BRSHeader;

/**
 *
 * @author yoserizy
 */
//rtl
import javax.swing.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;
import static KFramework30.Widgets.KDataBrowserBaseClass.BROWSER_COLUMN_TYPE_NUMERICNOFORMAT;
import ProblemDomainComponent.BRSHeaderClass;
import ProblemDomainComponent.ProductOutHeaderClass;

// system
//import ProblemDomainComponent.pr_newClass;


public class BRSHeaderBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public BRSHeaderBrowserClass(
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
                    BRSHeaderClass.class,
                    BRSHeaderEditDialogClass.class
            );  
            
            // uses                   
	    // has            
    }        


    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                " pr.ID, pr.nomor, pr.tanggal, pr.suppliername, pr.nobc, pr.tglbc ",
                
                // 2 tablas and joins                                             
                " brs_hdr pr   " 
                 ,
                                                                
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            setColumnNames( "pr", "ID", "ID" );
            setColumnNames( "pr", "TANGGAL", "Tanggal" );
            setColumnNames( "pr", "SUPPLIERNAME", "SupplierName" );
            setColumnNames( "pr", "NOBC", "NOBC" );
            setColumnNames( "pr", "TGLBC", "TglBC" );

       
            setDefaultOrder( "ID" );

            

            // load data
            super.initializeTable();   
            
            adjustColumnWidth( "ID", 40 );
            adjustColumnWidth( "Tanggal", 80 );
            adjustColumnWidth( "SupplierName", 200 );
            adjustColumnWidth( "NOBC", 80 );
            adjustColumnWidth( "TglBC", 80 );


            
            adjustColumnType("ID",  BROWSER_COLUMN_TYPE_NUMERICNOFORMAT );    
    }        


    
}
