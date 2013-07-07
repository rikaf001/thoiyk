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
import javax.persistence.Basic;
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
    pkColumnValue="GEN_OSORDER_ID", 
    allocationSize=1)
@Table(name = "OUTSTANDINGORDER")
public class outstandingorderClass 
extends KBusinessObjectClass
{
    @Id
    @KBusinessObjectClass.KID    
    @Basic(optional = false)
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long id;
    
    @Column(name = "srid")
    private long srid;
    
    @Column(name = "buyerid")
    private long buyerid;
    
    @Column(name = "style")
    private String style;
    
    @Column(name = "qty")
    private double qty;
       
    @Column(name = "shipdate")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date shipdate;
   
    @Column(name = "productin")
    private long productin;

    @Column(name = "productout")
    private long productout;

    @Column(name = "line")
    private String line;

    @Column(name = "remark")
    private String remark;

    @KObjectVersion
    @Column(name = "version")
    private long version;
   
    public outstandingorderClass()
    throws KExceptionClass
    {
        
        // initialize has
        //nama = "";
        //total = 0L;
        
  //      fieldMaxSize.put( "nama", 200 );
                
    //    fieldTypes.put( "total", CURRENCY_TYPE );
     //   fieldTypes.put( "buyeridd", NUMERIC_NOFORMAT );
        
       // readOnlyFields.add("total");
        
        // let others be set by server in create new
    }

    //-------------- getter and setter --------------
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSrid() {
        return srid;
    }

    public void setSrid(long srid) {
        this.srid = srid;
    }

    
    public long getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(long buyerid) {
        this.buyerid = buyerid;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public Date getShipdate() {
        return shipdate;
    }

    public void setShipdate(Date shipdate) {
        this.shipdate = shipdate;
    }

    public long getProductin() {
        return productin;
    }

    public void setProductin(long productin) {
        this.productin = productin;
    }

    public long getProductout() {
        return productout;
    }

    public void setProductout(long productout) {
        this.productout = productout;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
