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
    pkColumnValue="GEN_FWASHING_DTL", 
    allocationSize=1)    
@Table(name = "FORMWASHING_DTL")
public class FormWashingDetailClass 
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

    @Column(name = "lineid")
    private long LineID;

    @Column(name = "namabahan")
    private String NamaBahan;

    @Column(name = "warna")
    private String Warna;

    @Column(name = "ok")
    private long OK;

    @Column(name = "reject")
    private long Reject;
    
    @Column(name = "total")
    private long Total;
    
    @Column(name = "xs")
    private long XS;
        
    @Column(name = "s")
    private long S;
        
    @Column(name = "m")
    private long M;

    @Column(name = "l")
    private long L;
        
    @Column(name = "xl")
    private long XL;
    
    @Column(name = "xxl")
    private long XXL;
        
    @Column(name = "xxxl")
    private long XXXL;
        
    @Column(name = "qtytotal")
    private long QtyTotal;
    
    @Column(name = "keteranganreject")
    private String KeteranganReject;
    
    @Column(name = "auditdate")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date AuditDate;

    @Column(name = "audituser")
    private String AuditUser;
    
    
    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;

    
    
    public FormWashingDetailClass() throws KExceptionClass {
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

    public long getLineID() {
        return LineID;
    }

    public void setLineID(long LineID) {
        this.LineID = LineID;
    }

    public String getNamaBahan() {
        return NamaBahan;
    }

    public void setNamaBahan(String NamaBahan) {
        this.NamaBahan = NamaBahan;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public long getOK() {
        return OK;
    }

    public void setOK(long OK) {
        this.OK = OK;
    }

    public long getReject() {
        return Reject;
    }

    public void setReject(long Reject) {
        this.Reject = Reject;
    }

    public long getTotal() {
        return Total;
    }

    public void setTotal(long Total) {
        this.Total = Total;
    }

    public long getXS() {
        return XS;
    }

    public void setXS(long XS) {
        this.XS = XS;
    }

    public long getS() {
        return S;
    }

    public void setS(long S) {
        this.S = S;
    }

    public long getM() {
        return M;
    }

    public void setM(long M) {
        this.M = M;
    }

    public long getL() {
        return L;
    }

    public void setL(long L) {
        this.L = L;
    }

    public long getXL() {
        return XL;
    }

    public void setXL(long XL) {
        this.XL = XL;
    }

    public long getXXL() {
        return XXL;
    }

    public void setXXL(long XXL) {
        this.XXL = XXL;
    }

    public long getXXXL() {
        return XXXL;
    }

    public void setXXXL(long XXXL) {
        this.XXXL = XXXL;
    }

    public long getQtyTotal() {
        return QtyTotal;
    }

    public void setQtyTotal(long QtyTotal) {
        this.QtyTotal = QtyTotal;
    }

    public String getKeteranganReject() {
        return KeteranganReject;
    }

    public void setKeteranganReject(String KeteranganReject) {
        this.KeteranganReject = KeteranganReject;
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
