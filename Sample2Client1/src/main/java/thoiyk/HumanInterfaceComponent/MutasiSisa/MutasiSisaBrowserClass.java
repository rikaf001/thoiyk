/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.MutasiSisa;

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
import ProblemDomainComponent.MutasiSisaClass;


public class MutasiSisaBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public MutasiSisaBrowserClass(
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
                    MutasiSisaClass.class,
                    MutasiSisaEditDialogClass.class
            );  
            
            // uses                   
	    // has            
    }        


    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                // 1 campos                    
                " mb.id,mb.kodekawasanid,mb.barangid,mb.barangnama, mb.unittypeid,mb.stockopname,mb.selisih,mb.saldoawal,mb.pemasukan,mb.pengeluaran,mb.penyesuaian,mb.saldoakhir, mb.createdby, mb.datecreated ",
                
                // 2 tablas and joins                                             
                " MUTASISISA mb  ",
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setDefaultOrder( "  ID " );
            
            // load data
            super.initializeTable();   
                        
    }        


    
}
