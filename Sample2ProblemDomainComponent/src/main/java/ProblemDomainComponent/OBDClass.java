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
    pkColumnValue="SEQ_GEN_OBD", 
    allocationSize=1) 
@Table(name = "OBD")
public class OBDClass 
extends KBusinessObjectClass {
@KBusinessObjectClass.KID
    @Id   
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;
    
    @Column(name = "obdtypeid")
    private long OBDTypeID;
    
    @Column(name = "kodemesin")
    private String KodeMesin;
    
    @Column(name = "mesin")
    private String Mesin;

    @Column(name = "proses")
    private String Proses;

    @Column(name = "allow")
    private double Allow;

    @Column(name = "pper45mnt")
    private double PPer45Mnt;

    @Column(name = "pper1jam")
    private double PPer1Jam;

    @Column(name = "rms")
    private double RMS;

    @Column(name = "hperprs")
    private double HPerPRS;

    @Column(name = "auditdate")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date AuditDate;
    
    @Column(name = "audituser")
    private String AuditUser;
  
    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;

    public OBDClass() throws KExceptionClass {
    }

    //=================================================================    
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getOBDTypeID() {
        return OBDTypeID;
    }

    public void setOBDTypeID(long OBDTypeID) {
        this.OBDTypeID = OBDTypeID;
    }

    public String getKodeMesin() {
        return KodeMesin;
    }

    public void setKodeMesin(String KodeMesin) {
        this.KodeMesin = KodeMesin;
    }

    public String getMesin() {
        return Mesin;
    }

    public void setMesin(String Mesin) {
        this.Mesin = Mesin;
    }

    public String getProses() {
        return Proses;
    }

    public void setProses(String Proses) {
        this.Proses = Proses;
    }

    public double getAllow() {
        return Allow;
    }

    public void setAllow(double Allow) {
        this.Allow = Allow;
    }

    public double getPPer45Mnt() {
        return PPer45Mnt;
    }

    public void setPPer45Mnt(double PPer45Mnt) {
        this.PPer45Mnt = PPer45Mnt;
    }

    public double getPPer1Jam() {
        return PPer1Jam;
    }

    public void setPPer1Jam(double PPer1Jam) {
        this.PPer1Jam = PPer1Jam;
    }

    public double getRMS() {
        return RMS;
    }

    public void setRMS(double RMS) {
        this.RMS = RMS;
    }

    public double getHPerPRS() {
        return HPerPRS;
    }

    public void setHPerPRS(double HPerPRS) {
        this.HPerPRS = HPerPRS;
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
