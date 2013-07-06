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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
    pkColumnValue="GEN_PO", 
    allocationSize=1)    
@Table(name = "PURCHASEORDER")
public class PurchaseOrderClass 
extends KBusinessObjectClass
{
    
    @KID
    @Id   
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long ID;
   
   
    @Column(name = "nomor")
    private String Nomor;
    
    @Column(name = "PODATE")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date PODate;
    
    @Column(name = "supplierid")
    private long SupplierID;
    
    @Column(name = "issuedby")
    private String IssuedBy;
    
    @KBusinessObjectClass.KObjectVersion
    @Column(name = "version")
    private long version;
 

    public PurchaseOrderClass() throws KExceptionClass {
    }

    //=================================================================    
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNomor() {
        return Nomor;
    }

    public void setNomor(String Nomor) {
        this.Nomor = "PO" + Long.toString(ID);
    }

    public Date getPODate() {
        return PODate;
    }

    public void setPODate(Date PODate) {
        this.PODate = PODate;
    }

    public long getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(long SupplierID) {
        this.SupplierID = SupplierID;
    }

    public String getIssuedBy() {
        return IssuedBy;
    }

    public void setIssuedBy(String IssuedBy) {
        this.IssuedBy = IssuedBy;
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
