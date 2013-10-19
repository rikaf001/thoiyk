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
    pkColumnValue="GEN_FCUTTING_DTL", 
    allocationSize=1)    
@Table(name = "FORMCUTTING_DTL")
public class FormCuttingDetailClass 
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

    @Column(name = "linecutting")
    private String LineCutting;

    @Column(name = "namabahan")
    private String NamaBahan;

    @Column(name = "ok")
    private long OK;

    @Column(name = "reject")
    private long Reject;
    
    @Column(name = "total")
    private long Total;
    
    @Column(name = "xs")
    private long XS;
        
    @Column(name = "sm")
    private long SM;
        
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
    
    @Column(name = "createdby")
    private String CreatedBy;
    
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date DateCreated;

    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;

    
    
    public FormCuttingDetailClass() throws KExceptionClass {
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

    public String getLineCutting() {
        return LineCutting;
    }

    public void setLineCutting(String LineCutting) {
        this.LineCutting = LineCutting;
    }

    public String getNamaBahan() {
        return NamaBahan;
    }

    public void setNamaBahan(String NamaBahan) {
        this.NamaBahan = NamaBahan;
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

    public long getSM() {
        return SM;
    }

    public void setSM(long SM) {
        this.SM = SM;
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

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    public Date getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(Date DateCreated) {
        this.DateCreated = DateCreated;
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
