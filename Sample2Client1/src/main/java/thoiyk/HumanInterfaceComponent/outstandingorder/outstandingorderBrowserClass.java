/*
 * This source code is part of the Thoyik
 * Copyright (C) 2013  Yoseriza
 * Feedback / Bug Reports yoser174@gmail.com
 * 
 * This project used:
 * KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.outstandingorder;

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
import ProblemDomainComponent.mesinClass;
import ProblemDomainComponent.outstandingorderClass;
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
                    outstandingorderClass.class,
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
                " os.ID, pr.prno status, byr.nama as buyername, os.STYLE, os.QTY, to_CHAR( os.shipdate, 'yyyy-mm-dd HH24:MI:SS' ) as shipdate, os.productin, os.productout, os.line, os.remark ",
                
                // 2 tablas and joins                                             
                " outstandingorder os   " +
                    " left join buyer byr on byr.id=os.buyerid "+
                    " left join productionrecord pr on os.id=pr.selectid ",
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            setColumnNames( "os", "ID", "ID" );             
            setColumnNames( "pr", "STATUS", "Status" );             
            setColumnNames( "byr", "BUYERNAME", "BuyerName" ); 
            setColumnNames( "os", "STYLE", "Style" ); 
            setColumnNames( "os", "QTY", "Qty" ); 
            setColumnNames( "os", "SHIPDATE", "ShipDate" ); 
            setColumnNames( "os", "PRODUCTIN", "ProductIn" ); 
            setColumnNames( "os", "PRODUCTOUT", "ProductOut" ); 
            setColumnNames( "os", "LINE", "Line" ); 
            setColumnNames( "os", "REMARK", "Remark" ); 

            
            // load data
            super.initializeTable();   
            
            
    }        


    
}

