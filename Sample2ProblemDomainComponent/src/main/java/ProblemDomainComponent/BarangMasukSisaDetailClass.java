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
    pkColumnValue="GEN_BRNGMSKSISA_DTL", 
    allocationSize=1)    
@Table(name = "BARANGMASUKSISA_DTL")
public class BarangMasukSisaDetailClass 
extends KBusinessObjectClass
{
    @KBusinessObjectClass.KID
    @Id   
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;

    @Column(name = "hdrid")
    private long HdrID;

    @Column(name = "barangid")
    private long BarangID;

    @Column(name = "barangnama")
    private String BarangNama;

    @Column(name = "unitid")
    private Long UnitID;

    @Column(name = "qty")
    private Long Qty;

    @Column(name = "createdby")
    private String CreatedBy;
    
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date DateCreated;


    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;
    
    public BarangMasukSisaDetailClass() throws KExceptionClass{
    }

    //=================================================================
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getHdrID() {
        return HdrID;
    }

    public void setHdrID(long HdrID) {
        this.HdrID = HdrID;
    }

    public long getBarangID() {
        return BarangID;
    }

    public void setBarangID(long BarangID) {
        this.BarangID = BarangID;
    }

    public String getBarangNama() {
        return BarangNama;
    }

    public void setBarangNama(String BarangNama) {
        this.BarangNama = BarangNama;
    }

    public Long getUnitID() {
        return UnitID;
    }

    public void setUnitID(Long UnitID) {
        this.UnitID = UnitID;
    }

    public Long getQty() {
        return Qty;
    }

    public void setQty(Long Qty) {
        this.Qty = Qty;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    public Date getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(Date DateCreated) {
        this.DateCreated = DateCreated;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
    
    
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }
    
}
