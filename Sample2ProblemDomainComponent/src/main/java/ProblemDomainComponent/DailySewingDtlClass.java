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
    pkColumnValue="GEN_FSEWING_DTL", 
    allocationSize=1)    
@Table(name = "DAILYSEWING_DTL")
public class DailySewingDtlClass 
extends KBusinessObjectClass
{

    @KID
    @Id   
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;

    @Column(name = "hdrid")
    private long HDRID;
       
    @Column(name = "prid")
    private long PRID;

    @Column(name = "prno")
    private String PRNo;
        
    @Column(name = "prqty")
    private String PRQty;

    @Column(name = "style")
    private String Style;

    @Column(name = "lineid")
    private long LineID;

    @Column(name = "targetperjam")
    private long TargetPerJam;

    @Column(name = "j0845")
    private long j0845;
    
    @Column(name = "j0930")
    private long j0930;

    @Column(name = "j1015")
    private long j1015;

    @Column(name = "j1100")
    private long j1100;

    @Column(name = "j1145")
    private long j1145;

    @Column(name = "j1330")
    private long j1330;

    @Column(name = "j1415")
    private long j1415;

    @Column(name = "j1500")
    private long j1500;

    @Column(name = "j1545")
    private long j1545;

    @Column(name = "j1630")
    private long j1630;

    @Column(name = "j1715")
    private long j1715;

    @Column(name = "j1800")
    private long j1800;

    @Column(name = "j1945")
    private long j1945;

    @Column(name = "j2030")
    private long j2030;

    @Column(name = "j2115")
    private long j2115;

    @Column(name = "j2200")
    private long j2200;

    @Column(name = "totaloutput")
    private long TotalOutput;

    @Column(name = "grandtotal")
    private long GrandTotal;

    @Column(name = "blc")
    private long BLC;

    @Column(name = "hadiropr")
    private long HadirOPR;

    @Column(name = "hadirhp")
    private long HadirHP;

    @Column(name = "absentopr")
    private long AbsentOPR;

    @Column(name = "absenthp")
    private long AbsentHP;

    @Column(name = "auditdate")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date AuditDate;

    @Column(name = "audituser")
    private String AuditUser;
    
    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;

    
    
    public DailySewingDtlClass() throws KExceptionClass {
    }

    //=================================================================
        public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getHDRID() {
        return HDRID;
    }

    public void setHDRID(long HDRID) {
        this.HDRID = HDRID;
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

    public String getPRQty() {
        return PRQty;
    }

    public void setPRQty(String PRQty) {
        this.PRQty = PRQty;
    }

    
    public String getStyle() {
        return Style;
    }

    public void setStyle(String Style) {
        this.Style = Style;
    }

    public long getLineID() {
        return LineID;
    }

    public void setLineID(long LineID) {
        this.LineID = LineID;
    }

    public long getTargetPerJam() {
        return TargetPerJam;
    }

    public void setTargetPerJam(long TargetPerJam) {
        this.TargetPerJam = TargetPerJam;
    }

    public long getJ0845() {
        return j0845;
    }

    public void setJ0845(long j0845) {
        this.j0845 = j0845;
    }

    public long getJ0930() {
        return j0930;
    }

    public void setJ0930(long j0930) {
        this.j0930 = j0930;
    }

    public long getJ1015() {
        return j1015;
    }

    public void setJ1015(long j1015) {
        this.j1015 = j1015;
    }

    public long getJ1100() {
        return j1100;
    }

    public void setJ1100(long j1100) {
        this.j1100 = j1100;
    }

    public long getJ1145() {
        return j1145;
    }

    public void setJ1145(long j1145) {
        this.j1145 = j1145;
    }

    public long getJ1330() {
        return j1330;
    }

    public void setJ1330(long j1330) {
        this.j1330 = j1330;
    }

    public long getJ1415() {
        return j1415;
    }

    public void setJ1415(long j1415) {
        this.j1415 = j1415;
    }

    public long getJ1500() {
        return j1500;
    }

    public void setJ1500(long j1500) {
        this.j1500 = j1500;
    }

    public long getJ1545() {
        return j1545;
    }

    public void setJ1545(long j1545) {
        this.j1545 = j1545;
    }

    public long getJ1630() {
        return j1630;
    }

    public void setJ1630(long j1630) {
        this.j1630 = j1630;
    }

    public long getJ1715() {
        return j1715;
    }

    public void setJ1715(long j1715) {
        this.j1715 = j1715;
    }

    public long getJ1800() {
        return j1800;
    }

    public void setJ1800(long j1800) {
        this.j1800 = j1800;
    }

    public long getJ1945() {
        return j1945;
    }

    public void setJ1945(long j1945) {
        this.j1945 = j1945;
    }

    public long getJ2030() {
        return j2030;
    }

    public void setJ2030(long j2030) {
        this.j2030 = j2030;
    }

    public long getJ2115() {
        return j2115;
    }

    public void setJ2115(long j2115) {
        this.j2115 = j2115;
    }

    public long getJ2200() {
        return j2200;
    }

    public void setJ2200(long j2200) {
        this.j2200 = j2200;
    }

    public long getTotalOutput() {
        return TotalOutput;
    }

    public void setTotalOutput(long TotalOutput) {
        this.TotalOutput = TotalOutput;
    }

    public long getGrandTotal() {
        return GrandTotal;
    }

    public void setGrandTotal(long GrandTotal) {
        this.GrandTotal = GrandTotal;
    }

    public long getBLC() {
        return BLC;
    }

    public void setBLC(long BLC) {
        this.BLC = BLC;
    }

    public long getHadirOPR() {
        return HadirOPR;
    }

    public void setHadirOPR(long HadirOPR) {
        this.HadirOPR = HadirOPR;
    }

    public long getHadirHP() {
        return HadirHP;
    }

    public void setHadirHP(long HadirHP) {
        this.HadirHP = HadirHP;
    }

    public long getAbsentOPR() {
        return AbsentOPR;
    }

    public void setAbsentOPR(long AbsentOPR) {
        this.AbsentOPR = AbsentOPR;
    }

    public long getAbsentHP() {
        return AbsentHP;
    }

    public void setAbsentHP(long AbsentHP) {
        this.AbsentHP = AbsentHP;
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
