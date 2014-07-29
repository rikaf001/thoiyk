/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.OBD;

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
import ProblemDomainComponent.OBDClass;


public class OBDBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public OBDBrowserClass(
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
                    OBDClass.class,
                    OBDEditDialogClass.class
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
                " sm.id,st.nama obdtype,sm.kodemesin,sm.mesin,sm.proses,sm.allow,sm.pper45mnt,sm.pper1jam,sm.rms,sm.hperprs,sm.auditdate,sm.audituser  ",
                
                // 2 tablas and joins                                             
                " OBD sm   " +
                " left join OBDTYPE st on sm.obdtypeid=st.id" ,
                
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
//            setColumnNames( "svc", "ID", "ID" );
//            setColumnNames( "svc", "SERVICETYPE", "OBDType" );                                           
//            setColumnNames( "svc", "NAME", "Name" );
//            setColumnNames( "svc", "DESCRIPTION", "Description" );

            setDefaultOrder( "  ID " );

            
            // load data
            super.initializeTable();   
            
            // some customization
            adjustColumnWidth( "ID", 50 );
//            adjustColumnWidth( "OBDType", 100 );  
//            adjustColumnWidth( "Description", 200 );
            
    }        


    
}
