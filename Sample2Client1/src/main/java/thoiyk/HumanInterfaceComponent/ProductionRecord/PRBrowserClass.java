/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.ProductionRecord;

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
import ProblemDomainComponent.pr_newClass;
import java.util.HashMap;
import thoiyk.HumanInterfaceComponent.mesin.mesinEditDialogClass;
import thoiyk.HumanInterfaceComponent.pr_from_sr.pr_from_srEditDialogClass;


public class PRBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public PRBrowserClass(
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
                    pr_newClass.class,
                    PREditDialogClass.class
            );  
            
            // uses                   
	    // has            
    }        


    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                " pr.ID,st.nama type, pr.STYLE, pr.BUYERID,byr.NAMA BUYERNAME,pr.DESCRIPTION, pr.QTY ",
                
                // 2 tablas and joins                                             
                " productionrecord pr   "  +
                " left join stocktype st on pr.samplerecordtypeid = st.id "   +
                " left join BUYER byr on pr.BUYERID=byr.id where pr.selectid<=0 "  
                 ,
                                                                
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

     
            setColumnNames( "pr", "ID", "ID" );
            setColumnNames( "st", "TYPE", "TypeName" );
            setColumnNames( "pr", "STYLE", "Style" );
            setColumnNames( "pr", "BUYERID", "BuyerID" );
            setColumnNames( "byr", "BUYERNAME", "BuyerName" );
            setColumnNames( "pr", "DESCRIPTION", "Description" );
            setColumnNames( "pr", "QTY", "Qty" );
       

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
