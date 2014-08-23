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
    pkColumnValue="SEQ_GEN_SEWINGOPBREAKDOWN", 
    allocationSize=1) 
@Table(name = "SEWINGOPBREAKDOWN")
public class SewingOpBreakDownClass 
extends KBusinessObjectClass {

    @KBusinessObjectClass.KID
    @Id   
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;
        
        
    @Column(name = "prid")
    private long PRID;

    @Column(name = "prno")
    private String PRNo;

    @Column(name = "stylename")
    private String StyleName;
    
    @Column(name = "buyerid")
    private String BuyerID;
    
    @Column(name = "buyername")
    private String BuyerName;
    

    @Column(name = "typename")
    private String typeName;

    @Column(name = "tper45")
    private long TPer45;


    @Column(name = "tanggal")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date Tanggal;

    
    
    @Column(name = "auditdate")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date AuditDate;
    
    @Column(name = "audituser")
    private String AuditUser;
  
    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;

    public SewingOpBreakDownClass() throws KExceptionClass {
    }

    //=================================================================    
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
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

    public String getStyleName() {
        return StyleName;
    }

    public void setStyleName(String StyleName) {
        this.StyleName = StyleName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    
    public String getBuyerID() {
        return BuyerID;
    }

    public void setBuyerID(String BuyerID) {
        this.BuyerID = BuyerID;
    }

    public String getBuyerName() {
        return BuyerName;
    }

    public void setBuyerName(String BuyerName) {
        this.BuyerName = BuyerName;
    }

    public Date getTanggal() {
        return Tanggal;
    }

    public void setTanggal(Date Tanggal) {
        this.Tanggal = Tanggal;
    }

    public long getTPer45() {
        return TPer45;
    }

    public void setTPer45(long TPer45) {
        this.TPer45 = TPer45;
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
