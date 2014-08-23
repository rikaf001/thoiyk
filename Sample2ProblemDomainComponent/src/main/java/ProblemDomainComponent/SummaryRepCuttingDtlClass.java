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
    pkColumnValue="SEQ_GEN_SIZE", 
    allocationSize=1) 
@Table(name = "V_SUMMARYREPCUTTING")
public class SummaryRepCuttingDtlClass 
extends KBusinessObjectClass{
 @KBusinessObjectClass.KID
    @Id   
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;
   
 
    @Column(name = "prid")
    private long PRID;

    @Column(name = "prno")
    private String PRNo;

    @Column(name = "lineid")
    private long LineID;
         
    @Column(name = "stylename")
    private String StyleName;

    @Column(name = "qty")
    private long Qty;
    
    @Column(name = "targetperjam")
    private long TargetPerJam;
    
    @Column(name = "j0845")
    private long J0845;

    @Column(name = "j0930")
    private long J0930;

    @Column(name = "j1015")
    private long J1015;
    
    @Column(name = "j1100")
    private long J1100;

    @Column(name = "j1145")
    private long J1145;

    @Column(name = "j1330")
    private long J1330;

    @Column(name = "j1415")
    private long J1415;

    @Column(name = "j1500")
    private long J1500;

    @Column(name = "j1545")
    private long J1545;

    @Column(name = "j1630")
    private long J1630;

    @Column(name = "j1715")
    private long J1715;

    @Column(name = "j1800")
    private long J1800;

    @Column(name = "j1945")
    private long J1945;

    @Column(name = "2030")
    private long J2030;

    @Column(name = "j2115")
    private long J2115;

    @Column(name = "j2200")
    private long J2200;

    @Column(name = "auditdate")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date AuditDate;
    
    @Column(name = "audituser")
    private String AuditUser;
  
      
    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;

    public SummaryRepCuttingDtlClass() throws KExceptionClass {
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

    public long getLineID() {
        return LineID;
    }

    public void setLineID(long LineID) {
        this.LineID = LineID;
    }

    public String getStyleName() {
        return StyleName;
    }

    public void setStyleName(String StyleName) {
        this.StyleName = StyleName;
    }

    public long getQty() {
        return Qty;
    }

    public void setQty(long Qty) {
        this.Qty = Qty;
    }

    public long getTargetPerJam() {
        return TargetPerJam;
    }

    public void setTargetPerJam(long TargetPerJam) {
        this.TargetPerJam = TargetPerJam;
    }

    public long getJ0845() {
        return J0845;
    }

    public void setJ0845(long J0845) {
        this.J0845 = J0845;
    }

    public long getJ0930() {
        return J0930;
    }

    public void setJ0930(long J0930) {
        this.J0930 = J0930;
    }

    public long getJ1015() {
        return J1015;
    }

    public void setJ1015(long J1015) {
        this.J1015 = J1015;
    }

    public long getJ1100() {
        return J1100;
    }

    public void setJ1100(long J1100) {
        this.J1100 = J1100;
    }

    public long getJ1145() {
        return J1145;
    }

    public void setJ1145(long J1145) {
        this.J1145 = J1145;
    }

    public long getJ1330() {
        return J1330;
    }

    public void setJ1330(long J1330) {
        this.J1330 = J1330;
    }

    public long getJ1415() {
        return J1415;
    }

    public void setJ1415(long J1415) {
        this.J1415 = J1415;
    }

    public long getJ1500() {
        return J1500;
    }

    public void setJ1500(long J1500) {
        this.J1500 = J1500;
    }

    public long getJ1545() {
        return J1545;
    }

    public void setJ1545(long J1545) {
        this.J1545 = J1545;
    }

    public long getJ1630() {
        return J1630;
    }

    public void setJ1630(long J1630) {
        this.J1630 = J1630;
    }

    public long getJ1715() {
        return J1715;
    }

    public void setJ1715(long J1715) {
        this.J1715 = J1715;
    }

    public long getJ1800() {
        return J1800;
    }

    public void setJ1800(long J1800) {
        this.J1800 = J1800;
    }

    public long getJ1945() {
        return J1945;
    }

    public void setJ1945(long J1945) {
        this.J1945 = J1945;
    }

    public long getJ2030() {
        return J2030;
    }

    public void setJ2030(long J2030) {
        this.J2030 = J2030;
    }

    public long getJ2115() {
        return J2115;
    }

    public void setJ2115(long J2115) {
        this.J2115 = J2115;
    }

    public long getJ2200() {
        return J2200;
    }

    public void setJ2200(long J2200) {
        this.J2200 = J2200;
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
