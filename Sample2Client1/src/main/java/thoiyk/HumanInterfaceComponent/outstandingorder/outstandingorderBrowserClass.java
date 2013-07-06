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
                " ID, BUYERID, STYLE, QTY, to_CHAR( shipdate, 'yyyy-mm-dd HH24:MI:SS' ) as shipdate, productin, productout, line, remark ",
                
                // 2 tablas and joins                                             
                " outstandingorder os   "  ,
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
           // setColumnNames( "stk", "ID", "id" );
       /*     setColumnNames( "stk", "STOCKTYPEID", "StockTypeID" );
            setColumnNames( "stk", "BUYERID", "BuyerID" );                                      
            //setColumnNames( "stk", "PRODUCT", "Product" );                                      
            setColumnNames( "stk", "COLOUR", "Colour" );                                      
            setColumnNames( "stk", "IMAGE", "Image" );                                      
            setDefaultOrder( "  ID " );
*/
            //setRowsHeight( 150 );
            
            // load data
            super.initializeTable();   
            
            // some customization
            //adjustColumnWidth( "id", 100 );
            //adjustColumnWidth( "Name", 200 );  
            //adjustColumnWidth( "Cost", 100 );  
            
            //adjustColumnType( "Cost", BROWSER_COLUMN_TYPE_CURRENCY );            
            //adjustColumnFont(  "Cost",  new Font( "arial", Font.BOLD, 10  ) );             
            //adjustColumnForegroundColor( "Cost", Color.BLUE  );
            
            //adjustColumnWidth( "IMAGE", 210 );  
            //setColumnRenderer( "IMAGE", new ImageCellRendererClass( tableModel, log, 120, 150 ) );
            
    }        


    
}

