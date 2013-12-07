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
    pkColumnValue="GEN_PRD_IN_HDR", 
    allocationSize=1)    
@Table(name = "BRS_HDR")
public class BRSHeaderClass 
extends KBusinessObjectClass
{
    @KBusinessObjectClass.KID
    @Id   
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;
    
    @Column(name = "btbid")
    private long BTBID;
    
    @Column(name = "jenisdokid")
    private long JenisDokID;

    @Column(name = "kawasanid")
    private long KawasanID;

    @Column(name = "nomor")
    private String Nomor;

    @Column(name = "tanggal")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date Tanggal;

    @Column(name = "supplierid")
    private Long SupplierID;

    @Column(name = "suppliername")
    private String SupplierName;

    @Column(name = "nobc")
    private String NoBC;

    @Column(name = "tglbc")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date TglBC;
    
    
    @Column(name = "auditdate")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date AuditDate;

    @Column(name = "audituser")
    private String AuditUser;

    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;
    
    public BRSHeaderClass() throws KExceptionClass{
    }

    //=================================================================
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }


    public String getNomor() {
        return Nomor;
    }

    public void setNomor(String Nomor) {
        this.Nomor = Nomor;
    }

    public Long getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(Long SupplierID) {
        this.SupplierID = SupplierID;
    }

    

    public Date getTanggal() {
        return Tanggal;
    }

    public void setTanggal(Date Tanggal) {
        this.Tanggal = Tanggal;
    }

    
    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }


    public String getNoBC() {
        return NoBC;
    }

    public void setNoBC(String NoBC) {
        this.NoBC = NoBC;
    }

    public Date getTglBC() {
        return TglBC;
    }

    public void setTglBC(Date TglBC) {
        this.TglBC = TglBC;
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

    public long getBTBID() {
        return BTBID;
    }

    public void setBTBID(long BTBID) {
        this.BTBID = BTBID;
    }

    public long getJenisDokID() {
        return JenisDokID;
    }

    public void setJenisDokID(long JenisDokID) {
        this.JenisDokID = JenisDokID;
    }

    public long getKawasanID() {
        return KawasanID;
    }

    public void setKawasanID(long KawasanID) {
        this.KawasanID = KawasanID;
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
