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
    pkColumnValue="GEN_FSEWING_DTL", 
    allocationSize=1)    
@Table(name = "FORMSEWING_DTL")
public class FormSewingDetailClass 
extends KBusinessObjectClass
{

    @KID
    @Id   
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;
    
    @Column(name = "hdrid")
    private long HdrID;

    @Column(name = "itemid")
    private long ItemID;

    @Column(name = "nama")
    private String Nama;

    @Column(name = "warna")
    private String Warna;

    @Column(name = "qtyorder")
    private long QtyOrder;

    @Column(name = "qtyallowance")
    private long QtyAllowance;
    
    @Column(name = "cut")
    private long Cut;
    
    @Column(name = "given")
    private long Given;
        
    @Column(name = "actual")
    private long Actual;
        
    @Column(name = "datang")
    private long Datang;
        
    @Column(name = "butuh")
    private long Butuh;
    
    @Column(name = "plusmin")
    private long PlusMin;
        
    @Column(name = "persen")
    private long Persen;
        
    @Column(name = "keterangan")
    private String Keterangan;
    
    @Column(name = "createdby")
    private String CreatedBy;
    
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date DateCreated;

    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;

    
    
    public FormSewingDetailClass() throws KExceptionClass {
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

    public long getItemID() {
        return ItemID;
    }

    public void setItemID(long ItemID) {
        this.ItemID = ItemID;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public long getQtyOrder() {
        return QtyOrder;
    }

    public void setQtyOrder(long QtyOrder) {
        this.QtyOrder = QtyOrder;
    }

    public long getQtyAllowance() {
        return QtyAllowance;
    }

    public void setQtyAllowance(long QtyAllowance) {
        this.QtyAllowance = QtyAllowance;
    }

    public long getCut() {
        return Cut;
    }

    public void setCut(long Cut) {
        this.Cut = Cut;
    }

    public long getGiven() {
        return Given;
    }

    public void setGiven(long Given) {
        this.Given = Given;
    }

    public long getActual() {
        return Actual;
    }

    public void setActual(long Actual) {
        this.Actual = Actual;
    }

    public long getDatang() {
        return Datang;
    }

    public void setDatang(long Datang) {
        this.Datang = Datang;
    }

    public long getButuh() {
        return Butuh;
    }

    public void setButuh(long Butuh) {
        this.Butuh = Butuh;
    }

    public long getPlusMin() {
        return PlusMin;
    }

    public void setPlusMin(long PlusMin) {
        this.PlusMin = PlusMin;
    }

    public long getPersen() {
        return Persen;
    }

    public void setPersen(long Persen) {
        this.Persen = Persen;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
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
    
    
    @Override
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }


}
