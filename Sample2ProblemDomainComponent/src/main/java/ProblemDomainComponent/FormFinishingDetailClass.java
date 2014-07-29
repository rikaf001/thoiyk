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
    pkColumnValue="GEN_FFINISHING_DTL", 
    allocationSize=1)    
@Table(name = "FORMFINISHING_DTL")
public class FormFinishingDetailClass 
extends KBusinessObjectClass
{

    @KID
    @Id   
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;
    
    @Column(name = "hdrid")
    private long HdrID;

    @Column(name = "prid")
    private long PRID;

    @Column(name = "prno")
    private String PRNo;
        
    @Column(name = "buyerid")
    private long BuyerID;
    
    @Column(name = "buyername")
    private String BuyerName;

    @Column(name = "style")
    private String Style;


    @Column(name = "qtyexport")
    private long QtyExport;

    @Column(name = "qtyorder")
    private long QtyOrder;

    @Column(name = "qtycutting")
    private long QtyCutting;

    @Column(name = "qtysewing")
    private long QtySewing;

    @Column(name = "qtysendwash")
    private long QtySendWash;

    @Column(name = "lbr")
    private long LBR;

    @Column(name = "qtyreceivewash")
    private long QtyReceiveWash;

    @Column(name = "qtybutton")
    private long QtyButton;
    
    @Column(name = "qtytrim")
    private long QtyTrim;

    @Column(name = "qtyiron")
    private long QtyIron;

    @Column(name = "qtyqc")
    private long QtyQC;

    @Column(name = "qtypack")
    private long QtyPack;

    @Column(name = "qtyreject")
    private long QtyReject;

    @Column(name = "balance")
    private long Balance;

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

    
    
    public FormFinishingDetailClass() throws KExceptionClass {
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

    public long getBuyerID() {
        return BuyerID;
    }

    public void setBuyerID(long BuyerID) {
        this.BuyerID = BuyerID;
    }

    public String getBuyerName() {
        return BuyerName;
    }

    public void setBuyerName(String BuyerName) {
        this.BuyerName = BuyerName;
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String Style) {
        this.Style = Style;
    }

    public long getQtyExport() {
        return QtyExport;
    }

    public void setQtyExport(long QtyExport) {
        this.QtyExport = QtyExport;
    }

    public long getQtyOrder() {
        return QtyOrder;
    }

    public void setQtyOrder(long QtyOrder) {
        this.QtyOrder = QtyOrder;
    }

    public long getQtyCutting() {
        return QtyCutting;
    }

    public void setQtyCutting(long QtyCutting) {
        this.QtyCutting = QtyCutting;
    }

    public long getQtySewing() {
        return QtySewing;
    }

    public void setQtySewing(long QtySewing) {
        this.QtySewing = QtySewing;
    }

    public long getQtySendWash() {
        return QtySendWash;
    }

    public void setQtySendWash(long QtySendWash) {
        this.QtySendWash = QtySendWash;
    }

    public long getLBR() {
        return LBR;
    }

    public void setLBR(long LBR) {
        this.LBR = LBR;
    }

    public long getQtyReceiveWash() {
        return QtyReceiveWash;
    }

    public void setQtyReceiveWash(long QtyReceiveWash) {
        this.QtyReceiveWash = QtyReceiveWash;
    }

    public long getQtyButton() {
        return QtyButton;
    }

    public void setQtyButton(long QtyButton) {
        this.QtyButton = QtyButton;
    }

    public long getQtyTrim() {
        return QtyTrim;
    }

    public void setQtyTrim(long QtyTrim) {
        this.QtyTrim = QtyTrim;
    }

    public long getQtyIron() {
        return QtyIron;
    }

    public void setQtyIron(long QtyIron) {
        this.QtyIron = QtyIron;
    }

    public long getQtyQC() {
        return QtyQC;
    }

    public void setQtyQC(long QtyQC) {
        this.QtyQC = QtyQC;
    }

    public long getQtyPack() {
        return QtyPack;
    }

    public void setQtyPack(long QtyPack) {
        this.QtyPack = QtyPack;
    }

    public long getQtyReject() {
        return QtyReject;
    }

    public void setQtyReject(long QtyReject) {
        this.QtyReject = QtyReject;
    }

    public long getBalance() {
        return Balance;
    }

    public void setBalance(long Balance) {
        this.Balance = Balance;
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
