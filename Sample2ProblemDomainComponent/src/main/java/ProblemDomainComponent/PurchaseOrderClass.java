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
   
    @Column(name = "statusid")
    private long StatusID;
   
    @Column(name = "termpaymentid")
    private long TermPaymentID;
   
    @Column(name = "currencyid")
    private long CurrencyID;
   
    @Column(name = "nomor")
    private String Nomor;
    
    @Column(name = "PODATE")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date PODate;
    
    @Column(name = "supplierid")
    private long SupplierID;
    
    @Column(name = "supplier_text01")
    private String Supplier_Text01;
    
    @Column(name = "supplier_text02")
    private String Supplier_Text02;
    
    @Column(name = "supplier_text03")
    private String Supplier_Text03;
    
    @Column(name = "supplier_text04")
    private String Supplier_Text04;
    
    @Column(name = "issuedby")
    private String IssuedBy;
    
    @Column(name = "checkedby")
    private String CheckedBy;
    
    @Column(name = "authorizedby")
    private String AuthorizedBy;
    
    @Column(name = "issueddate")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date IssuedDate;
    
    @Column(name = "checkeddate")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date CheckedDate;
    
    @Column(name = "authorizeddate")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date AuthorizedDate;
    
    @Column(name = "deliverydate")
    @Temporal(TemporalType.TIMESTAMP)   
    private Date DeliveryDate;
    
    
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

    public long getStatusID() {
        return StatusID;
    }

    public void setStatusID(long StatusID) {
        this.StatusID = StatusID;
    }

    public long getTermPaymentID() {
        return TermPaymentID;
    }

    public void setTermPaymentID(long TermPaymentID) {
        this.TermPaymentID = TermPaymentID;
    }

    public long getCurrencyID() {
        return CurrencyID;
    }

    public void setCurrencyID(long CurrencyID) {
        this.CurrencyID = CurrencyID;
    }

    public String getNomor() {
        return Nomor;
    }

    public void setNomor(String Nomor) {
        this.Nomor = Nomor;
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

    public String getSupplier_Text01() {
        return Supplier_Text01;
    }

    public void setSupplier_Text01(String Supplier_Text01) {
        this.Supplier_Text01 = Supplier_Text01;
    }

    public String getSupplier_Text02() {
        return Supplier_Text02;
    }

    public void setSupplier_Text02(String Supplier_Text02) {
        this.Supplier_Text02 = Supplier_Text02;
    }

    public String getSupplier_Text03() {
        return Supplier_Text03;
    }

    public void setSupplier_Text03(String Supplier_Text03) {
        this.Supplier_Text03 = Supplier_Text03;
    }

    public String getSupplier_Text04() {
        return Supplier_Text04;
    }

    public void setSupplier_Text04(String Supplier_Text04) {
        this.Supplier_Text04 = Supplier_Text04;
    }

    public String getIssuedBy() {
        return IssuedBy;
    }

    public void setIssuedBy(String IssuedBy) {
        this.IssuedBy = IssuedBy;
    }

    public String getCheckedBy() {
        return CheckedBy;
    }

    public void setCheckedBy(String CheckedBy) {
        this.CheckedBy = CheckedBy;
    }

    public String getAuthorizedBy() {
        return AuthorizedBy;
    }

    public void setAuthorizedBy(String AuthorizedBy) {
        this.AuthorizedBy = AuthorizedBy;
    }

    public Date getIssuedDate() {
        return IssuedDate;
    }

    public void setIssuedDate(Date IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    public Date getCheckedDate() {
        return CheckedDate;
    }

    public void setCheckedDate(Date CheckedDate) {
        this.CheckedDate = CheckedDate;
    }

    public Date getAuthorizedDate() {
        return AuthorizedDate;
    }

    public void setAuthorizedDate(Date AuthorizedDate) {
        this.AuthorizedDate = AuthorizedDate;
    }

    public Date getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(Date DeliveryDate) {
        this.DeliveryDate = DeliveryDate;
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
