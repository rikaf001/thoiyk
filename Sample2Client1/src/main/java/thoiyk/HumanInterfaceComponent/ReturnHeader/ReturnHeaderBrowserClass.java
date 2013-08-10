/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.ReturnHeader;

/**
 *
 * @author yoserizy
 */
//rtl
import javax.swing.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;
import ProblemDomainComponent.ProductOutHeaderClass;

// system
//import ProblemDomainComponent.pr_newClass;


public class ReturnHeaderBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public ReturnHeaderBrowserClass(
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
                    ProductOutHeaderClass.class,
                    ReturnHeaderEditDialogClass.class
            );  
            
            // uses                   
	    // has            
    }        


    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                " pr.ID, pr.nomor, pr.tanggal, pemberiname,pr.nosj,pr.tglsj, pr.nobc, pr.tglbc ",
                
                // 2 tablas and joins                                             
                " return_hdr pr   " 
                 ,
                                                                
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

     
            setColumnNames( "pr", "ID", "ID" );
            //setColumnNames( "pt", "TYPE", "Type" );
            setColumnNames( "pr", "NOMOR", "Nomor" );
            setColumnNames( "pr", "TANGGAL", "Tanggal" );
            setColumnNames( "sup", "PEMBERINAME", "PemberiName" );
            setColumnNames( "pr", "NOSJ", "NoSJ" );
            setColumnNames( "pr", "TGLSJ", "TglSJ" );
            setColumnNames( "pr", "NOBC", "NoBC" );
            setColumnNames( "pr", "TGLBC", "TglBC" );
       

            // load data
            super.initializeTable();   
            
            
    }        


    
}
