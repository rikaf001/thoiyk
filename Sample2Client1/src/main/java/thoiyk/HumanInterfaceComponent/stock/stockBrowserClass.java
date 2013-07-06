/*
This source code is part of the KFRAMEWORK  (http://k-framework.sourceforge.net/)
Copyright (C) 2001  Alejandro Vazquez, Ke Li
Feedback / Bug Reports vmaxxed@users.sourceforge.net

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 2.1 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */



package thoiyk.HumanInterfaceComponent.stock;

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
import ProblemDomainComponent.stockClass;
import Sample1.HumanInterfaceComponent.sample_product.productEditDialogClass;
import java.util.HashMap;


public class stockBrowserClass 
extends KDataBrowserBaseClass {   
        
    // uses                       	
    
    // has

    /** Creates new viajeBrowserClass */
    public stockBrowserClass(
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
                    stockClass.class,
                    stockEditDialogClass.class
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
                " ID, STOCKTYPEID, BUYERID, STYLEID, PRODUCT, COLOUR, QTY, IMAGE ",
                
                // 2 tablas and joins                                             
                " STOCK stk   "  ,
                                                   
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
            setRowsHeight( 150 );
            
            // load data
            super.initializeTable();   
            
            // some customization
            //adjustColumnWidth( "id", 100 );
            //adjustColumnWidth( "Name", 200 );  
            //adjustColumnWidth( "Cost", 100 );  
            
            //adjustColumnType( "Cost", BROWSER_COLUMN_TYPE_CURRENCY );            
            //adjustColumnFont(  "Cost",  new Font( "arial", Font.BOLD, 10  ) );             
            //adjustColumnForegroundColor( "Cost", Color.BLUE  );
            
            adjustColumnWidth( "IMAGE", 210 );  
            setColumnRenderer( "IMAGE", new ImageCellRendererClass( tableModel, log, 120, 150 ) );
            
    }        


    
}
