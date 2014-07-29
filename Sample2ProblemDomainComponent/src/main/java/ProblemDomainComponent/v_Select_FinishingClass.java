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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

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
    pkColumnValue="SEQ_GEN_SIZEMATRIX", 
    allocationSize=1) 
@Table(name = "V_SELECT_FINISHING")
public class v_Select_FinishingClass 
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
    
    @Column(name = "buyerid")
    private long BuyerID;

    @Column(name = "buyername")
    private String BuyerName;

    @Column(name = "style")
    private String Style;

    @Column(name = "qty")
    private long Qty;

    @Column(name = "cutting")
    private long Cutting;

    @Column(name = "sewing")
    private long Sewing;
    
    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;

    public v_Select_FinishingClass() throws KExceptionClass {
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

    public long getQty() {
        return Qty;
    }

    public void setQty(long Qty) {
        this.Qty = Qty;
    }

    
    public long getCutting() {
        return Cutting;
    }

    public void setCutting(long Cutting) {
        this.Cutting = Cutting;
    }

    public long getSewing() {
        return Sewing;
    }

    public void setSewing(long Sewing) {
        this.Sewing = Sewing;
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
