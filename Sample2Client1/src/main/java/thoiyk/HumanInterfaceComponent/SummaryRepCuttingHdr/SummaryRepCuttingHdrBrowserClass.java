/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.SummaryRepCuttingHdr;

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
import ProblemDomainComponent.SummaryRepCuttingHdrClass;


public class SummaryRepCuttingHdrBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public SummaryRepCuttingHdrBrowserClass(
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
                    SummaryRepCuttingHdrClass.class,
                    SummaryRepCuttingHdrEditDialogClass.class
            );  
            
            // uses                   
	    // has            
    }        


    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                " src.ID, src.prdate, src.prno, src.buyername, src.material, src.stylename,src.suppliername ",
                
                // 2 tablas and joins                                             
                " V_SUMMARYREPCUTTING src   "   
                 ,
                                                                  
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

     
            setColumnNames( "src", "ID", "ID" );
            setColumnNames( "src", "PRDATE", "PR Date" );
            setColumnNames( "src", "PRNO", "PR No" );
            setColumnNames( "src", "BUYERNAME", "Buyer Name" );
            setColumnNames( "src", "MATERIAL", "Material" );
            setColumnNames( "src", "STYLENAME", "Style Name" );
            setColumnNames( "src", "SUPPLIERNAME", "Supplier Name" );
            
            setDefaultOrder( "ID" );

            // load data
            super.initializeTable();   
                        
            adjustColumnWidth( "ID", 40 );
            adjustColumnWidth( "PR Date", 100 );
            adjustColumnWidth( "PR No", 120 );
            adjustColumnWidth( "Style Name", 100 );
            adjustColumnWidth( "Material", 100 );
            adjustColumnWidth( "Buyer Name", 200 );
            adjustColumnWidth( "Supplier Name", 200 );
     
            adjustColumnType("ID",  BROWSER_COLUMN_TYPE_NUMERICNOFORMAT );     
            
    }        


    
}
