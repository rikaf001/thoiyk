/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.BRPHeader;

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
import ProblemDomainComponent.BRPHeaderClass;

// system
//import ProblemDomainComponent.pr_newClass;


public class BRPHeaderBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public BRPHeaderBrowserClass(
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
                    BRPHeaderClass.class,
                    BRPHeaderEditDialogClass.class
            );  
            
            // uses                   
	    // has            
    }        


    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                " pr.ID,pr.tanggal, bkb.nomor no_bkb,pr.nomor ",
                
                // 2 tablas and joins                                             
                "  brp_hdr pr "+
                    "left join v_penerima vp on pr.penerimaid=vp.id "+
                    "left join bkb_hdr bkb on pr.bkbid=bkb.id",
                                                                
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

     
            setColumnNames( "pr", "ID", "ID" );
            setColumnNames( "pr", "TANGGAL", "Tanggal" );
            setColumnNames( "bkb", "NO_BKB", "BKBNo" );
            setColumnNames( "pr", "NOMOR", "Nomor" );

       
            setDefaultOrder( "ID" );
            // load data
            super.initializeTable();   
             adjustColumnWidth( "ID", 40 );
            adjustColumnWidth( "Nomor", 80 );
            adjustColumnWidth( "Tanggal", 80 );


            
            adjustColumnType("ID",  BROWSER_COLUMN_TYPE_NUMERICNOFORMAT );
            
    }        


    
}
