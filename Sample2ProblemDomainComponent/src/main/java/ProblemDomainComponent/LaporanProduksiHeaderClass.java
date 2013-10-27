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
    pkColumnValue="GEN_LAPROD_HDR", 
    allocationSize=1)    
@Table(name = "LAPORANPRODUKSI_HDR")
public class LaporanProduksiHeaderClass 
extends KBusinessObjectClass
{
    @KBusinessObjectClass.KID
    @Id   
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;

    @Column(name = "description")
    private String Description;
    
    @Column(name = "style")
    private String Style;

    @Column(name = "gmtdelivery")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date GMTDilevery;

    @Column(name = "buyerid")
    private Long BuyerID;

    @Column(name = "buyername")
    private String BuyerName;

    @Column(name = "prid")
    private long PRID;

    @Column(name = "prno")
    private String PRNo;

    @Column(name = "poqty")
    private long POQty;

    @Column(name = "tanggal")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date Tanggal;

    @Column(name = "createdby")
    private String CreatedBy;
    
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date DateCreated;


    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;
    
    public LaporanProduksiHeaderClass() throws KExceptionClass{
    }

    //=================================================================
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String Style) {
        this.Style = Style;
    }

    public Date getGMTDilevery() {
        return GMTDilevery;
    }

    public void setGMTDilevery(Date GMTDilevery) {
        this.GMTDilevery = GMTDilevery;
    }

    public Long getBuyerID() {
        return BuyerID;
    }

    public void setBuyerID(Long BuyerID) {
        this.BuyerID = BuyerID;
    }

    public String getBuyerName() {
        return BuyerName;
    }

    public void setBuyerName(String BuyerName) {
        this.BuyerName = BuyerName;
    }

    public long getPRID() {
        return PRID;
    }

    public void setPRID(long PRID) {
        this.PRID = PRID;
    }

    public String getPRNo() {
        return PRNo;
    }

    public void setPRNo(String PRNo) {
        this.PRNo = PRNo;
    }

    public long getPOQty() {
        return POQty;
    }

    public void setPOQty(long POQty) {
        this.POQty = POQty;
    }

    public Date getTanggal() {
        return Tanggal;
    }

    public void setTanggal(Date Tanggal) {
        this.Tanggal = Tanggal;
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
