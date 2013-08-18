/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.BTSHeader;

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


public class BTSHeaderBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public BTSHeaderBrowserClass(
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
                    BTSHeaderEditDialogClass.class
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
                " bts_hdr pr   "  +
                " left join supplier sup on pr.supplierid=sup.id "  
                 ,
                                                                
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

     
            setColumnNames( "pr", "ID", "ID" );
            setColumnNames( "pr", "NOMOR", "Nomor" );
            setColumnNames( "pr", "TANGGAL", "Tanggal" );
            setColumnNames( "sup", "SUPPLIERNAME", "SupplierName" );
            setColumnNames( "pr", "NOSJ", "NoSJ" );
            setColumnNames( "pr", "TGLSJ", "TglSJ" );
            setColumnNames( "pr", "NOBC", "NoBC" );
            setColumnNames( "pr", "TGLBC", "TglBC" );
       

            // load data
            super.initializeTable();   
            
            
    }        


    
}
