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
    private double QtyOrder;

    @Column(name = "qtyallowance")
    private double QtyAllowance;

    @Column(name = "qtycut")
    private double QtyCut;

    @Column(name = "consumtiongiven")
    private double ConsumtionGiven;

    @Column(name = "consumtionactual")
    private double ConsumtionActual;

    @Column(name = "kaindatang")
    private double KainDatang;

    @Column(name = "kainbutuh")
    private double KainButuh;

    @Column(name = "kainplusmin")
    private double KainPlusMin;

    @Column(name = "kainpersen")
    private double KainPersen;

    @Column(name = "keterangan")
    private String Keterangan;
    
    @Column(name = "auditdate")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date AuditDate;
    
    @Column(name = "audituser")
    private String AuditUser;

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

    public double getQtyOrder() {
        return QtyOrder;
    }

    public void setQtyOrder(double QtyOrder) {
        this.QtyOrder = QtyOrder;
    }

    public double getQtyAllowance() {
        return QtyAllowance;
    }

    public void setQtyAllowance(double QtyAllowance) {
        this.QtyAllowance = QtyAllowance;
    }

    public double getQtyCut() {
        return QtyCut;
    }

    public void setQtyCut(double QtyCut) {
        this.QtyCut = QtyCut;
    }

    public double getConsumtionGiven() {
        return ConsumtionGiven;
    }

    public void setConsumtionGiven(double ConsumtionGiven) {
        this.ConsumtionGiven = ConsumtionGiven;
    }

    public double getConsumtionActual() {
        return ConsumtionActual;
    }

    public void setConsumtionActual(double ConsumtionActual) {
        this.ConsumtionActual = ConsumtionActual;
    }

    public double getKainDatang() {
        return KainDatang;
    }

    public void setKainDatang(double KainDatang) {
        this.KainDatang = KainDatang;
    }

    public double getKainButuh() {
        return KainButuh;
    }

    public void setKainButuh(double KainButuh) {
        this.KainButuh = KainButuh;
    }

    public double getKainPlusMin() {
        return KainPlusMin;
    }

    public void setKainPlusMin(double KainPlusMin) {
        this.KainPlusMin = KainPlusMin;
    }

    public double getKainPersen() {
        return KainPersen;
    }

    public void setKainPersen(double KainPersen) {
        this.KainPersen = KainPersen;
    }

    public Date getAuditDate() {
        return AuditDate;
    }

    public void setAuditDate(Date AuditDate) {
        this.AuditDate = AuditDate;
    }

    public String getAuditUser() {
        return AuditUser;
    }

    public void setAuditUser(String AuditUser) {
        this.AuditUser = AuditUser;
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
