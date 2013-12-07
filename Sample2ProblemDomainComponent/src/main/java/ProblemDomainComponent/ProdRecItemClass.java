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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@Table(name = "PRODUCTIONRECORDITEM")
public class ProdRecItemClass 
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
    private double qty;
    
    @Column(name = "unittypeid")
    private long unittypeid;
    
    @Column(name = "comp")
    private double comp;

    @Column(name = "tolerance")
    private double tolerance;

    @Column(name = "qtyneed")
    private double qtyneed;

     
    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;
 

    public ProdRecItemClass() throws KExceptionClass {
           fieldTypes.put( "clientId", NUMERIC_NOFORMAT );
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

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public long getUnittypeid() {
        return unittypeid;
    }

    public void setUnittypeid(long unittypeid) {
        this.unittypeid = unittypeid;
    }

    public double getComp() {
        return comp;
    }

    public void setComp(double comp) {
        this.comp = comp;
    }

    public double getTolerance() {
        return tolerance;
    }

    public void setTolerance(double tolerance) {
        this.tolerance = tolerance;
    }

    public double getQtyneed() {
        return qtyneed;
    }

    public void setQtyneed(double qtyneed) {
        this.qtyneed = (comp*tolerance*qty)+(qty*comp);
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
