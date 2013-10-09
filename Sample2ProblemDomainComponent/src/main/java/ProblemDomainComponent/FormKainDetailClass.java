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
    pkColumnValue="GEN_FKAIN_DTL", 
    allocationSize=1)    
@Table(name = "FORMKAIN_DTL")
public class FormKainDetailClass 
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

    @Column(name = "jeniskain")
    private String JenisKain;

    @Column(name = "warna")
    private String Warna;

    @Column(name = "qtyorder")
    private long QtyOrder;

    @Column(name = "qtyallowance")
    private long QtyAllowance;

    @Column(name = "qtycut")
    private long QtyCut;

    @Column(name = "consumtiongiven")
    private long ConsumtionGiven;

    @Column(name = "consumtionactual")
    private long ConsumtionActual;

    @Column(name = "kaindatang")
    private long KainDatang;

    @Column(name = "kainbutuh")
    private long KainButuh;

    @Column(name = "kainplusmin")
    private long KainPlusMin;

    @Column(name = "kainpersen")
    private long KainPersen;

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

    
    
    public FormKainDetailClass() throws KExceptionClass {
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

    public String getJenisKain() {
        return JenisKain;
    }

    public void setJenisKain(String JenisKain) {
        this.JenisKain = JenisKain;
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

    public long getQtyCut() {
        return QtyCut;
    }

    public void setQtyCut(long QtyCut) {
        this.QtyCut = QtyCut;
    }

    public long getConsumtionGiven() {
        return ConsumtionGiven;
    }

    public void setConsumtionGiven(long ConsumtionGiven) {
        this.ConsumtionGiven = ConsumtionGiven;
    }

    public long getConsumtionActual() {
        return ConsumtionActual;
    }

    public void setConsumtionActual(long ConsumtionActual) {
        this.ConsumtionActual = ConsumtionActual;
    }

   

    public long getKainDatang() {
        return KainDatang;
    }

    public void setKainDatang(long KainDatang) {
        this.KainDatang = KainDatang;
    }

    public long getKainButuh() {
        return KainButuh;
    }

    public void setKainButuh(long KainButuh) {
        this.KainButuh = KainButuh;
    }

    public long getKainPlusMin() {
        return KainPlusMin;
    }

    public void setKainPlusMin(long KainPlusMin) {
        this.KainPlusMin = KainPlusMin;
    }

    public long getKainPersen() {
        return KainPersen;
    }

    public void setKainPersen(long KainPersen) {
        this.KainPersen = KainPersen;
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
