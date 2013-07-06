/*
This source code is part of the Thoyik
Copyright (C) 2013  Yoserizal
Feedback / Bug Reports yoser174@gmail.com


This project used:
KFRAMEWORK  (http://k-framework.sourceforge.net/)
 */


package ProblemDomainComponent;

/**
 *
 * @author yoserizy
 */
import KFramework30.Base.KBusinessObjectClass;
import KFramework30.Base.KExceptionClass;
import java.awt.Component;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@TableGenerator( // SCOPE is Global to PU
    name="KIDGenerator", 
    table="SEQUENCE", 
    pkColumnName="SEQ_NAME", 
    valueColumnName="SEQ_COUNT", 
    pkColumnValue="SEQ_GEN_TABLE", 
    allocationSize=1) 
@Table(name = "SAMPLERECORDITEM")
public class pr_from_sritemClass 
extends KBusinessObjectClass
{
    
    @KBusinessObjectClass.KID
    @Id   
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long id;

    @Column(name = "samplerecordid")
    private long samplerecordid;
    
    @Column(name = "itemid")
    private long itemid;
    
    @Column(name = "qty")
    private long qty;

    @Column(name = "comp")
    private long comp;

    @Column(name = "tolerance")
    private long tolerance;

    @Column(name = "qtyneed")
    private long qtyneed;

     
    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;
 

    public pr_from_sritemClass() throws KExceptionClass {
           //fieldTypes.put( "clientId", NUMERIC_NOFORMAT );
    }

    //=================================================================    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSamplerecordid() {
        return samplerecordid;
    }

    public void setSamplerecordid(long samplerecordid) {
        this.samplerecordid = samplerecordid;
    }

    public long getItemid() {
        return itemid;
    }

    public void setItemid(long itemid) {
        this.itemid = itemid;
    }

    public long getQty() {
        return qty;
    }

    public void setQty(long qty) {
        this.qty = qty;
    }

    public long getComp() {
        return comp;
    }

    public void setComp(long comp) {
        this.comp = comp;
    }

    public long getTolerance() {
        return tolerance;
    }

    public void setTolerance(long tolerance) {
        this.tolerance = tolerance;
    }

    public long getQtyneed() {
        return qty*comp*tolerance;
    }

    public void setQtyneed(long qtyneed) {
        this.qtyneed = qtyneed;
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
