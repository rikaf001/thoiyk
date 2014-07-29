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
    pkColumnValue="GEN_FPACKING_DTL", 
    allocationSize=1)    
@Table(name = "FORMPACKING_DTL")
public class FormPackingDetailClass 
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

    @Column(name = "warna")
    private String Warna;

    @Column(name = "nocartoon")
    private String NoCartoon;

    @Column(name = "kodepp")
    private String KodePP;

    @Column(name = "inslot")
    private String InsLot;

    @Column(name = "totalctn")
    private String TotalCTN;

    @Column(name = "nw")
    private double NW;

    @Column(name = "gw")
    private double GW;

    @Column(name = "q1")
    private long Q1;

    @Column(name = "q2")
    private long Q2;

    @Column(name = "q3")
    private long Q3;

    @Column(name = "q4")
    private long Q4;

    @Column(name = "q5")
    private long Q5;

    @Column(name = "q6")
    private long Q6;

    @Column(name = "q7")
    private long Q7;

    @Column(name = "q8")
    private long Q8;

    @Column(name = "q9")
    private long Q9;

    @Column(name = "q10")
    private long Q10;

    @Column(name = "qtotal")
    private long QTotal;

    @Column(name = "auditdate")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date AuditDate;

    @Column(name = "audituser")
    private String AuditUser;
    
    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;

    
    
    
    public FormPackingDetailClass() throws KExceptionClass {
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

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public String getNoCartoon() {
        return NoCartoon;
    }

    public void setNoCartoon(String NoCartoon) {
        this.NoCartoon = NoCartoon;
    }

    public String getKodePP() {
        return KodePP;
    }

    public void setKodePP(String KodePP) {
        this.KodePP = KodePP;
    }

    public String getInsLot() {
        return InsLot;
    }

    public void setInsLot(String InsLot) {
        this.InsLot = InsLot;
    }

    public String getTotalCTN() {
        return TotalCTN;
    }

    public void setTotalCTN(String TotalCTN) {
        this.TotalCTN = TotalCTN;
    }

    public double getNW() {
        return NW;
    }

    public void setNW(double NW) {
        this.NW = NW;
    }

    public double getGW() {
        return GW;
    }

    public void setGW(double GW) {
        this.GW = GW;
    }

  
    public void setGW(long GW) {
        this.GW = GW;
    }

    public long getQ1() {
        return Q1;
    }

    public void setQ1(long Q1) {
        this.Q1 = Q1;
    }

    public long getQ2() {
        return Q2;
    }

    public void setQ2(long Q2) {
        this.Q2 = Q2;
    }

    public long getQ3() {
        return Q3;
    }

    public void setQ3(long Q3) {
        this.Q3 = Q3;
    }

    public long getQ4() {
        return Q4;
    }

    public void setQ4(long Q4) {
        this.Q4 = Q4;
    }

    public long getQ5() {
        return Q5;
    }

    public void setQ5(long Q5) {
        this.Q5 = Q5;
    }

    public long getQ6() {
        return Q6;
    }

    public void setQ6(long Q6) {
        this.Q6 = Q6;
    }

    public long getQ7() {
        return Q7;
    }

    public void setQ7(long Q7) {
        this.Q7 = Q7;
    }

    public long getQ8() {
        return Q8;
    }

    public void setQ8(long Q8) {
        this.Q8 = Q8;
    }

    public long getQ9() {
        return Q9;
    }

    public void setQ9(long Q9) {
        this.Q9 = Q9;
    }

    public long getQ10() {
        return Q10;
    }

    public void setQ10(long Q10) {
        this.Q10 = Q10;
    }

    public long getQTotal() {
        return QTotal;
    }

    public void setQTotal(long QTotal) {
        this.QTotal = QTotal;
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
