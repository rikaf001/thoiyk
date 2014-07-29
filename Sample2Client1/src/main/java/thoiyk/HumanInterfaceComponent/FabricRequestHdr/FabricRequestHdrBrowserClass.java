/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.FabricRequestHdr;

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

// system
import ProblemDomainComponent.pr_newClass;


public class FabricRequestHdrBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public FabricRequestHdrBrowserClass(
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
                    pr_newClass.class,
                    FabricRequestHdrEditDialogClass.class
            );  
            
            // uses                   
	    // has            
    }        


    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                " fk.ID, fk.prno, fk.tanggal, fk.stylename, fk.buyername ",
                
                // 2 tablas and joins                                             
                " fabricrequest_hdr fk   " ,
                                                                  
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            setDefaultOrder( "ID" );
            
            setColumnNames( "fk", "ID", "ID" );
            setColumnNames( "fk", "PRNO", "PR No" );
            setColumnNames( "fk", "TANGGAL", "Tanggal" );
            setColumnNames( "fk", "STYLENAME", "Style Name" );
            setColumnNames( "fk", "BUYERNAME", "Buyer Name" );
       

            // load data
            super.initializeTable();   
            
            adjustColumnWidth( "ID", 40 );
            adjustColumnWidth( "PR No", 120 );
            adjustColumnWidth( "Tanggal", 100 );
            adjustColumnWidth( "Style Name", 200 );
            adjustColumnWidth( "Buyer Name", 200 );


            
            adjustColumnType("ID",  BROWSER_COLUMN_TYPE_NUMERICNOFORMAT );    
    }        


    
}
