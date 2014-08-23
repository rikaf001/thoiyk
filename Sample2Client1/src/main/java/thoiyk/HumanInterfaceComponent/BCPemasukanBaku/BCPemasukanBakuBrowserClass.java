/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.BCPemasukanBaku;

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


public class BCPemasukanBakuBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public BCPemasukanBakuBrowserClass(
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
                    BCPemasukanBakuEditDialogClass.class
            );  
            
            // uses                   
	    // has            
    }        


    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                " pr.ID,pr.kawasanid,pr.kawasan, pr.dokbc,pr.nobc,pr.tglbc,pr.notrima,pr.tgltrima,pr.pengirim,pr.kodebrng,pr.nama,pr.unit,pr.jumlah,pr.currency,pr.nilai,pr.auditdate,pr.audituser ",
                
                // 2 tablas and joins                                             
                " v_bc_pemasukan_baku pr "  
                 ,
                                                                
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

     
/*            setColumnNames( "pr", "ID", "ID" );
            setColumnNames( "pr", "NOMOR", "Nomor" );
            setColumnNames( "pr", "TANGGAL", "Tanggal" );
            setColumnNames( "sup", "SUPPLIERNAME", "SupplierName" );
            setColumnNames( "pr", "NOSJ", "NoSJ" );
            setColumnNames( "pr", "TGLSJ", "TglSJ" );
            setColumnNames( "pr", "NOBC", "NoBC" );
            setColumnNames( "pr", "TGLBC", "TglBC" );
  */     
            setDefaultOrder( "ID" );
            // load data
            super.initializeTable();   
            
            
    }        


    
}
