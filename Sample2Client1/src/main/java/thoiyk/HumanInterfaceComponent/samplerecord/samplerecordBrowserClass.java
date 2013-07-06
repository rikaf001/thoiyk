/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.samplerecord;

/**
 *
 * @author yoserizy
 */

//rtl
import thoiyk.HumanInterfaceComponent.samplerecord.*;
import javax.swing.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;

// system
import ProblemDomainComponent.samplerecordClass;


public class samplerecordBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public samplerecordBrowserClass(
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
                    samplerecordClass.class,
                    samplerecordEditDialogClass.class
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
                "sr.ID, 'SR'||sr.ID as nomor, srt.nama as type, srs.nama as status,sr.style, byr.nama buyer, description, issuedby ",
                
                // 2 tablas and joins                                             
                " SAMPLERECORD sr   " +
                " left join STOCKTYPE srt on srt.id=sr.samplerecordtypeid "+
                " left join buyer byr on byr.id=sr.buyerid " +
                " left join SAMPLERECORDSTATUS srs on srs.id=sr.samplerecordstatusid "    ,
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setColumnNames( "sr", "ID", "ID" );
            setColumnNames( "sr", "NOMOR", "SRid" );
            setColumnNames( "srt", "TYPE", "Type" );
            setColumnNames( "sr", "STATUS", "Status" );
            setColumnNames( "sr", "STYLE", "Style" );
            setColumnNames( "byr", "BUYER", "Buyer" );
            setColumnNames( "sr", "DESCRIPTION", "Description" );
            //setColumnNames( "sr", "SAMPLERECORDSTATUSID", "SampleRecordStatusID" );
            setColumnNames( "sr", "ISSUEDBY", "IssuedBy" );
            
            
            
            setDefaultOrder( "  ID " );

          //  setRowsHeight( 150 );
            
            // load data
            super.initializeTable();   
            
            // some customization
            //adjustColumnWidth( "ID", 70 );
            //adjustColumnWidth( "BUYER", 150 );
            //adjustColumnWidth( "DESCRIPTION", 200 );
            
            adjustColumnType("ID",  BROWSER_COLUMN_TYPE_NUMERICNOFORMAT );
            
            
            
    }        


    
}
