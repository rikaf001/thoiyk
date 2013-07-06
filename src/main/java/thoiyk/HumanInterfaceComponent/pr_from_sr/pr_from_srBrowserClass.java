/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.pr_from_sr;

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
import ProblemDomainComponent.pr_from_srClass;
import java.util.HashMap;
import thoiyk.HumanInterfaceComponent.mesin.mesinEditDialogClass;


public class pr_from_srBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public pr_from_srBrowserClass(
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
                    pr_from_srClass.class,
                    pr_from_srEditDialogClass.class
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
                " pr.ID, pr.STYLE, pr.BUYERID,byr.NAMA BUYERNAME,pr.DESCRIPTION, pr.QTY ",
                
                // 2 tablas and joins                                             
                " productionrecord pr   "  +
                " left join BUYER byr on pr.BUYERID=byr.id where pr.selectid>0 "    ,
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            setColumnNames( "pr", "ID", "ID" );
            setColumnNames( "pr", "STYLE", "Style" );
            setColumnNames( "pr", "BUYERID", "BuyerID" );
            setColumnNames( "byr", "BUYERNAME", "BuyerName" );
            setColumnNames( "pr", "DESCRIPTION", "Description" );
            setColumnNames( "pr", "QTY", "Qty" );
       
            
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

