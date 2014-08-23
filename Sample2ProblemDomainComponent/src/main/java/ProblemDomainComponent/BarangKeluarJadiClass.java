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
    pkColumnValue="GEN_BRNGKELJADI", 
    allocationSize=1)    
@Table(name = "BARANGKELUARJADI")
public class BarangKeluarJadiClass 
extends KBusinessObjectClass
{
    @KBusinessObjectClass.KID
    @Id   
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;

    @Column(name = "tanggal")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date Tanggal;

    @Column(name = "selectid")
    private long SelectID;

    @Column(name = "nomor")
    private String Nomor;

    @Column(name = "buyerid")
    private long BuyerID;

    @Column(name = "buyernama")
    private String BuyerNama;

    @Column(name = "jenisdokpabeanid")
    private long JenisDokPabeanID;

    @Column(name = "bcno")
    private String BCNo;

    @Column(name = "bctgl")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date BCTgl;
    
    @Column(name = "matauangid")
    private Long MataUangID;
    
    @Column(name = "createdby")
    private String CreatedBy;
    
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date DateCreated;

    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;
    
    public BarangKeluarJadiClass() throws KExceptionClass{
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

    public long getSelectID() {
        return SelectID;
    }

    public void setSelectID(long SelectID) {
        this.SelectID = SelectID;
    }

    public String getNomor() {
        return Nomor;
    }

    public void setNomor(String Nomor) {
        this.Nomor = Nomor;
    }

    public long getBuyerID() {
        return BuyerID;
    }

    public void setBuyerID(long BuyerID) {
        this.BuyerID = BuyerID;
    }

    public String getBuyerNama() {
        return BuyerNama;
    }

    public void setBuyerNama(String BuyerNama) {
        this.BuyerNama = BuyerNama;
    }

    public long getJenisDokPabeanID() {
        return JenisDokPabeanID;
    }

    public void setJenisDokPabeanID(long JenisDokPabeanID) {
        this.JenisDokPabeanID = JenisDokPabeanID;
    }

    public String getBCNo() {
        return BCNo;
    }

    public void setBCNo(String BCNo) {
        this.BCNo = BCNo;
    }

    public Date getBCTgl() {
        return BCTgl;
    }

    public void setBCTgl(Date BCTgl) {
        this.BCTgl = BCTgl;
    }

    public Long getMataUangID() {
        return MataUangID;
    }

    public void setMataUangID(Long MataUangID) {
        this.MataUangID = MataUangID;
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
