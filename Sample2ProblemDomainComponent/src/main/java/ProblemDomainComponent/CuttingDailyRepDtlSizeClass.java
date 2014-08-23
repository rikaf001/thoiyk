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
    pkColumnValue="SEQ_CDRSIZE_DTL", 
    allocationSize=1)    
@Table(name = "CUTTINGDAILYREP_DTLSIZE")
public class CuttingDailyRepDtlSizeClass 
extends KBusinessObjectClass
{
    @KID
    @Id   
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;

    @Column(name = "hdrid")
    private long HdrID;


    @Column(name = "sizeno")
    private long SizeNo;

    @Column(name = "layer")
    private long Layer;

    @Column(name = "sizeratio")
    private long SizeRatio;

    @Column(name = "breakdownsize")
    private long BreakDownSize;

    @Column(name = "auditdate")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date AuditDate;

    @Column(name = "audituser")
    private String AuditUser;
    

    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;

   public CuttingDailyRepDtlSizeClass() throws KExceptionClass {
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

    public long getSizeNo() {
        return SizeNo;
    }

    public void setSizeNo(long SizeNo) {
        this.SizeNo = SizeNo;
    }

    public long getLayer() {
        return Layer;
    }

    public void setLayer(long Layer) {
        this.Layer = Layer;
    }

    public long getSizeRatio() {
        return SizeRatio;
    }

    public void setSizeRatio(long SizeRatio) {
        this.SizeRatio = SizeRatio;
    }

    public long getBreakDownSize() {
        return BreakDownSize;
    }

    public void setBreakDownSize(long BreakDownSize) {
        this.BreakDownSize = BreakDownSize;
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
