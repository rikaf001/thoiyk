/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.v_MachineAndSparepart;

/**
 *
 * @author yoserizy
 */
//rtl
import KFramework30.Base.KConfigurationClass;
import KFramework30.Base.KExceptionClass;
import KFramework30.Base.KLogClass;
import javax.swing.*;

// utilities
import KFramework30.Widgets.*;

// system

public class v_MachineAndSparePartBrowserClass
extends KDataBrowserBaseClass{
            
    // uses                       	
    
    // has

    public v_MachineAndSparePartBrowserClass (KConfigurationClass configurationParam,
            KLogClass logParam,
            JTable tableParam,
            java.awt.Window parentWindow           
            ) throws KExceptionClass
    {
    super(
                    configurationParam, logParam,
                    true, tableParam, parentWindow,  
                    null,
                    null
            );
    };

    
    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                // 1 campos                    
                " ID, CATEGORY, CODE,DESCRIPTION, UNIT",
                
                // 2 tablas and joins                                             
                " V_MACHINEANDSPAREPART vms"    ,
                
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setColumnNames( "vms", "ID", "ID" );
            setColumnNames( "vms", "CATEGORY", "Category" );
            setColumnNames( "vms", "CODE", "Code" );
            setColumnNames( "vms", "DESCRIPTION", "Description" );
            setColumnNames( "vms", "UNIT", "Unit" );

            
            // load data
            super.initializeTable();   
            
            // some customization
            
            
    }        

}
