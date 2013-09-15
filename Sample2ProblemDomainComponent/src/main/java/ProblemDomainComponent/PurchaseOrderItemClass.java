/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package ProblemDomainComponent;


import KFramework30.Base.KBusinessObjectClass;
import KFramework30.Base.KExceptionClass;
import java.awt.Component;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author yoserizy
 */
@Entity
@TableGenerator( // SCOPE is Global to PU
    name="KIDGenerator", 
    table="SEQUENCE", 
    pkColumnName="SEQ_NAME", 
    valueColumnName="SEQ_COUNT", 
    pkColumnValue="SEQ_PO_ITEM", 
    allocationSize=1)    
@Table(name = "PURCHASEORDERITEM")
public class PurchaseOrderItemClass 
extends KBusinessObjectClass
{
    
    @Id
    @KBusinessObjectClass.KID    
    @Basic(optional = false)
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;
    
    @Column(name = "purchaseorderid")
    private long PurchaseOrderID;
        
    @Column(name = "productionrecordid")
    private long ProductionRecordID;
    
    @Column(name = "prno")
    private String PRNo;
    
    
    @Column(name = "itemid")
    private long ItemID;

    
    @Column(name = "unitprice")
    private double UnitPrice;
    
    @Column(name = "qty")
    private double Qty;
    

    
    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;
 

    public PurchaseOrderItemClass() throws KExceptionClass {
    }

    //=================================================================    
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getPurchaseOrderID() {
        return PurchaseOrderID;
    }

    public void setPurchaseOrderID(long PurchaseOrderID) {
        this.PurchaseOrderID = PurchaseOrderID;
    }

    public long getProductionRecordID() {
        return ProductionRecordID;
    }

    public void setProductionRecordID(long ProductionRecordID) {
        this.ProductionRecordID = ProductionRecordID;
    }

    public long getItemID() {
        return ItemID;
    }

    public void setItemID(long ItemID) {
        this.ItemID = ItemID;
    }


    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public double getQty() {
        return Qty;
    }

    public void setQty(double Qty) {
        this.Qty = Qty;
    }



    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getPRNo() {
        return PRNo;
    }

    public void setPRNo(String PRNo) {
        this.PRNo = PRNo;
    }

    
    


    @Override
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }
    

}
