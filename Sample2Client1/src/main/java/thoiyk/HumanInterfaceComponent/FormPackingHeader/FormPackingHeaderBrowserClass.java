/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.FormPackingHeader;

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


public class FormPackingHeaderBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public FormPackingHeaderBrowserClass(
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
                    FormPackingHeaderEditDialogClass.class
            );  
            
            // uses                   
	    // has            
    }        


    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                " fk.ID, fk.prno,fk.stylename, fk.tanggal, fk.stylename, fk.buyerid, fk.buyername ",
                
                // 2 tablas and joins                                             
                " FORMPACKING_HDR fk   " ,
                                                                  
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   
/*
     
            setColumnNames( "fk", "ID", "ID" );
            setColumnNames( "fk", "PRNO", "PRNo" );
            setColumnNames( "fk", "TANGGAL", "Tanggal" );
            setColumnNames( "fk", "STYLENAME", "StyleName" );
            setColumnNames( "fk", "BUYERID", "BuyerID" );
            setColumnNames( "fk", "BUYERNAME", "BuyerName" );
            setColumnNames( "fk", "OK", "OK" );
            setColumnNames( "fk", "REJECT", "Reject" );
            setColumnNames( "fk", "TOTAL", "Total" );
       
*/
            // load data
            super.initializeTable();   
            
            
    }        


    
}
