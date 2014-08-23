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
    pkColumnValue="SEQ_GEN_SEWINGOPBREAKDOWNDTL", 
    allocationSize=1) 
@Table(name = "SEWINGOPBREAKDOWNDTL")
public class SewingOpBreakDownDtlClass 
extends KBusinessObjectClass{

    @KBusinessObjectClass.KID
    @Id   
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;
    
    @Column(name = "hdrid")
    private long HdrID;
    
    @Column(name = "obdid")
    private long OBDID;

    @Column(name = "obdtype")
    private String OBDType;

    @Column(name = "kodemesin")
    private String KodeMesin;

    @Column(name = "mesin")
    private String Mesin;

    @Column(name = "proses")
    private String Proses;

    @Column(name = "actualtime")
    private Double ActualTime;
    
    @Column(name = "standtime10")
    private Double StandTime10;

    @Column(name = "allow")
    private Double Allowance;
    
    @Column(name = "standtime")
    private Double StandTime;

    @Column(name = "pper45")
    private Double PPer45;

    @Column(name = "pperjam")
    private Double PPerJam;

    @Column(name = "rms")
    private Double RMS;

    @Column(name = "hperprs")
    private Double HPerPRS;

    @Column(name = "jam15")
    private Double Jam15;

    @Column(name = "mcpercall")
    private Double MCPerCall;
    
    @Column(name = "mcperact")
    private Double MCPerAct;

    @Column(name = "adjprsper45")
    private Double AdjPRSPer45;

    @Column(name = "auditdate")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date AuditDate;
    
    @Column(name = "audituser")
    private String AuditUser;
  
    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;

    public SewingOpBreakDownDtlClass() throws KExceptionClass {
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

    public long getOBDID() {
        return OBDID;
    }

    public void setOBDID(long OBDID) {
        this.OBDID = OBDID;
    }

    public String getOBDType() {
        return OBDType;
    }

    public void setOBDType(String OBDType) {
        this.OBDType = OBDType;
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

    public Double getActualTime() {
        return ActualTime;
    }

    public void setActualTime(Double ActualTime) {
        this.ActualTime = ActualTime;
    }

    public Double getStandTime10() {
        return StandTime10;
    }

    public void setStandTime10(Double StandTime10) {
        this.StandTime10 = StandTime10;
    }

    public Double getAllowance() {
        return Allowance;
    }

    public void setAllowance(Double Allowance) {
        this.Allowance = Allowance;
    }

    public Double getStandTime() {
        return StandTime;
    }

    public void setStandTime(Double StandTime) {
        this.StandTime = StandTime;
    }

    public Double getPPer45() {
        return PPer45;
    }

    public void setPPer45(Double PPer45) {
        this.PPer45 = PPer45;
    }

    public Double getPPerJam() {
        return PPerJam;
    }

    public void setPPerJam(Double PPerJam) {
        this.PPerJam = PPerJam;
    }

    public Double getRMS() {
        return RMS;
    }

    public void setRMS(Double RMS) {
        this.RMS = RMS;
    }

    public Double getHPerPRS() {
        return HPerPRS;
    }

    public void setHPerPRS(Double HPerPRS) {
        this.HPerPRS = HPerPRS;
    }

    public Double getJam15() {
        return Jam15;
    }

    public void setJam15(Double Jam15) {
        this.Jam15 = Jam15;
    }

    public Double getMCPerCall() {
        return MCPerCall;
    }

    public void setMCPerCall(Double MCPerCall) {
        this.MCPerCall = MCPerCall;
    }

    public Double getMCPerAct() {
        return MCPerAct;
    }

    public void setMCPerAct(Double MCPerAct) {
        this.MCPerAct = MCPerAct;
    }

    public Double getAdjPRSPer45() {
        return AdjPRSPer45;
    }

    public void setAdjPRSPer45(Double AdjPRSPer45) {
        this.AdjPRSPer45 = AdjPRSPer45;
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
