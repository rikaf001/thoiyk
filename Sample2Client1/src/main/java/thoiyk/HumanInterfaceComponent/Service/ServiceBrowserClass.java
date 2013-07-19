/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.Service;

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
import ProblemDomainComponent.ServiceClass;


public class ServiceBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public ServiceBrowserClass(
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
                    ServiceClass.class,
                    ServiceEditDialogClass.class
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
                " svc.id, svt.NAME servicetype, svc.name Name, svc.DESCRIPTION ",
                
                // 2 tablas and joins                                             
                " SERVICE svc   " +
                " left join SERVICETYPE svt on svc.servicetypeid=svt.id" ,
                
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setColumnNames( "svc", "ID", "ID" );
            setColumnNames( "svc", "SERVICETYPE", "ServiceType" );                                           
            setColumnNames( "svc", "NAME", "Name" );
            setColumnNames( "svc", "DESCRIPTION", "Description" );

            setDefaultOrder( "  ID " );

            
            // load data
            super.initializeTable();   
            
            // some customization
            adjustColumnWidth( "ID", 50 );
            adjustColumnWidth( "ServiceType", 100 );  
            adjustColumnWidth( "Description", 200 );
            
    }        


    
}
