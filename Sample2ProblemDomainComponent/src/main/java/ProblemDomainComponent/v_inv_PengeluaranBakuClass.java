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
    pkColumnValue="SEQ_GEN_TABLE", 
    allocationSize=1)
@Table(name = "V_INV_PENGELUARANBAKU")
public class v_inv_PengeluaranBakuClass 
extends KBusinessObjectClass{

    
    @Id
    @KBusinessObjectClass.KID    
    @Basic(optional = false)
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;

    @Column(name = "tanggal")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date Tanggal;

    @Column(name = "sjno")
    private String SJNo;
    
    @Column(name = "barangid")
    private Long BarangID;

    @Column(name = "barangnama")
    private String BarangNama;
   
    @Column(name = "qty")
    private Long Qty;

    @Column(name = "createdby")
    private String createdby;
   
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date DateCreated;

    public v_inv_PengeluaranBakuClass() throws KExceptionClass {
    }

    //=================================================================    
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Date getTanggal() {
        return Tanggal;
    }

    public void setTanggal(Date Tanggal) {
        this.Tanggal = Tanggal;
    }

    public String getSJNo() {
        return SJNo;
    }

    public void setSJNo(String SJNo) {
        this.SJNo = SJNo;
    }

    public Long getBarangID() {
        return BarangID;
    }

    public void setBarangID(Long BarangID) {
        this.BarangID = BarangID;
    }

    public String getBarangNama() {
        return BarangNama;
    }

    public void setBarangNama(String BarangNama) {
        this.BarangNama = BarangNama;
    }

    public Long getQty() {
        return Qty;
    }

    public void setQty(Long Qty) {
        this.Qty = Qty;
    }

     
    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Date getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(Date DateCreated) {
        this.DateCreated = DateCreated;
    }
    
    
    //=================================================================
        @Override
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }


}
