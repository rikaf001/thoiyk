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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

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
    pkColumnValue="SEQ_GEN_TABLE", 
    allocationSize=1)
@Table(name = "V_BC_PEMASUKAN_BAKU_DTL")
public class v_BC_PemasukanBakuDetailClass 
extends KBusinessObjectClass{

    
    @Id
    @KBusinessObjectClass.KID    
    @Basic(optional = false)
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;

    @Column(name = "hdrid")
    private Long HdrID;
    
    @Column(name = "category")
    private String Category;

    @Column(name = "description")
    private String Description;
   
    @Column(name = "unit")
    private String Unit;
   
    @Column(name = "itemqty")
    private Long ItemQty;

    public v_BC_PemasukanBakuDetailClass() throws KExceptionClass {
    }

    //=================================================================    
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Long getHdrID() {
        return HdrID;
    }

    public void setHdrID(Long HdrID) {
        this.HdrID = HdrID;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public Long getItemQty() {
        return ItemQty;
    }

    public void setItemQty(Long ItemQty) {
        this.ItemQty = ItemQty;
    }
    
    
    
    //=================================================================
        @Override
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }


}
