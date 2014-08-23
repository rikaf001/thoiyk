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
import javax.persistence.Basic;
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
@TableGenerator( // SCOPE is Global to PU
    name="KIDGenerator", 
    table="SEQUENCE", 
    pkColumnName="SEQ_NAME", 
    valueColumnName="SEQ_COUNT", 
    pkColumnValue="SEQ_PO_ITEM", 
    allocationSize=1)    
@Table(name = "V_LAPROD_SELECT")
public class v_Laprod_SelectClass 
extends KBusinessObjectClass
{
    @Id
    @KBusinessObjectClass.KID    
    @Basic(optional = false)
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;
    
    @Column(name = "style")
    private String Style;

    @Column(name = "buyerid")
    private Long BuyerID;
    
    @Column(name = "buyername")
    private String BuyerName;

    @Column(name = "prid")
    private Long PRID;

    @Column(name = "prno")
    private String PRNo;

    @Column(name = "poqty")
    private Long POQty;


    public v_Laprod_SelectClass() throws KExceptionClass {
    }

    //=================================================================
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String Style) {
        this.Style = Style;
    }

    public Long getBuyerID() {
        return BuyerID;
    }

    public void setBuyerID(Long BuyerID) {
        this.BuyerID = BuyerID;
    }

    public String getBuyerName() {
        return BuyerName;
    }

    public void setBuyerName(String BuyerName) {
        this.BuyerName = BuyerName;
    }

    public Long getPRID() {
        return PRID;
    }

    public void setPRID(Long PRID) {
        this.PRID = PRID;
    }

    public String getPRNo() {
        return PRNo;
    }

    public void setPRNo(String PRNo) {
        this.PRNo = PRNo;
    }

    public Long getPOQty() {
        return POQty;
    }

    public void setPOQty(Long POQty) {
        this.POQty = POQty;
    }
    
    

    
    
    @Override
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }
    
    
}
