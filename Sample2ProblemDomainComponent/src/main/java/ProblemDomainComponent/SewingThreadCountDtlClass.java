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
@TableGenerator( 
    name="KIDGenerator", 
    table="SEQUENCE", 
    pkColumnName="SEQ_NAME", 
    valueColumnName="SEQ_COUNT", 
    pkColumnValue="SEQ_GEN_SEWINGTHREADCOUNTDTL", 
    allocationSize=1) 
@Table(name = "SEWINGTHREADCOUNTDTL")
public class SewingThreadCountDtlClass 
extends KBusinessObjectClass{

    @KBusinessObjectClass.KID
    @Id   
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;
    
    @Column(name = "hdrid")
    private long HdrID;

    @Column(name = "threadid")
    private long ThreadID;

    @Column(name = "threadname")
    private String ThreadName;
    
    @Column(name = "ukuran")
    private String Ukuran;

    @Column(name = "part")
    private String Part;  
    
    @Column(name = "totalinch")
    private double TotalInch;  
    
    @Column(name = "totalmeter")
    private double TotalMeter;  

    @Column(name = "remark")
    private String Remark;  

    @Column(name = "auditdate")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date AuditDate;
    
    @Column(name = "audituser")
    private String AuditUser;
  
    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;

    public SewingThreadCountDtlClass() throws KExceptionClass {
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

    public long getThreadID() {
        return ThreadID;
    }

    public void setThreadID(long ThreadID) {
        this.ThreadID = ThreadID;
    }

    public String getThreadName() {
        return ThreadName;
    }

    public void setThreadName(String ThreadName) {
        this.ThreadName = ThreadName;
    }

    public String getUkuran() {
        return Ukuran;
    }

    public void setUkuran(String Ukuran) {
        this.Ukuran = Ukuran;
    }

    public String getPart() {
        return Part;
    }

    public void setPart(String Part) {
        this.Part = Part;
    }

    public double getTotalInch() {
        return TotalInch;
    }

    public void setTotalInch(double TotalInch) {
        this.TotalInch = TotalInch;
    }

    public double getTotalMeter() {
        return TotalMeter;
    }

    public void setTotalMeter(double TotalMeter) {
        this.TotalMeter = TotalMeter;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
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
