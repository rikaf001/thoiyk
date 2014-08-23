/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.SizeMatrix;

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
import ProblemDomainComponent.SizeMatrixClass;


public class SizeMatrixBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public SizeMatrixBrowserClass(
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
                    SizeMatrixClass.class,
                    SizeMatrixEditDialogClass.class
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
                " sm.id,st.nama sizetype,sm.s1 ,sm.s2 ,sm.s3 ,sm.s4 ,sm.s5 ,sm.s6 ,sm.s7 ,sm.s8 ,sm.s9 ,sm.s10 ,sm.s11 ,sm.s12 ,sm.s13 ,sm.s14 ,sm.s15 ,sm.auditdate,sm.audituser  ",
                
                // 2 tablas and joins                                             
                " SIZEMATRIX sm   " +
                " left join SIZETYPE st on sm.sizetypeid=st.id" ,
                
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
//            setColumnNames( "svc", "ID", "ID" );
//            setColumnNames( "svc", "SERVICETYPE", "SizeMatrixType" );                                           
//            setColumnNames( "svc", "NAME", "Name" );
//            setColumnNames( "svc", "DESCRIPTION", "Description" );

            setDefaultOrder( "  ID " );

            
            // load data
            super.initializeTable();   
            
            // some customization
            adjustColumnWidth( "ID", 50 );
//            adjustColumnWidth( "SizeMatrixType", 100 );  
//            adjustColumnWidth( "Description", 200 );
            
    }        


    
}
