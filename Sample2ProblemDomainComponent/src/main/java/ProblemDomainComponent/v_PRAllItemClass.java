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
import java.io.Serializable;
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
@TableGenerator( 
    name="KIDGenerator", 
    table="SEQUENCE", 
    pkColumnName="SEQ_NAME", 
    valueColumnName="SEQ_COUNT", 
    pkColumnValue="SEQ_PO_ITEM", 
    allocationSize=1)    
@Table(name = "V_PRALLITEM")
public class v_PRAllItemClass 
extends KBusinessObjectClass
{
    @Id
    @KBusinessObjectClass.KID    
    @Basic(optional = false)
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;
    
    @Column(name = "prid")
    private long PRID;
    
    @Column(name = "itemid")
    private long ItemID;
    
    @Column(name = "kode")
    private long Kode;

    @Column(name = "nama")
    private long Nama;

    @Column(name = "warna")
    private long Warna;

    @Column(name = "qty")
    private long Qty;

    @Column(name = "unit")
    private long Unit;

    public v_PRAllItemClass() throws KExceptionClass {
    }

    //=================================================================
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getPRID() {
        return PRID;
    }

    public void setPRID(long PRID) {
        this.PRID = PRID;
    }

    public long getItemID() {
        return ItemID;
    }

    public void setItemID(long ItemID) {
        this.ItemID = ItemID;
    }

    public long getKode() {
        return Kode;
    }

    public void setKode(long Kode) {
        this.Kode = Kode;
    }

    public long getNama() {
        return Nama;
    }

    public void setNama(long Nama) {
        this.Nama = Nama;
    }

    public long getWarna() {
        return Warna;
    }

    public void setWarna(long Warna) {
        this.Warna = Warna;
    }

    public long getQty() {
        return Qty;
    }

    public void setQty(long Qty) {
        this.Qty = Qty;
    }

    public long getUnit() {
        return Unit;
    }

    public void setUnit(long Unit) {
        this.Unit = Unit;
    }

    
        
    @Override
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }

}
