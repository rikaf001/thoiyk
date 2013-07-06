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
                " po.ID ID,po.NOMOR,po.PODATE,po.SUPPLIERID,sup.NAMA SUPPLIERNAME, po.ISSUEDBY ",
                
                // 2 tablas and joins                                             
                " PURCHASEORDER po   "+
                " left join SUPPLIER sup on po.SUPPLIERID=sup.ID"   ,
                                                   
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

            // define column settings
            
            setColumnNames( "po", "ID", "ID" );
            setColumnNames( "po", "NOMOR", "PONumber" );
            setColumnNames( "po", "PODATE", "PODate" );
            setColumnNames( "po", "SUPPLIERID", "SupplierID" );
            setColumnNames( "sup", "SUPPLIERNAME", "SupplierName" );
            setColumnNames( "po", "ISSUEDBY", "IssuedBy" );


            

            
            // load data
            super.initializeTable();   
            

    }        


    
}
