/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.BKSHeader;

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
import ProblemDomainComponent.BKSHeaderClass;

// system


public class BKSHeaderBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public BKSHeaderBrowserClass(
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
                    BKSHeaderClass.class,
                    BKSHeaderEditDialogClass.class
            );  
            
            // uses                   
	    // has            
    }        


    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                "  pr.ID, pr.nomor, ts.name service,pr.tanggal, pr.penerima penerimaname, pr.nobc, pr.tglbc  ",
                
                // 2 tablas and joins                                             
                "  bks_hdr pr    "  +
                "  left join servicetype ts on pr.servicetypeid=ts.id "  +
                "  "  
                 ,
                                                                
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

                setColumnNames( "pr", "ID", "ID" );             
                setColumnNames( "pr", "NOMOR", "Nomor" );          
                setColumnNames( "pr", "SERVICE", "Service" );
                setColumnNames( "pr", "TANGGAL", "Tanggal" );
                setColumnNames( "pr", "PENERIMANAME", "Penerima" );
                setColumnNames( "pr", "NOBC", "NoBC" );
                setColumnNames( "pr", "TGLBC", "TglBC" );
                
                setDefaultOrder( "ID" );

            // load data
            super.initializeTable();   
              // some customization
            adjustColumnWidth( "ID", 40 );
            adjustColumnWidth( "Nomor", 100 );
            adjustColumnWidth( "Service", 90 );
            adjustColumnWidth("Tanggal", 90 );
            adjustColumnWidth( "Penerima", 100 );
            adjustColumnWidth( "NoBC", 90 );
            adjustColumnWidth( "TglBC", 100 );
            
            adjustColumnType("ID",  BROWSER_COLUMN_TYPE_NUMERICNOFORMAT );
            
    }        


    
}
