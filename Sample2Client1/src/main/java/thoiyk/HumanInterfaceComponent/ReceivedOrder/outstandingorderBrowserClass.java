/*
 * This source code is part of the Thoyik
 * Copyright (C) 2013  Yoseriza
 * Feedback / Bug Reports yoser174@gmail.com
 * 
 * This project used:
 * KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.ReceivedOrder;

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
import static KFramework30.Widgets.KDataBrowserBaseClass.BROWSER_COLUMN_TYPE_NUMERICNOFORMAT;
import Sample1.HumanInterfaceComponent.system_mail.*;
import ProblemDomainComponent.mesinClass;
import ProblemDomainComponent.ReceivedOrderClass;
import java.util.HashMap;
import thoiyk.HumanInterfaceComponent.mesin.mesinEditDialogClass;


public class outstandingorderBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public outstandingorderBrowserClass(
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
                    ReceivedOrderClass.class,
                    outstandingorderEditDialogClass.class
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
                " os.ID, pr.prno status, byr.nama as buyername, os.STYLE, os.QTY, to_CHAR( os.shipdate, 'yyyy-mm-dd' ) as shipdate, os.productin, os.productout, os.line, os.remark ",
                
                // 2 tablas and joins                                             
                " receivedorder os   " +
                    " left join buyer byr on byr.id=os.buyerid "+
                    " left join productionrecord pr on os.id=pr.selectid ",
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            setColumnNames( "os", "ID", "ID" );             
            setColumnNames( "pr", "STATUS", "No Production Record" );             
            setColumnNames( "byr", "BUYERNAME", "Buyer Name" ); 
            setColumnNames( "os", "STYLE", "Style" ); 
            setColumnNames( "os", "QTY", "Qty" ); 
            setColumnNames( "os", "SHIPDATE", "Ship Date" ); 
            setColumnNames( "os", "PRODUCTIN", "Production In" ); 
            setColumnNames( "os", "PRODUCTOUT", "Production Out" ); 
            setColumnNames( "os", "LINE", "Line" ); 
            setColumnNames( "os", "REMARK", "Remark" ); 

            
            setDefaultOrder( "  ID " );
            
            // load data
            super.initializeTable();   
            
            // some customization
            adjustColumnWidth( "ID", 40 );
            adjustColumnWidth( "No Production Record", 150 );
            adjustColumnWidth( "Buyer Name", 100 );
            adjustColumnWidth( "Style", 120 );
            adjustColumnWidth( "Qty", 40 );
            
            adjustColumnType("ID",  BROWSER_COLUMN_TYPE_NUMERICNOFORMAT );
            adjustColumnType("Ship Date",BROWSER_COLUMN_TYPE_DATE);
    }        


    
}

