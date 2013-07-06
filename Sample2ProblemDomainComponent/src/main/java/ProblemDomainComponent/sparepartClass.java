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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@TableGenerator( // SCOPE is Global to PU
    name="KIDGenerator", 
    table="SEQUENCE", 
    pkColumnName="SEQ_NAME", 
    valueColumnName="SEQ_COUNT", 
    pkColumnValue="SEQ_MATERIAL", 
    allocationSize=1)
@Table(name = "SPAREPART")
public class sparepartClass 
extends KBusinessObjectClass
{
    
    @Id
    @KBusinessObjectClass.KID    
    @Basic(optional = false)
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long id;
    
    @Column(name = "spareparttypeid")
    private String spareparttypeid;
    @Column(name = "supplierid")
    private String supplierid;
    @Column(name = "kode")
    private String kode;
    @Column(name = "ukuran")
    private String ukuran;
    @Column(name = "mesin")
    private String mesin;
    @Column(name = "qty")
    private String qty;
  
    @Lob
    @Column(name = "image")
    private byte[] image;    

    public sparepartClass() throws KExceptionClass {
    }

    //=================================================================    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSpareparttypeid() {
        return spareparttypeid;
    }

    public void setSpareparttypeid(String spareparttypeid) {
        this.spareparttypeid = spareparttypeid;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getMesin() {
        return mesin;
    }

    public void setMesin(String mesin) {
        this.mesin = mesin;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
  
    

    @Override
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }
    

}
