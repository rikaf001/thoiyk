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
import KFramework30.Base.KBusinessObjectClass.KID;
import KFramework30.Base.KExceptionClass;
import java.awt.Component;
import java.awt.Container;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
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
@Table(name = "SALESITEM")
public class salesitemClass 
extends KBusinessObjectClass        
 {
    
    
    @Id
    @KID
    @Basic(optional = false)
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long id;
    
    
    @Column(name = "qty")
    private double qty;
    
    @Column(name = "cost")
    private double cost;
    
    @Column(name = "salesid")
    private long salesid;
    
    @Column(name = "samplerecordid")
    private long samplerecordid;
    
    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;    

    public salesitemClass()  
    throws KExceptionClass
    {
        
           // initialize fields
         id = -1;            
         qty = 1;
         salesid = -1;
         samplerecordid = -1;   
         
        //set max size
        fieldTypes.put( "qty" ,NUMERIC2_TYPE  );                
        fieldTypes.put( "cost" , CURRENCY_TYPE  );                
        fieldMaxSize.put( "description" ,30  );
                
        //readOnlyFields        
    
        editable = true;        
    }

    @Override
    public void materializeFromDisplay(Container visualDisplay, List extraList, int missingFieldsBehavior) throws KExceptionClass {
                       
        super.materializeFromDisplay(visualDisplay, extraList, missingFieldsBehavior);
        
        if( qty <= 0 ) throw new KExceptionClass("Product Quantity must be assigned", null);                
                
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public long getSalesid() {
        return salesid;
    }

    public void setSalesid(long salesid) {
        this.salesid = salesid;
    }

    public long getSamplerecordid() {
        return samplerecordid;
    }

    public void setSamplerecordid(long samplerecordid) {
        this.samplerecordid = samplerecordid;
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
