/*
 * This source code is part of the Thoyik
 * Copyright (C) 2013  Yoserizal
 * Feedback / Bug Reports yoser174@gmail.com
 * 
 * 
 * This project used:
 * KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.PurchaseOrder;

/**
 *
 * @author yoserizy
 */

//rtl
import javax.swing.*;

// utilities
import KFramework30.Widgets.*;
import KFramework30.Base.*;
import static KFramework30.Widgets.KDataBrowserBaseClass.BROWSER_COLUMN_TYPE_NUMERICNOFORMAT;

// system
import ProblemDomainComponent.PurchaseOrderClass;




public class PurchaseOrderBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public PurchaseOrderBrowserClass(
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
                    PurchaseOrderClass.class,
                    PurchaseOrderEditDialogClass.class
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
                " po.ID ID,case when po.checkedby is not null then 'aproved'  else '' end  as status,po.NOMOR,po.PODATE,sup.NAMA SUPPLIERNAME, po.ISSUEDBY ",
                
                // 2 tablas and joins                                             
                " PURCHASEORDER po   "+
                " left join SUPPLIER sup on po.SUPPLIERID=sup.ID"   ,
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            
            setColumnNames( "po", "ID", "ID" );
            setColumnNames( "po", "STATUS", "Status" );
            setColumnNames( "po", "NOMOR", "NO PO" );
            setColumnNames( "po", "PODATE", "PO Date" );
            //setColumnNames( "po", "SUPPLIERID", "SupplierID" );
            setColumnNames( "sup", "SUPPLIERNAME", "Supplier Name" );
            setColumnNames( "po", "ISSUEDBY", "Issued By" );
            
            setDefaultOrder( "ID" );


            

            
            // load data
            super.initializeTable();   
                        // some customization
            adjustColumnWidth( "ID", 40 );
            adjustColumnWidth( "Status", 80 );
            adjustColumnWidth( "NO PO", 80 );
            adjustColumnWidth( "PO Date", 80 );
            adjustColumnWidth( "Supplier Name", 200 );
            adjustColumnWidth( "Issued By", 80 );
            
                        
            adjustColumnType("ID",  BROWSER_COLUMN_TYPE_NUMERICNOFORMAT );

    }        


    
}
