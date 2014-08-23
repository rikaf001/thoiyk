/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.KodeKawasan;

/**
 *
 * @author yoserizy
 */

//rtl
import javax.swing.*;
import java.awt.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;
import KFramework30.Communication.persistentObjectManagerClass;

// system
import KFramework30.Widgets.DataBrowser.TableCellRenderers.ImageCellRendererClass;
import static KFramework30.Widgets.KDataBrowserBaseClass.BROWSER_COLUMN_TYPE_CURRENCY;
import Sample1.HumanInterfaceComponent.system_mail.*;
import ProblemDomainComponent.sample_productClass;
import ProblemDomainComponent.KodeKawasanClass;
import Sample1.HumanInterfaceComponent.sample_product.productEditDialogClass;
import java.util.HashMap;


public class KodeKawasanBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public KodeKawasanBrowserClass(
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
                    KodeKawasanClass.class,
                    KodeKawasanEditDialogClass.class
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
                " kw.id,kw.kode,kw.nama,kw.periodedari, kw.periodesampai, kw.createdby, kw.datecreated ",
                
                // 2 tablas and joins                                             
                " KODEKAWASAN kw   ",
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setColumnNames( "kw", "ID", "ID" );
            setColumnNames( "kw", "KODE", "Kode" );
            setColumnNames( "kw", "NAMA", "Nama" );
            setColumnNames( "kw", "PERIODEDARI", "PeriodeDari" );
            setColumnNames( "kw", "PERIODESAMPAI", "PeriodeSampai" );
            setColumnNames( "kw", "CREATEDBY", "CreatedBy" );
            setColumnNames( "kw", "DATECREATED", "DateCreated" );
            setDefaultOrder( "  ID " );
            
            // load data
            super.initializeTable();   
                        
    }        


    
}
