/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package thoiyk.HumanInterfaceComponent.LaporanProduksiHeader;

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
import ProblemDomainComponent.pr_newClass;


public class LaporanProduksiHeaderBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public LaporanProduksiHeaderBrowserClass(
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
                    LaporanProduksiHeaderEditDialogClass.class
            );  
            
            // uses                   
	    // has            
    }        


    public void initializeTable()
    throws KExceptionClass
    {	      
              
            // set the SQL
            super.initializeSQLQuery( 
                
                " lp.ID, lp.tanggal,lp.description, lp.style, lp.gmtdelivery, lp.buyerid, lp.buyername,lp.prno,lp.poqty, lp.createdby,lp.datecreated ",
                
                // 2 tablas and joins                                             
                " laporanproduksi_hdr lp   " ,
                                                                  
                // 3 llave principal (mayusculas!)
                "ID" 
                                                                                             
                    );   

     
            setColumnNames( "lp", "ID", "ID" );
            setColumnNames( "lp", "TANGGAL", "Tanggal" );
            setColumnNames( "lp", "DESCRIPTION", "Description" );
            setColumnNames( "lp", "STYLE", "Style" );
            setColumnNames( "lp", "GMTDELIVERY", "GMTDelivery" );
            setColumnNames( "lp", "BUYERID", "BuyerID" );
            setColumnNames( "lp", "BUYERNAME", "BuyerName" );
            setColumnNames( "lp", "PRNO", "PRNo" );
            setColumnNames( "lp", "POQTY", "POQty" );
            setColumnNames( "lp", "CREATEDBY", "CreatedBy" );
            setColumnNames( "lp", "DATECREATED", "DateCreated" );
       

            // load data
            super.initializeTable();   
            
            
    }        


    
}
