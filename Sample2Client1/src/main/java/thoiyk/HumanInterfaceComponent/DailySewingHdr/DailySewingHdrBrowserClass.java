/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.DailySewingHdr;

/**
 *
 * @author yoserizy
 */
//rtl
import javax.swing.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;

// system
import ProblemDomainComponent.pr_newClass;


public class DailySewingHdrBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public DailySewingHdrBrowserClass(
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
                    DailySewingHdrEditDialogClass.class
            );  
            
            // uses                   
	    // has            
    }        


    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                        " dtl.id, to_char(dtl.tanggal,'YYYYMMDD') tanggal, dtl.auditdate, dtl.audituser ",    

                        // 2 tables and joins                                                
                        " dailysewing_hdr dtl " ,
                                                             
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

     
//            setColumnNames( "fk", "ID", "ID" );
//            setColumnNames( "fk", "PRNO", "PRNo" );
//            setColumnNames( "fk", "TANGGAL", "Tanggal" );
//            setColumnNames( "fk", "STYLENAME", "StyleName" );
//            setColumnNames( "fk", "BUYERID", "BuyerID" );
//            setColumnNames( "fk", "BUYERNAME", "BuyerName" );
       

            // load data
            super.initializeTable();   
            
            
    }        


    
}
