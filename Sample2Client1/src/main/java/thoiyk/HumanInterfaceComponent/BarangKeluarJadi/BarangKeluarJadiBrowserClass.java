/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.BarangKeluarJadi;

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


public class BarangKeluarJadiBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public BarangKeluarJadiBrowserClass(
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
                    BarangKeluarJadiEditDialogClass.class
            );  
            
            // uses                   
	    // has            
    }        


    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                " bkb.id,bkb.buyernama,neg.currency,jd.kode as dokpabean,bkb.createdby,bkb.datecreated ",
                
                // 2 tablas and joins                                             
                " barangkeluarjadi bkb   "+
                    " left join negara neg on bkb.matauangid=neg.id "+
                    " left join jenisdokpabean jd on bkb.jenisdokpabeanid = jd.id"
                 ,
                                                                
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

       
            setDefaultOrder( "ID" );
            // load data
            super.initializeTable();   
            
            
    }        


    
}
