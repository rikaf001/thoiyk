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
@Table(name = "MESIN")
public class mesinClass 
extends KBusinessObjectClass
{
    
    @Id
    @KBusinessObjectClass.KID    
    @Basic(optional = false)
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long id;
    
    @Column(name = "mesintypeid")
    private long mesintypeid;
    @Column(name = "kode")
    private String kode;
    @Column(name = "supplierid")
    private String supplierid;
    @Column(name = "description")
    private String description;
    @Column(name = "qty")
    private long qty;

        
    @Lob
    @Column(name = "image")
    private byte[] image;    

    public mesinClass() throws KExceptionClass {
    }

    //=================================================================    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getMesintypeid() {
        return mesintypeid;
    }

    public void setMesintypeid(long mesintypeid) {
        this.mesintypeid = mesintypeid;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getQty() {
        return qty;
    }

    public void setQty(long qty) {
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
