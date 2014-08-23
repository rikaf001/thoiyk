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
    pkColumnValue="GEN_BRNGKELBAKU", 
    allocationSize=1)    
@Table(name = "BARANGKELUARBAKU")
public class BarangKeluarBakuClass 
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

    @Column(name = "buyerid")
    private long BuyerID;

    @Column(name = "buyernama")
    private String BuyerNama;

    @Column(name = "sjno")
    private String SJNo;
    
    @Column(name = "matauangid")
    private Long MataUangID;
    
    @Column(name = "jenisdokpabeanid")
    private Long JenisDokPabeanID;
    

    @Column(name = "nobc")
    private String BCNo;

    @Column(name = "bctgl")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date BCTgl;

    @Column(name = "kodekawasanid")
    private Long KodeKawasanID;
    

    @Column(name = "createdby")
    private String CreatedBy;
    
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date DateCreated;

    @Column(name = "catatan")
    private String Catatan;


    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;
    
    public BarangKeluarBakuClass() throws KExceptionClass{
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


    public String getSJNo() {
        return SJNo;
    }

    public void setSJNo(String SJNo) {
        this.SJNo = SJNo;
    }

    public Long getMataUangID() {
        return MataUangID;
    }

    public void setMataUangID(Long MataUangID) {
        this.MataUangID = MataUangID;
    }

    
    public Long getJenisDokPabeanID() {
        return JenisDokPabeanID;
    }

    public void setJenisDokPabeanID(Long JenisDokPabeanID) {
        this.JenisDokPabeanID = JenisDokPabeanID;
    }

    
    
    public Long getKodeKawasanID() {
        return KodeKawasanID;
    }

    public void setKodeKawasanID(Long KodeKawasanID) {
        this.KodeKawasanID = KodeKawasanID;
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

    public String getCatatan() {
        return Catatan;
    }

    public void setCatatan(String Catatan) {
        this.Catatan = Catatan;
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
