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
@TableGenerator( 
    name="KIDGenerator", 
    table="SEQUENCE", 
    pkColumnName="SEQ_NAME", 
    valueColumnName="SEQ_COUNT", 
    pkColumnValue="SEQ_PO_ITEM", 
    allocationSize=1)    
@Table(name = "V_PRSIZEITEM")
public class v_PRSizeItemClass 
extends KBusinessObjectClass 
{
    @Id
    @KBusinessObjectClass.KID    
    @Basic(optional = false)
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;
    
    @Column(name = "prid")
    private long PRID;

    @Column(name = "warna")
    private String Warna;

    @Column(name = "xs")
    private long XS;

    @Column(name = "s")
    private long S;

    @Column(name = "m")
    private long M;

    @Column(name = "l")
    private long L;

    @Column(name = "xl")
    private long XL;

    @Column(name = "xxl")
    private long XXL;

    @Column(name = "xxxl")
    private long XXXL;
    
    @Column(name = "total")
    private long Total;

    public v_PRSizeItemClass() throws KExceptionClass {
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

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    

    public long getXS() {
        return XS;
    }

    public void setXS(long XS) {
        this.XS = XS;
    }

    public long getS() {
        return S;
    }

    public void setS(long S) {
        this.S = S;
    }

    public long getM() {
        return M;
    }

    public void setM(long M) {
        this.M = M;
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

    public long getTotal() {
        return Total;
    }

    public void setTotal(long Total) {
        this.Total = Total;
    }
 
    
    @Override
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }
}
