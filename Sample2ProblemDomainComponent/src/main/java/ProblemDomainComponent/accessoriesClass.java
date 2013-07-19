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
@Table(name = "ACCESSORIES")
public class accessoriesClass 
extends KBusinessObjectClass
{
    
    @Id
    @KBusinessObjectClass.KID    
    @Basic(optional = false)
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long id;
    
    @Column(name = "accessoriestypeid")
    private long accessoriestypeid;
    @Column(name = "supplierid")
    private long supplierid;
    @Column(name = "unit")
    private String unit;
    @Column(name = "kode")
    private String kode;
    @Column(name = "ukuran")
    private String ukuran;
    @Column(name = "colour")
    private String colour;
    @Column(name = "description")
    private String description;
   
       
    @Lob
    @Column(name = "image")
    private byte[] image;    


    public accessoriesClass() throws KExceptionClass {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAccessoriestypeid() {
        return accessoriestypeid;
    }

    public void setAccessoriestypeid(long accessoriestypeid) {
        this.accessoriestypeid = accessoriestypeid;
    }

    public long getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(long supplierid) {
        this.supplierid = supplierid;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
