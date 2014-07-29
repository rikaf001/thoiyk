/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.BTBHeader;

/**
 *
 * @author yoserizy
 */
//rtl
import javax.swing.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;
import static KFramework30.Widgets.KDataBrowserBaseClass.BROWSER_COLUMN_TYPE_DATE;
import static KFramework30.Widgets.KDataBrowserBaseClass.BROWSER_COLUMN_TYPE_NUMERICNOFORMAT;

// system
import ProblemDomainComponent.BTBHeaderClass;


public class BTBHeaderBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public BTBHeaderBrowserClass(
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
                    BTBHeaderClass.class,
                    BTBHeaderEditDialogClass.class
            );  
            
            // uses                   
	    // has            
    }        


    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                " pr.ID, pr.nomor, pr.tanggal, sup.nama suppliername,pr.nosj,pr.tglsj, pr.nobc, pr.tglbc ",
                
                // 2 tablas and joins                                             
                " btb_hdr pr   "  +
                " left join supplier sup on pr.supplierid=sup.id "  
                 ,
                                                                
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

     
            setColumnNames( "pr", "ID", "ID" );
            setColumnNames( "pr", "NOMOR", "Nomor" );
            setColumnNames( "pr", "TANGGAL", "Tanggal" );
            setColumnNames( "sup", "SUPPLIERNAME", "Supplier Name" );
            setColumnNames( "pr", "NOSJ", "No SJ" );
            setColumnNames( "pr", "TGLSJ", "Tgl SJ" );
            setColumnNames( "pr", "NOBC", "No BC" );
            setColumnNames( "pr", "TGLBC", "Tgl BC" );
       
            setDefaultOrder( "ID" );
            // load data
            super.initializeTable();   
            
                        adjustColumnWidth( "ID", 60 );
            adjustColumnWidth( "Nomor", 100 );
            adjustColumnWidth( "Tanggal", 100 );
            adjustColumnWidth( "Supplier Name", 200 );
            adjustColumnWidth( "No SJ", 100 );
            adjustColumnWidth( "Tgl SJ" , 100 );
            adjustColumnWidth( "No BC",100 );
            adjustColumnWidth( "Tgl BC", 100 );
            
            adjustColumnType("ID",  BROWSER_COLUMN_TYPE_NUMERICNOFORMAT );
            adjustColumnType("Tanggal",BROWSER_COLUMN_TYPE_DATE);
            adjustColumnType("Tgl SJ",BROWSER_COLUMN_TYPE_DATE);
            adjustColumnType("Tgl BC",BROWSER_COLUMN_TYPE_DATE);
    }        


    
}
