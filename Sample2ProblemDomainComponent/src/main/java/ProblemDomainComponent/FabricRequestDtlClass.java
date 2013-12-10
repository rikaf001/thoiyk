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
    pkColumnValue="SEQ_PR_DTL", 
    allocationSize=1)    
@Table(name = "FABRICREQUEST_DTL")
public class FabricRequestDtlClass 
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

    @Column(name = "qtyneed")
    private double QtyNeed;

    @Column(name = "qtyallowance")
    private double QtyAllowance;

    @Column(name = "qtyneedtotal")
    private double QtyNeedTotal;

    @Column(name = "kainreceived")
    private double KainReceived;

    @Column(name = "kainneeded")
    private double KainNeeded;

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

    
    
    public FabricRequestDtlClass() throws KExceptionClass {
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

    public double getQtyNeed() {
        return QtyNeed;
    }

    public void setQtyNeed(double QtyNeed) {
        this.QtyNeed = QtyNeed;
    }

    public double getQtyAllowance() {
        return QtyAllowance;
    }

    public void setQtyAllowance(double QtyAllowance) {
        this.QtyAllowance = QtyAllowance;
    }

    public double getQtyNeedTotal() {
        return QtyNeedTotal;
    }

    public void setQtyNeedTotal(double QtyNeedTotal) {
        this.QtyNeedTotal = QtyNeedTotal;
    }

    public double getKainReceived() {
        return KainReceived;
    }

    public void setKainReceived(double KainReceived) {
        this.KainReceived = KainReceived;
    }

    public double getKainNeeded() {
        return KainNeeded;
    }

    public void setKainNeeded(double KainNeeded) {
        this.KainNeeded = KainNeeded;
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

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
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
