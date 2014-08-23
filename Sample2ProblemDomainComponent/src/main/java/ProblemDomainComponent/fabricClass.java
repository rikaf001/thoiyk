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
@Table(name = "FABRIC")
public class fabricClass 
extends KBusinessObjectClass
{
    
    @Id
    @KBusinessObjectClass.KID    
    @Basic(optional = false)
    @GeneratedValue( strategy = javax.persistence.GenerationType.TABLE, generator="KIDGenerator" )    
    @Column(name = "id")
    private long id;
    
    @Column(name = "fabrictypeid")
    private long fabrictypeid;
    @Column(name = "supplierid")
    private long supplierid;
    @Column(name = "suppliername")
    private String SupplierName;
    @Column(name = "unit")
    private String unit;
    @Column(name = "kode")
    private String kode;
    @Column(name = "content")
    private String content;
    @Column(name = "construction")
    private String construction;
    @Column(name = "finishing")
    private String finishing;
    @Column(name = "colour")
    private String colour;
    @Column(name = "width")
    private String width;
    @Column(name = "weight")
    private String weight;
   @Column(name = "description")
    private String Description;

        
    @Lob
    @Column(name = "image")
    private byte[] image;    

    
    public fabricClass() throws KExceptionClass {
    }

    //=================================================================    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFabrictypeid() {
        return fabrictypeid;
    }

    public void setFabrictypeid(long fabrictypeid) {
        this.fabrictypeid = fabrictypeid;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public String getFinishing() {
        return finishing;
    }

    public void setFinishing(String finishing) {
        this.finishing = finishing;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    


    @Override
    public void validateInput(String currentField, Component currentComponent) throws KExceptionClass {
    }
    

}
