/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.BKBHeader;

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
import ProblemDomainComponent.BKBHeaderClass;


public class BKBHeaderBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public BKBHeaderBrowserClass(
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
                    BKBHeaderClass.class,
                    BKBHeaderEditDialogClass.class
            );  
            
            // uses                   
	    // has            
    }        


    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                "  pr.ID, pr.nomor, pr.tanggal, tr.nama penerimaname, pr.nobc, pr.tglbc  ",
                
                // 2 tablas and joins                                             
                "  bkb_hdr pr    "  +
                "  left join line tr on pr.penerimaid=tr.id "  
                 ,
                                                                
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

     
            setColumnNames( "pr", "ID", "ID" );
            setColumnNames( "pr", "NOMOR", "Nomor" );
            setColumnNames( "pr", "TANGGAL", "Tanggal" );
            setColumnNames( "sup", "PENERIMANAME", "PenerimaName" );
            setColumnNames( "pr", "NOBC", "NoBC" );
            setColumnNames( "pr", "TGLBC", "TglBC" );
       
            setDefaultOrder( "ID" );
            // load data
            super.initializeTable();   
            
            adjustColumnWidth( "ID", 40 );
            adjustColumnWidth( "Nomor", 80 );
            adjustColumnWidth( "Tanggal", 80 );
            adjustColumnWidth( "PenerimaName",100 );
            adjustColumnWidth( "NoBC",80 );
            adjustColumnWidth( "TglBC",80 );
            
            adjustColumnType("ID",  BROWSER_COLUMN_TYPE_NUMERICNOFORMAT );
            
            
    }        


    
}
